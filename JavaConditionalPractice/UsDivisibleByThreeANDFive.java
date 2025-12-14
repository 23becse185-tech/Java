import java.util.*;
public class UsDivisibleByThreeANDFive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        

        if(num%3==0)
            System.out.println("Divisible BY Three :"+num);
        else if(num%5==0)
            System.out.println("Divisible BY Five :"+num);
        else 
            System.out.println("Its not neither three nor five !");
    }
    
}
