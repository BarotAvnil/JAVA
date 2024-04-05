import java.util.Scanner;
public class Lab2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        Double a = sc.nextDouble();
        System.out.print("Enter Number 2 : ");
        Double b = sc.nextDouble();
        System.out.print("Enter Sign : ");
        String s = sc.next();
        if(s.equals("+"))
        {
            System.out.println("Addition is : "+(a+b));
        }
        else if(s.equals("-"))
        {
            System.out.println("Substraction is : "+(a-b));
        }
        else if(s.equals("/"))
        {
            System.out.println("Division is : "+(a/b));
        }
        else if (s.equals("*"))
        {
            System.out.println("Multiplication is : "+(a*b));
        }
        else
        {
            System.out.println("Invalid Operator");
        }
    }
    
}
