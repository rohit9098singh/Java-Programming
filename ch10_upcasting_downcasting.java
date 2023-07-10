class phone
{
    void showtime()
    {
        System.out.println("the time is 8 am now");
    }
    void on()
    {
       System.out.println("normal phone on's");
    }

}
class smartphone extends phone{
    void on()
    {
        System.out.println("smart phone on's");
    }
    void musicplayer()
    {
        System.out.println("playing music");
    }

}
public class ch10_upcasting_downcasting {
    public static void main(String[] args) {
        //UPCASTING-we can only call the overloaded and the parent class methods only;
        phone p=new smartphone();/*or we can also write as phone p=new (phone) smartphone(); 
                                  this actually means we are typecasting the smartphone to phone class that is the parentclass
                                  */
        p.on();
        //p.musicplayer();//not allowed as it is upcating can only call overloaded method and parent method                         

      
       //DOWNCASTING-
       smartphone s=(smartphone) p;//basically i am saying is hey i know this is object of smartphone but has a refernce of phone
                                   //therefore we forcefully convert so that it becomes a downcating
        s.musicplayer();//here it is allowed as we have typecacted it to child class                                                                
    }
     

}
/*S.No	Upcasting	Downcasting
1.	A child object is typecasted to a parent object
2.	We can perform Upcasting implicitly or explicitly.	
3.	In the child class, we can access the methods and variables of the parent class.
4.	We can access some specified methods of the child class.
5.	Parent p = new Parent()*/

/*Downcasting
1. The reference of the parent class object is passed to the child class.
2. Implicitly Downcasting is not possible.
3. The methods and variables of both the classes(parent and child) can be accessed.
4.	All the methods and variables of both classes can be accessed by performing downcasting.
5. Child c = (Child)p;*/