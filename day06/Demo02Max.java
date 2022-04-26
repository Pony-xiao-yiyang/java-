package day06;

/**
 * @description:数组最大值
 * @author:
 * @time: 2022/4/26 20:43
 */
public class Demo02Max {
    public static void main(String[] args) {
        int[] arr =   {11,22,33,55,44};
        int max = arr[0];
        for (int x = 0; x < arr.length; x++) {
            if (arr[x]>max) {
                max = arr[x];
            }

        }
        System.out.println(max);
    }

}
