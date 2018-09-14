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
        List<String> res = new ArrayList<>();
        this.helper(0, 0, n, "", res);
        return res;
    }

    private void helper(int front, int back, int n, String curr, List<String> res) {

        if (back == n) {
            res.add(curr);
            return;
        }

        if (front < n) {
            this.helper(front + 1, back, n, curr + "(", res);
        }

        if (back < front) {
            this.helper(front, back + 1, n, curr + ")", res);
        }

    }


    public static void main(String[] argv) {
        Parens p = new Parens();
        List<String> res = p.generateParenthesis(3);
        System.out.println(res);
    }
}
