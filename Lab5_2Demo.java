import java.util.Scanner;
public class Lab5_2Demo 
{
    public static void main(String[] args) 
    {
        
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Hour : ");
        int h = sc.nextInt();
        System.out.println("Enter Minute : ");
        int m = sc.nextInt();
        Time t1 = new Time();
        Time t2 = new Time(h,m);
        t1.addition(t2);
    }
}
class Time 
{
    int hour;
    int minute;

    Time() 
    {
        hour = 12;
        minute = 45;
    }

    Time(int h, int m) 
    {
        this.hour = h;
        this.minute = m;
    }

    void addition(Time t) 
    {
        int m = this.minute + t.minute;
        int h = this.hour + t.hour;
        if (m >= 60) 
        {
            h += m / 60;
            m %= 60;
        }
        System.out.println("The time after adding is " + h + ":" + m);

    }
}