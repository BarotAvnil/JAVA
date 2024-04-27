import java.util.Scanner;

public class Lab5_2 {
    int hour;
    int minute;

    public void Time(int h, int m) {
        this.hour = h;
        this.minute = m;
    }

    public void addition(Time t) {
        int m = this.minute + t.minute;
        int h = this.hour + t.hour;
        if (m >= 60) {
            h += m / 60;
            m %= 60;
        }
        System.out.println("The time after adding is " + h + ":" + m);
        

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times to add : ");
        int n = sc.nextInt();
        Time[] t = new Time[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter Time 1 : ");
            int h1 = sc.nextInt();
            int m1 = sc.nextInt();
            t[i] = new Time(h1, m1);
            System.out.println("Enter Time 2 : ");
            int h2 = sc.nextInt();
            int m2 = sc.nextInt();
            Time t2 = new Time(h2, m2);
            t[i].addition(t2);
        }
    }
}