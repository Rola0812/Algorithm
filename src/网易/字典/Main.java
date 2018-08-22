package 网易.字典;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    private static void PermutationHelper(char[] cs, int i, ArrayList<String> list) {
        if(i == cs.length-1){
            for(int k = 0;k<list.size();k++){
                if(list.get(k).equals(String.valueOf(cs))){
                    return;
                }
            }
            list.add(String.valueOf(cs));
        }else {
            for(int j = i;j<cs.length;j++){
                if(j== i || cs[j] != cs[i]){
                    swap(cs,i,j);
                    PermutationHelper(cs,i+1, list);
                    swap(cs,i,j);
                }
            }
        }
    }

    private static void swap(char[] cs,int i,int j){
        char temp = cs[i];
        cs[i] = cs[j];
        cs[j] = temp;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        char[] chars = new char[n+m];
        for(int i=0;i<n;i++){
            chars[i] = 'a';
        }
        for(int j=n;j<n+m;j++){
            chars[j] = 'z';
        }
        ArrayList<String> list = new ArrayList<String>();
        PermutationHelper(chars, 0, list);
        Collections.sort(list);
        System.out.println(list);
        if(k>list.size()){
            System.out.println("-1");
        }else {
            System.out.println(list.get(k-1));
        }
    }
}
