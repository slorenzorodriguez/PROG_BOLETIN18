/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_18;

import javax.swing.JOptionPane;
import Boletin18_1.Persoal;


/**
 *
 * @author slorenzorodriguez
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persoal al1p = new Persoal("687123453","qwerly@gmail.com");
        Academica al1 = new Academica("Qwerly",5,al1p);
        JOptionPane.showMessageDialog(null, al1);
        Persoal.calculateGrade(al1);
        JOptionPane.showMessageDialog(null, al1);
        
        Persoal al2p = new Persoal("653454645","qwerdsa@hotmail.es");
        al2p.setMail("qwerdsa@hotmail.es");
        al2p.setPhone("653454645");
        Academica al2 = new Academica();
        al2.setName("Qwerlt");
        al2.setStudent(al2p);
        JOptionPane.showMessageDialog(null, al2);
        Persoal.calculateGrade(al2);
        JOptionPane.showMessageDialog(null, al2);
        
    }
    
}
    
    

