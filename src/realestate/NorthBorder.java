package realestate;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class NorthBorder extends JPanel {
    private BufferedImage logoImage;
    private Connection connection;

    public NorthBorder() {
        //flow layoutoo bordedr bolgod east west layoutin ashiglad zuun baruundn gargachih
        setLayout(new FlowLayout(FlowLayout.LEFT));
        JPanel flowPanel2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        setBackground(Color.decode("#FAFAFA"));

        // Retrieve the database connection
        connection = DatabaseConnection.getConnection();

        // Perform database operations
        performDatabaseOperations();

        // Components in the north region
        JLabel textLabel = new JLabel("Real Estate Application");
        JTextField searchBarField = new JTextField(20);
        JButton searchButton = new JButton("Search");
        JButton Login = new JButton("Login");

        try {
            File imageFile = new File("RealEstateLogo.jpg");
            if (imageFile.exists()) {
                logoImage = ImageIO.read(imageFile);
            } else {
                // Use "noImage.png" if image doesn't exist
                logoImage = ImageIO.read(new File("noImage.png"));
            }
        } catch (IOException e) {
            e.printStackTrace();
            
        }
        
        

        // Add components to the north region
        add(createRoundedImageLabel(logoImage));
        add(textLabel);
        add(searchBarField);
        add(searchButton);
//        add(Login);
    }

private void performDatabaseOperations() {
    JLabel countLabel = new JLabel();

        try {
            String query = "SELECT COUNT(text1) AS count FROM test";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int count = resultSet.getInt("count");
                countLabel.setText("Count: " + count);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        add(countLabel);

}
    

    private JLabel createRoundedImageLabel(BufferedImage image) {
        ImageIcon icon = new ImageIcon(image);
        Image scaledImage = icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        BufferedImage roundedImage = new BufferedImage(50, 50, BufferedImage.TYPE_INT_ARGB);

        // Create a rounded shape
        Graphics2D g2d = roundedImage.createGraphics();
        g2d.setClip(new Ellipse2D.Float(0, 0, 50, 50));
        g2d.drawImage(scaledImage, 0, 0, null);
        g2d.dispose();

        // Create a JLabel with the rounded image
        return new JLabel(new ImageIcon(roundedImage));
    }
}
