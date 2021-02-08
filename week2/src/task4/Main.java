package task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("欢迎来到猜字游戏，请输入一个数：");
        Scanner in = new Scanner(System.in);
        Game game = new Game();
        while (true) {
            int a = in.nextInt();
            int b = game.guess(a);

            if (b == 0)
                break;

        }
    }

}
