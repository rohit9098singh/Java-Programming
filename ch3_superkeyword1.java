class animal {
    String species;
    String living;

    animal(String species, String living) {
        this.species = species;
        this.living = living;
    }
}

class lion extends animal {
    String name;

    lion(String species, String living, String name) {
        super(species, living);//here we have used it 
        this.name = name;
    }

    void display() {
        System.out.println("species = " + species);
        System.out.println("living in = " + living);
        System.out.println("name is = " + name);
    }
}
class goat extends lion{
    String eating;
    goat(String species,String living,String name,String eating)
    {
        super(species,living,name);
        this.eating=eating;
    }
    void display()
    {
        super.display();//here we have used it
        System.out.println("ther are actually eating "+eating);
    }
}

public class ch3_superkeyword1 {
    public static void main(String[] args) {
        lion li = new lion("wild", "jungle", "lion");
        li.display();
        System.out.println("=============================================");
        goat g=new goat("harbivorous","our surrounding","goat","grass");
        g.display();
    }
}
