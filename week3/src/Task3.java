/*
 1.从键盘输入一个字符串 str
 2.将字符串变成字符数组
 3.定义一个LinkedHashSet集合，将字符数组存储到集合中
 4。将集合中的元素存储到数组中，遍历输出。 .toArray();
 */

import java.util.Scanner;
import java.util.LinkedHashSet;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入一串字符：");
        String str = in.next();
        char[] ch = str.toCharArray();
        LinkedHashSet<String> linked = new LinkedHashSet<>();
        for (int i = 0; i < ch.length; i++) {
            linked.add(String.valueOf(ch[i]));
        }

        Object[] chars = linked.toArray();
        for (int j = 0; j < chars.length; j++) {
            System.out.print(chars[j]);
        }


    }
}
