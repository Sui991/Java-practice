

package homework;

import java.util.*;
public class P7_14 {
    
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num[]=new int[5];
        for (int i=0;i<num.length;i++)
        {
            num[i]=input.nextInt();
        }
        
             System.out.println(gcd(num));
    }
public static int gcd(int... number) {
int tmp = 0;
while (number[0]% number[1] != 0) {
tmp = number[1];
number[1] = number[0] % number[1];
number[0] = tmp;
}
return number[1];
}
}
