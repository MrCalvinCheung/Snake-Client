package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by Calvin on 12/11/2015.
 */
public class Login {

    private JTextField Username;
    private JPasswordField password;
    private JButton btnLogin;
    private JLabel lblSnake;

    /**
     * Create the panel.
     */
    public Login() {
        setLayout(null);

        JLabel lblSnake = new JLabel("Snake");
        lblSnake.setHorizontalAlignment(SwingConstants.CENTER);
        lblSnake.setBounds(203, 40, 91, 22);
        lblSnake.setFont(new Font("Lucida Grande", Font.BOLD, 25));
        add(lblSnake);

        Username = new JTextField();
        Username.setBounds(174, 119, 149, 28);
        add(Username);
        Username.setColumns(10);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(203, 223, 91, 29);
        add(btnLogin);

        JLabel lblUsername = new JLabel("Username");
        lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
        lblUsername.setBounds(203, 91, 91, 16);
        add(lblUsername);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
        lblPassword.setBounds(203, 159, 91, 16);
        add(lblPassword);

        password = new JPasswordField();
        password.setBounds(174, 183, 149, 28);
        add(password);

    }

    public JButton getBtnLogin() {
        return btnLogin;
    }

    public void addActionListener(ActionListener l) {

        btnLogin.addActionListener(l);
    }



}
