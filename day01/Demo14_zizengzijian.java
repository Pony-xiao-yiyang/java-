package day01;

/**
 * @description:自增自减运算符
 * @author:
 * @time: 2022/4/8 17:46
 */
public class Demo14_zizengzijian {
    public static void main(String[] args) {
        /**
         * 自增自减运算符
         *      ++      自增      变量的值+1
         *      --      自减      变量的值-1
         *
         *
         * ++和--既可以放在变量的后面，也可以放在变量的前面
         * 单独使用的时候，++和--无论是放在变量前面还是后面，结果都是一样的。
         * 参与操作的时候，如果放在变量的后面，先拿变量参与操作，后拿变量做++或者--；
         * 参与操作的时候，如果放在变量的前面，先拿变量做++或者--，后拿变量参与操作；
         *
         * 最常见的操作：单独使用
         */
        //定义变量

        int i = 10;

        System.out.println("i:"+i);
//            单独使用
//        i++;//i:11
//        ++i;//i:11
//        System.out.println("i:"+i);

        //参与操作作用
        //先把i 赋值给了j ,i在自加
//        int j = i++;
//        System.out.println("i:"+i);//i:11
//        System.out.println("j:"+j);//j:10

        //先把i自加，再赋值给了J
        int j = ++i;
        System.out.println("i:"+i);
        System.out.println("j:"+j);
    }
}
