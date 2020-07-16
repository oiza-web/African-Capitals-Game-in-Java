package Game;

import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws IOException {

        HashMap<String, String> africanCapitals = new HashMap<String, String>();
        africanCapitals.put("Algeria", "Algiers");
        africanCapitals.put("Angola", "Luanda");
        africanCapitals.put("Benin", "Porto-Novo");
        africanCapitals.put("Botswana", "Gaborone");
        africanCapitals.put("Burkina Faso", "Ouagadougou");
        africanCapitals.put("Burundi", "Bujumbura");
        africanCapitals.put("Cameroon", "Luanda");

        
        Integer userScore = 0;
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 10 ; i++) {
            
            Object[] africanKeys = africanCapitals.keySet().toArray();
            Object key = africanKeys[new Random().nextInt(africanKeys.length)];
            System.out.println("Enter the Capitals for the countries displayed                                   |Your score: " + userScore);
            System.out.println("Country: " + key.toString());

            
            System.out.println("Capital: ");

            String capital = sc.next();
            System.out.println("Capital of " + key + " is " + capital);

            // check if user entry is same as key value
            String cap = africanCapitals.get(key);
            if (!cap.equals(capital)) {
                userScore += 0;
                
            } else {
                userScore += 5;
                
            }
           

        }
        sc.close();
        System.out.println("Your total is " + userScore);
       

    }
}
