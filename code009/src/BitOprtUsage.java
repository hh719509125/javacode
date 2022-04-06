public class BitOprtUsage {
    public static void main(String[] args){
        int base = 1;
        int is_student_mask = base;//二进制0001
        int is_programmer_mask = base << 1;//二进制0010
        int is_driver_mask = base << 2;//二进制0100
        int is_painter_mask = base <<3;//二进制1000

        int data = 5;//二进制0101
        boolean isStudent = (data & is_student_mask) != 0;//0101 & 0001 = 1
        System.out.println(isStudent);
        boolean isProgrammer = (data & is_programmer_mask) != 0;//0101 & 0010 = 0
        System.out.println(isProgrammer);
        boolean isDriver = (data & is_driver_mask) != 0;//0101 & 0100 = 1
        System.out.println(isDriver);
        boolean isPainter = (data & is_painter_mask) != 0;//0101 & 1000 = 0
        System.out.println(isPainter);
    }
}
