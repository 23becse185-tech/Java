import java.util.Scanner;
public class UsOcttoInt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Oct = sc.next();
        int num = Integer.parseInt(Oct,8);
        System.out.println(num);
    }
}
