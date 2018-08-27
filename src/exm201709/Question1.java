package exm201709;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        int result;
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt() / 10;
        if (n < 3) {
            result = n;
        } else if (n < 5) {
            result = n + 1;
        } else  {
            int a = (n / 5);
            n %= 5;
            result = a * 7;
            if (n >= 3)
                result += n + 1;
            else
                result += n;
        }
        System.out.println(result);
    }
}
