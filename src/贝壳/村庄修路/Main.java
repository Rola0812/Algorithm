package 贝壳.村庄修路;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] v = new int[n];
        for(int i = 0;i<v.length;i++){
            v[i] = in.nextInt();
        }
        Arrays.sort(v);
        int res = 0;
        for(int i = 1;i<v.length;i++){
            res += v[i];
        }
        System.out.println(res);
    }
}
