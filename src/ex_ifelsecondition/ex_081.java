package ex_ifelsecondition;

public class ex_081 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if(age>18) {
            System.out.println("you can vote");
        }
            else
            {
                System.out.println("you cannot");
            }
    }
}
