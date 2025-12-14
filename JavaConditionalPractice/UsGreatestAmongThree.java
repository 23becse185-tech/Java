import java.util.Scanner;
public class UsGreatestAmongThree{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c){
             System.out.println("a is the Greatest Among Three :" + a);
        }
        
        else if(b>c){
              System.out.println("b is the Greatest Among Three :" + b);
        }
        else{
            System.out.println("C is the Greatest Among Three :" + c);
        }

    }

}
