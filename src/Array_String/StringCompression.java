package Array_String;

import java.util.Hashtable;

/**
 * Question: String Compression
 * Implement a method to perform basic string compression using the counts
 * of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
 * "compressed" string would not become smaller than the original string, your method should return
 * the original string. You can assume the string has only uppercase and lowercase letters (a - z).
 * Hints:#92, #110
 */
public class StringCompression {

    private String compresseString(String s) {
        // idea: 2 pointers
        int p1 = 0; //for chars
        int counter = 0; // for nums
        int iterator = 0;
        StringBuilder res = new StringBuilder();
        while (iterator < s.length()) {
            if (s.charAt(p1) == s.charAt(iterator)) {
                counter++;
                iterator++;
                continue;
            }
            res.append(s.charAt(p1));
            res.append(counter);
            p1 = iterator;
            counter = 0;
        }
        res.append(s.charAt(p1));
        res.append(counter);

        System.out.println("s:" +s);
        System.out.println("res:" + res.toString());
        return s.length() < res.length() ? s : res.toString();
    }


    public static void main(String[] argv) {
        String test = "a";
        StringCompression sc = new StringCompression();
        System.out.println(sc.compresseString(test));
    }
}
