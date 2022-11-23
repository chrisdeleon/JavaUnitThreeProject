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
        String s = input.nextLine();
        System.out.println("Enter the character you want to parse for: ");
        char c = input.nextLine().charAt(0);


        System.out.println(count(s, c));
    }

    public static int count(String str, char a){
        int occurrences = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == a){
                occurrences++;
            }
        }

        return occurrences;
    }
}