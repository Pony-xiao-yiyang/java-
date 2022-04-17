package day04;

/**
 * @description:偶数求和
 * @author:
 * @time: 2022/4/16 21:16
 */
public class Demo04_oushuqiuhe {
    public static void main(String[] args) {
        /**
         * 需求：求1-100之间的偶数和，并把求和结果在控制台输出
         */
        int sum = 0;
        for (int i = 1; i <=100 ; i++) {
            if (i%2 ==0) {
                sum += i ;
            }
        }
        System.out.println("1-100之间的偶数和"+sum);
    }
}
