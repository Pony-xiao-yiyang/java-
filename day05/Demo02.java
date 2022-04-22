package day05;

/**
 * @description:
 * @author:
 * @time: 2022/4/22 16:52
 */
public class Demo02 {
    public static void main(String[] args) {
        int count = 0;
        double paper = 0.1;
        int zf = 8844430;
        while (paper<=zf){
            paper *=2;
            count++;
        }
        System.out.println("需要折叠"+count+"次");
    }
}
