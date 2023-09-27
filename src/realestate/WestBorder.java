package realestate;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class WestBorder extends JPanel {
    public WestBorder() {
        
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setPreferredSize(new Dimension(300, 0));

        // Components in the west region
        JButton westButton1 = new JButton("Зар харах");
        JButton westButton2 = new JButton("Зар нэмэх");
        JButton westButton3 = new JButton("Хадгалсан зар");
        JButton westButton4 = new JButton("Ажилтантай холбогдох");
        JButton westButton5 = new JButton("Бидний тухай");
        JButton westButton6 = new JButton("Гарах");

        // Set fixed size for the buttons
        Dimension buttonSize = new Dimension(Integer.MAX_VALUE, 121);
        int height = 121;

        westButton1.setPreferredSize(buttonSize);
        westButton2.setPreferredSize(buttonSize);
        westButton3.setPreferredSize(buttonSize);
        westButton4.setPreferredSize(buttonSize);
        westButton5.setPreferredSize(buttonSize);
        westButton6.setPreferredSize(buttonSize);
        westButton1.setMaximumSize(new Dimension(Integer.MAX_VALUE, height));
        westButton2.setMaximumSize(new Dimension(Integer.MAX_VALUE, height));
        westButton3.setMaximumSize(new Dimension(Integer.MAX_VALUE, height));
        westButton4.setMaximumSize(new Dimension(Integer.MAX_VALUE, height));
        westButton5.setMaximumSize(new Dimension(Integer.MAX_VALUE, height));
        westButton6.setMaximumSize(new Dimension(Integer.MAX_VALUE, height));

        // Change button color
        Color buttonColor = Color.decode("#f0efeb");
        westButton1.setBackground(buttonColor);
        westButton2.setBackground(buttonColor);
        westButton3.setBackground(buttonColor);
        westButton4.setBackground(buttonColor);
        westButton5.setBackground(buttonColor);
        westButton6.setBackground(buttonColor);

        // Set margin and alignment for the buttons in the west region
        westButton1.setAlignmentX(Component.LEFT_ALIGNMENT);
        westButton2.setAlignmentX(Component.LEFT_ALIGNMENT);
        westButton3.setAlignmentX(Component.LEFT_ALIGNMENT);
        westButton4.setAlignmentX(Component.LEFT_ALIGNMENT);
        westButton5.setAlignmentX(Component.LEFT_ALIGNMENT);
        westButton6.setAlignmentX(Component.LEFT_ALIGNMENT);

        // Add components to the west region
        add(westButton1);
        add(westButton2);
        add(westButton3);
        add(westButton4);
        add(westButton5);
        add(westButton6);
        
        westButton2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            CenterBorderContent centerBorderContetn = new CenterBorderContent();
    }
});

    }
}