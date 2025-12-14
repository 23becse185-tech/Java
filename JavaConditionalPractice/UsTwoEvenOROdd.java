import java.util.Scanner;

public class UsTwoEvenOROdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = n1 + n2;
        if(sum%2==0)
        System.out.println("even");
        else
            System.out.println("odd");
    }
    
}
