import java.util.Scanner;
public class oddnumbereven {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("ป้อนตัวเลขจำนวนเต็ม= ");
        int number= kb.nextInt();

        // % number % 2 ลงตัว เป็นเลข คู่
        // % number % 2 ไม่ลงตัว เป็นเลขคี่

        if (number%2==0){
            System.out.println(number+" เป็นเลขคู่");
        }
        else {
            System.out.println(number+" เป็นเลขคี่");
        }
    }
}
