/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5001.university.example;

import info5001.university.example.CourseCatalog.Course;
import info5001.university.example.CourseCatalog.CourseCatalog;
import info5001.university.example.CourseSchedule.CourseLoad;
import info5001.university.example.CourseSchedule.CourseOffer;
import info5001.university.example.CourseSchedule.CourseSchedule;
import info5001.university.example.Department.Department;
import info5001.university.example.Persona.Person;
import info5001.university.example.Persona.PersonDirectory;
import info5001.university.example.Persona.StudentDirectory;
import info5001.university.example.Persona.StudentProfile;
import java.awt.CardLayout;

/**
 *
 * @author kal bugrara
 */
public class Info5001UniversityExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Department dep = new Department("Information System");
        CourseCatalog courseCata = dep.getCourseCatalog();    
        //courseCatalog 不該被new courseCatalog,
        //而是應該從department連出去，那個dep的courseCatalog
        Course info5001Course = courseCata.newCourse("Application Modeling & Design", "INF5001", 4);
        info5001Course.getCourseCatalog().getDepartment();  //一步一步往上搜尋
        
        
        
        
        // TODO code application logic here
//        Department department = new Department("Information Systems");
//
//        Course course = department.newCourse("app eng", "info 5100", 4);
//
//        CourseSchedule courseschedule = department.newCourseSchedule("Fall2020");
//
//        CourseOffer courseoffer = courseschedule.newCourseOffer("info 5100");
//        
//        courseoffer.generatSeats(10);
//        
//               //create student
//        
//        PersonDirectory pd = department.getPersonDirectory();
//        
//        Person person = pd.newPerson("123");
//        StudentDirectory sd = department.getStudentDirectory();
//        StudentProfile student = sd.newStudentProfile(person);
//        CourseLoad courseload = student.newCourseLoad("Fall2020"); 
//        
//        courseload.newSeatAssignment(courseoffer);
//        
        
        
        
       
        

    }

}
