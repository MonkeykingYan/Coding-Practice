package Array_String;

import java.util.Hashtable;

/**
 * Given a string, determine if a permutation of the string could form a palindrome.
 * <p>
 * Idea: only one character could have even numbers
 */
public class PalindromePermutation {

    private boolean check(String s) {
        s = s.toLowerCase().trim();
        System.out.println(s);
        Hashtable<Character, Integer> table = new Hashtable<>();
        boolean flag = false;
        for (char c : s.toCharArray()) {
            if(c == ' ') continue;
            table.put(c, table.getOrDefault(c, 0) + 1);
        }

        for (char ss : table.keySet()) {
            if (table.get(ss) % 2 != 0 && flag == false) {
                flag = true;
            } else if (table.get(ss) % 2 != 0 && flag == true) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] argv) {
        String test = "TactC oa";
        PalindromePermutation p = new PalindromePermutation();
        System.out.println(p.check(test));

    }

}

