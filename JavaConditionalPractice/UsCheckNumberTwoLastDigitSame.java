import java.util.*;
public class UsCheckNumberTwoLastDigitSame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if((n1%10)==(n2%10))
            System.out.println("The Two Number's Last Digit is Same :");
        else
            System.out.println("The Two Number's Last Digit is not Same :");
    }
}