package homework;

public class p5_18 {

    public static void main(String[] args) {
        int count = 0;
        System.out.print("Pattern A");
        for (int i = 1; i < 8; i++) {
            count += 1;
            if (count > 1) {
                System.out.print("\n");

            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");

            }
        }
        System.out.print("\n");
        count = 0;
        System.out.println("Pattern B");
        for (int i = 7; i > 1; i--) {
            count += 1;
            if (count > 1) {
                System.out.print("\n");

            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");

            }
        }
        System.out.print("\n");
        System.out.print("Pattern C");
        count = 0;
        int d=10;
        for (int i = 1; i < 8; i++) {
            count+=1;
            if(count>1)
            {
                System.out.print("\n");
            }
             
             d-=1;
            for ( int s=d ; s >1 ; s--) {
                    System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
                }
                

           
        }
         System.out.print("\n");
        System.out.println("Pattern D");
        count = 0;
         d=0;
        for (int i = 7; i >1; i--) {
            count+=1;
            if(count>1)
            {
                System.out.print("\n");
            }
             
             d+=1;
            for ( int s=d ; s >0 ; s--) {
                    System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
                }
                

           
        }

    }
}
