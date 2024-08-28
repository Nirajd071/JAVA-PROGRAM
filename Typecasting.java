import java.util.Scanner;
public class Typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter any number:");
        int a = sc.nextInt();
        double y = (double)a;
        System.out.println(y/2);
    }
}
