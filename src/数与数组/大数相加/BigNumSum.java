package 数与数组.大数相加;

public class BigNumSum {

    /**
     * 用字符串模拟两个大数相加:前提两个都是正整数，当然你可以直接用BIGDECIMAL对象来计算
     * @param n1 加数1
     * @param n2 加数2
     * @return   相加结果
     */
    public static String bigAdd(String n1,String n2){

        StringBuffer result = new StringBuffer();

        //1、反转字符串
        n1 = new StringBuffer(n1).reverse().toString();
        n2 = new StringBuffer(n2).reverse().toString();

        int len1 = n1.length();
        int len2 = n2.length();
        int maxLen = len1 > len2 ? len1 : len2;
        boolean nOverFlow = false; //是否大于10，大于10需要进位

        //2.把两个字符串补齐，即短字符串的高位用0补齐
        if(len1 < len2){
            for(int i = len1 ; i < len2 ; i++){
                n1 += "0";
            }
        }
        else if (len1 > len2){
            for(int i = len2 ; i < len1 ; i++){
                n2 += "0";
            }
        }

        //3.把两个正整数相加，一位一位的加并加上进位
        for(int i = 0 ; i < maxLen ; i++){
            int nSum = Integer.parseInt(n1.charAt(i) +"") + Integer.parseInt(n2.charAt(i) +"");

            if(nSum<=9){
                if(nOverFlow==true){  //低位上一次有进位
                    if(nSum==9){
                        result.append(0);
                        nOverFlow=true;  //本次有进位，由于本来就是true，无需修改
                    }else{
                        result.append(nSum+1);
                        nOverFlow=false;
                    }

                }else {
                    result.append(nSum);
                }
            }
            else {//nSum最大为18
                if(nOverFlow==true){  //低位上一次有进位
                    result.append(nSum-10+1);
                    //nOverFlow=true;  //本次还有进位，由于本来就是true，无需修改
                }else {
                    result.append(nSum-10);
                    nOverFlow=true;  //本次有进位
                }
            }
        }

        if(nOverFlow==true){ //最后还有进位，最高位直接加1
            result.append(1);
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {

        String str = bigAdd("100000000000009","900000000000001");

        System.out.println("100000000000000");
        System.out.println(str);
    }
}

