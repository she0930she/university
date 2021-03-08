/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5001.university.example.Department;

import info5001.university.example.CourseCatalog.Course;
import info5001.university.example.CourseCatalog.CourseCatalog;
import info5001.university.example.CourseSchedule.CourseLoad;
import info5001.university.example.CourseSchedule.CourseOffer;
import info5001.university.example.CourseSchedule.CourseSchedule;
import info5001.university.example.Persona.PersonDirectory;
import info5001.university.example.Persona.StudentDirectory;
import info5001.university.example.Persona.StudentProfile;
import java.util.HashMap;

/**
 *
 * @author kal bugrara
 */
public class Department {

    String name;
    CourseCatalog coursecatalog;
    PersonDirectory persondirectory;
    StudentDirectory studentdirectory;

    HashMap<String, CourseSchedule> mastercoursecatalog;

    public Department(String n) {
        name = n;
        mastercoursecatalog = new HashMap<String, CourseSchedule>();
        coursecatalog = new CourseCatalog(this);
        studentdirectory = new StudentDirectory(this); //pass the department object so it stays linked to it
        persondirectory = new PersonDirectory();   
        //person does not in dep devel, 
        // but in University level. so no "this"
    }

    public Department() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public PersonDirectory getPersonDirectory() {

        return persondirectory;

    }

    public StudentDirectory getStudentDirectory() {
    return studentdirectory;
    }

    public CourseSchedule newCourseSchedule(String semester) {

        CourseSchedule cs = new CourseSchedule(semester, coursecatalog);
        mastercoursecatalog.put(semester, cs);
        return cs;
    }

    public CourseSchedule getCourseSchedule(String semester) {

        return mastercoursecatalog.get(semester);

    }

    public CourseCatalog getCourseCatalog() {

        return coursecatalog;

    }
    
    public HashMap<String, CourseSchedule> getTerm(){
        return mastercoursecatalog;
    }

    public Course newCourse(String n, String nm, int cr) {

        Course c = coursecatalog.newCourse(n, nm, cr);
        return c;
    }

    public int calculateRevenuesBySemester(String semester) {

        CourseSchedule css = mastercoursecatalog.get(semester);

        return css.calculateTotalRevenues();

    }

    public void RegisterForAClass(String studentid, String cn, String semester) {

        StudentProfile sp = studentdirectory.findStudent(studentid);

        CourseLoad cl = sp.getCurrentCourseLoad();

        CourseSchedule cs = mastercoursecatalog.get(semester);

        CourseOffer co = cs.getCourseOfferByNumber(cn);

        co.assignEmptySeat(cl);

    }
    
    
    
}
