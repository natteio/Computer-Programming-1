// Element in an array (MAIN)

public static void main(String[] args) {
     int n;
     int pos;
     int x;
     Scanner scan = new Scanner(System.in);

     System.out.println("Enter number of elements:");
     n = scan.nextInt();
     int arr[] = new int [n+1];

     System.out.println("Enter element:");
     for (int i = 0; i < arr.length; i++){
         arr[i] = scan.nextInt();
     }

     System.out.println("Enter the cell you want to insert number:");
     pos = scan.nextInt();

     System.out.print("Enter element:");
     x = scan.nextInt();

     for (int i = (n-1); i >= (pos-1); i--){
         arr[i+1]= arr[i];
     }

     arr[pos-1] = x;
     System.out.println("After inserting");
     for (int i = 0; i < arr.length; i++){
         System.out.print(arr[i]+",");
     }

     System.out.println(arr[n]);

    }
}
