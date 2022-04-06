import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        //创建Scanner从控制台读取输入
        Scanner in = new Scanner(System.in);

        //游戏设置
        int rangeStart = 30;
        int rangeEnd = 50;
        int guessTotal = 5;

        //游戏统计
        int totalGameCount = 0;
        int totalCorrectCount = 0;

        //是否结束
        boolean stopGame = false;

        while (!stopGame){
            //初始化本次游戏的变量
            int guessLeft = guessTotal;
            int mod = rangeEnd - rangeStart;
            double randNum = Math.random();
            int num = ((int)(randNum * rangeEnd * 100) % mod);
            num = num + rangeStart;
            if (num <= rangeStart){
                num = rangeStart + 1;
            }
            if (num >= rangeEnd){
                num = rangeEnd - 1;
            }

            System.out.println("================猜数字===============");
            System.out.println("目标数字以生成，数字在" + rangeStart + "到" + rangeEnd + "之间，"
                    + "不包括这两个数。共有" + guessLeft + "次猜测机会，输入-1随时结束游戏");

            //本次游戏是否开始了
            boolean gameStart = true;
            //本次是否猜中数字
            boolean guessCorrect = false;
            while (guessLeft > 0){
                System.out.println("还有" + guessLeft + "次机会，请输入猜测的数字，回车确认");
                int guessNmu = in.nextInt();
                //输入-1，结束游戏
                if (guessNmu == -1){
                    stopGame = true;
                    break;
                }

                if (guessNmu <= rangeStart || guessNmu >= rangeEnd){
                    System.out.println("请输入在" + rangeStart + "到" + rangeEnd + "之间的数，不包括这两个数");
                    continue;
                }

                //只要猜过一次就算玩过
                if (gameStart){
                    totalGameCount++;
                    gameStart = false;
                }
                guessLeft--;
                if (guessNmu == num){
                    totalCorrectCount++;
                    guessCorrect =true;
                    System.out.println("恭喜你猜对了！这次的数字就是" + num +
                            "。本次你一共猜了" + (guessTotal - guessLeft ) + "次");
                    break;
                }else if (guessNmu > num){
                    System.out.println("猜测的数字比目标数字大。");
                }else {
                    System.out.println("猜测的数字比目标数字小。");
                }
            }
            if (!guessCorrect){
                System.out.println("太可惜了！差一点就成功了。正确的数字是：" + num);
            }
        }
        System.out.println("共进行了" + totalGameCount + "次游戏，其中这正确的次数为：" + totalCorrectCount + "次");
    }
}
