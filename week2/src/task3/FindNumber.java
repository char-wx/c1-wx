package task3;


import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        System.out.println("请输入字符串: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        StringBuilder bui = new StringBuilder();

        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                bui.append(str.charAt(i));
                flag = true;
            } else {
                if (flag) {  //在每次在将数字放入字符串缓冲区后添加一个“,”
                    flag = false;
                    bui.append(",");
                }
            }
        }
        System.out.println("该字符串中的数字：" + bui);
    }
}
