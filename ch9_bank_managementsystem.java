import java.util.Scanner;
class bankaccount
{
    double balance;
    double prevtrans;
    String customername;
    String coustomerid;
    bankaccount(String customername,String cutomerid)
    {
        this.customername=customername;
        this.coustomerid=cutomerid;
    }
    void addbalance(double amount)
    {
        if(amount!=0)
        {
            balance=balance+amount;
             prevtrans = amount;
        }
    }
    void withdrawl(double amount)
    {
        if(amount!=0 && balance>amount)
        {
            balance=balance-amount;
            prevtrans=amount;
        }
        else if(balance<amount)
        {
            System.out.println("you cannot withdraw your available balance is insufficent for withdrawal");
        }
    }
    void getprevioustransaction()
    {
        if(prevtrans>0)
        {
            System.out.println(" deposited ="+prevtrans);
        }
       else if(prevtrans<0)
        {
            System.out.println("withdrawn ="+Math.abs(prevtrans));
        }
        else
        {
            System.out.println("no transction has occured");
        }
    }
    void printBill()
     {
        System.out.println("Customer Name: " + customername);
        System.out.println("Customer ID: " +coustomerid);
        System.out.println("Balance: " + balance);
    }
   void menu() 
     {
    char option;
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome " + customername);
    System.out.println("Your ID: " + coustomerid);
    System.out.println("");
    System.out.println("a) Check Balance");
    System.out.println("b) Withdraw Amount");
    System.out.println("c) Deposit Amount");
    System.out.println("d) Previous Transaction");
    System.out.println("e)printbill");
    System.out.println("f) Exit");

    option = sc.next().charAt(0);
    System.out.println("\n");

    while (Character.toLowerCase(option) != 'f') {
        System.out.println("********************************************");
        System.out.println("Choose an option");
        System.out.println("\n");

        switch (Character.toLowerCase(option)) {
            case 'a':
                System.out.println("......................");
                System.out.println("Balance = " + balance);
                System.out.println("......................");
                System.out.println("\n");
                break;
            case 'b':
                System.out.println("......................");
                System.out.println("Enter an amount to withdraw: ");
                System.out.println("......................");
                double amt = sc.nextDouble();
                withdrawl(amt);
                System.out.println("\n");
                break;
            case 'c':
                System.out.println("......................");
                System.out.println("Enter an amount to deposit: ");
                System.out.println("......................");
                double amtd = sc.nextDouble();
                addbalance(amtd);
                System.out.println("\n");
                break;
            case 'd':
                System.out.println("......................");
                System.out.println("Previous Transaction:");
                getprevioustransaction();
                System.out.println("......................");
                System.out.println("\n");
                break;
                case 'e':
                {
                    printBill();
                }
            default:
                System.out.println("Choose a correct option to proceed");
                break;
        }

        System.out.println("********************************************");
        System.out.println("Choose an option");
        option = sc.next().charAt(0);
        System.out.println("\n");
    }
    
    System.out.println("Thank you for using our banking services");
} 
}

public class ch9_bank_managementsystem {
    public static void main(String[] args) {
        bankaccount bank=new bankaccount("rohit","101");
        bank.menu();
        bankaccount bank2=new bankaccount("dolly","102a");
        bank2.menu();
    }
}
