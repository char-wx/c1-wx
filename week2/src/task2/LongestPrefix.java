package task2;

import java.util.Scanner;

public class LongestPrefix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入字符串个数：");
        int n = in.nextInt();
        System.out.println("请输入字符：");
        String[] strs = new String[n];
        for (int i = 0; i < n; i++)
            strs[i] = in.next();

        StringBuilder longestPrefix = new StringBuilder();
        String prefix = strs[0];
        int num = 0;
        char b = prefix.charAt(0);
        for (int k = 1; k < n; k++) {
            if (b != strs[k].charAt(0)) {
                System.out.println("不存在公共前缀！");
                num++;
                break;
            }
        }
        if (num == 0) {
            for (int i = 0; i < prefix.length(); i++) {
                char a = prefix.charAt(i);
                for (int j = 0; j < n; j++) {
                    if (a != strs[j].charAt(i))
                        break;
                    else if (j == n - 1)
                        longestPrefix.append(a);
                }

            }

            System.out.println("最大公共前缀为：" + longestPrefix.toString());
        }
    }
}

