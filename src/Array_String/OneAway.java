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
    String origin;
    String curr;
    Hashtable<Character, Integer> currTable;
    Hashtable<Character, Integer> originTable;

    private OneAway(String origin, String curr) {
        this.curr = curr;
        this.origin = origin;
        currTable = new Hashtable<>();
        originTable = new Hashtable<>();
        for (char c : curr.toCharArray()) {
            currTable.put(c, currTable.getOrDefault(c, 0) + 1);
        }
        for (char c : origin.toCharArray()) {
            originTable.put(c, originTable.getOrDefault(c, 0) + 1);
        }

    }


    private boolean checkInsert() {
        if (curr.length() <= origin.length()) return false;
        //Insert is curr has all the chars that origin has, and has at least one char not in the origin
        //Idea: Using hash table, hashing origin one and check the curr one
        for (char c : currTable.keySet()) {
            if (currTable.get(c) < originTable.get(c)) return true;
        }
        return false;
    }

    private boolean checkReplace(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        //??
        return false;
    }

    private boolean checkRemove(String s1, String s2) {
        // ??
        return false;
    }


}
