package day01;

/**
 * @description:关系运算符
 * @author:
 * @time: 2022/4/8 18:20
 */
public class Demo15_Guanxiyunsuanfu {
    public static void main(String[] args) {
        /**
         * 关系运算符
         *          ==      a==b    判断a和b的值是否相等，成立为true，不成立为false；
         *          !=      a!=b    判断a和b的值是否不相等，成立为true，不成立为false；
         *          >       a>b     判断a是否大于b，成立为true，不成立为false；
         *          >=      a>=b    判断a是否大于等于b，成立为true，不成立为false；
         *          <       a<=b    判断a是否小于b，成立为true，不成立为false；
         *          <=      a<=b    判断a是否小于等于b，成立为true，不成立为false；
         *
         *
         * 注意：
         *      关系运算符的结果都是Boolean类型，要么是true，要么是false；
         *      千万别把"=="误写成"="
         */

        //定义变量
        int i = 10;
        int j = 20;
        int k = 10;

        //==
        System.out.println(i == j);
        System.out.println(i == k);
        System.out.println("=========================================");

        //!=
        System.out.println(i != j);
        System.out.println(i != k);
        System.out.println("=========================================");

        //>
        System.out.println(i > j);
        System.out.println(i > k);
        System.out.println("=========================================");

        //>=
        System.out.println(i >= j);
        System.out.println(i >= k);
        System.out.println("=========================================");

        //<
        System.out.println(i < j);
        System.out.println(i < k);
        System.out.println("=========================================");

        //<=
        System.out.println(i <= j);
        System.out.println(i <= k);
        System.out.println("=========================================");

    }
}
