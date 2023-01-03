

package homework;
import java.util.*;
public class P7_11 {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double number[]=new double[10];
        System.out.println("Enter ten numbers:");
        for (int i=0;i<10;i++)
        {
            number[i]=input.nextDouble();
        }
        double mean=mean(number);
        double deviation=deviation(number);
        System.out.printf("The mean is %.2f\n",mean);    
        
        System.out.printf("The standard deviation is %.5f\n",deviation);    
    }
    
public static double  deviation(double[]x)
{
    double mean1=mean(x);
    double sum1=0;
    for (int i=0;i<10;i++)
    {
        sum1+=Math.pow(x[i]-mean1,2);
    }
    sum1=sum1/9;
    sum1=Math.pow(sum1,0.5);
    return sum1;
}
public static double  mean(double []x)
{
    double sum=0;
    for (int i=0;i<10;i++)
    {
         sum+=x[i];
    }
       sum=sum/10;
       return sum;
}
}
