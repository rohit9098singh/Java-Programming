class disealengine
{
    String name_of_engine;
    int id_of_engine;
    int price;
    //normal constructor
    disealengine()
    {
        name_of_engine="bs2";
        id_of_engine=101;
        price=40000;
    }
    //parameterized constructor
    disealengine(String name_of_engine,int id_of_engine,int price)
    {
        this.name_of_engine=name_of_engine;
        this.id_of_engine=id_of_engine;
        this.price=price;
    }
    //copy constructor
    disealengine(disealengine myengine)
    {
        this.name_of_engine=myengine.name_of_engine;
        this.id_of_engine=myengine.id_of_engine;
        this.price=myengine.price;
    }
    void display_output()
    {
        System.out.println("Engine_name ="+name_of_engine+"\n"+"your engine id is ="+id_of_engine+"\n"+"price ="+price);
    }

}
public class ch4_copyconstructor2 {
    public static void main(String[] args) {
        disealengine engine1=new disealengine();//calling the non parametrized constructor
        System.out.printf("inside the non parametrized constructor where the values are already present\n");
        engine1.display_output();

        disealengine engine2=new disealengine("tata_motors",102,3000000);
        System.out.println("i am a overloaded constructor where the values are set during the run time ");
        engine2.display_output();

        disealengine engine3=new disealengine(engine2);
        System.out.println("executing the copy constructor which is the last type of the cnstructor");
        engine3.display_output();
    }
    
}
