package day03;

import java.util.Scanner;

/**
 * @description:奇偶数
 * @author:
 * @time: 2022/4/10 21:30
 */

public class Demo01_If_Jioushu {

    public static void main(String[] args) {
        /**
         * 需求：任意给出一个整数，请用程序实现判断该整数是奇数还是偶数，并在控制台输出该整数是奇数还是偶数。
         * 分析：
         *      1.为了体现任意给出一个整数，采用键盘录用一个数据
         *          使用键盘录入功能需要导包
         *              import java.util.Scanner;
         *          创建对象
         *              Scanner sc  = new Scanner(System.in);
         *          接收数据
         *              int number = sc.nextInt();
         *      2.判断整数是偶数还是奇数要分两种情况进行判断，使用if...else结构
         *          if(){
         *
         *          }else{
         *
         *          }
         *     3.判断是否偶数需要使用区取余运算符实现该功能number %2 == 0
         *          if(number % 2 ==0){
         *
         *          }else{
         *
         *          }
         *     4.根据判断情况，在控制台输出对应的内容
         *     if(number % 2 ==0){
         *         System.out.println(number + "是偶数");
         *     }else{
         *         System.out.println(number + "是奇数");
         *     }
          */

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = scanner.nextInt();
        if (number %2 ==0) {
            System.out.println(number + "是偶数");
        } else {
            System.out.println(number + "是奇数");
        }

    }
}
