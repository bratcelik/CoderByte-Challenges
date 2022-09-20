package Easy;

import java.util.Locale;
import java.util.Scanner;

/*
* Snake Case
*
* Have the function SnakeCase(str) take the str parameter being passed
* and return it in proper snake case format where each word is lowercased
* and separated from adjacent words via an underscore.
* The string will only contain letters and some combination of delimiter punctuation characters separating each word.
*
* For example:
*
* if str is "BOB loves-coding" then your program should return the string bob_loves_coding.
*
* @author Berat Sercan Çelik
*/

public class SnakeCase {

    public static String SnakeCase(String str){
        //code goes here
        str = str.toLowerCase(Locale.ENGLISH);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++){
            if (!Character.isLetterOrDigit(str.charAt(i))){
                result.append("_");
            }
            else {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.println(SnakeCase(s.nextLine()));
    }
}
