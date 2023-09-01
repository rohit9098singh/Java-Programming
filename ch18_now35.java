class complexNumber
{
    int real;
    float imagi;
    public  complexNumber(int real,float imagi)
    {
       this.real=real;
       this.imagi=imagi;
    }
    public String toString() 
    {
      return real+"+"+imagi+"i";
      
    }
}
public class ch18_now35 {
    public static void main(String[] args) {
        complexNumber c=new complexNumber(4,5.3f);
        System.out.println(c.toString());
    }
    
}
