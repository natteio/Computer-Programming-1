// Fabonacci (LOOP)

import java.util.*;

public class NewClass1 {
public static Scanner scan = new Scanner (System.in);

    public static void main (String args[]){

        System.out.println("This will show a Fabonnaci Sequence");

        char Y;
        do {
        int n;
            System.out.println("Input number:");
            n = scan.nextInt();

        int x = 0;
        int y = 1;
        int sum;
        System.out.print("0 1 1 ");
        for (int i = 1; i <= n-3; ++i)
        {
        sum = x + y;
        x = y;
        y = sum;
            System.out.print(x + y + " ");
        }
        do{
             System.out.println();
             System.out.println("Do you wish to try again?");
             System.out.println("Y/N");

             Y = scan.next().charAt(0);
        }while((Y != 'Y' && Y != 'y') && (Y != 'N' && Y != 'n'));
        } while (Y == 'Y' || Y == 'y');
        System.out.println("Thank you!");

    }
}
