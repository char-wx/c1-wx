import java.util.Scanner;

/*
String indexOf
1.定义 两个String   通过键盘输入in.next();
2.用indexOf方法

 */
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = new String();
        String str2 = new String();
        System.out.println("请输入一串字符：");
        str1 = in.next();
        System.out.println("请输入索引的字符串：");
        str2 = in.next();

        System.out.println( str1.indexOf(str2));

    }
}
