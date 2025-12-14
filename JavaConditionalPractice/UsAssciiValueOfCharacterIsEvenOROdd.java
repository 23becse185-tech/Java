import java.util.*;
public class UsAssciiValueOfCharacterIsEvenOROdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int Value = (int)ch;
        if(Value%2 == 0)
        System.out.println("ASSCII Value is Even ="+Value);
        else
          System.out.println("ASSCII Value is Odd ="+Value);

    }
}