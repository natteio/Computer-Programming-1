// Highest & Lowest Number (Method)

import java.util.Scanner;

public class Neri {

    public static void main(String[] args)  {

     Scanner scan = new Scanner(System.in);
      int arr [] = new int [5];

      for (int i=0; i<arr.length;i++){
          System.out.println("Input Number:");
          arr[i] = scan.nextInt();
      }
        System.out.println("Highest Number is: " +high(arr));
        System.out.println("Lowest Number is: " +low(arr));

        Sort(arr);
        System.out.print("Here is the sorted user input numbers: ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int high (int numb[]){
        int high = 0;

    high = numb[0];
        for (int i=0; i<numb.length;i++){
            if (high<numb[i]){
                high = numb[i];
            }
        }
        return high;
    }
    public static int low (int numb[]){
        int low = 0;

    low = numb[0];
        for (int i=0;i<numb.length;i++){
            if (low>numb[i]){
                low = numb[i];
            }
        }
         return low;
    }
    public static void Sort (int arr[]){

     int swap = 0;

        for (int i=0; i<arr.length; i++){
            for (int j=1; j<arr.length; j++){
                if (arr[j-1] > arr[j]){
                    swap = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = swap;
                }
            }
        }
    }

}
