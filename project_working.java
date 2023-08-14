import java.util.*;
class ch9_banakmanagement_system{
    String accountnumber;
    String name;
    String address;
    String phonenumber;
    String pannumber;
    String adharnumbr;
    String customer_id;
    String landmark;
    public ch9_banakmanagement_system(String accountnumber,String name,String address,String phonenumber,String pannumber,String adharnumbr,String customer_id,String landmark)
    {
        this.accountnumber=accountnumber;
        this.address=address;
        this.name=name;
        this.phonenumber=phonenumber;
        this.pannumber=pannumber;
        this.adharnumbr=adharnumbr;
        this.customer_id=customer_id;
        this.landmark=landmark;

    }
    public String get_customer_details()
    {
        return "accountnumber"+ accountnumber +"name ="+name+"adreesss"+address+"phone number"+phonenumber+"pannumber"+pannumber+"adharnumber"+adharnumbr+"customer id"+customer_id;
    }


}
class banking_process{
    ch9_banakmanagement_system system[];
    public void view_details()
    {
        system=new ch9_banakmanagement_system[]{
        new ch9_banakmanagement_system("2409 987 9877","rahul kumar singh","banglore","9000093032","4987 8312 5341","9232323", "101","near acharya institute"),
        new ch9_banakmanagement_system("23232 323 3232","amit kumar", "jharkhand","9320232322","4334 4343 3434","93929323", "102","near namma metro"),};
        //any other deatils
    }
}
class employee extends banking_process 
{
   private static final int ORIGINAL_PASSWORD = 1234;
    private static final int MAX_LOGIN_ATTEMPTS = 3;
    private int id;
    private int loginAttempts = 0; // To track failed login attempts
    private int loginPassword;
    private Scanner sc = new Scanner(System.in);

    public employee() {
        while (loginAttempts < MAX_LOGIN_ATTEMPTS) {
            System.out.println("Enter your 4-digit password:");
            loginPassword = sc.nextInt();
            if (loginPassword == ORIGINAL_PASSWORD) {
                System.out.println("Welcome to your portal");
                break;
            } else {
                loginAttempts++;
                int remainingAttempts = MAX_LOGIN_ATTEMPTS - loginAttempts;
                if (remainingAttempts > 0) {
                    System.out.println("Password incorrect. " + remainingAttempts + " attempts remaining.");
                } else {
                    System.out.println("System failed. Too many failed login attempts.");
                }
            }
        }
    }
}
public class practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        banking_process process =new banking_process();
        while(true)
        {
            System.out.println("enter your choice 1:view details\n2:employee login\n3:customer login\n4:exit");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                process.view_details();
                break;

                case 2:
                employee e=new employee();
                break;
                case 3:
                break;
                case 4:
                System.out.println("thanks for enrolling here have a great day ahead");
                return;
                default:
                System.out.println("enter correct choice");
                

                
                

            }
        }
        
    }
    
}
