package homework;

public class P5_27 {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 2014; i <= 2114; i++) {
            if (i % 4 == 0 && i % 100 != 0) { 
              
                
                count += 1;
                System.out.print(i + " ");
                
            }
            else if (i%400==0)
                count += 1;
                System.out.print(i + " ");
        }
        System.out.print("\nThe number of leap years is:" + count);
    }

}
