/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5001.university.example.CourseCatalog;

/**
 *
 * @author kal bugrara
 */
public class Course {
    CourseCatalog cc;
    String number;
    String name;

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }
    int credits;
    int price; //per credit hour
    public Course(String n, String numb, int ch, CourseCatalog cc){
        this.cc= cc;
        name = n;
        number = numb;
        credits = ch;
    }
    public String getCOurseNumber(){
        return number;
    }
    
    public int getCoursePrice(){
        return price*credits;
        
    }

    public CourseCatalog getCourseCatalog() {
        return cc;
    }
    
}
