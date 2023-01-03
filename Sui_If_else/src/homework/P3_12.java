

import java.util.Scanner;

public class P3_12 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,a,b ;
        System.out.print("Enter a three-digit integer:");
        i = input.nextInt();
        a=i/100;
        b=i % 10;
        if (a==b)
        {
            System.out.print(i+" is a palindrome");
        }
         else 
            System.out.print(i+" is not a palindrome");
        
    }

}
