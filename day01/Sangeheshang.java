package day01;


import java.util.Scanner;

/**
 * @description:
 * @author:
 * @time: 2022/4/8 21:44
 */
public class Sangeheshang {

    /**
     * 案列：
     *      需求：一座寺庙里住着三个和尚，已知他们的身高未知
     *      请用程序实现获取这三个和尚的最高身高。
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入身高1");
        double b1  = scanner.nextDouble();
        System.out.println("请输入身高2");
        double b2  = scanner.nextDouble();
        System.out.println("请输入身高3");
        double b3  = scanner.nextDouble();
        double b =  (b1>b2 ?b1:b2)>b3 ? (b1>b2 ?b1:b2):b3;

        System.out.println(b);
    }

}
