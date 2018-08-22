package 字符串.第一个只出现一次的字符;

/**
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,
 * 并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 */
public class Solution {
    public int FirstNotRepeatingChar(String str) {
        if(str == null || str.length() == 0){
            return -1;
        }
        int[] array = new int[256];
        char[] chars = str.toCharArray();
        for(int i = 0;i<str.length();i++){
            array[chars[i]]++;
        }
        for(int i = 0;i<str.length();i++){
            if(array[chars[i]]==1){
                return i;
            }
        }
        return 0;
    }
}
