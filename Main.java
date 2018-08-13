
import java.awt.Dimension;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rahul
 */
import java.lang.Math;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Design gui = new Design();
        gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gui.setResizable(false);
        gui.setTitle("CALCULATOR");
        gui.setVisible(true);
    }
    
}
