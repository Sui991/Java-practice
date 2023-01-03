
package homework;
import java.util.*;

public class P8_5 {

   
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     double add[][]=new double[2][2];
     double matrix1[][]=new double[2][2];
     double matrix2[][]=new double[2][2];
     System.out.println("Enter matrix1:");
     for (int i=0;i<matrix1.length;i++)
     {
         for (int j=0;j<matrix1[i].length;j++)
         {
             matrix1[i][j]=input.nextDouble();
         }
     }
      System.out.println("Enter matrix2:");
       for (int i=0;i<matrix2.length;i++)
     {
         for (int j=0;j<matrix2[i].length;j++)
         {
             matrix2[i][j]=input.nextDouble();
         }
     }
       add=addMatrix(matrix1,matrix2);
       System.out.println("The matrices are added as follows:");
        for (int i=0;i<matrix1.length;i++)
     {
         for (int j=0;j<matrix1[i].length;j++)
         {
            System.out.print(matrix1[i][j]+" ");
         }
           System.out.println();
     }
         System.out.println("   +");
           for (int i=0;i<matrix2.length;i++)
     {
         for (int j=0;j<matrix2[i].length;j++)
         {
             System.out.print(matrix2[i][j]+" ");
         }
         System.out.println();
     }
           System.out.println("   =");
            for (int i=0;i<add.length;i++)
     {
         for (int j=0;j<add[i].length;j++)
         {
             System.out.print(add[i][j]+" ");
         }
         System.out.println();
     }
    }   
    
public static double [][] addMatrix(double [][] a,double [][]b)
{
    double addmatrix[][]=new double[2][2];
         for (int i=0;i<addmatrix.length;i++)
     {
         for (int j=0;j<addmatrix[i].length;j++)
         {
             addmatrix[i][j]=a[i][j]+b[i][j];
         }
     }
         return addmatrix;
}
}
