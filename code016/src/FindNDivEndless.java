public class FindNDivEndless {
    public static void main(String[] args) {
        int n = 5;

        int dividend = 100;
        int divisor = 89;

        int found = 0;
        while (found < n){
            if (dividend % divisor == 0){
                System.out.println(dividend + "可以整除" + divisor + "。商为" + (dividend/divisor));

            }
            dividend++;
        }
    }
}
