package Array_String;

import java.util.Arrays;
import java.util.HashMap;

//Given 2 strings, write a method to determine if one is a permutation of the other
public class CheckPermutation {
    public boolean permutaion(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : s2.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
            if (map.get(c) < 0)
                return false;
        }
        return true;
    }

    public boolean solution1(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        String sortedS1 = this.sortString(s1);
        String sortedS2 = this.sortString(s2);
        return sortedS1.equals(sortedS2);
    }

    public String sortString(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public boolean solution2(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] checker = new int[128];
        for (char c : s1.toCharArray()) {
            checker[c]++;
        }
        for (char c : s2.toCharArray()) {
            checker[c]--;
            if (checker[c] < 0) return false;
        }
        return true;
    }

    public static void main(String argv[]) {
        String t1 = "mayan";
        String t2 = "yanna";
        CheckPermutation cp = new CheckPermutation();
        boolean res = cp.solution2(t1, t2);
        System.out.print(res);
    }
}
