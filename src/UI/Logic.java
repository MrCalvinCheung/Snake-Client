package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Created by Calvin on 12/11/2015.
 */
public class Logic {


        private Screen screen;


        public Logic() {

            screen = new Screen();
            screen.setVisible(true);
        }

        public void run() {
            screen.getlogin().addActionListener(new LoginActionListener());
            screen.show(screen.LOGIN);

        }

        private class LoginActionListener implements ActionListener {

            public void actionPerformed(ActionEvent e){

                if (e.getSource() == screen.getlogin().getBtnLogin()) {
                    screen.show(screen.MENU_USER);
                }
            }
        }
    }

}
