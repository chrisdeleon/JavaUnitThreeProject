/*
 * Chris de Leon 
 * 11/23/2022
 * CIS170 - Java Programming
 * Write a recusrive method that finds the number of occurrences of a specified letter in a string using
 * the following method header:
 * 
 * public static int count(String str, char a)
 * 
 * For example, count("Welcome", 'e') returns 2.
 */

import java.util.Scanner;

public class Exercise18_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to parse: ");
        String s = input.nextLine(); // stores the string
        System.out.println("Enter the character you want to parse for: ");

        // since java does not have .nextChar(), this approach is a good alternative for parsing the character entered
        // it also stores that character 
        char c = input.nextLine().charAt(0); 

        // prints what the method returns in the console passing the two previously stores variables as arguments in the method
        System.out.println(count(s, c)); 
    }

    public static int count(String str, char a){
        int occurrences = 0; // this integer keeps count of how many times a specified character appears in the string
        for(int i = 0; i < str.length(); i++){ // the for loop is set up to run as long as the string is. 
            if(str.charAt(i) == a){ // if there is a matching letter to the one specified, 1 is added to the count
                occurrences++;
            }
        }

        return occurrences; // returns the final amount
    }
}