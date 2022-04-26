package day06;

/**
 * @description:
 * @author:
 * @time: 2022/4/26 20:56
 */
public class Demo03Method {
    public static void main(String[] args) {
        isEvenNumber();
    }

    public static void isEvenNumber() {
        //定义变量
        int number = 10;
        number = 9;
        //判断该数据是否为偶数
        if (number%2 == 0) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
