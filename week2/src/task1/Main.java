package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Move m = new Move();
        System.out.println("请输入二维矩阵A（nxn）的中n的值：");
        int n = in.nextInt();
        m.setN(n);
        System.out.println("请依次输入矩阵A中的数据：");
        int[][] matrix = new int[n][n];
        in.nextLine();
        m.setMatrix(matrix);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                matrix[i][j] = in.nextInt();
        }

        System.out.println("此时图像为：");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.printf("%4d", matrix[i][j]);
            System.out.printf("\n");
        }

        System.out.println("矩阵图像顺时针旋转 90 度为：");
        m.move();

    }
}

