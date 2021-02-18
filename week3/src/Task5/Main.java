package Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("除法器");
        System.out.println("请输入两个数，分别代表被除数,除数：");
        double a = in.nextDouble();
        double b = in.nextDouble();
        bCheck(a, b);
    }

    public static void bCheck(double a, double b) {
        if (b == 0) {
            try {
                throw new IoException("除数不能为0");
            } catch (IoException e) {
                e.printStackTrace();
                return;
            }
        }
        System.out.println(a / b);
    }
}
