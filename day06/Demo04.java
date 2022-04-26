package day06;

import java.util.Scanner;

/**
 * @description:
 * @author:
 * @time: 2022/4/26 21:11
 */
public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入a的值");
        double a = scanner.nextDouble();
        System.out.println("请输入b的值");
        double b = scanner.nextDouble();
        panduan(a,b);
    }

    private static void panduan(double a, double b) {
        if (a>b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
}
