package day01;

/**
 * @description:三元运算符
 * @author:
 * @time: 2022/4/8 20:48
 */
public class Demo17_Sanyuanyunsuanfu {
    public static void main(String[] args) {
        /**
         * 三元运算符
         *      格式：关系表达式？ 表达式 1 ： 表达式 2
         *        eg: a > b ? a:b
         *      计算规则：
         *          首先计算关系表达式的值
         *          如果值为true，表达式1的值就是运算结果
         *          如果值为false，表达式2的值就是运算结果
         */
        //定义两个变量
        int a = 10;
        int b = 20;

        //获取两个数据中的较大值
        int max = a > b ? a : b;

        //输出答案
        System.out.println("max为"+max);

        System.out.println("=====================================================");

        /**
         * 案列：
         *      需求：动物园里有两只老虎，已知两只老虎的体重分别为180KG、200KG
         *      请用程序实现判断两只老虎的体重是否相同
         *
         *
         */
            double weight1 = 180;
            double weight2 = 200;
            boolean b1 =  weight1 == weight2 ? true:false ;
        System.out.println(b1);

        System.out.println("=====================================");

        /**
         * 案列：
         *      需求：一座寺庙里住着三个和尚，已知他们的身高分别为150cm、210cm、165cm
         *      请用程序实现获取这三个和尚的最高身高。
         */
        double height3 = 150;
        double height4 = 210;
        double height5 = 165;
//        double b2 = height3 > height4 ? height3 : height4;
//        double b3 = b2 > height5 ? b2 : height5;
        double b2 =(height3 > height4 ? height3 : height4) > height5 ? (height3 > height4 ? height3 : height4):height5;
        System.out.println("最高的身高是"+b2+"cm");


    }
}
