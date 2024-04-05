import java.util.Scanner;
public class Lab2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Enter Temperature in Fahrenhiet : ");
        double f = sc.nextDouble();
        System.out.println("Temperature in Celscius : "+((f-32)*5/9))   ;
    }
    
}
