/*
1.从键盘输入包含n个整数的数组：int[] nums; int n ,target; Scanner  .nextInt()
2.定义一个threeSum方法用于找出数组中的三个元素 a，b，c ，使得 a + b + c =target。
    参数：int[] nums,int target     返回值：List<List<Integer>>
3.数组nums先排序,再。。。，最后得出返回集合
4.输出
 */

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入整数个数：");
        int n = in.nextInt();
        int[] nums = new int[n];
        System.out.println("请输入整数：");
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println("请输入目标数：");
        int target = in.nextInt();

        List<List<Integer>> res = threeSum(nums,target);
        System.out.println(res);

    }

    public static List<List<Integer>> threeSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > target)
                break;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) {
                    //数字一样跳过 防止重复
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1])
                        left++;
                    while (left < right && nums[right] == nums[right - 1])
                        right--;
                    left++;
                    right--;
                }
                else if (sum < target) left++;
                else if (sum > target) right--;
            }
        }
        return res;
    }

}
