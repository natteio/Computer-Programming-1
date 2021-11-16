// Recursion

import java.util.Scanner;

public class lab4 {
public static Scanner get = new Scanner (System.in);
    public String reverseString (String reverse){
        if (reverse.isEmpty()){
            return reverse;
        } else {
            return reverseString(reverse.substring(1)) + reverse.charAt(0);
        }
    }
    public static void main (String args[]){
        lab4 obj = new lab4();
        System.out.println("Enter word: ");
        String word = get.nextLine();
        String result = obj.reverseString(word);

        System.out.println(result);
    }
}
