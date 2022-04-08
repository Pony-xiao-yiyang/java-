package day01;

/**
 * @description:赋值运算符
 * @author:
 * @time: 2022/4/8 17:22
 */
public class Demo13_Fuzhiyunsuanfu {
    public static void main(String[] args) {
        /**
         * 赋值运算符
         *      =       赋值    a = 10 将10赋值给变量a
         *
         *      +=      加后赋值    a+=b ，将a+b的值赋给a
         *
         *      -=      减后赋值    a-=b , 将a-b的值赋给a
         *
         *      *=      乘后赋值    a*=b ,  将a*b的值赋值给a
         *
         *      /=      除后赋值    a/=b,   将a+b的商给a
         *
         *      %=      取余后赋值   a%=b    将a+b的余数给a
         *
         *
         */
        int i= 10;
        System.out.println("i:"+i);

        //+==: 用前一个i + 后面一个 i

        i   += 20;
        System.out.println("i:"+i);

        //注意：扩展的赋值运算符底层隐含了强制类型转换
        short s =10;
//        s += 20;
        s = (short)(s+20);
        System.out.println(s);


    }
}
