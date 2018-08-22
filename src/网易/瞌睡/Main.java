package 网易.瞌睡;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        int[] t = new int[n];

        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
        }
        for(int i=0;i<n;i++){
            t[i] = in.nextInt();
        }
        int max = 0;
        int current = 0;
        for(int i = 0;i<n;i++){
            current = 0;
            for(int j = i;i<n;j++){
                if(t[j]==1) {
                    current = current + a[i];
                }

            }

        }

    }

}
