import java.util.Scanner;
public class conversiontemperaturifelse {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("ต้องการเเปลงเป็น (C กด 1/F กด 2 =)");
        int choice= kb.nextInt();

        if (choice == 1){
            System.out.print("ป้อนอุณหภูมิ (ฟาเรนไฮน์) =");
            float f= kb.nextFloat();
            float c= (f-32)*5/9;
            System.out.print(f+"ฟาเรนไฮน์  ="+c+"เซลเซียส");
        }
        if (choice == 2){
            System.out.print("ป้อนอุณหภูมิ (เซลเซียส) =");
            float c= kb.nextFloat();
            float f=(c*9/5)+32;
            System.out.println(c+"เซลเซียส = "+f+"ฟาเรนไฮต");
        }
        else {
            System.out.println("กรุณาระบุเลขให้ถูกต้อง");
        }
    }
}
