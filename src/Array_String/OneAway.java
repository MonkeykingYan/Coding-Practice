package Array_String;

import java.util.Arrays;
import java.util.Hashtable;

/**
 * Question:
 * One Away: There are three types of edits that can be performed on strings: insert a character,
 * remove a character, or replace a character. Given two strings, write a function to check if they are
 * one edit (or zero edits) away.
 * EXAMPLE
 * pale, ple -> true
 * pales, pale -> true
 * pale, bale -> true
 * pale, bake -> false
 */
public class OneAway {

    private boolean checkOneAway(String origin, String curr) {
        if (origin.length() == curr.length())
            return checkReplace(origin, curr);
        else if (origin.length() == curr.length() + 1)
            return checkDelete(origin, curr);
        else if (curr.length() == origin.length() + 1)
            return checkInsert(origin, curr);
        return false;
    }

    private boolean checkReplace(String origin, String curr) {
        // idea is to sort the string and to compare the different
        char[] originCharrArray  = origin.toCharArray();
        Arrays.sort(originCharrArray);

        char[] currCharArray = curr.toCharArray();
        Arrays.sort(currCharArray);

        int numDiff = 0;
        for(int i = 0 ; i <originCharrArray.length; i ++)
        {
            if(currCharArray[i]!=originCharrArray[i]) numDiff++;
        }

        return numDiff<=1;


        return false;
    }

    private boolean checkDelete(String origin, String curr) {
        return false;
    }

    private boolean checkInsert(String origin, String curr) {
        return false;
    }
}

