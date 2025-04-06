package ex_ifelsecondition;

import java.util.Scanner;

public class ex_83_OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = scanner.nextInt();

                if(a%2==0){
                    System.out.println("No is even");
                }
                else {
                    System.out.println("No is odd");
                }
    }
}
