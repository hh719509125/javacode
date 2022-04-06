public class Example3 {
    public static void main(String[] args) {

        int liao = 10;

        {
            int yu = 5;
            System.out.println("liao变量的值是" + liao + "yu变量的值是" + yu + "。");
        }

        int a1 = 1;
        {
            int a2 = a1 + 1;
            {
                int a3 = a2 + 1;
                System.out.println("a3=" + a3);
            }
            {
                int a3 = a2 + 10;
                System.out.println("a3=" + a3);
            }
            System.out.println(a2);
        }
    }
}
