package Task;

public class TypeCasting_gradesdisplay {
    public static void main(String[] args) {
        //90-100--> A
        //80-89--> B
        //70-79--> C
        //60-69-->D
        //0-59--> F
        String Grade1 = args[0];
        System.out.println(Grade1);
        System.out.println(Grade1 instanceof String);

        int grade = Integer.parseInt(Grade1);

        String result = (grade >= 90) ? "A" : (grade >= 80) ? "B" : (grade >= 70) ? "C" : (grade >= 60) ? "D" : "F";
        System.out.println(result);
    }

    }

