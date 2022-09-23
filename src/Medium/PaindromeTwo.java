package Medium;

import java.util.Locale;
import java.util.Scanner;


//Have the function PalindromeTwo(str) take the str parameter being passed and return the string true if the parameter is a palindrome, (the string is the same forward as it is backward) otherwise return the string false.
// The parameter entered may have punctuation and symbols but they should not affect whether the string is in fact a palindrome. For example: “Anne, I vote more cars race Rome-to-Vienna” should return true.
/*
* Palindrome Two
*
* Have the function PalindromeTwo(str) take the str parameter being passed and
* return the string true if the parameter is a palindrome,
* (the string is the same forward as it is backward) otherwise return the string false.
* The parameter entered may have punctuation and symbols but they should not affect whether the string is in fact a palindrome.
*
* For example:
*
* “Anne, I vote more cars race Rome-to-Vienna” should return true.
*
*
* Examples:
*
* Input: "Noel - sees Leon"
* Output: true
*
* Input: "A wat at Tarawa!"
* Output: true
*
* @author Berat Sercan Çelik
*/

public class PaindromeTwo {
    public static boolean PalindromeTwo(String str){
        // code goes here
        Locale ENGLISH = Locale.forLanguageTag("en");
        String pattern = "[^a-zA-Z]+";
        String original = str.replaceAll(pattern,"").toLowerCase(ENGLISH);
        String reverse = new StringBuilder(original).reverse().toString().toLowerCase(ENGLISH);

        return original.equals(reverse);
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(PalindromeTwo(s.nextLine()));
    }

}
