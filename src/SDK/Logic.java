package SDK;


import UI.LoginPanel;
import com.google.gson.Gson;

/**
 * Created by Calvin on 29/10/2015.
 */
public class Logic {

    public static void login(String username, String password){

        ServerConnection serverConnection = new ServerConnection();

        LoginPanel loginPanel = new LoginPanel();

        User user = new User();
        user.setPassword(loginPanel.getTextFieldPassword());
        user.setUsername(loginPanel.getTextFieldUserName());

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


}