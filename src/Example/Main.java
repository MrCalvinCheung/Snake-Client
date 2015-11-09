package Example;

import java.io.IOException;
/**
 * Created by Calvin on 29/10/2015.
 */

public class Main {

        public static void main(String args[]){

            try {
                Config.init();
            } catch (IOException e) {
                e.printStackTrace();
            }


            //new Api().login();
        }
    }

