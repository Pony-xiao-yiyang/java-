package day05;

import java.util.Scanner;

/**
 * @description:switch，以及switch的case穿透
 * @author:
 * @time: 2022/4/17 18:27
 */
public class Demo01 {
    public static void main(String[] args) {
        /**
         * 春夏秋冬
         */
        Scanner sc  = new Scanner(System.in);
        System.out.println("请输入你的选择的月份");
        int month = sc.nextInt();
        switch (month){
//            穿透效果
            case 1:
            case 2:
            case 12:
                System.out.println("冬天");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春天");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏天");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋天");
                break;
            default:
                System.out.println("你输入的有误");

        }

    }
}
