package 字符串.替换空格;
/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */

public class Solution {
    public String replaceSpace(StringBuffer str) {
        if(str == null || str.length() == 0){
            return str.toString();
        }
        StringBuffer str_ret = new StringBuffer();
        for(char c : str.toString().toCharArray()){
            if(c==' '){
                str_ret.append("%20");
            }else {
                str_ret.append(c);
            }
        }
        return str_ret.toString();
    }
}
