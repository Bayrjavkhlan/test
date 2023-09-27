package realestate;

import java.awt.*;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CenterBorder extends JPanel {
    private Connection connection;

    public CenterBorder() {
        setLayout(new BorderLayout());
        CenterBorderContent centerBorderContent = new CenterBorderContent();
        add(centerBorderContent, BorderLayout.CENTER);
//        connection = DatabaseConnection.getConnection();
//        performDatabaseOperations();
    }

//    private void performDatabaseOperations() {
//        try {
//            // Example: Execute a query
//            String query = "SELECT * FROM your_table";
//            PreparedStatement statement = connection.prepareStatement(query);
//            ResultSet resultSet = statement.executeQuery();
//
//            // Process the result set
//
//            resultSet.close();
//            statement.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
}
