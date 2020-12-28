/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hexdec;

/**
 *CSC 206 
 * Mr. Osborne
 * @author Isaiah J Jones
 * 2-4-17
 */

//Prompt user for a hexedecimal number
//Store and read number
// Convert number to its base-10 value
// Print out the base-10 value

//Import Scanner
import java.util.Scanner;
public class HexDec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    //Declare variables
    String userNumber;
    int decNumber;
    char x;
    
    //Create a Scanner
    Scanner input = new Scanner(System.in);
    
    //Prompt user for a one-digit hexedecimal number
    System.out.println("Enter a one-digit hexadecimal number:");
    
    //Store and read user's number
    userNumber = input.nextLine();
    x = Character.toUpperCase(userNumber.charAt(0));
    
    //Make sure the user inputs a one-digit number
    if (userNumber.length() != 1){
        System.out.println("I said a ONE-DIGIT number. Try Again.");
        System.exit(0);
    
    }
     
    //Covert user's number to base-10
    if(x >= 'A' && x <= 'F'){
        decNumber = x - 'A' + 10;
        } else decNumber = x;
    
    //Print out the base-10 number
    System.out.println(x + " in Base-10 is " + decNumber);
    }
    
    
    }
    

