package exm201703;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        int result = 0;
        int kg = 0;
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int k = cin.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = cin.nextInt();
        }
        for (int num : nums) {
            if ((kg += num) >= k){
                result++;
                kg = 0;
            }
        }
        if(kg > 0)
            result++;
        System.out.println(result);
    }
}
