package day05;

/**
 * @description:
 * @author:
 * @time: 2022/4/22 18:49
 */
public class ShuzuDemo {
    public static void main(String[] args) {
        int[] arr = new int[3];
        /**
         * 左面：
         *      int:说明数组中的元素类型是int类型
         *      []: 说明这是一个数组
         *      arr:这是数组的名称
         *
         * 右面：
         *      new:为数组申请内存空间
         *      int:说明数组中的元素类型是int类型
         *      []：说明这是一个数组
         *      3:数组长度，其实就是数组中的元素个数
         */
        //输出数组组名
        System.out.println(arr);//[I@50cbc42f

        //输出数组中的元素
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

    }
}
