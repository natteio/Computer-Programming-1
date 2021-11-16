// Leap Year

import java.util.*;
    public class NewClass {
    public static Scanner scan = new Scanner(System.in);

        public static void main(String[]args){

        int year;
        System.out.println("Enter year of birth:");
        year = scan.nextInt();

        if (year %4 == 0 && year %100 !=0 || year % 400 ==0){
            System.out.println(year+" is a leap year.");
        } else
        {
            System.out.println("Sorry " +year+" is not a leap year.");
        }


    }

}
