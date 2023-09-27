package realestate;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.border.Border;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class CenterBorderContent extends JPanel {
    public CenterBorderContent() {
        DatabaseConnection dataBaseConnection = new DatabaseConnection();
        setLayout(new BorderLayout()); 
        

        JPanel flowPanel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JPanel gridLayout = new JPanel(new GridLayout(10,3));
        gridLayout.setPreferredSize(new Dimension(1000,1000));        
        GridLayout layout = (GridLayout)gridLayout.getLayout();
        layout.setHgap(10);
        layout.setVgap(10); 
        JButton button = new JButton("Хайх");
        String[] items1 = {"Төрөл","Орон сууц", "Хашаа байшин гэр", "Газар", "Оффис", "Граж контайнер", "Хаус зуслан", "Худалдаа үйлчилгээний талбай", "Үйлдвар агуулах обьект", "00-н өрөө подвол"};
        String[] items2 = {"Доод үнэ","0","10сая","20сая","30сая","40сая","50сая","60сая","70сая","80сая","90сая","100сая"};
        String[] items3 = {"Дээд үнэ","0","10сая","20сая","30сая","40сая","50сая","60сая","70сая","80сая","90сая","100сая"};
        String[] items4 = {"Ангилах", "Шинэ эхэндээ", "Эрэлттэй", "Үнэ өсөх", "Үнэ буурах"};
        String[] items5 = {"Багануур", "Бага-хангай", "Баянгол", "Баянзүрх", "Налайх", "СонгиноХайрхан", "Сүхбаатар", "Хан-Уул", "Чингэлтэй", "Архангай", "Баян-Өлгий", "Баянхонгор", "Булган", "Говь-Алтай", "Говьсүмбэр", "Дархан-Уул", "Дорноговь", "Дорнод", "Дундговь", "Завхан", "Орхон", "Өвөрхангай", "Өмнөговь", "Сүхбаатар", "Сэлэнгэ", "Төв", "Увс", "Ховд", "Хөвсгөл", "Хэнтий"};
        String[] items6 = {"Бүгд","Зарах","Түрээслэх"};
        JComboBox<String> dropdown1 = new JComboBox<>(items1);
        JComboBox<String> dropdown2 = new JComboBox<>(items2);
        JComboBox<String> dropdown3 = new JComboBox<>(items3);
        JComboBox<String> dropdown4 = new JComboBox<>(items4);
        JComboBox<String> dropdown5 = new JComboBox<>(items5);
        JComboBox<String> dropdown6 = new JComboBox<>(items6);

        flowPanel1.add(dropdown1);
        flowPanel1.add(dropdown2);
        flowPanel1.add(dropdown3);
        flowPanel1.add(dropdown4);
        flowPanel1.add(dropdown5);
        flowPanel1.add(dropdown6);
        flowPanel1.add(button);

        
//------------------------------------------------------------------------------
        class CustomLabel extends JLabel {
            public CustomLabel(ImageIcon imageIcon) {
                super(imageIcon);
            }

            @Override
            public Dimension getPreferredSize() {
                Dimension size = super.getPreferredSize();
                size.width = 50; // Set the width to 50
                return size;
            }
        }
        ImageIcon originalImage1 = new ImageIcon("D:\\Language\\Java\\RealEstate\\RealEstateImage\\Image1.jpg");
        ImageIcon originalImage2 = new ImageIcon("D:\\Language\\Java\\RealEstate\\NoImage.png");
        ImageIcon originalImage3 = new ImageIcon("D:\\Language\\Java\\RealEstate\\NoImage.png");
        ImageIcon originalImage4 = new ImageIcon("D:\\Language\\Java\\RealEstate\\RealEstateImage\\image2.jpg");
        ImageIcon originalImage5 = new ImageIcon("D:\\Language\\Java\\RealEstate\\NoImage.png");
        ImageIcon originalImage6 = new ImageIcon("D:\\Language\\Java\\RealEstate\\RealEstateImage\\image3.jpg");
        ImageIcon originalImage7 = new ImageIcon("D:\\Language\\Java\\RealEstate\\NoImage.png");
        ImageIcon originalImage8 = new ImageIcon("D:\\Language\\Java\\RealEstate\\RealEstateImage\\image4.jpg");
        ImageIcon originalImage9 = new ImageIcon("D:\\Language\\Java\\RealEstate\\RealEstateImage\\image5.jpg");
        ImageIcon originalImage10 = new ImageIcon("D:\\Language\\Java\\RealEstate\\NoImage.png");

        int height =1000;
        int width = 400;
        Image resizedImage1 = originalImage1.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT);
        Image resizedImage2 = originalImage2.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT);
        Image resizedImage3 = originalImage3.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT);
        Image resizedImage4 = originalImage4.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT);
        Image resizedImage5 = originalImage5.getImage().getScaledInstance(width, height, Image.SCALE_AREA_AVERAGING);
        Image resizedImage6 = originalImage6.getImage().getScaledInstance(width, height, Image.SCALE_REPLICATE);
        Image resizedImage7 = originalImage7.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT);
        Image resizedImage8 = originalImage8.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT);
        Image resizedImage9 = originalImage9.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT);
        Image resizedImage10 = originalImage10.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        
        JLabel label1 = new JLabel(new ImageIcon(resizedImage1));
        JLabel label2 = new JLabel(new ImageIcon(resizedImage2));
        JLabel label3 = new JLabel(new ImageIcon(resizedImage3));
        JLabel label4 = new JLabel(new ImageIcon(resizedImage4));
        JLabel label5 = new JLabel(new ImageIcon(resizedImage5));
        JLabel label6 = new JLabel(new ImageIcon(resizedImage6));
        JLabel label7 = new JLabel(new ImageIcon(resizedImage7));
        JLabel label8 = new JLabel(new ImageIcon(resizedImage8));
        JLabel label9 = new JLabel(new ImageIcon(resizedImage9));
        JLabel label10 = new JLabel(new ImageIcon(resizedImage10));
        
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        gridLayout.setBorder(border);


        
        //----------------------------------------------------------------------

        JPanel nestedPanel1 = new JPanel(new GridLayout(2, 6));
        JLabel label21 = new JLabel();
        JLabel label22 = new JLabel();
        JLabel label23 = new JLabel();
        JLabel label24 = new JLabel();
        JLabel label25 = new JLabel();
        JLabel label26 = new JLabel();
        JLabel label27 = new JLabel();
        JLabel label28 = new JLabel();
        JLabel label29 = new JLabel();
        JLabel label30 = new JLabel();
        JLabel label11 = new JLabel();
        JLabel label12 = new JLabel();
        JLabel label13 = new JLabel();
        JLabel label14 = new JLabel();
        JLabel label15 = new JLabel();
        JLabel label16 = new JLabel();
        JLabel label17 = new JLabel();
        JLabel label18 = new JLabel();
        JLabel label19 = new JLabel();
        JLabel label110 = new JLabel();
        
 
        JLabel label50 = new JLabel("Төрөл");
        dataBaseConnection.performDatabaseOperations(label50);

        nestedPanel1.add(label50);
        nestedPanel1.add(label11);
        JButton button1 = new JButton("Хадгалах");
        button1.setPreferredSize(new Dimension(200,200));
        nestedPanel1.add(button1);
        nestedPanel1.add(new JLabel("Үнэ:"));
        nestedPanel1.add(label21);
        JPanel nestedPanel2 = new JPanel(new GridLayout(2, 6));
        nestedPanel2.add(new JLabel("Гарчиг:"));
        nestedPanel2.add(label12);
        JButton button2 = new JButton("Хадгалах");
        button2.setPreferredSize(new Dimension(200,200));
        nestedPanel2.add(button2);
        nestedPanel2.add(new JLabel("Үнэ:"));
        nestedPanel2.add(label22);
        JPanel nestedPanel3 = new JPanel(new GridLayout(2, 6));
        nestedPanel3.add(new JLabel("Гарчиг:"));
        nestedPanel3.add(label13);
        JButton button3 = new JButton("Хадгалах");
        button3.setPreferredSize(new Dimension(200,200));
        nestedPanel3.add(button3);
        nestedPanel3.add(new JLabel("Үнэ:"));
        nestedPanel3.add(label23);
        JPanel nestedPanel4 = new JPanel(new GridLayout(2, 6));
        nestedPanel4.add(new JLabel("Гарчиг:"));
        nestedPanel4.add(label4);
        JButton button4 = new JButton("Хадгалах");
        button4.setPreferredSize(new Dimension(200,200));
        nestedPanel4.add(button4);
        nestedPanel4.add(new JLabel("Үнэ:"));
        nestedPanel4.add(label14);
        JPanel nestedPanel5 = new JPanel(new GridLayout(2, 6));
        nestedPanel5.add(new JLabel("Гарчиг:"));
        nestedPanel5.add(label5);
        JButton button5 = new JButton("Хадгалах");
        button5.setPreferredSize(new Dimension(200,200));
        nestedPanel5.add(button5);
        nestedPanel5.add(new JLabel("Үнэ:"));
        nestedPanel5.add(label15);
        JPanel nestedPanel6 = new JPanel(new GridLayout(2, 6));
        nestedPanel6.add(new JLabel("Гарчиг:"));
        nestedPanel6.add(label6);
        JButton button6 = new JButton("Хадгалах");
        button6.setPreferredSize(new Dimension(200,200));
        nestedPanel6.add(button6);
        nestedPanel6.add(new JLabel("Үнэ:"));
        nestedPanel6.add(new JLabel("label7"));
        JPanel nestedPanel7 = new JPanel(new GridLayout(2, 6));
        nestedPanel7.add(new JLabel("Гарчиг:"));
        nestedPanel7.add(label17);
        JButton button7 = new JButton("Хадгалах");
        button7.setPreferredSize(new Dimension(200,200));
        nestedPanel7.add(button7);
        nestedPanel7.add(new JLabel("Үнэ:"));
        nestedPanel7.add(new JLabel("Database"));
        JPanel nestedPanel8 = new JPanel(new GridLayout(2, 6));
        nestedPanel8.add(new JLabel("Гарчиг:"));
        nestedPanel8.add(new JLabel("Database"));
        JButton button8 = new JButton("Хадгалах");
        button8.setPreferredSize(new Dimension(200,200));
        nestedPanel8.add(button8);
        nestedPanel8.add(new JLabel("Үнэ:"));
        nestedPanel8.add(new JLabel("Database"));
        JPanel nestedPanel9 = new JPanel(new GridLayout(2, 6));
        nestedPanel9.add(new JLabel("Гарчиг:"));
        nestedPanel9.add(new JLabel("Database"));
        JButton button9 = new JButton("Хадгалах");
        button9.setPreferredSize(new Dimension(200,200));
        nestedPanel9.add(button9);
        nestedPanel9.add(new JLabel("Үнэ:"));
        nestedPanel9.add(new JLabel("Database"));
        JPanel nestedPanel10 = new JPanel(new GridLayout(2, 6));
        nestedPanel10.add(new JLabel("Гарчиг:"));
        nestedPanel10.add(new JLabel("Database"));
        JButton button10 = new JButton("Хадгалах");
        button10.setPreferredSize(new Dimension(200,200));
        nestedPanel10.add(button10);
        nestedPanel10.add(new JLabel("Үнэ:"));
        nestedPanel10.add(new JLabel("Database"));

        //----------------------------------------------------------------------

