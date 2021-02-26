import java.util.Arrays;
import java.util.Scanner;

/*
1.定义一个整数数组，键盘输入
2.数组排序，Arrays.sort()
3.索引找到第k小的数字
 */
public class Task4 {
    public static void main(String[] args) {
        System.out.println("请输入整数个数：");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        System.out.println("请输入整数");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        Arrays.sort(array);
        System.out.println("找出第k小的数，请输入k：");
        int k = in.nextInt();
        System.out.println("第"+k+"小的数为："+array[k-1]);

    }
}
