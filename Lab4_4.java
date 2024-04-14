import java.util.Scanner;

public class Lab4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of an Array : ");
        Integer n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter Element :");
            arr[i]=sc.nextInt();
        }
        
        for(int i=n-1;i>=0;i--)
        {
            System.out.println("Reverse Order : "+arr[i]);
        }
    }
    
}
