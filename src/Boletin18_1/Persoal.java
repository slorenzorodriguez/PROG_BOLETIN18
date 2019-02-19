/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boletin18_1;

/**
 *
 * @author slorenzorodriguez
 */
import boletin_18.Academica;
import javax.swing.JOptionPane;


public class Persoal {
   

    private String phone;
    private String mail;

    public Persoal() {
    }

    public Persoal(String telefono, String correo) {
        this.phone = telefono;
        this.mail = correo;
    }

    public String getPhone() {
        return phone;
    }

    public String getMail() {
        return mail;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public static void calculateGrade(Academica student) {
        float practice;
        float theory;
        int boletines;
        int nBoletines;
        int work;
        float media;

        do {
            practice = Float.parseFloat(JOptionPane.showInputDialog("Practice grade"));
        } while (practice < 1 || practice > 10);

        do {
            theory = Float.parseFloat(JOptionPane.showInputDialog("Theory grade"));
        } while (theory < 1 || theory > 10);

        do {
            boletines = Integer.parseInt(JOptionPane.showInputDialog("Boletines done"));
        } while (boletines < 1 || boletines > 20);

        nBoletines = boletines / 20 * 100;
        if (nBoletines >= 80) {
            work = 2;
        } else if (nBoletines >= 70) {
            work = 1;
        } else {
            work = 0;
        }

        media = theory * 0.4f + practice * 0.4f + work;
        media = Math.round(media);

        student.setGrade(media);
    }

    @Override
    public String toString() {
        return "\nPhone: " + phone + "\nMail: " + mail;
    }
}

