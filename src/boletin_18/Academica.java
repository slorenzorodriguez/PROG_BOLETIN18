/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_18;

import Boletin18_1.Persoal;

/**
 *
 * @author slorenzorodriguez
 */
public class Academica {
    
    private static int referenceNum = 2018;
    private String name;
    private float grade;
    private Persoal student;

    public Academica() {
        referenceNum ++;
    }

    public Academica(String name, float grade, Persoal student) {
        this.name = name;
        this.grade = grade;
        this.student = student;
        referenceNum ++;
    }

    
    public static int getReferenceNum() {
        return referenceNum;
    }

    public String getName() {
        return name;
    }

    public float getGrade() {
        return grade;
    }

    public Persoal getStudent() {
        return student;
    }

    public static void setReferenceNum(int referenceNum) {
        Academica.referenceNum = referenceNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public void setStudent(Persoal student) {
        this.student = student;
    }
    
    
    @Override
    public String toString(){
        return "Ref: "+referenceNum+"\nName: "+name+"\nGrade: "+grade+student;
    }
}


