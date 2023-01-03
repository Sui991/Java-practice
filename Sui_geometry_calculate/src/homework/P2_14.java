

import java.util.Scanner;

public class P2_14 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pounds,inches,BMI;
        System.out.print("Enter weight in pounds: ");
        pounds=input.nextDouble();
        System.out.print("Enter height in inches: ");      
        inches=input.nextDouble();
        BMI=(pounds*0.45359237)/Math.pow((inches*0.0254),2);
        System.out.print("BMI is:  "+BMI);    
        
        
        
        
    }

}
