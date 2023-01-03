package homework;

import java.util.*;

public class P7_4 {

    public static void main(String[] args) {
        int n[] = new int[101];
        for (int c = 0; c <101; c++) {
            n[c] -= 1;
        }
        int total = 0;
        int count = 0;
        int num = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("輸入成績:");
        while (num != 0) {

            int i = input.nextInt();
            if (i >= 0) {
                n[i] = i;

                total += i;
                count += 1;
            }
            if (i < 0) {
                num = 0;

            }

        }
        for (int h = 0; h < 101; h++) {
            if (n[h] >= 0) {
                if (n[h] >= total / count) {
                    System.out.println(n[h] + "高於或等於平均值");
                } else {
                    System.out.println(n[h] + "低於平均值");
                }
            }
        }
    }
}
