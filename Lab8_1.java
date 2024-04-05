public class Lab8_1
{
	public static void main(String[] args) 
    {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a*b;
            if(a<0){
                System.out.println(a+" is negative");
                throw new MyException("Negative number not allowed");
            }
            else if (a == 0 || b == 0) {
                System.out.println("Multiplication by zero is not allowed");
                throw new MyException("multiplication by zero is not allowed");
            }
            else if (b<0) {
                System.out.println(b+" is negative");
                throw new MyException("Negative number not allowed");
            }
            System.out.println("The product of " + a + " and " + b + " is " + c);
        } catch (Exception e) {
            System.out.println("Exception is "+e);
        }
	}
}
class MyException  extends Exception {
    MyException(String s){
        super(s);
    }
    
}