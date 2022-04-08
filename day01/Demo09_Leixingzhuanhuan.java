package day01;

/**
 * @description:
 * @author:
 * @time: 2022/4/8 15:18
 */
public class Demo09_Leixingzhuanhuan {
    public static void main(String[] args) {
        /**
         * 类型转换
         *      自动类型转换
         *          把一个表示数据范围小的数值或者变量赋值给另一个表示数据范围大的变量
         *          eg:double = 10;
         *
         *      强制类型转换
         *          把一个表示数据范围大的数值或者变量复制给另一个表示数据范围小的变量
         *          格式：目标数据类型 变量名 = （目标数据类型）值或者变量
         *          eg：int K = （int）88.88;
         *
         */
        //自动类型转换
        double d = 10;
        System.out.println(d);

        //定义byte类型的变量
        byte b = 10;
        short s = b;
        int i = b;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);

        //这是不可以的，类型不兼容
//        char c = b;

        //强制类型转换
        int k  = (int)88.88;
        System.out.println(k);

    }
}
