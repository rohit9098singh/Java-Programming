public class ch1_prime_twointerval {
    public static void main(String[] args) {
        int low=10,high=50,c=0;
        int i,j;
        int flag=0;
        System.out.println("prime number between the enterd numbers are as follow");
        for( i=low;i<=high;i++)
        {
            for( j=2;i<=i;j++)
            {
                if(i%j==0)
                {
                    c=1;
                    break;
                    
                }
            }   
            if(i==j)
            {
                
                System.out.println(i);
            }
        
        }
    }
    
}
