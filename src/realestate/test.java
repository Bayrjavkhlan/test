//package realestate;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.image.BufferedImage;
//import javax.imageio.ImageIO;
//import java.io.File;
//import java.io.IOException;
//
//public class MainPage{
//
//    public MainPage() {
//        JFrame frame = new JFrame();
//
//        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        //---------------------------------------------------------
//GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
//Rectangle bounds = env.getMaximumWindowBounds();
//int maxWidth = bounds.width;
//Integer maxHeight = bounds.height;
//        //--------------------------------------------------------
//        frame.setMinimumSize(new Dimension(600, 600));
//        // JPanel
//        JPanel panel = new JPanel(new BorderLayout());
//        panel.setBackground(Color.decode("#ffffff"));
////        NorthBorder northBorder = new NorthBorder();
//        // Border layout for flow + box layout within the west panel
//        JPanel northPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
//        northPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
//        JPanel westPanel = new JPanel();
//        westPanel.setLayout(new BoxLayout(westPanel, BoxLayout.Y_AXIS));
//        westPanel.setPreferredSize(new Dimension(300, 0));
//        JPanel centerPanel = new JPanel();
//        // Add panels to the main panel using border layout
//        panel.add(northPanel, BorderLayout.NORTH);
//        panel.add(westPanel, BorderLayout.WEST);
//        panel.add(centerPanel, BorderLayout.CENTER);
//
//        // Logo image + resize
//        BufferedImage logoImage = null;
//        int newWidth = 50; // Set the desired width
//        int newHeight = 50; // Set the desired height
//        try {
//            File imageFile = new File("RealEstateLogo.jpg");
//            if (imageFile.exists()) {
//                logoImage = ImageIO.read(imageFile);
//            } else {
//                // Use "noImage.png" if image doesn't exist
//                logoImage = ImageIO.read(new File("noImage.png"));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        if (logoImage != null) {
//            Image resizedImage = logoImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
//            ImageIcon logoIcon = new ImageIcon(resizedImage);
//            JLabel logoLabel = new JLabel(logoIcon);
//            northPanel.add(logoLabel);
//        }
//
//        // Components in the north region
//        JLabel textLabel = new JLabel("Real Estate Application");
//        JTextField searchBarField = new JTextField(20);
//        JButton searchButton = new JButton("Search");
//
//        // Components in the west region
//        JButton westButton1 = new JButton("Зар харах");
//        JButton westButton2 = new JButton("Зар нэмэх");
//        JButton westButton3 = new JButton("Хадгалсан зар");
//        JButton westButton4 = new JButton("Ажилтантай холбогдох");
//        JButton westButton5 = new JButton("Бидний тухай");
//        JButton westButton6 = new JButton("Гарах");
//        
//        //heden yumni size harsi algas 
//        int northBorderHeight = northPanel.getHeight();
//        JLabel label1 = new JLabel(Integer.toString(maxHeight));
//        JLabel label2 = new JLabel(Integer.toString(maxWidth));
//        JLabel label3 = new JLabel(Integer.toString(northBorderHeight));
//
//        // Set fixed size for the buttons
//        Dimension buttonSize = new Dimension(Integer.MAX_VALUE, 121);
//        int height = 121;
//
//        westButton1.setPreferredSize(buttonSize);
//        westButton2.setPreferredSize(buttonSize);
//        westButton3.setPreferredSize(buttonSize);
//        westButton4.setPreferredSize(buttonSize);
//        westButton5.setPreferredSize(buttonSize);
//        westButton6.setPreferredSize(buttonSize);
//        westButton1.setMaximumSize(new Dimension(Integer.MAX_VALUE, height));
//        westButton2.setMaximumSize(new Dimension(Integer.MAX_VALUE, height));
//        westButton3.setMaximumSize(new Dimension(Integer.MAX_VALUE, height));
//        westButton4.setMaximumSize(new Dimension(Integer.MAX_VALUE, height));
//        westButton5.setMaximumSize(new Dimension(Integer.MAX_VALUE, height));
//        westButton6.setMaximumSize(new Dimension(Integer.MAX_VALUE, height));
//
//        // Change button color
//        Color buttonColor = Color.decode("#f0efeb");
//        westButton1.setBackground(buttonColor);
//        westButton2.setBackground(buttonColor);
//        westButton3.setBackground(buttonColor);
//        westButton4.setBackground(buttonColor);
//        westButton5.setBackground(buttonColor);
//        westButton6.setBackground(buttonColor);
//        // Add components to the north region
//        northPanel.add(textLabel);
//        northPanel.add(searchBarField);
//        northPanel.add(searchButton);
//        northPanel.setBackground(Color.decode("#FAFAFA")); // Set the background color of the north region
//
//        // Set margin and alignment for the buttons in the west region
//        westButton1.setAlignmentX(Component.LEFT_ALIGNMENT);
//        westButton2.setAlignmentX(Component.LEFT_ALIGNMENT);
//        westButton3.setAlignmentX(Component.LEFT_ALIGNMENT);
//        westButton4.setAlignmentX(Component.LEFT_ALIGNMENT);
//        westButton5.setAlignmentX(Component.LEFT_ALIGNMENT);
//        westButton6.setAlignmentX(Component.LEFT_ALIGNMENT);
//
//        // Add components to the west region
//        westPanel.add(westButton1);
//        westPanel.add(westButton2);
//        westPanel.add(westButton3);
//        westPanel.add(westButton4);
//        westPanel.add(westButton5);
//        westPanel.add(westButton6);
////        westPanel.add(label1);
////        westPanel.add(label2);
////        westPanel.add(label3);
//
////----------------------------------------------------------------------
//        //odoo endes centerin yumnudig amaln avch tamlan zowoonoo
//JPanel flowPanel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
//JPanel flowPanel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
//
//String[] items1 = {"Төрөл","Орон сууц", "Хашаа байшин гэр", "Газар", "Оффис", "Граж контайнер", "Хаус зуслан", "Худалдаа үйлчилгээний талбай", "Үйлдвар агуулах обьект", "00-н өрөө подвол"};
//
//JTextField textField1 = new JTextField(20);
//JTextField textField2 = new JTextField(20);
//JButton button = new JButton("Click");
////Object[] items2 = new Object[]{textField1, textField2, button};
//String[] items2 = {"Option 1", "Option 2", "Option 3"};
//String[] items3 = {"Option 1", "Option 2", "Option 3"};
//String[] items4 = {"Option 1", "Option 2", "Option 3"};
//String[] items5 = {"Option 1", "Option 2", "Option 3"};
//
//JComboBox<String> dropdown1 = new JComboBox<>(items1);
//JComboBox<String> dropdown2 = new JComboBox<>(items2);
//JComboBox<String> dropdown3 = new JComboBox<>(items3);
//JComboBox<String> dropdown4 = new JComboBox<>(items4);
//JComboBox<String> dropdown5 = new JComboBox<>(items5);
//
//flowPanel1.add(dropdown1);
//flowPanel1.add(dropdown2);
//flowPanel1.add(dropdown3);
//flowPanel2.add(dropdown4);
//flowPanel2.add(dropdown5);
//
//centerPanel.setLayout(new FlowLayout(FlowLayout.LEFT)); // Set left alignment
//centerPanel.add(flowPanel1);
//centerPanel.add(flowPanel2);
//
//
////        dropdown.setAlignmentX(Component.LEFT_ALIGNMENT);
//
//        // Add vertical glue to fill the empty space in the west panel
//        westPanel.add(Box.createVerticalGlue());
//
//        // Add the main panel to the frame
//        frame.setContentPane(panel);
//
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//}
