package task4;

import java.util.Scanner;

public class Game {
    private int v = 100;

    public int guess(int a) {
        if (a == this.v) {
            System.out.println("恭喜你，猜对了！");
            return 0;
        }
        if (a > this.v) {
            System.out.println("猜的有点大，再试一次吧！");
            return 1;
        } else {
            System.out.println("猜的有点小，再试一次吧！");
            return 1;
        }
    }
}
