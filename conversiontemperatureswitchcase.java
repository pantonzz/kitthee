import java.util.Scanner;
public class conversiontemperatureswitchcase {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("ต้องการเเปลงเป็น (C กด 1/F กด 2 ) =");
        String choice = kb.nextLine();
        System.out.print(choice);

        switch (choice){
            case "C":
                System.out.print("ป้อนอุณหภูมิ(เซลเซียส) =");
                float c= kb.nextFloat();
                float f=(c*9/5)+32;
                System.out.println(c+"เซลเซียส "+f+"ฟาเรนไฮต");
                break;
            case "F":
                System.out.print("ป้อนอุณหภูมิ(ฟาเรนไฮต) =");
                float faren= kb.nextFloat();
                float cel=(faren-32)*5/9;
                System.out.println(faren+"เซลเซียส "+cel+"ฟาเรนไฮต");
                break;
            default:
                System.out.println("กรุณาระบุเลขให้ถูกต้อง ");
        }
    }
}
