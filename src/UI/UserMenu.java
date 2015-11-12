package UI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JList;


/**
 * Created by Calvin on 12/11/2015.
 */
public class UserMenu {

    setLayout(null);

    JLabel Welcome = new JLabel("Welcome to Snake");
    Welcome.setBounds(134, 28, 229, 27);
    Welcome.setHorizontalAlignment(SwingConstants.CENTER);
    Welcome.setFont(new Font("Lucida Grande", Font.BOLD, 22));
    add(Welcome);

    JButton btnStartSpil = new JButton("Start game");
    btnStartSpil.setBounds(61, 104, 113, 62);
    add(btnStartSpil);

    JButton btnVisHighscore = new JButton("Highscore");
    btnVisHighscore.setBounds(193, 178, 113, 62);
    add(btnVisHighscore);

    JButton btnSletSpil = new JButton("Load Game");
    btnSletSpil.setBounds(61, 178, 113, 62);
    add(btnSletSpil);

    JButton btnLogUd = new JButton("Log ud");
    btnLogUd.setBounds(318, 178, 113, 62);
    add(btnLogUd);

    JButton btnOpretSpil = new JButton("Create Game");
    btnOpretSpil.setBounds(193, 104, 113, 62);
    add(btnOpretSpil);

    JButton btnDeleteGame = new JButton("Delete Game");
    btnDeleteGame.setBounds(318, 104, 113, 62);
    add(btnDeleteGame);

}


