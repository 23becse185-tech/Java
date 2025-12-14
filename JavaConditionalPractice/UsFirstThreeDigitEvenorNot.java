import java.util.Scanner;
public class UsFirstThreeDigitEvenorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 
        if((num/100)%2==0){
            System.out.println("Even at first no:");
        }
        else
            System.out.println("Odd");

    }
    
}
