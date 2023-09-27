package realestate;
import java.awt.*;
import javax.swing.*;

public class MainPage {
    public MainPage() {
        JFrame frame = new JFrame();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.decode("#ffffff"));

        NorthBorder northBorder = new NorthBorder();
        WestBorder westBorder = new WestBorder();
        CenterBorder centerBorder = new CenterBorder();

        JScrollPane scrollPane = new JScrollPane(centerBorder);

        // Add the scroll pane to the center of the main panel
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(northBorder, BorderLayout.NORTH);
        panel.add(westBorder, BorderLayout.WEST);

        // Add the main panel to the frame
        frame.setContentPane(panel);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
