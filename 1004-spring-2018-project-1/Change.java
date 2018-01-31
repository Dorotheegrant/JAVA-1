/**
 * This program determines how to provide change given the amount received
 * and the amount due.
 * 
 * @author: <your name here>
 * @date: <the date here>
 */

import java.util.Scanner;

public class Change{
  
    public static void main(String[] args){

        // your code here!
        // ask price
        Scanner money = new Scanner(System.in);
        System.out.println("How much is due?");
        int due;
        due = money.nextInt();
        
        // ask amount given
        System.out.println("How many pennies has the costumer given you?");
        int pennies;
        pennies = money.nextInt();
        
        //calculations
        int difference = pennies - due;
        int dollars = difference / 100;
        int dollarsLeft = difference - (100*dollars);
        int quarters = dollarsLeft / 25;
        int quartersLeft = dollarsLeft - (25*quarters);
        int dimes = quartersLeft / 10;
        int dimesLeft = quartersLeft - (10*dimes);
        int nickles = dimesLeft / 5;
        int nicklesLeft = dimesLeft - (5*nickles);
        int penny = nicklesLeft;
        
        //print amount to give back
        System.out.println("Return " +  dollars  + " dollar(s), " +  quarters  + " quarter(s), ");
        System.out.println( +  dimes  + " dime(s), " +  nickles  + " nickle(s), ");
        System.out.println("and, " +  penny  + " penny(ies), to the costumer.");
        
        System.out.println("Thank you for shopping with us!");
        
            
            //end main mathod
    }





}	