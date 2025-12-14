import java.util.*;
public class UsDivisibleByTwoFiveButNotEight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2 == 0 && num%5 == 0 && num%8!=0){
            System.out.println("Divisible by both 2 and 5 But NOT 8 !");
        }
        else{
            System.out.println("It is not under the condition !");
        }
    }
    
}
