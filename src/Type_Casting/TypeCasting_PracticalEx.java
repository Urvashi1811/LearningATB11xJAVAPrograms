package Type_Casting;

public class TypeCasting_PracticalEx {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
        float total = course+GST; //narrowing -Explicit
        System.out.println(total);
        float total1 = (float) course+GST; //widenning- implicit
        System.out.println(total1);
    }
}
