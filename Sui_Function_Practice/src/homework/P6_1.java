package homework;

public class P6_1 {

    public static void main(String[] args) {
     int count=0;
     for (int i=1;i<=100;i++)
     {
         int n=getPentagonalNumber(i);
         System.out.print(n+",");
         count+=1;
         if (count%10==0)
         {
             System.out.print("\n");
         }
     } 
    }
     public static int getPentagonalNumber(int n) {
         n=n*(3*n-1)/2;
         return n;
     }
   

}
