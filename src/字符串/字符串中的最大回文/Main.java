package 字符串.字符串中的最大回文;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        while(scanner.hasNext()){
            str = scanner.next();
            char[] chars = str.toCharArray();
            int len = str.length();
            if(len<=1)
            {
                System.out.println(len);
                continue;
            }
            int num = 1;
            for(int i=1;i<len-1;i++)
            {
                if(chars[i]==chars[i+1])
                {//偶数对成
                    int curnum = 0;
                    int start = i;int end =i+1;
                    while(start>=0 && end<len && chars[start] == chars[end])
                    {
                        start--;
                        end++;
                        curnum+=2;
                    }
                    if(curnum>num)
                        num = curnum;
                }
                if(chars[i-1]==chars[i+1])
                {//偶数对成
                    int curnum = 1;
                    int start = i-1;int end =i+1;
                    while(start>=0 && end<=len && chars[start] == chars[end])
                    {
                        start--;
                        end++;
                        curnum+=2;
                    }
                    if(curnum>num)
                        num = curnum;
                }
            }
            System.out.println(num);
        }
    }
}
