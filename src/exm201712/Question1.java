package exm201712;

import java.util.Arrays;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int result = Integer.MAX_VALUE;
        int n = cin.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = cin.nextInt();

        Arrays.sort(nums);
        // 排序后只需选出两个相邻的元素最小的差值
        int len = nums.length-1;
        for (int i = 0; i < len; i++) {
            result = Math.min(result, Math.abs(nums[i] - nums[i+1]));
        }
        System.out.println(result);
    }
}
