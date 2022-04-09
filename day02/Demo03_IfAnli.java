package day02;

import java.util.Scanner;

/**
 * @description:
 * @author:
 * @time: 2022/4/9 21:47
 */
public class Demo03_IfAnli {
    public static void main(String[] args) {
        /**
         * 案例：奇偶数
         * 需求：任意给出一个整数，请用程序实现判断该整数是奇数还偶数，并在控制台输出该整数是奇数还偶数
         * 分析：
         *      1.为了体现任意给出一个整数，采用键盘录入一个数据
         *      使用键盘录入功能需要导包
         *      import java.util.Scanner;
         *      创建对象
         *      Scanner sc = new Scanner(System.in);
         *      接收数据
         *      int number = sc.nextInt();
         *      2.判断整数是偶数还是奇数两种情况进行判断，使用if...else结构
         *      if(){
         *
         *      }else{
         *
         *      }
         *      3.判断是否偶数需要使用取余运算符实现该功能number % 2 ==0
         *      if(number % 2 ==0){
         *
         *      }else{
         *
         *      }
         *      4.根据判断情况，在控制台输入对应的内容
         *      if(number % 2 == 0){
         *          System.out.println(number + "是偶数"）;
         *      }else{
         *          System.out.println(number + "是奇数");
         *      }
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = scanner.nextInt();
        if (number%2 == 0) {
            System.out.println(number+"是偶数");
        } else {
            System.out.println(number+"是奇数");
        }

    }
}
