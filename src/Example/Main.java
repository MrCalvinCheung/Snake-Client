package Example;

import sdk.Logic;

import java.io.IOException;
/**
 * Created by Calvin on 29/10/2015.
 */

public class Main {

        public static void main(String args[]) throws IOException {

            Logic.login("doek4life", "abc123");
            Logic.createGame("battle_to_death",1);

        }
    }

