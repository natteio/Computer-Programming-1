// Palindrome (Method)

import java.util.Scanner;

public class Palindrome {
public static Scanner get = new Scanner (System.in);
    public static void main (String args []){
        char Y;
        do {

            System.out.println("Enter word: ");
            String input = get.next();
            palindrome(input);

        System.out.println("Do you wish to try again?");
        System.out.println("Y/N");

            Y = get.next().charAt(0);
        } while (Y == 'Y' || Y == 'y');
        System.out.println("Thank you");
    }
public static void palindrome (String input ){
    int length = input.length();
    int i;
    int begin;
    int middle;
    int end;

    begin = 0;
    end = length - 1;
    middle = (begin + end) / 2;

    for (i=0; i<=middle;i++){
        if (input.charAt(begin) == input.charAt(end)){
            begin++;
            end--;
        }
        else {
            break;
        }
    }
    if (i == middle + 1){
        System.out.println("IT IS A PALINDROME");
    }
    else {
        System.out.println("IT IS NOT A PALINDROME");
    }
    }
}
