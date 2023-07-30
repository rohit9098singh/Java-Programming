//The Character class wraps a value of the primitive type char in an object.
//or IT IS A PROCESS OF WRAPPING PRIMITIVE TYPE VARIABLE INTO CHARACTER OBJECTS
public class ch2_characterclass {
    public static void main(String[] args) {
        char ch='a';
        System.out.println("using all the character class method ");
        boolean first=Character.isDigit(ch);
        System.out.println("is character " +ch+ "a digit - " +first);

        boolean second=Character.isLetter(ch);
        System.out.println("is character "+ch+" is a letter -"+second);

        boolean third=Character.isLowerCase(ch);
        System.out.println("is character "+ch+" is a lowercase -"+second);
         
        boolean fourth =Character.isUpperCase(ch);
        System.out.println("is character "+ch+" is in upper case -" +fourth);


        char c=Character.toUpperCase(ch);
        System.out.println("upper case of " +ch+" is "+c);

        char l=Character.toLowerCase(ch);
        System.out.println("lower case of " +ch+ " is "+l);

        

        
    }
    
}
