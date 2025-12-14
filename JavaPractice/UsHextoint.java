import java.util.Scanner;
public class UsHextoint{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        String hex = sc.next();
        int num = Integer.parseInt(hex,16);
        System.out.println(num);
    }
}