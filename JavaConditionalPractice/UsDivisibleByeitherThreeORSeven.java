import java.util.*;
public class UsDivisibleByeitherThreeORSeven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if((num%3==0)||(num%7==0))
            System.out.println("Its Divisble by either Three and Seven");
        else
            System.out.println("it is not Divisible by neither of Three and Seven");
    }
    
}
