public class CalcDivFor3 {
    public static void main(String[] args) {
        int divided = 100;
        int divisor = 3;

        int found = 0;
        int toBeFound = 10;

        for (int i = 0; i < 100; i++) {
            if (divided % divisor == 0) {
                System.out.println(divided + "可以整除" + divisor + ",商为" + (divided / divisor));
                found++;
            }
             if (found >= toBeFound){
                System.out.println("已经找到" + toBeFound + "个数，循环退出");
                break;
            }
            divided++;
        }

    }
}