// Zodiac Sign (If-Else)

package ZodiacSign;
import java.util.*;


public class Activity2 {
public static Scanner scan = new Scanner(System.in);
    public static void main(String[]args){
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

        if (day>31){
            System.out.println("ERROR "+day+" OF THE MONTH DOES NOT EXISTS");
            System.exit(0);
        }

        if (month==1) // January
        {
            if (day>=20 && day<=31){
                System.out.println("Your zodiac sign is: Aquarius");
            } else if (day>=1 && day<=19){
                System.out.println("Your zodiac sign is: Capricorn");
            }
        } else if (month==2) // February
        {
            if (day>=1 && day<=18){
                System.out.println("Your zodiac sign is: Aquarius");
            } else if (day>=19 && day<=28){
                System.out.println("Your zodiac sign is: Pisces");
            }
        } else if (month==3) // March
        {
            if (day>=1 && day<=20){
                System.out.println("Your zodiac sign is: Pisces");
            } else if (day>=21 && day<=31){
                System.out.println("Your zodiac sign is: Aries");
            }
        } else if (month==4) // April
        {
            if (day>=1 && day<=19){
                System.out.println("Your zodiac sign is: Aries");
            } else if (day>=20 && day<=30){
                System.out.println("Your zodiac sign is: Taurus");
            }
        } else if (month==5) // May
        {
            if (day>=1 && day<=20){
                System.out.println("Your zodiac sign is: Taurus");
            } else if (day>=21 && day<=31){
                System.out.println("Your zodiac sign is: Gemini");
            }
        } else if (month==6) // June
        {
            if (day>=1 && day<=20){
                System.out.println("Your zodiac sign is: Gemini");
            } else if (day>=21 && day<=30){
                System.out.println("Your zodiac sign is: Cancer");
            }
        } else if (month==7) // July
        {
            if (day>=1 && day<=22){
                System.out.println("Your zodiac sign is: Cancer");
            } else if (day>=23 && day<=31){
                System.out.println("Your zodiac sign is: Leo");
            }
        } else if (month==8) // August
        {
            if (day>=1 && day<=22){
                System.out.println("Your zodiac sign is: Leo");
            } else if (day>=23 && day<=31){
                System.out.println("Your zodiac sign is: Virgo");
            }
        } else if (month==9) // September
        {
            if (day>=1 && day<=22){
                System.out.println("Your zodiac sign is: Virgo");
            } else if (day>=23 && day<=30){
                System.out.println("Your zodiac sign is: Libra");
            }
        } else if (month==10) // October
        {
            if (day>=1 && day<=22){
                System.out.println("Your zodiac sign is: Libra");
            } else if (day>=23 && day<=31){
                System.out.println("Your zodiac sign is: Scorpio");
            }
        } else if (month==11) // November
        {
            if (day>=1 && day<=21){
                System.out.println("Your zodiac sign is: Scorpio");
            } else if (day>=22 && day<=30){
                System.out.println("Your zodiac sign is: Sagittarius");
            }
        } else if (month==12) // December
        {
            if (day>=1 && day<=21){
                System.out.println("Your zodiac sign is: Sagittarius");
            } else if (day>=22 && day<=31){
                System.out.println("Your zodiac sign is: Capricorn");
            }
        } else
        {
            System.out.println("Your zodiac sign is: ERROR "+month+" MONTH DOES NOT EXISTS");
        }
    }
}
