

package homework;
import java.util.Scanner;
public class P6_4 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("輸入兩數:"); 
        System.out.print("m = "); 
        int m = scanner.nextInt();
        System.out.print("n = "); 
        int n = scanner.nextInt();
        System.out.println("GCD: " + gcd(m, n)); 
    }   
   
public static int gcd(int num1, int num2) {
        int r = 0;
 
        while(num2 != 0) {
            r = num1 % num2;
            num1 = num2;
            num2 = r;
        }
 
        return num1;
}
}
 