package SDK;

import Example.Config;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

/**
 * Created by Calvin on 09/11/2015.
 */
public class Api {

    ServerConnection serverConnection = new ServerConnection();

    public String login(User user) {

        return serverConnection.post(new Gson().toJson(user), "login");
    }
    
    public ArrayList <User> getUsers(){

        String jsonOfUsers = serverConnection.get(Config.getServerAdresseAllUsers());

        return new Gson().fromJson(jsonOfUsers, new TypeToken<ArrayList<User>>() {
        }.getType());

    }

    public String deleteUser(){

        String deleteUser = serverConnection.get(User);

        return new Gson.fromJson(deleteUser());

    }


}