package day05;

/**
 * @description:
 * @author:
 * @time: 2022/4/22 17:08
 */
public class Tiaozhuankongzhi {
    public static void main(String[] args) {
        /**
         * continue：用于循环中，基于条件控制，跳过某次循环体内容的执行，继续下一次的执行
         * break：用在循环中，基于条件控制，终止循环体内容的执行，也就是说结束当前的整个循环
         */
        for (int i = 1; i <=5; i++) {
            if (i%2 ==0) {
                //输出结果：1,3,5
//                continue;
                //输出结果：1
                break;
            }
            System.out.println(i);
        }
    }
}
