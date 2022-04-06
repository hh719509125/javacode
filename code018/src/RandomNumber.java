public class RandomNumber {

    public static void main(String[] args) {
        double ranNum = 0;

        while (ranNum < 0.5){
            ranNum = Math.random();
            System.out.println(ranNum);
        }

        int rangeStart = 99;
        int rangeEnd = 180;

        for (int i = 0; i < 100; i++){
            //确定模
            int mod = rangeEnd - rangeStart;

            //生成随机数
            ranNum = Math.random();
            //num的值会在0到mod-1，也就是0到rangeEnd - rangeStart - 1
            int num = ((int) (ranNum * rangeEnd * 100)) % mod;

            //num加rangeStart之后，值域是0到rangeEnd - 1
            num += rangeStart;

            if(num <= ranNum){
                num = rangeStart + 1;
            }
            //根据数据分析，这个条件不会满足，只是为了做最后的防护
            if (num >= rangeEnd){
                num = rangeEnd - 1;
            }
        }
    }
}
