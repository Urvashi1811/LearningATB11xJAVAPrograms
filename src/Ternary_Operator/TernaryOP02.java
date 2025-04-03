package Ternary_Operator;

public class TernaryOP02 {
    public static void main(String[] args) {
        int i = 25;
        String result = (i > 10) ? (i> 20 ? "N>20" : "N<20") : "B" ;
        System.out.println(result);
     }
}
