import java.util.Scanner;
class Bank_Account {
    double accountNo;
    String username;
    String email;
    String accountType;
    double accountBalance;

    public void getAccountDetails(double accountNo,String username,String email,String accountType,double accountBalance) {
        this.accountNo = accountNo;
        this.username = username;
        this.email = email;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public void displayAccountDetails() {
        System.out.println("\nAccount Details : \n"+"Account Number = " + accountNo + "\nUsername = " + username + "\nEmail = " + email
                + "\nAccount Type = " + accountType + "\nAccount Balance = " + accountBalance);
    }

}
public class Lab5_4 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Bank_Account detail = new Bank_Account();
        System.out.print("Enter AccountNo : ");
        double accountNo = sc.nextDouble();
        System.out.print("Enter Username : ");
        String username = sc.next();
        System.out.print("Enter Email : ");
        String email = sc.next();
        System.out.print("Enter AccountType : ");
        String accountType = sc.next();
        System.out.print("Enter AccountBalance : ");
        double accountBalance = sc.nextDouble();
        detail.getAccountDetails(accountNo, username, email, accountType, accountBalance);
        detail.displayAccountDetails();
    }
    
}