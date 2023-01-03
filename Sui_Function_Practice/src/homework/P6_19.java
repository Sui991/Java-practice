

package homework;
import java.util.Scanner;
public class P6_19 {

    
    public static void main(String[] args) {
        double side1,side2,side3,area;
       
          Scanner input=new Scanner(System.in);
          System.out.println("請輸入三角形的三個邊:");
          side1=input.nextDouble();
          side2=input.nextDouble();
          side3=input.nextDouble();
        boolean isValid1=isValid(side1,side2,side3);
         if (isValid1)
         {
             area=area(side1,side2,side3);
             System.out.print("三角形面積為:"+area);
         }
         else if (!isValid1){
             System.out.print("資訊無效");
         }
    }
 public static boolean isValid(double side1,double side2, double side3){
     boolean isValid=true;
     if ((side1+side2)<side3)
     {
     isValid=false;
     
     }
     if ((side1+side3)<side2)
     {
  isValid=false;
     }
     if ((side3+side2)<side1)
     {
    isValid=false;
     }
     return isValid;
     
 }
 public static double area(double side1, double side2, double side3){
     double s,area;
     s=(side1+side2+side3)/2;
     area=Math.pow(s*((s-side1)*(s-side2)*(s-side3)),0.5);
     return area;
 }
}
