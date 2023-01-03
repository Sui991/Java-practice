
package homework;
import java.util.Scanner;

public class P6_6 {

   
    public static void main(String[] args) {
        int n;
       Scanner input=new Scanner(System.in);
         System.out.println("輸入一個整數");
       n=input.nextInt();
       displayPattern(n);
    }
    public static void displayPattern(int n) {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
              System.out.print("\n");
        }
    }
}
