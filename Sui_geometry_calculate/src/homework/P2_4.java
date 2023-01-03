

import java.util.Scanner;

public class P2_4 {


    
    public static void main(String[] args) {
        double squ;
        double ping;
        System.out.print("Enter a numbler in square meters:");
        Scanner input=new Scanner(System.in);
        squ=input.nextDouble();
        ping=squ*0.3025;
        System.out.print(squ+"square meters is "+ping+"pings");
                
    }

}
