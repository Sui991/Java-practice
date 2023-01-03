


package homework;

import java.util.Scanner;
public class P3_17 {

   
    public static void main(String[] args) {
        
         int com =  (int) (Math.random() * 3);
         Scanner input = new Scanner(System.in);
         System.out.println("scissor(0),rock(1),paper(2)");
            int p=input.nextInt();
            if (p==0){
                if (com==2){
                    System.out.println("The computer is paper. You are scissor. You won");
                }
                else if (com==1){
                    System.out.println("The computer is rock. You are scissor. You lose");
                }
                else if (com==0){
                    System.out.println("The computer is scissor. You are scissor. it's a draw");
                }
            }
            if (p==1){
                if (com==2){
                    System.out.println("The computer is paper. You are rock. You lose");
                }
                else if (com==1){
                    System.out.println("The computer is rock. You are rock. it's a draw");
                }
                else if (com==0){
                    System.out.println("The computer is scissor. You are rock. You won");
                }
            }
            if (p==2){
                if (com==2){
                    System.out.println("The computer is paper. You are paper. it's a draw");
                }
                else if (com==1){
                    System.out.println("The computer is rock. You are paper. You won");
                }
                else if (com==0){
                    System.out.println("The computer is scissor. You are paper. You lose");
                }
            }
    }

}
