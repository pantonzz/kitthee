import java.util.Scanner;
public class artificialnumbers {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("ป้อนค่าที่1=");
        int number= kb.nextInt();
        System.out.print("ป้อนค่าที่2=");
        int number1= kb.nextInt();

        if (number<number1){
            System.out.println(number+"น้อยกว่า"+number1);
        }
        else if (number==number1){
            System.out.println(number+"เท่ากัน"+number1);
        }
        else {
            System.out.println(number+"มากกว่า"+number1);
        }
    }
}
