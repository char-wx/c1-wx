/*
  给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的
相对顺序。
示例：
输入: [0,1,0,3,12]
输出: [1,3,12,0,0]
 */

import java.util.Scanner;
public class Task4{
   public static void main(String[]args){
       int L = 0;
       int[] num = new int[1000];
       //输入
       Scanner in = new Scanner(System.in);
       System.out.print("输入：");
       while(in.hasNextInt()){  //当输入非int数据时退出循环
           num[++L] = in.nextInt();
       }
       //调用
       zero(num,L); //参数为num数组地址和表示数组num长度的整型
       //输出
       System.out.print("输出：[");
       for(int i = 0; i < L; i++) {
           if(i < L-1)
               System.out.print(num[i]+",");
           else
               System.out.print(num[i]+"]");
       }
   }

   //zero:将所有 0 移动到数组的末尾，同时保证非0元素的相对顺序
   public static int[] zero(int[] array,int l){
       for(int i = 0; i < l; i++){
           if(array[i] == 0){
             for(int j = i; j < l; j++ ){ //发现0元素后将其移动到数组末尾
                 int t = array[j];
                 array[j] = array[j+1];
                 array[j+1] = t;
             }
             l-=1;//保证已经移动到末尾的0元素不会被重复交换
           }
       }
       return array;
   }
}