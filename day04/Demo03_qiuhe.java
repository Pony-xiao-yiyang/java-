package day04;

/**
 * @description:
 * @author:
 * @time: 2022/4/16 20:34
 */
public class Demo03_qiuhe {
    public static void main(String[] args) {
        /**
         * 求和：
         *      求1-5之间的数据和，并把求和结果在控制台上输出
         */
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
            System.out.println("1-5之间的数据求和为"+sum);
        }

    }
}
