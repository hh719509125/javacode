public class CalcAndAssign {
    public static void main(String[] args) {
        int a = 16;

        a >>= 2;

        System.out.println(a);

        //此时a为4

        a *= 9;
        System.out.println(a);
    }
}
