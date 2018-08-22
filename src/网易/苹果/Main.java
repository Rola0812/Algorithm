package 网易.苹果;

/**
 * 又到了丰收的季节，恰逢小易去牛牛的果园里游玩。
 * 牛牛常说他对整个果园的每个地方都了如指掌，小易不太相信，所以他想考考牛牛。
 * 在果园里有N堆苹果，每堆苹果的数量为ai，小易希望知道从左往右数第x个苹果是属于哪一堆的。
 * 牛牛觉得这个问题太简单，所以希望你来替他回答。
 *
 * 输入描述:
 * 第一行一个数n(1 <= n <= 105)。
 * 第二行n个数ai(1 <= ai <= 1000)，表示从左往右数第i堆有多少苹果
 * 第三行一个数m(1 <= m <= 105)，表示有m次询问。
 * 第四行m个数qi，表示小易希望知道第qi个苹果属于哪一堆。
 *
 *
 * 输出描述:
 * m行，第i行输出第qi个苹果属于哪一堆。
 *
 * 输入例子1:
 * 5
 * 2 7 3 4 9
 * 3
 * 1 25 11
 *
 * 输出例子1:
 * 1
 * 5
 * 3
 *
 */

import java.util.Scanner;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int a = 0;
        int appleNums[] = new int[n];
        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            appleNums[i] = a + input;
            a = appleNums[i];
        }

        int m = scanner.nextInt();
        int searchNums[] = new int[m];
        for (int i = 0; i < m; i++) {
            searchNums[i] = scanner.nextInt();
        }

        //二分查找法
        for (int i = 0; i < m; i++) {
            int index = Arrays.binarySearch(appleNums, searchNums[i]);
            if (index>0) {
                System.out.println(index+1);
            }else{
                System.out.println(-index);
            }
        }
    }
}