import java.util.*;
public class UsCheckSingledigitDoubledigitThreedigit{
    public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      if(n>= -9 && n<10)
        System.out.println("Single Digit !");
     else if (n>= -99 && n<100)
        System.out.println("Double Digit !");
     else if(n>=-999 && n<1000 )
        System.out.println("Three Digit !");
     else 
        System.out.println("Its more than three Digit");

    }
}