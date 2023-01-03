
package homework;
import java.util.Scanner;
public class P6_2 {

    public static void main(String[] args) {
        String n1;
        Scanner input=new Scanner(System.in);
        System.out.println("輸入一個數字");
        n1=input.nextLine();
       int ans=mulDigits(n1);
        System.out.print(ans);
    }
      public static int mulDigits(String n) {
     int a=1;
     String pro;
    int len=n.length();
    for (int i=len;i>=1;i--)
    {
          pro=n.substring(i-1,i);
          a=a*Integer.valueOf(pro);
              }
        return a;
 
 }
}