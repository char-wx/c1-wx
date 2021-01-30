package Week1Task5;
import java.util.Scanner;
public class Task5 {
    public static void main(String[]args){
        System.out.println("输入圆半径：");
        //输入圆半径
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        //调用Task5Circle类
        Circle ci = new Circle();
        ci.radius = r;
        double a = ci.getArea();
        double p = ci.getPerimeter();
        //以字符串形式输出，小数点后保留2位
        System.out.print("输出：the area is ");
        System.out.printf("%.2f\n", a);
        System.out.print("     "+"the perimeter is ");
        System.out.printf("%.2f", p);
    }
}
