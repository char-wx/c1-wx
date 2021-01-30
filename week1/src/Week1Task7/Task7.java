package Week1Task7;
import java.util.Scanner;
public class Task7 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("第一行输入两个数字分别表示第一个复数的实部和虚部,第二行同理。");
        System.out.println("请输入第一个复数：");
        int A1 = in.nextInt();
        int B1 = in.nextInt();
        System.out.println("请输入第二个复数：");
        int A2 = in.nextInt();
        int B2 = in.nextInt();
        CompoundNumber cn = new CompoundNumber(A1,B1,A2,B2);
        System.out.print("相加结果为：");
        cn.add();
        System.out.print("相减结果为：");
        cn.reduce();
        System.out.print("相乘结果为：");
        cn.multiply();
    }

}
