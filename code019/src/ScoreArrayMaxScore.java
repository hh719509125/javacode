public class ScoreArrayMaxScore {
    public static void main(String[] args) {
        //声明六个变量，分别代表六个科目的成绩
        int YuWen = 0;
        int ShuXue = 1;
        int WaiYu = 2;
        int WuLi = 3;
        int HuaXue = 4;
        int ShengWu = 5;

        //每门课的名字
        int totalScoreCount = 6;
        String[] scoreNums = new String[totalScoreCount];
        scoreNums[YuWen] = "语文";
        scoreNums[ShuXue] = "数学";
        scoreNums[WaiYu] = "外语";
        scoreNums[WuLi] = "物理";
        scoreNums[HuaXue] = "化学";
        scoreNums[ShengWu] = "生物";

        //每门课的成绩
        double[] scores = new double[totalScoreCount];
        //用随机数给成绩赋值
        for (int i =0; i < totalScoreCount; i++){
            scores[i] = 80 + Math.random() * 20;
            System.out.println(scoreNums[i] + "的成绩是：" + scores[i]);
        }

        //计算最高成绩和最高成绩对应的科目索引
        double maxScore = 0;
        int maxScoreIndex = -1;
        for (int i = 0; i < totalScoreCount; i++){
            if (scores[i] > maxScore) {
                maxScore = scores[i];
                maxScoreIndex = i;
            }
        }
        //输出最高成绩科目和成绩
        System.out.println("最好成绩科目是" + scoreNums[maxScoreIndex] + ":" + maxScore);

    }
}
