package 华为.厂商打折;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {//注意while处理多个case
            int num = in.nextInt();
            double price = in.nextDouble();

            if(num<=0 || num >10000 || price<=0 || price > 10000){
                return;
            }

            double asum = 0;
            double bsum = 0;

            if(num >= 3){
                asum = (price*0.7)*num+10;
                if(asum-10 > 50){
                    asum -= 10;
                }
            }else {
                asum = price*num + 10;
                if(asum-10 > 50){
                    asum -= 10;
                }
            }

            bsum = price*num;
            if(bsum >10){
                bsum -= 2;
            }
            bsum = bsum+6;
            if(bsum-6 >= 99){
                bsum = bsum-6;
            }
            if(bsum>asum){
                System.out.println("1");
            }else {
                System.out.println(bsum==asum?0:2);
            }
        }
    }
}
