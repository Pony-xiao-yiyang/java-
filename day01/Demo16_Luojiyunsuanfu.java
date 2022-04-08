package day01;

/**
 * @description:
 * @author:
 * @time: 2022/4/8 18:43
 */
public class Demo16_Luojiyunsuanfu {
    public static void main(String[] args) {
        /**
         * 逻辑运算符
         *      在数学中，一个数据x，大于2，小于6，我们可以这样进行表示：3<x<6
         *      在java中，需要把上面的式子先进行拆解，再进行合并表达。
         *      拆解为：x>3和x<6
         *      合并后: x>3 && x<6
         *
         *      &&其实就是一个逻辑运算符
         *      我们可以这样说，逻辑运算符，是用来连接关系运算符的运算符
         *      当然，逻辑运算符也可以直接连接布尔类型的常量或者变量
         *
         *      &   逻辑与
         *      |   逻辑或
         *      ^   逻辑异或
         *      !   逻辑非
         */
        //定义变量
        int i  = 10;
        int j  = 20;
        int k  = 30;

        //& 有false则false
        System.out.println((i > j)&(i > j));//false & false
        System.out.println((i < j)&(i > j));//true & false
        System.out.println((i > j)&(i < j));//false & ture
        System.out.println((i < j)&(i < j));//true & true
        System.out.println("==================================================");

        //| 有true则true
        System.out.println((i > j)|(i > j));//false | false
        System.out.println((i < j)|(i > j));//true | false
        System.out.println((i > j)|(i < j));//false | ture
        System.out.println((i < j)|(i < j));//true | true
        System.out.println("==================================================");

        //^ 相同为false，不同则为true
        System.out.println((i > j)^(i > j));//false ^ false
        System.out.println((i < j)^(i > j));//true ^ false
        System.out.println((i > j)^(i < j));//false ^ ture
        System.out.println((i < j)^(i < j));//true ^ true
        System.out.println("==================================================");

        //!
        System.out.println(i > j);//false
        System.out.println(!(i < j));//!false
        System.out.println(!!(i > j));//!!false
        System.out.println(!!!(i < j));//!!!false
        System.out.println("==================================================");

        /**
         * 短路运算符
         *      &&      短路与     作用和 & 相同，但是有短路效果
         *      ||      短路或     作用和 | 相同，但是有短路效果
         *
         *
         * 注意事项：
         *      逻辑与&，无论左面真假，右面都要执行
         *      短路与&&，如果左面为真，右面执行；如果左面为假，右面不执行
         *
         *      逻辑或 |，无论左面真假，右面都要执行
         *      短路或 ||，如果左面为假，右面执行；如果左面为真，右面不执行
         *
         *
         * 最常见的逻辑运算：&&，||，！
         */

        //^ 相同为false，不同则为true
        System.out.println((i > j)&&(i > j));//false && false
        System.out.println((i < j)&&(i > j));//true && false
        System.out.println((i > j)&&(i < j));//false && ture
        System.out.println((i < j)&&(i < j));//true && true
        System.out.println("==================================================");

        //^ 相同为false，不同则为true
        System.out.println((i > j)||(i > j));//false || false
        System.out.println((i < j)||(i > j));//true || false
        System.out.println((i > j)||(i < j));//false || ture
        System.out.println((i < j)||(i < j));//true || true
        System.out.println("==================================================");

        //&&和&
//        System.out.println((i++ > 100)  &   (j++ > 100));//false & false//i = 11,j=21
        System.out.println((i++ > 100)  &&   (j++ > 100));//false & false//i = 11,j = 20,因为i++为false，所以 j++ > 100就没有执行了
        System.out.println("i:"+i);
        System.out.println("j:"+j);



    }
}