gridLayout.add(new JLabel("1"));
gridLayout.add(label1);
gridLayout.add(nestedPanel1);
gridLayout.add(new JLabel("2"));
gridLayout.add(label2);
gridLayout.add(nestedPanel2);
gridLayout.add(new JLabel("3"));
gridLayout.add(label3);
gridLayout.add(nestedPanel3);
gridLayout.add(new JLabel("4"));
gridLayout.add(label4);
gridLayout.add(nestedPanel4);
gridLayout.add(new JLabel("5"));
gridLayout.add(label5);
gridLayout.add(nestedPanel5);
gridLayout.add(new JLabel("6"));
gridLayout.add(label6);
gridLayout.add(nestedPanel6);
gridLayout.add(new JLabel("7"));
gridLayout.add(label7);
gridLayout.add(nestedPanel7);
gridLayout.add(new JLabel("8"));
gridLayout.add(label8);
gridLayout.add(nestedPanel8);
gridLayout.add(new JLabel("9"));
gridLayout.add(label9);
gridLayout.add(nestedPanel9);
gridLayout.add(new JLabel("10"));
gridLayout.add(label10);
gridLayout.add(nestedPanel10);



        
        setVisible(true);

        add(flowPanel1, BorderLayout.NORTH);
        add(gridLayout, BorderLayout.WEST);
    }
}

