package Recursion_Dynamic;

import java.util.ArrayList;
import java.util.List;

/**
 * Parens: Implement an algorithm to print all valid (e.g., properly opened and closed) combinations
 * of n pairs of parentheses.
 * EXAMPLE
 * Input: 3
 * Output: ( ( () ) ) , ( () () ) , ( () ) () , () ( () ) , () () ()
 * <p>
 * https://leetcode.com/problems/generate-parentheses/description/
 */
public class Parens {
    public List<String> generateParenthesis(int n) {
        String curr = "";
        List<String> res = new ArrayList<>();
        this.helper(0, 0, "(", n, curr, res);
        return res;
    }

    private void helper(int front, int back, String p, int n, String curr, List<String> res) {
        if (back == n) {
            System.out.println(curr);
            res.add(curr);
            return;
        }

        if (front < back) {
            curr = curr + ")";
            back++;
        } else {
            curr = curr + p;
            if (p.equals("(")) front++;
            if (p.equals(")")) back++;
        }
        this.helper(front, back, ")", n, curr, res);
        this.helper(front, back, "(", n, curr, res);
    }

    public static void main(String[] argv) {
        Parens p = new Parens();
        List<String> res = p.generateParenthesis(3);
        System.out.println(res);
    }
}
