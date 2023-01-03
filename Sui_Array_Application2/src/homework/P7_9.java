package homework;
import java.util.*;


public class P7_9 {

   
    public static void main(String[] args) {
        double max;
        Scanner input=new Scanner(System.in);
        double n[]=new double[10];
        System.out.println("Enter ten numbers:");
        for (int i=0;i<n.length;i++)
        {
            n[i]=input.nextDouble();
        }
        max=max(n);
        System.out.printf("The maximum number is:%f",max);
    }
    public static double max(double[]array)
    {
        double max=0;
        for (int i=0;i<array.length;i++)
        {
            if (array[i]>=max)
            {
                max=array[i];
            }
        }
        return max;
    }
}
