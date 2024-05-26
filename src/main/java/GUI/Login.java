package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Login extends JFrame{
    private JTextField userNameField;
    private JPasswordField passwordField1;
    private JLabel logoLabel;
    public  JPanel loginPanel;
    private JLabel capLogo;
    private JButton button1;
    private JPanel loginButton;

    static String imgPath = "src\\main\\img\\";

    public Login() {
        new Layout().initialize(loginPanel, capLogo, logoLabel, 430, 400);
        login();
    }

    void login() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userNameField.getText();
                String password = passwordField1.getText();

                if(userNameField.getText().equals("admin") && password.equals("password")) {
                    Home rf = null;
                    rf = new Home();
                    rf.setVisible(true);
                    Login.super.setVisible(false);
                }
            }
        });
    }

    public static void main(String[] args) {
        new Login();
    }
}
