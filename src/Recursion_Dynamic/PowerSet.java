package Recursion_Dynamic;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 0) return res;
        this.getSubSet(nums, 0, res, new ArrayList<>());
        return res;
    }

    private void getSubSet(int[] nums, int curr, List<List<Integer>> res, List<Integer> subset) {
        res.add(new ArrayList<>(subset));
        for (int index = curr; index < nums.length; index++) {
            subset.add(nums[index]);
            getSubSet(nums, index + 1, res, subset);
            subset.remove(subset.size() - 1);
        }
    }

    public static void main(String[] argv) {
        PowerSet ps = new PowerSet();
        List<List<Integer>> res = ps.subsets(new int[]{1, 2, 3});
        for (List<Integer> list : res) {
            for (Integer a : list) {
                System.out.print("" + a+",");
            }
            System.out.println();
        }
    }
}
