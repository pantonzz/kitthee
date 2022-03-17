import java.util.Scanner;
public class conversiontemperature {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        //System.out.print("ป้อนอุณหภูมิ (ฟาเรนไฮน์) =");
        //float f= kb.nextFloat();
        //float c= (f-32)*5/9;
        //System.out.print(f+"ฟาเรนไฮน์  ="+c+"เซลเซียส");

        System.out.print("ป้อนอุณหภูมิ (เซลเซียส) =");
        float c= kb.nextFloat();
        float f=(c*9/5)+32;
        System.out.println(c+"เซลเซียส = "+f+"ฟาเรนไฮต");

    }

}
