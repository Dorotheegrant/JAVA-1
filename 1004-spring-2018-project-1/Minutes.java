/**
 * This program converts a number of hours, days, and years into seconds.
 * 
 * @author: <Dorothee Grant>
 * @date: <01/30/18>
 */

import java.util.Scanner;

public class Minutes{
    
    public static void main(String[] args){
        
        //your code here
        // ask user for years
        Scanner Dude = new Scanner(System.in);
        
        
        System.out.println("Please enter the amount of years");
        
        int years;
        years = Dude.nextInt();
       
        
        // The actual claculations for years
        int days = years*365;     
        int hours = days*24;
        int minutes = hours*60;
        
        //what to print for years
        System.out.println("That's " +  minutes  + " minutes");
        
        //Ask user for days 
        System.out.println("Please enter the amount of days");
        int DAYS;
            DAYS = Dude.nextInt();      
        
        // Calculations for Days
        
         int hoursForDays = DAYS*24;
         int minutesDAYS = hoursForDays*60;
       
        
           //what to print for days 
        System.out.println("That's " +  minutesDAYS  + " minutes ");
        
        
        //ask user for hours
        System.out.println("Please enter the amount of hours");
        int HOURS;
        HOURS = Dude.nextInt();
        
        //hours calculations

         int minutesHOURS = HOURS*60;
        
        //What to print
        
         System.out.println("That's " +  minutesHOURS  + " minutes");
        
        //end main method
        
    }
}
 
