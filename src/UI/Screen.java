package UI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Created by Calvin on 12/11/2015.
 */
public class Screen {

    public static final String LOGIN = "Login123";
    public static final String MENU_USER = "MenuUser123";

    private JPanel contentPane;
    private CardLayout c;
    private Login login;
    private UserMenu menuUser;

    /**
     * Create the frame.
     */
    public Screen() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 497, 317);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        contentPane.setLayout(new CardLayout(0,0));

        login = new Login();
        contentPane.add(login, LOGIN);

        menuUser = new UserMenu();
        contentPane.add(menuUser, MENU_USER);

        c = (CardLayout) getContentPane().getLayout();



		/*c = new CardLayout();
		c.addLayoutComponent(login, LOGIN);
		c.addLayoutComponent(menuUser, MENU_USER);*/

    }

    public Login getlogin() {
        return login;
    }

    public UserMenu getmenuUser() {
        return menuUser;
    }

    public void show(String card) {
        c.show(this.getContentPane(), card);
    }


}




