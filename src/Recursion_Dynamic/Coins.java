package Recursion_Dynamic;

public class Coins {
    private int change(int amount, int[] coins) {
        int[] res = new int[amount + 1];
        res[0] = 1;

        for (int coinVAl : coins) {
            for (int i = 0; i <= amount; i++) {
                if (i >= coinVAl) {
                    res[i] = res[i] + res[i - coinVAl];
                }
            }
        }
        printAmount(res);
        return res[amount];
    }

    private static void printAmount(int[] amount) {
        for (int i = 0; i < amount.length; i++) {
            System.out.println("For amount:" + i + " The nums is:" + amount[i]);
        }
    }

    public static void main(String[] argv) {
        Coins c = new Coins();
        System.out.println(c.change(5, new int[]{1, 2, 5}));
    }


}
