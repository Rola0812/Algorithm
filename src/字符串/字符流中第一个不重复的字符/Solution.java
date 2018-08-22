package 字符串.字符流中第一个不重复的字符;

/**
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。
 * 例如，当从字符流中只读出前两个字符"go"时，
 * 第一个只出现一次的字符是"g"。
 * 当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 */
public class Solution {
    int[] array = new int[256];
    StringBuilder sb = new StringBuilder();
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        sb.append(ch);
        array[ch]++;
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        char[] chars = sb.toString().toCharArray();
        for(int i = 0;i<chars.length;i++){
            if(array[chars[i]] == 1){
                return chars[i];
            }
        }
        return '#';
    }
}
