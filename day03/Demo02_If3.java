package day03;

import java.util.Scanner;

/**
 * @description:if语句格式三
 * @author:
 * @time: 2022/4/10 22:49
 */
public class Demo02_If3 {
    public static void main(String[] args) {
        /**
         *      if语句
         *          格式：
         *              if(关系表达式){
         *                  语句体1;
         *              }else if(关系表达式){
         *                  语句体2;
         *              }
         *              .....
         *              else{
         *                  语句体n+1;
         *              }
         *
         *          执行流程：
         *              1.首先计算关系表达式1的值
         *              2.如果值为true就执行语句体1;如果值为false就计算关系表达式2的值
         *              3.如果值为true就执行语句体2;如果值为false就计算关系表达式3的值
         *              4. .......
         *              5.如果没有任何关系表达式为true，就执行语句体n+1;
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个星期数(1-7)");
        int week = scanner.nextInt();
        if (week == 1) {
            System.out.println("星期一");
        } else if (week ==2){
            System.out.println("星期二");
        } else if (week ==3){
            System.out.println("星期三");
        } else if (week ==4){
            System.out.println("星期四");
        } else if (week ==5){
            System.out.println("星期五");
        } else if (week ==6){
            System.out.println("星期六");
        }else {
            System.out.println("星期日");
        }
    }
}
