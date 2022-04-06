import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        //创建Scanner来读取用户的键盘输入
        Scanner in = new Scanner(System.in);

        //游戏设置
        int rangeStart = 30;
        int rangeEnd = 50;
        int guessTotal = 5;

        //游戏统计
        int totalGameCount = 0;
        int correctGuessCount = 0;
        int wrongGuessCount = 0;

        //是否结束游戏
        boolean gameEnd = false;

        while (!gameEnd) {
            //生成指定范围的随机数
            int mod = rangeEnd - rangeStart;

            if (rangeStart < 0 || rangeEnd < 0) {
                System.out.println("开始和结束必须是整数或者0");
            }

            if (mod <= 1) {
                System.out.println("非法数字范围：(" + rangeStart + "," + rangeEnd + ")");
            }

            //创建一个较大的数
            int bigRandom = (int) (Math.random() * (rangeEnd * 100));
            //numberToGuess的范围一定在rangeStart和rangeEnd之间
            int numberToGuess = (bigRandom % mod) + rangeStart;

            if (numberToGuess <= rangeStart) {
                numberToGuess = rangeStart + 1;
            } else if (numberToGuess >= rangeEnd) {
                numberToGuess = rangeEnd - 1;
            }

            //剩余猜测次数
            int leftToGuess = guessTotal;

            boolean currentGameCounted = false;
            boolean correctGuess = false;
            boolean wrongGuess = false;


            System.out.println("请输入猜测数字，范围在(" + rangeStart + "，" + rangeEnd + ")。输入-1代表结束游戏");
            while (leftToGuess > 0) {

                System.out.println("剩余的猜测次数为：" + leftToGuess + "次，请输入本次猜测的数字：");
                int guess = in.nextInt();

                if (guess < 0) {
                    gameEnd = true;
                    System.out.println("用户选择游戏结束");
                    break;
                }
                if (!currentGameCounted) {
                    currentGameCounted = true;
                    totalGameCount++;
                }
                leftToGuess--;
                if (guess > numberToGuess) {
                    System.out.println("输入的数字比目标数字大");
                } else if (guess < numberToGuess) {
                    System.out.println("输入的数字比目标数字小");
                } else {
                    correctGuessCount++;
                    correctGuess = true;
                    System.out.println("太帮了！你答对啦！");
                    break;
                }
            }
            if (!correctGuess){
                wrongGuessCount++;
                wrongGuess = true;
                System.out.println("太可惜了，还差一点就成功了！本次游戏正确的数是" + numberToGuess);
            }
        }
        System.out.println("共进行了" + totalGameCount + "次游戏，其猜中的次数为" + correctGuessCount + "次"
                + "，猜错的次数为" + wrongGuessCount + "次");
    }

}