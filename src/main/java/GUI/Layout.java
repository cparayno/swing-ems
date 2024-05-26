package GUI;

import javax.swing.*;
import java.awt.*;
import java.lang.ref.Cleaner;
import java.util.HashMap;

public class Layout extends JFrame{
    private JLabel capLogo = new JLabel();
    private JPanel mainPanel = new JPanel();

    static String imgPath = "src\\main\\img\\";
    private JLabel logoLabel;
    public Layout() {
    }

    void initialize(JPanel panel, JLabel capLogo, JLabel logoLabel, int width, int height) {
        setContentPane(panel);
        setTitle("Employee Management System");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(width, height);
        setLocationRelativeTo(null);
        setVisible(true);

        labelIcon(capLogo, "CAP.png", 70, 40);
        labelIcon(logoLabel, "EMS.png", 120, 100);

    }

    static void labelIcon(JLabel label, String filename, int width, int height) {
        ImageIcon icon = new ImageIcon(imgPath + filename);
        Image imageIcon = icon.getImage();
        Image newIcon = imageIcon.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        icon = new ImageIcon(newIcon);
        label.setIcon(icon);
    }
}
