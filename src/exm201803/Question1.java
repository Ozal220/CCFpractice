package exm201803;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        int sum = 0;
        int nice = 0;
        Scanner cin = new Scanner(System.in);
        while (cin.hasNextInt()) {
            int n = cin.nextInt();
            if (n == 0)
                break;
            else if (n == 1){
                nice = 0;
                sum += 1;
            }
            else if (n == 2){
                nice += 2;
                sum += nice;
            }
        }
        System.out.println(sum);
    }
}
