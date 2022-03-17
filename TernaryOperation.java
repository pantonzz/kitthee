import java.util.Scanner;
public class TernaryOperation {
        public static void main(String[] args) {
                Scanner kb=new Scanner(System.in);
                System.out.print("ตัวเลขจำนวนนเต็ม =");
                int number= kb.nextInt();

                String result="";

                //if (number%2==0){
                        //System.out.println(number+" เลขคู่ ");
               // }
                //else {
                       // System.out.println(number+" เลขคี่ ");
               // }
                // short if - else ตัวเเปร =(เงื่อนไข) ? คำสั่งเมื่อเงื่อนไขเป็นจริง : คำสั่งเมื่อเงื่อนไขเป็นเท็จ;
                result = (number%2==0) ? " เลขคู่ " : " เลขคี่ ";
                System.out.println(result);

        }
}
