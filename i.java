// Odd & Even (Loop)

import java.util.*;

public class Loop {
public static Scanner scan = new Scanner(System.in);
    public static void main (String args[]){


        char Y;
        do {

        System.out.println("This program will show odd/even numbers between 1 and user input number.");
        int x;
        System.out.println("Enter number here:");
        x = scan.nextInt();

        System.out.println("What do you want to show?");
        System.out.println("1 - Odd");
        System.out.println("2 - Even");

        int choice = scan.nextInt();
        switch (choice) {
            case 1: // Odd
                System.out.println("ODD NUMBERS BETWEEN 1 AND "+x);
              for (int i=1; i<=x; i++){
                  if(i % 2 !=0) {
                      System.out.print(i + " ");
                  }
              }
              System.out.println();
              System.out.println("Thank you!");
              break;
            case 2: // Even
                System.out.println("EVEN NUMBERS BETWEEN 1 AND "+x);
              for (int i=1; i <=x; i++){
                  if(i % 2 == 0){
                      System.out.print(i + " ");
                  }
              }
              System.out.println();
              System.out.println("Thank you!");
              break;
        default :
        System.out.println("Sorry!");
        System.out.println("You've entered an invalid choice.");
        }
        System.out.println("Do you wish to try again?");
        System.out.println("Y/N");

        Y = scan.next().charAt(0);
        } while (Y == 'Y' || Y == 'y');
        System.out.println("Thank you!");
        }

}
