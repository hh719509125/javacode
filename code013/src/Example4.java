public class Example4 {
    public static void main(String[] args) {
        int a = 66;
        int b = 44;
        int c = 44;
        if (a == b && b == c){
            System.out.println("a,b和c等大，为" + a);
        }else if (a > b && a > c){
            System.out.println("a是最大值，为" + a);
        }else if (b > a && b > c){
            System.out.println("b是最大值，为" + b);
        }else if (c > a && c > b){
            System.out.println("c是最大值，为" + c);
        }else if (a == b && a > c){
            System.out.println("a,b等大且最大");
        }else if (b == c && b > a){
            System.out.println("b,c等大且最大");
        }else if (c == a && c > b){
            System.out.println("b,c等大且最大");
        }
    }
}

