import java.awt.*;

import javax.swing.JFrame;
class dframe extends JFrame{
    dframe()
    {
   /*Panel p=new Panel(); *//*IF WE DONT MAKE THE PANNEL OBJECT AND DONT USE P.ADD(B) THEN THE BUTTON AND THAT ARE NOT GOING TO BE 
    BORDERED MEANS IT WILL NOT SEEM LIKE IT IS A BUTTON JUST A SIMPLE WRITING WILL BE THERE COMMENT THIS AND USE THE ALREADY 
    COMMENTED PART TO SEE THE EXPLAINATION */
    Button b=new Button("submit");
    //p.add(b);
   // add(p);

     add(b);//comment this and uncooment the commented part to see transaltion
    setSize(400,400);
    setTitle("my frame");
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
public class ch16_2_swing {
    public static void main(String[] args) {
        dframe d=new dframe();
    }
    
}
