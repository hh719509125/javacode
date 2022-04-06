import java.util.Scanner;

public class ReadStringAndIntFromConsole2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请问你的名字是？");
        String str = in.nextLine();
        System.out.println("你好，" + str );
        System.out.println(str + "请问你的性别是");
        String Gender = in.nextLine();
        System.out.println("好的");
        System.out.println("请问你今年多大？");
        int age = in.nextInt();
        System.out.println("谢谢你的配合");
    }
}
