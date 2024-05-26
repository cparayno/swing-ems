package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Home extends JFrame{
    private JLabel logoLabel;
    private JPanel homePanel;
    private JButton employees;
    private JLabel capLogo;
    private JLabel employeeLogo;
    private JLabel salaryLogo;
    private JLabel timesheetLogo;
    private JLabel leavesLogo;
    private JButton salary;
    private JButton timesheet;
    private JButton leaves;

    static String imgPath = "src\\main\\img\\";

    public Home() {
        initialize();
    }

    void initialize() {
        new Layout().initialize(homePanel, capLogo, logoLabel, 530, 500);

        HashMap<JLabel, String> iconLabels = new HashMap<>();
        iconLabels.put(employeeLogo, "employee.png");
        iconLabels.put(salaryLogo, "salary.png");
        iconLabels.put(timesheetLogo, "timesheet.png");
        iconLabels.put(leavesLogo, "leaves.png");

        iconLabels.forEach((label,filename) -> Layout.labelIcon(label, filename, 80, 60));
    }

    void labelIcon(JLabel label, String filename) {
        ImageIcon icon = new ImageIcon(imgPath + filename);
        Image imageIcon = icon.getImage();
        Image newIcon = imageIcon.getScaledInstance(80, 60, Image.SCALE_SMOOTH);
        icon = new ImageIcon(newIcon);
        label.setIcon(icon);
    }

    void actions() {
        employees.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

}
