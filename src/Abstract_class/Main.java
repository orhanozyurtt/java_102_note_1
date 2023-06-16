package Abstract_class;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        MyBook mybook = new MyBook();
        Scanner sc = new Scanner(System.in);
        String name = "";
        name = sc.next();
        mybook.setTitle(name);

    }



}
