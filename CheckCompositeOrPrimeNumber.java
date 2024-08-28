import java.util.Scanner;

public class CheckCompositeOrPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");
        int n = sc.nextInt();
        int temp=0;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                System.out.println("It is a composite Number.");
                temp=1;
                break;
            }
        }
        if (temp==0)
            System.out.println("It is prime Number.");
    }
}
