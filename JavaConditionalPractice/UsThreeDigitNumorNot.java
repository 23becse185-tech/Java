import java.util.*;
public class UsThreeDigitNumorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if((num>99)||(num>=999)){
            System.out.println("Its three digit number");
        }
        else
            System.out.println("its not a three digit");

    }
    
}
