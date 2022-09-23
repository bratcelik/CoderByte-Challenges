package Hard;

import java.util.Scanner;

/*
 * Pattern Chaser
 *
 * Have the function PatternChaser(str) take str which will be a string and
 * return the longest pattern within the string. A pattern for this challenge will be defined as:
 * if at least 2 or more adjacent characters within the string repeat at least twice.
 * So for example "aabecaa" contains the pattern aa,
 * on the other hand "abbbaac" doesn't contain any pattern.
 * Your program should return yes/no pattern/null.
 * So if str were "aabejiabkfabed" the output should be yes abe.
 * If str were "123224" the output should return no null.
 * The string may either contain all characters (a through z only), integers, or both.
 * But the parameter will always be a string type. The maximum length for the string being passed in will be 20 characters.
 * If a string for example is "aa2bbbaacbbb" the pattern is "bbb" and not "aa".
 * You must always return the longest pattern possible.
 *
 * @author Berat Sercan Çelik
 */


public class PatternChaser {
    public static String PatternChaser(String str) {
        // code goes here
        String result = "";
        int len = 0;

        for(int i = 0; i < str.length()-3; i++)
        {
            for(int j = 2; j <= (str.substring(i+j).length()); j++)
            {
                //System.out.println(i + " " + j);
                String pattern = str.substring(i,i+j);
                String subStr = str.substring(i+j);

                if(subStr.contains(pattern))
                {
                    if(len < pattern.length())
                    {
                        len = pattern.length();
                        result = pattern;
                        //System.out.println(result);
                    }
                }
            }
        }

        if(len > 0)
        {
            result = "yes " + result;
            return result;
        }


        return "no null";
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(PatternChaser(s.nextLine()));
    }
}
