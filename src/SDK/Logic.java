package SDK;


import UI.Login;
import UI.Screen;
import com.google.gson.Gson;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Calvin on 29/10/2015.
 */
public class Logic {

    public static void login(String username, String password){

        ServerConnection serverConnection = new ServerConnection();

        Login login = new Login();

        User user = new User();
        user.setPassword(login.getTextFieldPassword());
        user.setUsername(login.getTextFieldUserName());

        String json = new Gson().toJson(user);

        serverConnection.post(json, "login/");


    }
    public static void createUser(User user){

    }
    public static void deleteUser(int userId){

    }
    public static void getUser(int userId){

    }
    public static void getGame(int gameId){

    }
    public static void joinGame(int gameId, User opponent, String controls){

    }
    public static void startGame(int gameId){

    }
    public static void createGame(String name, int status){

        ServerConnection serverConnection = new ServerConnection();

        Game game = new Game();
        game.setName(name);
        //game.setHost();
        game.setStatus(status);

        String json = new Gson().toJson(game);

        serverConnection.post(json, "create");

    }
    public static void deleteGame(int gameId){



    }

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