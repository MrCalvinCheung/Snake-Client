package GUI;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JPasswordField;


public class Login extends JPanel {
    private JTextField Username;
    private JPasswordField password;
    private JButton btnLogin;
    private JLabel lblErrorMessage;

    /**
     * Create the panel.
     */
    public Login() {
        setLayout(null);

        JLabel lblSnake = new JLabel("Welcome to snake");
        lblSnake.setHorizontalAlignment(SwingConstants.CENTER);
        lblSnake.setBounds(120, 40, 245, 22);
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

        lblErrorMessage = new JLabel("");
        lblErrorMessage.setBounds(120, 269, 245, 16);
        add(lblErrorMessage);

    }

    public JButton getBtnLogin() {
        return btnLogin;
    }

    public void setErrorMessage(String ErrorMessage) {
        this.lblErrorMessage.setText(ErrorMessage);
    }

    public void addActionListener(ActionListener l) {

        btnLogin.addActionListener(l);
    }

}
