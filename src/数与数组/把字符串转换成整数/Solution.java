package 数与数组.把字符串转换成整数;

/**
 * 将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，
 * 但是string不符合数字要求时返回0)，要求不能使用字符串转换整数的库函数。
 * 数值为0或者字符串不是一个合法的数值则返回0。
 */

public class Solution {
    public int StrToInt(String str) {
        if(str == null || str.length() == 0){
            return 0;
        }
        char[] chars = str.toCharArray();
        boolean flag = true;
        int start = 0;
        if(chars[0] == '-'){
            flag = false;
            start = 1;
        }
        if(chars[0] == '+'){
            flag = true;
            start = 1;
        }
        int res = 0;
        for(int i = start;i<chars.length;i++){
            if(chars[i]>'9' || chars[i]<'0'){
                return 0;
            }
            res = res*10 + chars[i]-'0';
        }
        return flag?res:-res;
    }
}
