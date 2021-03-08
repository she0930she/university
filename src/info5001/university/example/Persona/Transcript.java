/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5001.university.example.Persona;

import info5001.university.example.CourseCatalog.Course;
import info5001.university.example.CourseSchedule.CourseLoad;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author kal bugrara
 */
public class Transcript {
    
    
    HashMap<String, CourseLoad> courseloadlist;
    
    CourseLoad currentcourseload;
    ArrayList<Course> currentCourse;
    
    public Transcript(){
        
        courseloadlist = new HashMap<String, CourseLoad>();
        currentCourse=new  ArrayList<>();
        
    }
    
    public CourseLoad newCourseLoad(String sem){
        
        currentcourseload = new CourseLoad(sem);
        courseloadlist.put(sem, currentcourseload);
        return currentcourseload;
    }
     public void newCourseLoad(Course course){
        currentCourse.add(course);
        
    }
     public ArrayList<Course> getCurrentCourse(){
         return currentCourse;
     }
    
    public CourseLoad getCurrentCourseLoad(){
        
        return currentcourseload;
        
    }
        public CourseLoad getCourseLoadBySemester(String semester){
        
        return courseloadlist.get(semester);
        
    }
}
