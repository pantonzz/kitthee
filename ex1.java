import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("ป้อนคะแนน=");
        int grade = kb.nextInt();

        if (grade>=80){
            System.out.println("ได้เกรด A");
        }
        else if (grade>=75){
            System.out.println("ได้เกรด B+");
        }
        else if (grade>=70){
            System.out.println("ได้เกรด B+");
        }
        else if (grade>=65){
            System.out.println("ได้เกรด C+");
        }
        else if (grade>=60){
            System.out.println("ได้เกรด C");
        }
        else if (grade>=55){
            System.out.println("ได้เกรด D+");
        }
        else if (grade>=50){
            System.out.println("ได้เกรด D");
        }
        else {
            System.out.println("F ลงเรียนใหม่");
        }
    }
}
