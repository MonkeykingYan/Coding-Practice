package Array_String;

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

    private boolean checkOneAway(String origin, String curr)
    {
        if(origin.length()==curr.length())
            return checkReplace(origin, curr);
        else if(origin.length()== curr.length()+1)
            return checkDelete(origin, curr);
        else if(curr.length() == origin.length()+1)
            return checkInsert(origin, curr);
        return false;
    }

    private boolean checkReplace(String origin, String curr)
    {

    }

    private boolean checkDelete(String origin, String curr)
    {

    }

    private boolean checkInsert(String origin, String curr)
    {

    }


}
