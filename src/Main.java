import java.util.Date;
import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Date date = new Date();
//        System.out.println("thg" + date);
//    }

    //    public static void main(String[] args) {
//        int i = 10;
//        float f = 20.5f;
//        boolean b = true;
//        char c = 'a';
//        String s = "HN";
//        System.out.println("i" + i);
//        System.out.println("f" + f);
//        System.out.println("b" + b);
//        System.out.println("c" + c);
//        System.out.println("s" + s);
//    }
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width");
        width = scanner.nextFloat();
        System.out.println("Enter height");
        height = scanner.nextFloat();
        float area = width*height;
        System.out.println("Area is :"+area);
    }
}