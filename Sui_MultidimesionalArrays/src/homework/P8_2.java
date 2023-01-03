
package homework;

import java.util.*;
public class P8_2 {

   
    public static void main(String[] args) {
     double dia[][]=new double[4][4];
     double aver=0;
     Scanner input=new Scanner(System.in);
     System.out.println("Enter a 4-by-4 matrix row by row:");
     for (int i=0;i<dia.length;i++)
     {
         for (int j=0;j<dia.length;j++)
         {
             dia[i][j]=input.nextDouble();             
         }
     }
     aver=averageMajorDiagonal(dia);
     System.out.println("Average of the elements in the major diagonal is "+aver);
        }
public static double averageMajorDiagonal(double [][]m)
{ double aver;
    double sum=0;
    double count=0;
     for (int i=0;i<m.length;i++)
     {
         for (int j=i;j<m.length;j+=4)
         {
                 sum+=m[i][j];
                 count+=1;
         }
     }
     
     aver=sum/count;
     
     return aver;
}
}
