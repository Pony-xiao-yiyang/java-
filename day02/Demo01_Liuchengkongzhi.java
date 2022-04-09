package day02;

/**
 * @description:流程控制
 * @author:
 * @time: 2022/4/9 21:04
 */
public class Demo01_Liuchengkongzhi {
    public static void main(String[] args) {
        /**
         * 流程控制
         *      1.1 流程控制语句概述
         *      1.2流程控制语句结构
         *          顺序结构
         *              顺序结构是程序中最简单最基本的流程控制，没有特定的语法结构，按照代码的先后顺序，依次执行
         *              程序中绝大部分的代码都是这样执行的
         *                  eg: 开始--->语句A--->语句B--->语句C---->结束
         *          分支结构(if , switch)
         *             1. if语句
         *                  if语句格式1：
         *                      if(关系表达式){
         *                             语句体;
         *                      }
         *                          执行流程:
         *                              (1)首先计算关系表达式的值
         *                              (2)如果关系表达式的值为true就执行语句体
         *                              (3)如果关系表达式的值为false就不执行语句体
         *                              (4)继续执行后面的语句内容
         *
         *                  if语句格式2:
         *                      if(关系表达式){
         *                          语句体1;
         *                      }else{
         *                          语句体2;
         *                      }
         *                          执行流程：
         *                              (1)首先计算关系表达式的值
         *                              (2)如果关系表达式的值为true就执行语句体1
         *                              (3)如果关系表达式的值为false就执行语句体2
         *                              (4)继续执行后面的语句内容
         *          循环结构(for,while,do...while)
         */

        /**
         * 需求：判断a和b的值是否相等，如果相等，就在控制台输出，a等于b
         */
        int a = 10;
        int b = 20;
        if (a == b) {
            System.out.println("a等于b");
        }
        System.out.println("结束");

        /**
         * 需求：判断a和c的值是否相等，如果相等，就在控制台输出，a等于c
         */
        int c = 10 ;
        if (a == c) {
            System.out.println("a等于c");
        }
        System.out.println("结束");
    }

}
