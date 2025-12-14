import java.util.Scanner;

public class MarksFiveSubjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks for Maths: ");
        int maths = sc.nextInt();

        System.out.print("Enter marks for Physics: ");
        int physics = sc.nextInt();

        System.out.print("Enter marks for Chemistry: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter marks for English: ");
        int english = sc.nextInt();

        System.out.print("Enter marks for Computer: ");
        int computer = sc.nextInt();

        System.out.println("\nMarks are:");
        System.out.println("Maths: " + maths);
        System.out.println("Physics: " + physics);
        System.out.println("Chemistry: " + chemistry);
        System.out.println("English: " + english);
        System.out.println("Computer: " + computer);

       
    }
}
