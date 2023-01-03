package homework;

import java.util.*;

public class P7_29 {

    public static void main(String[] args) {
        int poker[] = new int[53];
        int sum = 0;
        int turn = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 13; j++) {
                poker[i * j] = j;
            } 
        }
            while (sum ==0 ) {
                for (int t = 1; t <= 4; t++) {
                    
                    sum = sum+poker[1 + (int) (Math.random() * 52)];
               }
                turn+=1;
                System.out.println("發出四張牌 點數和為" + sum + " 回合數為" + turn);
                if (sum==24)
                {
                   sum+=0; 
                }
                else
                {
                    sum=0;
                }
                 
            }
       
    }

}
