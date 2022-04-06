public class MultiDimensionArray {
    public static void main(String[] args) {
        //创建一个double类型的二维数组
        double[][] multiDimensionArray = new double[3][5];

        //循环查看每个数组元素的值，再给元素赋值前，数组元素的值其实都是每种类型的初始值。
        for (int i = 0; i < multiDimensionArray.length;i++){
            for (int j = 0; j < multiDimensionArray[i].length;j++) {
                System.out.println("multiDimensionArray[" + i + "][" + j + "]=" + multiDimensionArray[i][j]);
            }
            }

                //其实第一维的数组，每个元素都是下一个一维度的属于的变量。在这里我们可以改变这个变量的值
                //也就是让它指向一个新的变量
                multiDimensionArray[2] = new double[100];

                //检查每个的数组的长度，发现最后一个的长度不一样了，因为它指向了印的数据组
                for (int i = 0;i < multiDimensionArray.length;i++){
                    System.out.println("multiDimensionArray[" + i + "].length=" + multiDimensionArray[i].length);
                }
    }
}
