


package homework;


public class P5_11 {

   
    public static void main(String[] args) {
        int d=0;
         for (int i=100;i<=200;i++)
        {
               if (i%3==0 ^ i%4==0)
               {
                   d+=1;
                   System.out.print(i+" ");
                   if (d%10==0){
                      System.out.print("\n");  
                   }
                 }
              
        }
    }

}
