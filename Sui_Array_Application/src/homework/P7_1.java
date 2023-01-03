

package homework;
import java.util.Scanner;
public class P7_1 {

    
    public static void main(String[] args) {
        int number;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of students:");
        number=input.nextInt();
        System.out.println("Enter "+number+" scores:");
        int stu[]=new int [number];
        String grade[]=new String[number];
        for (int i=0;i<stu.length;i++)
        {
            stu[i]=input.nextInt();
            
        }
        int best1=0;
        for (int i =0;i<stu.length;i++)
        {
            if (stu[i]>=best1)
            {
                best1=stu[i];
            }
        }
       
       
         for (int i=0;i<stu.length;i++)
        {
            if (stu[i]>=best1-5)
            {
                grade[i]="A";
            }
            else if(stu[i]>=best1-10)
            {
                  grade[i]="B";
            }
            else if (stu[i]>=best1-15)
            {
                grade[i]="C";
            }
             else if (stu[i]>=best1-20)
            {
                grade[i]="D";
            }
             else 
            grade[i]="F";
        }
         for (int i=0;i<stu.length;i++)
         {
             System.out.println("Student "+i+" score is "+stu[i]+" and grade is "+grade[i]);
         }
            }

}
