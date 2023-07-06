import java.util.Scanner;

class bankaccount {
    double balance;
    String pannumber;
    String address;
    String name;
    String phonenumber;
    String adharnumber;
    double prevtrans;
    String customername;
    String coustomerid;
    int no_of_customer = 0;

    bankaccount(String customername, String cutomerid) {
        this.customername = customername;
        this.coustomerid = cutomerid;
    }

    void addbalance(double amount) {
        if (amount != 0) {
            balance = balance + amount;
            prevtrans = amount;
        }
    }

    void withdrawl(double amount) {
        if (amount != 0 && balance > amount) {
            balance = balance - amount;
            prevtrans = amount;
        } else if (balance < amount) {
            System.out.println("you cannot withdraw your available balance is insufficent for withdrawal");
        }
    }

    void getprevioustransaction() {
        if (prevtrans > 0) {
            System.out.println(" deposited =" + prevtrans);
        } else if (prevtrans < 0) {
            System.out.println("withdrawn =" + Math.abs(prevtrans));
        } else {
            System.out.println("no transction has occured");
        }
    }

    void printBill() {
        System.out.println("Customer Name: " + customername);
        System.out.println("Customer ID: " + coustomerid);
        System.out.println("Balance: " + balance);
    }

    void addcustomer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.nextLine();
        System.out.println("enter your customer id");
        String coustomerid = sc.nextLine();
        System.out.println("enter your adharnumber");
        String adharnumber = sc.nextLine();
        System.out.println("enter your phone number");
        String phonenumber = sc.nextLine();
        System.out.println("enter your pancard number");
        String pannumber = sc.nextLine();
        if (isvalidpannumber(pannumber)) {
            System.out.println("paNnumber=" + pannumber);
        } else {
            System.out.println("not a valid pannumber please recheck it");
        }
    }

    boolean isvalidpannumber(String pannumber) {
        String st = "[A-z]{5}[0-9]{4}[A-z]{1}";
        return pannumber.matches(st);
    }

    void printing_customer_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the customerid");
        String getid = sc.nextLine();
        if (getid ==coustomerid) {
            System.out.println("****PRINTING CUSTOMER DETAILS*****");
            System.out.println("Name: " + name);
            System.out.println("Customer ID: " + coustomerid);
            System.out.println("Aadhar Number: " + adharnumber);
            System.out.println("Phone Number: " + phonenumber);
            System.out.println("PAN Card Number: " + pannumber);
        } else {
            System.out.println("you have entered a wrong customer_id please reenter the id");
        }
    }

    void menu() {
        char option;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome " + customername);
        System.out.println("Your ID: " + coustomerid);
        System.out.println("a) Check Balance");
        System.out.println("b) Withdraw Amount");
        System.out.println("c) Deposit Amount");
        System.out.println("d) Previous Transaction");
        System.out.println("e)printbill");
        System.out.println("f) add_account");
        System.out.println("g)printing_customer_details");
        System.out.println("h) Exit");
        System.out.println("********************************************");
        System.out.println("Choose an option");
        option = sc.next().charAt(0);
        System.out.println("\n");

        while (Character.toLowerCase(option) != 'h') {
            System.out.println("********************************************");
             switch (Character.toLowerCase(option)) {
                case 'a':
                    System.out.println("......................");
                    System.out.println("Balance = " + balance);
                    System.out.println("......................");
                    break;
                case 'b':
                    System.out.println("......................");
                    System.out.println("Enter an amount to withdraw: ");
                    System.out.println("......................");
                    double amt = sc.nextDouble();
                    withdrawl(amt);
                    break;
                case 'c':
                    System.out.println("......................");
                    System.out.println("Enter an amount to deposit: ");
                    System.out.println("......................");
                    double amtd = sc.nextDouble();
                    addbalance(amtd);
                    break;
                case 'd':
                    System.out.println("......................");
                    System.out.println("Previous Transaction:");
                    getprevioustransaction();
                    System.out.println("......................");
                    break;
                case 'e': {
                    printBill();
                    break;
                }
                case 'f': {
                    addcustomer();
                    break;
                }
                case 'g':
                {
                    printing_customer_details();
                    break;
                }
                default:
                    System.out.println("Choose a correct option to proceed");
                    break;
            }

            System.out.println("********************************************");
            System.out.println(
                    "Choose an option\n:a)check balance\nb:withdrawal amount\nc:deposite\nd:previous transaction\ne:printbill\nf:add_account\ng:printing_customer_details\nh)exit");
            option = sc.next().charAt(0);
        }

        System.out.println("Thank you for using our banking services");
    }
}

public class ch9_banakmanagement_system {
    public static void main(String[] args) {
        bankaccount bank = new bankaccount("rohit", "101");
        bank.menu();
        bankaccount bank2 = new bankaccount("dolly", "102");
        bank2.menu();
    }
}
