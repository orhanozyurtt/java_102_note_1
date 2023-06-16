import java.util.Scanner;
// HACKERRANK SORU ÇÖZÜMÜ
public class ders1 {
    public static int B;
    public static int H;
    public static boolean control;
    static {
        Scanner inp = new Scanner(System.in);
        System.out.println("gir");
        B = inp.nextInt();
        System.out.println("gir");
        H = inp.nextInt();

        if (B > 0 && H > 0) {
            System.out.print(B * H);
        } else if (B <= 0 || H <= 0) {
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }
    }


        public static void main(String[] args) {


    }
}
