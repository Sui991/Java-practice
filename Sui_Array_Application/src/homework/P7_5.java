

package homework;
import java.util.*;
public class P7_5 {

    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("輸入15個整數:");
         int odd=0,even=0;
         for (int i=0;i<15;i++)
         {
             int integer=input.nextInt();
             if (integer % 2==0)
             {
                 even+=1;
             }
             else
             {
                 odd+=1;
             }
         }
                 System.out.println("The number of odd numbers:"+odd);
                  System.out.println("The number of even numbers:"+even);
    }

}
