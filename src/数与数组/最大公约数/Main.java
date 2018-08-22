package 数与数组.最大公约数;

public class Main {
    static Object object = new Object();

    public int gcd(int m, int n){
        return n == 0?m:gcd(n,m%n);
    }

    public static void main(String[] args) {
        Object o = object;
        object = null;
        System.gc();
        System.out.println(o);
        System.out.println(object);
    }
}
