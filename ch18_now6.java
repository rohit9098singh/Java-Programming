public class ch18_now6 {
    public static void main(String[] args) {
        if(args.length==0)
        {
        System.out.println("no arguments are passed ");
        }
        else 
        {
            System.out.println("provided arguments are ");
        for(int i=0;i<args.length;i++)
        {
            System.out.println("arguments "+(i+10)+":"+args[i]);
        }
    }
    }
}
