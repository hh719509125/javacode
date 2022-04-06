public class Example {
    public static void main(String[] args) {
        double randNum = 0;

        //要生成一个大于0.5的随机数。只有随机数大于了0.5.循环才会退出
        while (randNum < 0.5){
            //使用Java中的Math.random(),生成一个随机数
            randNum = Math.random();
            System.out.println(randNum);
        }
        System.out.println("生成大于0.5的随机数是" + randNum);

        int rangeStart = 30;
        int rangeEnd = 31;

        int mod = rangeEnd - rangeStart;

        if (rangeStart < 0 || rangeEnd < 0){
            System.out.println("开始和结束必须是整数或者0");
        }

        if (mod <= 1){
            System.out.println("非法的数字范围：(" +rangeStart + "," + rangeEnd + ")");
        }

        for (int i = 0; i < 50; i++) {


            int bigRandom = (int) (Math.random() * (rangeEnd * 100));

            int numberToGuess = (bigRandom % mod) + rangeStart;

            if (numberToGuess <= rangeStart){
                numberToGuess = rangeStart + 1;
            }else if (numberToGuess >= rangeEnd){
                numberToGuess = rangeEnd - 1;
            }

            System.out.println("mod=" + mod + ", numberToGuess=" + numberToGuess);
        }
    }
}
