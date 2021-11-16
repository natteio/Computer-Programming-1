// Student (String)

import java.util.Scanner;

public class MachineProblem {
public static Scanner scan = new Scanner (System.in);
public static String arr[] = new String [2];

    public static void main(String[] args) {

        for (int i = 0; i < arr.length; i++){
            System.out.println("Enter Student " + (i+1) + " Information");
                    System.out.print("\t First Name: ");
                    arr[i] = scan.next();
                    System.out.print("\t Last Name: ");
                    arr[i] = scan.next();

        }
        System.out.println(Grade(arr));

    }

    public static int Grade (String student[]){
        int Grade = 0;

        for (int i = 0; i < arr.length; i++){
            System.out.println("Enter " + student[i] + "'s Grade");
                    System.out.print("Science: ");
                    scan.nextInt();
                    System.out.print("English: ");
                    scan.nextInt();
                    System.out.print("Mathematics: ");
                    scan.nextInt();
        }
       return Grade;
    }



}

 int arr []= new int [3];
        for (int i = 0; i < arr.length; i++){
            System.out.println("Student " + (i+1) + " Information");
                for (char j = 2; j < arr.length; j++){
                    System.out.print("\t First Name: ");
                    arr[j] = scan.next().charAt(j);
                        for (char k = 2; k < arr.length; k++){
                            System.out.print("\t Last Name: ");
                            arr[k] = scan.next().charAt(k);
                            }
                }
        }

    }

}
