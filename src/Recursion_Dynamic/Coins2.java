package Recursion_Dynamic;


/**
 * You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
 * <p>
 * Example 1:
 * <p>
 * Input: coins = [1, 2, 5], amount = 11
 * Output: 3
 * Explanation: 11 = 5 + 5 + 1
 * Example 2:
 * <p>
 * Input: coins = [2], amount = 3
 * Output: -1
 *
 * leetcode: https://leetcode.com/problems/coin-change/description/
 */
public class Coins2 {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        int min = amount;
        for (int coin : coins) {
            if (amount - coin >= 0) {
                int temp = coinChange(coins, amount - coin);
                if (temp + 1 < min) min = temp + 1;
            }
        }
        return min;
    }


    public static void main(String[] argv) {
        Coins2 c2 = new Coins2();
        System.out.println(c2.coinChange(new int[]{1,2,5}, 11));

    }
}
