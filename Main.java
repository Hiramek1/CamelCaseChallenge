/*
String Challenge
Have the function StringChallenge(str) take the str parameter being passed and return it in proper camel case format where the first letter of each word is capitalized (excluding the first letter). The string will only contain letters and some combination of delimiter punctuation characters separating each word.

For example: if str is "BOB loves-coding" then your program should return the string bobLovesCoding.
Once your function is working, take the final output string and combine it with your ChallengeToken, both in reverse order and separated by a colon.

Your ChallengeToken: wtorizhq2e8
Examples
Input: "cats AND*Dogs-are Awesome"
Output: catsAndDogsAreAwesome
Final Output: emosewAerAsgoDdnAstac:8e2qhzirotw
Input: "a b c d-e-f%g"
Output: aBCDEFG
Final Output: GFEDCBa:8e2qhzirotw
*/
import java.util.*;
import java.io.*;

class Main {

  public static String StringChallenge(String str) {
    // code goes here
    String reverseChallengeToken = new StringBuilder("wtorizhq2e8").reverse().toString();
    char strToChar[] = str.toCharArray();
    int count = 0;
    int n = str.length();
    int countReset = 0;

    for (int i = 0; i < n; i++)
    {
      strToChar[i] = Character.toLowerCase(strToChar[i]);
    }

    for (int i = 0; i < n; i++)
    {
      if (!Character.isAlphabetic(strToChar[i]))
      {
        count ++;
        strToChar[i+1] = Character.toUpperCase(strToChar[i+1]);
      } else {
        strToChar[countReset++] = strToChar[i];
      }
    }

    String strOutput = new StringBuilder(String.valueOf(strToChar, 0, n - count)).reverse().toString();

    return (strOutput + ":" + reverseChallengeToken);
  }

  public static void main (String[] args) {
    // keep this function call here
    Scanner s = new Scanner(System.in);
    //System.out.print(StringChallenge(s.nextLine()));
    String str = "cats AND*Dogs-are Awesome";
    System.out.println(StringChallenge(str));

    s.close();
  }

}