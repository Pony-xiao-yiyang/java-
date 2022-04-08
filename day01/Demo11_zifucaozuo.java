package day01;

/**
 * @description:字符的+操作
 * @author:
 * @time: 2022/4/8 16:42
 */
public class Demo11_zifucaozuo {
    public static void main(String[] args) {

        //定义两个变量
        int i =  10;
        char c = 'A';//'A'的值是65
        c = 'a';// 'a'的值是97
        c = '0';//'0'的值是48
        System.out.println(i+c);
        /**
         * 字符的“+”操作
         * 拿字符在计算机底层对应的数值来进行计算的
         * 'A'----->65, A-Z是连续的
         * 'a'----->97, a-z是连续的
         * '0'----->48, 0-9是连续的
         */
    }
}
