/*
1. 请用 if ... else 编写一个程序，用于计算体质指数 BMI，并打印结果。
BMI = 体重(kg)除以身高(m)的平方
BMI 结果：
过轻：低于 18.5
正常：18.5-25
过重：25-28
肥胖：28-32
非常肥胖：高于 32
 */

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner in = new Scanner(System.in);
        //输入体重和成绩
        System.out.println("输入体重（kg）:");
        double weight = in.nextDouble();
        System.out.println("输入身高（m）:");
        double height = in.nextDouble();
        //If-Else
        double bmi = weight / (height *height);
        if(bmi > 0 && bmi <= 18.5)
            System.out.println("过轻");
        else if(bmi > 18.5 && bmi <= 25)
            System.out.println("正常");
        else if(bmi > 25 && bmi <= 28)
            System.out.println("过重");
        else if(bmi > 28 && bmi <= 32)
            System.out.println("肥胖");
        else if(bmi > 32)
            System.out.println("非常肥胖");
        else
            System.out.println("请输入正确身高体重！");

    }
}


