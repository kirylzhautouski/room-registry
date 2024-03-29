package dev.kirillzhelt.registry.views;

import dev.kirillzhelt.registry.controllers.LoginController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {

    private JPanel jPanelMain;
    private JPanel jPanelFields;
    private JTextField jTextFieldLogin;
    private JPasswordField jPasswordField;
    private JButton jButtonLogin;
    private JLabel jLabelError;

    public LoginView(LoginController loginController) {
        super("Login");

        setContentPane(jPanelMain);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setBounds(700, 200, 600, 600);

        pack();
        setVisible(true);

        jButtonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginController.loginUser(jTextFieldLogin.getText(),
                    new String(jPasswordField.getPassword()));
            }
        });
    }

    public void showInvalidLoginOrPassword() {
        jTextFieldLogin.setText("");
        jPasswordField.setText("");

        jLabelError.setText("Invalid login or password");
    }
}
