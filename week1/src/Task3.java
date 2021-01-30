/*
编写一个函数，其作用是将输入的字符串反转过来。
示例 1：
输入：hello
输出：olleh
 */
import java.util.Scanner;
public class Task3 {
       //数组对称位置交换
        public static void swap(char[] a, int begin, int end) {
            while(begin<end) {
                char t=a[begin];
                a[begin]=a[end];
                a[end]=t;
                begin++;
                end--;
            }
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String str1=sc.next();
            //toCharArray自写swap方法转换
            char [] c1=str1.toCharArray();
            swap(c1,0,c1.length-1);
            System.out.println(c1);
        }
    }