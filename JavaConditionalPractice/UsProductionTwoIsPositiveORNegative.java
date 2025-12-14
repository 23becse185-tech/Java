import java.util.*;
import javax.lang.model.util.ElementScanner14;
public class UsProductionTwoIsPositiveORNegative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
         int n2 = sc.nextInt();
         int Product = n1 * n2 ;

        if(Product>=1)
            System.out.println("The Product of two number is positive");
        else if(Product == 0)
            System.out.println("The product is Zero ");
        else
             System.out.println("The Product of two number is not positive");
    }
}
