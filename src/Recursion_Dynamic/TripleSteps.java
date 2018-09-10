package Recursion_Dynamic;

/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * <p>
 * Note: Given n will be a positive integer.
 * <p>
 * Example 1:
 * <p>
 * Input: 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 * <p>
 * Input: 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 */
public class TripleSteps {

    public int climbStairs(int n) {
        if (n <= 0 || n == 1 || n == 2) return n;
        int[] resArr = new int[n];
        resArr[0] = 1;
        resArr[1] = 2;
        for (int i = 2; i < n; i++) {
            resArr[i] = resArr[i - 1] + resArr[i - 2];
        }
        return resArr[n - 1];
    }

    public static void main(String[] argv) {
        TripleSteps t = new TripleSteps();
        System.out.println(t.climbStairs(5));
    }

}
