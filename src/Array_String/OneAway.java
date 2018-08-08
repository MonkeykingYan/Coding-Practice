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
            return checkInsertorDelete(origin, curr);
        else if (curr.length() == origin.length() + 1)
            return checkInsertorDelete(curr, origin);
        return false;
    }

    private boolean checkReplace(String origin, String curr) {
        // idea is to sort the string and to compare the different
        char[] originCharrArray = origin.toCharArray();
        char[] currCharArray = curr.toCharArray();

        int numDiff = 0;
        for (int i = 0; i < originCharrArray.length; i++) {
            if (currCharArray[i] != originCharrArray[i]) numDiff++;
        }
        System.out.println("This is a replace operation");
        return numDiff == 1;
    }

    private boolean checkInsertorDelete(String origin, String curr) {
        // The idea is sort the array and check if delete?
        char[] originCharrArray = origin.toCharArray();
        char[] currCharArray = curr.toCharArray();

        int p1 = 0;
        int p2 = 0;
        int diff = 0;

        while (p2 < currCharArray.length) {
            if (originCharrArray[p1] != currCharArray[p2]) {
                p1++;
                diff++;
                continue;
            }
            p1++;
            p2++;
        }
        System.out.println("This is a delete operation");
        return diff <= 1;
    }

    public static void main(String[] argv) {
        String test1 = "pale";
        String test2 = "ple";

        OneAway on = new OneAway();
        System.out.println(on.checkOneAway(test1, test2));
    }


}

