import java.util.Scanner;
public class Lab3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks of 1st Subject : ");
        int a = sc.nextInt();
        System.out.print("Enter Marks of 2nd Subject : ");
        int b = sc.nextInt();
        System.out.print("Enter Marks of 3rd Subject : ");
        int c = sc.nextInt();
        System.out.print("Enter Marks of 4th Subject : ");
        int d = sc.nextInt();
        System.out.print("Enter Marks of 5th Subject : ");
        int e = sc.nextInt();
        double f=((a+b+c+d+e)*100)/(500);
        System.out.println("Percentage is : "+f);
        if(f>=60)
        {
            System.out.println("First Divison");
        }
        else if(f>=50 && f<=59)
        {
            System.out.println("Second Divison");
        }
        else if(f>=40 && f<=49)
        {
            System.out.println("Third Divison");
        }
        else if(f<=40)
        {
            System.out.println("Fail");
        }
        else
        {
            System.out.println("Error");
        } 
    }
    
}
