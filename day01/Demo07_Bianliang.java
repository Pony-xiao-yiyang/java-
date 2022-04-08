package day01;

/**
 * @description:变量使用的注意事项
 * @author:
 * @time: 2022/4/8 14:52
 */
public class Demo07_Bianliang {

    public static void main(String[] args) {
        /**
         * 变量使用的注意事项
         *  1.名字不能重复使用
         *  2.变量未赋值。不能使用
         *  3.long类型的变量定义的社会，为了防止整数过大，后面应加L
         *  4.float类型的变量定义的时候，为了防止类型不兼容的情况，后面需要加F
         */
        //定义byte类型的值的变量
        byte    b   =   10;

        //定义short类型的值的变量
        short   a   =   100;
        System.out.println(a);

        //定义int类型的值的变量
        double  d   =   13.14;
        System.out.println(d);

        //定义char类型的值的变量
        char    c   =   'a';
        System.out.println(c);

        //定义boolean类型的值的变量
        boolean bb  =   true;
        System.out.println(bb);

        //定义long类型的值的变量
        long i =    10000000L;
        System.out.println(i);

        //定义float类型的值的变量
        float f = 13.14F;
        System.out.println(f);

    }
}
