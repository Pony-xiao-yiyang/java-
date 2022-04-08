package day01;

/**
 * @description:字符的“+”操作
 * @author:
 * @time: 2022/4/8 17:05
 */
public class Demo12_zifucaozuo2 {
    public static void main(String[] args) {
        /**
         * 字符串的拼接
         * 1.当'+'操作出现字符串时，这个"+"是字符串连接符，而不是算术运算
         * 2.在“+”操作中，如果出现了字符串，就是连接运算符，否则就是算术运算符，当连续进行"+"操作时，从左到右逐个执行
         */
        System.out.println("我老婆是"+"有村架纯");
        System.out.println("我老婆是"+"新恒结衣");

        //优先级：先加法，再拼接
        System.out.println("我老婆"+6+66);//我老婆666
        System.out.println(1+99+"个老婆");//100个老婆

    }
}
