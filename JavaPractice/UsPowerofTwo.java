import java.util.*;
public class UsPowerofTwo {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      if(n > 0 && (n & (n - 1)) == 0)
        System.out.println(n+"It is power of 2");
      else 
        System.out.println(n +"It is not power of 2"); 
      
    }
    
}
