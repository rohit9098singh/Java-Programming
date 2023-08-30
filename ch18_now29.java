public class ch18_now29 {
    public static void main(String[] args) {
        String str="we are here to learn java";
        char[] ch={'a','e','i','o','u'};
        String str1="";
        for(char c:ch)
        {
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)==c)
                {
                    str1+=c;
                }
            }
        }
    }
    
}
