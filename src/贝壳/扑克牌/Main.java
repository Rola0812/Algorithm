package 贝壳.扑克牌;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String strs = in.next();
        char[] chars = strs.toCharArray();
        int[] nums = new int[chars.length];
        int[] times = new int[14];
        int res = 0;
        int res1 = 0;
        int res2 = 0;
        int res3 = 0;
        int res4 = 0;
        int res5 = 0;
        for(int i = 0;i<chars.length;i++){
            if(chars[i] == 'A'){
                nums[i] = 1;
            }else if(chars[i] == 'T'){
                nums[i] = 10;
            }else if(chars[i] == 'J'){
                nums[i] = 11;
            }else if(chars[i] == 'Q'){
                nums[i] = 12;
            }else if(chars[i] == 'K'){
                nums[i] = 13;
            }else {
                nums[i] = chars[i] - '0';
            }
            times[nums[i]]++;
        }
        for(int j = 1;j<=13;j++){
            if(times[j]>=4){
                res4++;
                times[j] = -1;
            }
            if(times[j]==3){
                res3++;
                times[j] = -1;
            }
        }
        int start = 1;
        int end = start;
        for(int k = start;k<=13;k++){
            if(times[k]<1){
                end = k;
                if(end-start+1>=5){

                }
                continue;
            }

        }

    }

}
