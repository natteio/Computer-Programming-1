// Highest and lowest number with Index (Main)

import java.util.Scanner;
public class Arry {
//ARRAY
	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);

		int [] array = new int [10];
		int highest = 0;
		int lowest = 0;
		int highest_index = 0;
		int lowest_index = 0;


		System.out.println("Input atleast 10 numbers");
		for(int i = 0; i < array.length; i++){
			array[i] = reader.nextInt();
			System.out.println("the number you input in index" + i +":" + array[i] );}


		lowest = array[0];
		for(int i = 0; i < array.length; i++){
			if(highest < array[i]){
			   highest = array[i];
			   highest_index = i;}

			if(lowest > array[i]){
			   lowest = array[i];
			   lowest_index = i; } }

		System.out.println("The highest number:" + highest);
		System.out.println("The index of the highest number:" + highest_index);

		System.out.println("The lowest number:" + lowest);
		System.out.println("The index of the lowest number:" + lowest_index);


	}

}




ASSIGNMENT
package assignmentarray;
import java.util.Scanner;

public class AssignmentArray {
    public static void main(String[] args) {


      Scanner reader = new Scanner (System.in);
      double l, w, h;
      l = reader.nextDouble();
      w = reader.nextDouble();
      h = reader.nextDouble();
      System.out.println("ENTER THE VALUE");
      double volume = reader.nextInt();

      double result1 = volume_cube(volume);
      System.out.println("The volume of the cube is: " + result1);

      System.out.println("Enter the radius of the Sphere");
      double r = reader.nextDouble();
      double result2 = volume_sphere(r);
      System.out.println("The volume of the sphere is: " + result2);

      //volume_par (l,w,h);

   }

   // for double
   public static double volume_cube(double volume) {
        double cube;
       cube= volume * volume * volume;

      return cube;
   }
   // for double
   public static double volume_sphere(double r){
       double sphere;
       double radius;
       radius = Math.pow(r,3);
       sphere = ((4 * Math.PI) * radius)/3;
       return sphere;

   }
   //public static void volume_par(double l, double w, double h){
       //double volume;
       //System.out.println("The volume is:" + l*w*h);
   //}
}
