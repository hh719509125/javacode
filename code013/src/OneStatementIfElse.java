public class OneStatementIfElse {
    public static void main(String[] args) {

        int a = 10;

        System.out.println("省略大括号");
        if (a > 0)
            System.out.println("a > 0");
        else
            System.out.println("a小于等于0");

        System.out.println("比较大小完整的写法");
        if (a > 0){
            System.out.println("a大于0");
        }else if (a == 0){
            System.out.println("a等于0");
        }else{
            System.out.println("a小于0");
        }


        System.out.println("比较大小的省略大括号的方法");
        if (a > 0)
            System.out.println("a大于0");
        else if (a == 0)
            System.out.println("a等于0");
        else
            System.out.println("a小于0");


        System.out.println("比较大小的代码块有多个语句的最优写法");
        if (a > 0){
            System.out.println("a大于0");
            System.out.println("买" + a + "个包子");
        }else if (a == 0){
            System.out.println("a等于0");
            System.out.println("不买肉包子");
        }else{
            System.out.println("a小于0");
            System.out.println("包子吃多了");
        }

        if (a == 0){}

    }
}
