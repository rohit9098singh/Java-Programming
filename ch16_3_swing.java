import java.awt.*;
import javax.swing.*;
class pannelex extends JFrame{
    pannelex()
    {
        /*IT IS BASICALLY THE TEMPLET OF THE GUI WHICH EVERY PROGRAMME SHOULD NEARLY HAVE IT */
        setTitle("cromepage");
        setSize(400,400);
        setMinimumSize(new Dimension(300, 400));
         setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        /*NOW HERE WE ARE ACTUALLY DOING THINGS THAT WE ACTUALLY WANT IN OUR GUI TO BE PRESENT */

        setLayout(new GridBagLayout());/*USED FOR BORDERING MEANS HOW THE BUTTONS PANNELS AND ALL WILL BE ARRANGED IN OUR INTERFACE 
        BASICALLY THERE ARE THREE TYPES OF LAYOUT SYSTEM THAT WE CAN USE 1.ALREADY USED 2-BorderLayout 3-FlowLayout EVERYONE HAS ITS 
        OWN SPECIFIC MEANING*/
        Panel p=new Panel();/*THEY ARE THE USED FOR INNER GRID OR BORDER TYPE IN THE GUI WHICH IS BUILD IN THE PROGRAMME WHICH WE CAN USE AS PUUTING SOME DATA IN IT */
        Label l1=new Label("panel 1");/*JLabel can display text, image or both . JLabel is only a display of text or image .and it cannot get focus . JLabel is inactive to input events such a mouse focus or keyboard focus. By default labels are vertically centered but the user can change the alignment of label. */
        p.add(l1);
        Button b1=new Button("button 1");
        p.add(b1);
        add(p);

        /*HERE WE HAVE CREATED ANOTHER PANNEL HERE */
        Panel p2=new Panel();
        Label l2=new Label("pannel 2");
        Button b2=new Button("button 2");
        p2.add(l2);
        p2.add(b2);
        add(p2);
 }
}
public class ch16_3_swing {
    public static void main(String[] args) {
        pannelex pan=new pannelex();
        /*WE CAN ALSO MAKE THAT TEMPLET OF THE GUI IN THE MAIN METHOD INSTED IN THE CLASS ITS THE USER CHOICE BUT NOTE THAT 
         * IN CALSS EXIT_ON_CLOSE WORKS DIRECTLY BECAUSE CLASS HAS IMPORTED THE PACKAGE BUT NOT HERE 
         * IN MAIN WE HAVE TO SPECIFY FROM WHICH PAKAGE IT BELONGS TO
         */

       /*   pan.setTitle("cromepage");
        pan.setSize(400,400);
        pan.setMinimumSize(new Dimension(300, 400));
         pan.setVisible(true);
        pan.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);*/

    }
    
}
