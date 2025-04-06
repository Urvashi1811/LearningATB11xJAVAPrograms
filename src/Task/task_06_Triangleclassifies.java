package Task;

import java.util.Scanner;

public class task_06_Triangleclassifies {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the Sides of Triangle");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a==b &&  b==c){
            System.out.println("its Equilateral");
        }
        else if (a==b || a==c || b==c){
            System.out.println("it Isosceles");
        }
        else {
            System.out.println("Scalene");
        }

    }
}

/* a= 100, b= 40, c = 40
 (a>=b)
 "issocles or scalene"
 "acute or isocles
 */