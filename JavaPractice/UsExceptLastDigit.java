import java.util.*;
public class UsExceptLastDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        int Exceptlastdigit = (num/10);  //Quotient
        System.out.println(+Exceptlastdigit);
    }
    
}
