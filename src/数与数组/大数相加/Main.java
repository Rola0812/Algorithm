package 数与数组.大数相加;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        String a="8888899999999888";
        String b="88888888888888";
        String str=new BigInteger(a).add(new BigInteger(b)).toString();
        System.out.println(str);

    }
}
