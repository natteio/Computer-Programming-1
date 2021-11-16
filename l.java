// Prime Numbers (Loop)

public class NewClass1 {
    public static void main (String args[]){


        int MaxNumber = 100;
        System.out.println("Prime Numbers from 1 - 100");


        for (int i=2; i<=100; i++) {
            boolean isPrime = true;
            for (int j=2; j < i; j++){
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i + " ");
            }
        }
        System.out.println();
            // Composite Numbers
        System.out.println();
        System.out.println("1 is a special number, therefore it is neither prime nor composite.");
        System.out.println();
        System.out.println("Composite Numbers from 1 - 100");
               for (int i=1; i<=100; i++) {
            boolean isPrime = true;
            for (int j=2; j < i; j++){
                if (i % j == 0){
                    isPrime = false;
                    System.out.print(i + " ");
                    break;
                }
            }
        }

    }
}



package PrimeComposite;

public class NewClass {
    public static void main (String args[]){


        int MaxNumber = 100;
        System.out.println("Prime and Composite Numbers from 1 - 100");

        for (int i=1; i<=100; i++) {
            boolean isPrime = true;
            for (int j=2; j < i; j++){
                if (i % j == 0){
                    isPrime = false;
                    System.out.println("Composite Number:" + i);
                    break;
                }
            }
            if(isPrime){
                System.out.println("Prime Number: " + i);
            }
        }

    }
}



package PrimeComposite;
public class PrimeComposite {

    public static void main (String args[]){


       int factors =0;

        for (int  i = 1; i <= 100; i++) {
           for (int j = 1; j <= i; j++) {
               if (i % j == 0) {
                   factors++;
               }
           }
           if (factors == 2){
               System.out.println(i + " is Prime Number" );
           } else if (factors > 2){
               System.out.println(i + " is a Composite Number");
           }
            factors =0;
        }

    }
}
