/*
    1.定义一个HashMap类 map
    2.定义一个字符串存储从键盘输入的字符，str Scanner
    3.定义一个字符数组存储字符串的每个元素
    4.通过Map.merge方法实现字段值的累加
    5.通过使用entry对象遍历输出
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一串英文单词：");
        String str = in.next();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            map.merge(ch[i], 1, Integer::sum);
        }

        System.out.println("输出：");
        Set<Map.Entry<Character, Integer>> set = map.entrySet();
        for (Map.Entry<Character, Integer> entry : set) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ":" + value);
        }

    }

}