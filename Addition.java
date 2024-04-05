import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.print("Enter Number a:");
        int a=A.nextInt();
        System.out.print("Enter Number b:");
        int b=A.nextInt();
        System.out.println("Answer is "+(a+b));
    }
}
