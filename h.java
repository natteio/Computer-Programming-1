// Name (String & Constructor)

import java.util.Scanner;

public class Name {
    public static void main (String args[]){
        Scanner get = new Scanner (System.in);
        String name;

        System.out.println("Enter name: ");
        name = get.next();

        System.out.println(name.substring(0,1).toUpperCase() +
                name.substring(1) + " has " + name.length() +
                " characters and starts with letter " + name.substring(0,1));


        char c = name.charAt(0);
        InputArr.compareChar(c);
    }
}
