


package homework;
import java.util.Scanner;


public class p5_17 {

   
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        number=input.nextInt();
        for (int d=number;d>=1;d-=1){
            System.out.print("\n");
        for (int i=number;i>=1;i--){
            System.out.print(i+" ");
                   }
             for (int i=2;i<=number;i++){
            System.out.print(i+" ");
                   }
             number-=1;
    }

}
}