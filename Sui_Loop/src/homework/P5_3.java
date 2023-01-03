


package homework;


public class P5_3 {

   
    public static void main(String[] args) {
        System.out.println("Celsius     Fahrenheit");
        int C=0;
        double F;
        for (C=0;C<100;C=C+2){
               F=C*9/5+32;
            System.out.println(C+"              "+F);
        }
    }

}
