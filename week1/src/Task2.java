/*
 计算 1000 以内的水仙花数有多少个。所谓的“水仙花数”是指一个三位数其各位数字的
立方和等于该数本身，例如 153 是“水仙花数”，因为：153 = 1*1*1 + 5*5*5 + 3*3*3
 */
public class Task2 {
    public static void main(String[]args){
        int n = 0;
        for(int i = 100; i <= 1000; i++){
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if(i == ge*ge*ge + shi*shi*shi + bai*bai*bai)
                n++;
        }
        System.out.println("100以内水仙花数有"+n+"个。");
    }
}
