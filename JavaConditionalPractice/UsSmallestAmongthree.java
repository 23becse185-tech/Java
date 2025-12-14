import java.util.Scanner;
public class UsSmallestAmongthree {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1<n2){
        System.out.println( "Smallest n1 :" + n1);
        }
        else if(n2>n1){
         System.out.println("Smallest n2 :" + n2);
        }
        else{
            System.out.println("both are  equal:");
        }
    } 
}
