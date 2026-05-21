import greenfoot.*;
import javax.swing.*;
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version 0.1.1
 */
public class Buttons extends World
{
    private boolean clicked = false;
    private boolean newPage = false;
    public Buttons() {
        super(3, 3, 225); 
        Button b1=new Button();
        addObject(b1,0,1);
        Button2 b2=new Button2();
        addObject(b2,2,1);
        Button3 b3=new Button3();
        addObject(b3,1,1);
        /**
         * JLabels:
         */
        //         JLabel label2;
        //         label2 = new JLabel("Compare English to Text Message:    English: I am a label    Text Message: i m a lbel");
        //         label2.setToolTipText("A label containing only text");
        //         add(label2);
        /**
         * Break:
         */
        //         if (Greenfoot.mouseClicked(this)) {  
        //             addObject(b3,2,2);
        //         }
    }

    public void setClicked(boolean b) {
        clicked = b;
    }

    public void changePage(boolean b) {
        newPage = b;
    }

    public boolean getDaClick(){
        return clicked;
    }

    public boolean getDaPage() {
        return newPage;
    }
}

//     private static void createAndShowGUI() {
//         JFrame frame = new JFrame("Compare");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.add(new test());
//         frame.pack();
//         frame.setVisible(true);
//     }
// 
//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(new Runnable() {
//                 public void run() {
//                     UIManager.put("swing.boldMetal", Boolean.FALSE);
//                     createAndShowGUI();
//                 }
//             });
//     }