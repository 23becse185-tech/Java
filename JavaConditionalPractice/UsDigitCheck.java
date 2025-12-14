import java.util.Scanner;

public class UsDigitCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num >= -9 && num <= 9) {
            System.out.println("Single-digit number");
        } 
        else if ((num >= 10 && num <= 99) || (num <= -10 && num >= -99)) {
            System.out.println("Two-digit number");
        } 
        else if ((num >= 100 && num <= 999) || (num <= -100 && num >= -999)) {
            System.out.println("Three-digit number");
        } 
        else {
            System.out.println("Number has more than three digits");
        }

        sc.close();
    }
}
