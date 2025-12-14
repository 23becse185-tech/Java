import java.util.Scanner;
public class UsThreeLastDigitEvenorNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if((num/100)%3==0){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
    
    
}
