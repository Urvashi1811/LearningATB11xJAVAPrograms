package Ternary_Operator;

public class Max_ThreeNo {
    public static void main(String[] args) {
        int x= 10;
        int y= 20;
        int z= -10;
        /* result= condition?exp1:exp 2;
        expression-(condition2 ? expression2 : expression 3) */
        //x>y, x>z= x is greater
        //y>z, y>x= y is greater
        // z is greater
        //(condition1)?expression 1: expression 2
        int result = (x > y) ? (x > z) ? x : z : ((y > z) ? y : z);
        System.out.println(result);
    }
}
