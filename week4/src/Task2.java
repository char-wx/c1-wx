import java.util.Arrays;
import java.util.Scanner;

/*
1.输入一个字符串,toCharArray()变为字符数组array1,array2
2.对array1排序，Array.sort(array1)
3.遍历array2,找到array1[i]与后一位比较indexOf??，直到不重复为止时

array1:排序后   , array2:排序前
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = in.next();
        char[] array1 = str.toCharArray();
        Arrays.sort(array1);
        char[] array2 = str.toCharArray();
        boolean bool = false;

        for (int i = 0; i < array2.length; i++) {
            char ch = array2[i];
            for (int j = 0; j < array1.length; j++) {
                if (ch == array1[j]) {
                    if (j == array1.length - 1) {
                        System.out.println(i);
                        bool = true;
                        break;
                    }
                    if (ch != array1[j + 1]) {
                        System.out.println(i);
                        bool = true;
                        break;
                    }
                    break;
                }
            }

            if(bool == true){
                break;
            }

        }
    }
}
