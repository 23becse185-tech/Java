import java.util.*;
public class UsSumFirstLastDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int firstdigit = (num/10); // Q
        sc.nextLine();
        int Lastdigit = (num%10);  // R
        
        System.out.println("Firstdigit:"+firstdigit+"Lastdigit:"+Lastdigit);
        // System.out.println("Lastdigit:"+Lastdigit);


    }
    
}
