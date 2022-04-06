public class Example {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++){
            String line = "";
            for (int j = 1; j <= 9; j++){
                if (j > i){
                    break;//当j<i终止循环
                }
                line += j + "*" + i + "=" + (i * j) + "\t";
            }
            System.out.println(line);
        }
    }
}
