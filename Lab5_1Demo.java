import java.util.Scanner;
class Square{
    double area;
    double area(int r){
        int ans = 0;
        area = r * r;
        return area;
    }

}
public class Lab5_1Demo{
    public static void main(String[] args) {
        Square s1 = new Square();
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the side length of a square: ");
        int  l = sc.nextInt();
        System.out.printf("The area of the square is : %.2f\n",s1.area(l));
    }
    
}