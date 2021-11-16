// Zodiac Sign (Switch)

package Lab1;
import java.util.*;

public class Switch {
public static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		System.out.println("Please use the numbers 1-12 (as shown below) as representation for your month of birth.");
		 System.out.println("1  - January \t5 - May \t9 - September");
	     System.out.println("2  - February \t6 - June \t10 - October");
	     System.out.println("3  - March \t7 - July \t11 - November");
	     System.out.println("4  - April \t8 - August \t12 - December");

	     int month;
	        System.out.println("Enter your month of birth:");
	        month = scan.nextInt();

	        if (month>12){
	            System.out.println("ERROR "+month+" MONTH DOES NOT EXISTS");
	            System.exit(0);
	        }

	        int day;
	        System.out.println("Enter your date of birth:");
	        day = scan.nextInt();

	        	switch(month) {

	        	case 1: // January
	        		if (day>=20 && day<=31 ){
	                    System.out.println("Your zodiac sign is: Aquarius");
	        		} else if (day>=1 && day<=19){
	        			System.out.println("Your zodiac sign is: Capricorn");
	        		} else
	        		{
	        			System.out.println("Sorry, January is only until 31st.");
	        		}
	                break;
	        	case 2: // February
	        		if (day>=1 && day<=18){
	                    System.out.println("Your zodiac sign is: Aquarius");
	                } else if (day>=19 && day<=29) {
	                    System.out.println("Your zodiac sign is: Pisces");
	                } else
	                {
	                	System.out.println("Sorry, February is only until 28th and 29th if leap year.");
	                }
	        		break;
	        	case 3: // March
	        		if (day>=1 && day<=20){
	                    System.out.println("Your zodiac sign is: Pisces");
	                } else if (day>=21 && day<=31) {
	                    System.out.println("Your zodiac sign is: Aries");
	                } else
	                {
	                	System.out.println("Sorry, March is only until 31st.");
	                }
	        		break;
	        	case 4: // April
	        		if (day>=1 && day<=19){
	                    System.out.println("Your zodiac sign is: Aries");
	                } else if (day>=20 && day<=30){
	                    System.out.println("Your zodiac sign is: Taurus");
	                } else
	                {
	                	System.out.println("Sorry, April is only until 30th.");
	                }
	        		break;
	        	case 5: // May
	        		if (day>=1 && day<=20){
	                    System.out.println("Your zodiac sign is: Taurus");
	                } else if (day>=21 && day<=31){
	                    System.out.println("Your zodiac sign is: Gemini");
	                } else
	                {
	                	System.out.println("Sorry, May is only until 31st.");
	                }
	        		break;
	        	case 6: // June
	        		if (day>=1 && day<=20){
	                    System.out.println("Your zodiac sign is: Gemini");
	                } else if (day>=21 && day<=30) {
	                    System.out.println("Your zodiac sign is: Cancer");
	                } else
	                {
	                	System.out.println("Sorry, June is only until 30th.");
	                }
	        		break;
	        	case 7: // July
	        		if (day>=1 && day<=22){
	                    System.out.println("Your zodiac sign is: Cancer");
	                } else if  (day>=23 && day<=31) {
	                    System.out.println("Your zodiac sign is: Leo");
	                } else
	                {
	                	System.out.println("Sorry, July is only until 31st.");
	                }
	        		break;
	        	case 8: // August
	        		 if (day>=1 && day<=22){
	                     System.out.println("Your zodiac sign is: Leo");
	                 } else if (day>=23 && day<=31){
	                     System.out.println("Your zodiac sign is: Virgo");
	                 } else
	                 {
	                	 System.out.println("Sorry, August is only until 31st.");
	                 }
	        		 break;
	        	case 9: // September
	        		 if (day>=1 && day<=22){
	                     System.out.println("Your zodiac sign is: Virgo");
	                 } else if (day>=23 && day<=30){
	                     System.out.println("Your zodiac sign is: Libra");
	                 } else
	                 {
	                	 System.out.println("Sorry, September is only until 30th.");
	                 }
	        		 break;
	        	case 10: // October
	        		 if (day>=1 && day<=22){
	                     System.out.println("Your zodiac sign is: Libra");
	                 } else if (day>=23 && day<=31){
	                     System.out.println("Your zodiac sign is: Scorpio");
	                 } else
	                 {
	                	 System.out.println("Sorry, October is only until 31st.");
	                 }
	        		 break;
	        	case 11: // November
	        		 if (day>=1 && day<=21){
	                     System.out.println("Your zodiac sign is: Scorpio");
	                 } else if (day>=22 && day<=30) {
	                     System.out.println("Your zodiac sign is: Sagittarius");
	                 } else
	        		 {
	        			 System.out.println("Sorry, November is only until 30th.");
	        		 }
	        		 break;
	        	case 12: // December
	        		if (day>=1 && day<=21){
	                    System.out.println("Your zodiac sign is: Sagittarius");
	                } else if (day>=22 && day<=31){
	                    System.out.println("Your zodiac sign is: Capricorn");
	                } else
	                {
	                	System.out.println("Sorry, December is only until 31st.");
	                }
	        		break;
	}

	}
}
