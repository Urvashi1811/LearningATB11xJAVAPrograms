package ex_ifelsecondition;

import java.util.Scanner;

public class ex_82 {
    public static void main(String[] args) {
        //Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scanner.nextInt();
        System.out.println(age);

        if(age> 18){
            System.out.println("you can vote");
        }
        else {
            System.out.println("you cannot");
        }

    }
}
