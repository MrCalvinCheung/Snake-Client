package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by Calvin on 19/11/2015.
 */
public class Highscore extends JPanel{


        private JTable table;
        private JButton btnMainMenu;

        /**
         * Create the panel.
         */
        public Highscore() {
            setLayout(null);

            JLabel lblNewLabel = new JLabel("Highscore");
            lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 16));
            lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
            lblNewLabel.setBounds(173, 19, 104, 31);
            add(lblNewLabel);

            table = new JTable();
            table.setBounds(65, 66, 320, 158);
            add(table);

            btnMainMenu = new JButton("Main Menu");
            btnMainMenu.setBounds(156, 236, 138, 50);
            add(btnMainMenu);

        }

        public JButton getBtnMainMenu(){
            return btnMainMenu;
        }

        public void addActionListener(ActionListener l){
            btnMainMenu.addActionListener(l);
        }


    }



