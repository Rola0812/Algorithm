package 贝壳.取消社团预约;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] req = new int[n][2];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<2;j++){
                req[i][j] = in.nextInt();
                if(req[i][j]>max){
                    max = req[i][j];
                }
                if(req[i][j]<min){
                    min = req[i][j];
                }
            }
        }
        int[] res = new int[max+1];
        for(int i = 0;i<n;i++){
            for(int j = req[i][1];j<=req[i][2];j++){
                res[j]++;
            }
        }
        boolean flag = true;
        for(int k = min;k<=max;k++){
            if(res[k] > 1){
                flag = false;
            }
        }
        if(flag = flag){
            System.out.println(n);
            for(int i = 0;i<n;i++){
                System.out.print(i+" ");
            }
        }
    }

}
