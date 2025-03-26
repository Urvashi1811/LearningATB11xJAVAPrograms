package ex_09_Switch;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab084_Switch {
    public static void main(String[] args) {
        //Take a user input and tell which day of the week it is
        // 1-7-->mon-sun
        //8--> not allowed or error
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the day number 1 to 7");
        int day = scanner.nextInt();

        switch (day){

            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tues");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Not Allowed");
                break;
        }
    }
}
