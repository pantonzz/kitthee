public class Whileloop {
    public static void main(String[] args) {
        int a = 1;
        while (true){
            System.out.println("รอบที่"+a+"Hello");
            a++;
            if (a > 100){
                break;
            }
        }
    }
}
