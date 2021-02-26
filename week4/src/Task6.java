import java.util.Scanner;

/*
1.定义一个字符串str1(){}[],输入一个字符串atr2
2.str2变为字符数组array
3.遍历字符数组，每次遍历时，用indexOf（）索引array[i]在str1中位置，
  若i=array.length-1,返回值为非负，输出true,break
  若在返回值为为非负数，continue。
  返回值为-1，输出false，break

 */
public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = "(){}[]";
        System.out.println("请输入字符串：");
        String str2 = in.next();
        char[] array = str2.toCharArray();
        for (int i = 0; i < array.length; i++) {
            int result = str1.indexOf(array[i]);
            if(i==array.length-1&&result!=-1){
                System.out.println("true");
                break;
            }
            if(result != -1){
                continue;
            }
            System.out.println("false");
            break;
        }
    }
}
