package exm201803;

import java.util.Scanner;

class Ball{
    int place;
    boolean direction; // true ->     false <-
}

public class Question2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int L = cin.nextInt();
        int t = cin.nextInt();
        Ball[] balls = new Ball[n];
        for (int i = 0; i < n; i++) {
            balls[i] = new Ball();
            balls[i].place = cin.nextInt();
            balls[i].direction = true;
        }

        for (int i = 0; i < t; i++) {

            // 每一秒球各走一步
            for (int j = 0; j < n; j++) {

                // 根据方向走一步
                if (balls[j].direction) {
                    balls[j].place++;
                    // 到右边界,方向向左
                    if (balls[j].place == L)
                        balls[j].direction = false;
                } else {
                    balls[j].place--;
                    // 到左边界,方向向右
                    if (balls[j].place == 0)
                        balls[j].direction = true;
                }
            }

            // 如果球撞在一起则换方向
            for (int ii = 0; ii < n - 1; ii++) {// 检查是否相撞
                for (int j = ii + 1; j < n; j++) {
                    if (balls[ii].place == balls[j].place) {
                        balls[ii].direction = !balls[ii].direction;
                        balls[j].direction = !balls[j].direction;
                        break;
                    }
                }
            }
        }
        for (Ball ball : balls)
            System.out.printf(ball.place + " ");
    }
}
