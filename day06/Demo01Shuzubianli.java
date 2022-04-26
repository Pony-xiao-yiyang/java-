package day06;

/**
 * @description:数组遍历
 * @author:
 * @time: 2022/4/26 20:34
 */
public class Demo01Shuzubianli {
    public static void main(String[] args) {
      int[] arr =   {11,22,33,44,55};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);


        for (int x = 0; x < 5; x++) {
            System.out.println(arr[x]);
        }
    }
}
