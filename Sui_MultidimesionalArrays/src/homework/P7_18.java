

package homework;
import java.util.*;
public class P7_18 {

    
     public static void main(String[] args) {
      double data[]=new double[10];
      Scanner input=new Scanner(System.in);
       System.out.println("輸入10個數字: ");
    for (int i=0;i<data.length;i++)
     {
         data[i]=input.nextDouble();
     }
        bubblesort(data);
        display(data);
        
    }

    public static void display(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void bubblesort(double[] array) {
double temp;
        for (int i=0;i<array.length-1;i++)
     {display(array);
            for (int j=0;j<array.length-1-i;j++)
            {
                if (array[j]<array[j+1]    )
                {
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
}
