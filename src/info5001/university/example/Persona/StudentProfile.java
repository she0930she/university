/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5001.university.example.Persona;

import info5001.university.example.CourseCatalog.Course;
import info5001.university.example.CourseSchedule.CourseLoad;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class StudentProfile {

    Person person;
    Transcript transcript;

    public StudentProfile(Person p) {

        person = p;
        transcript = new Transcript();
    }

    public boolean isMatch(String id) {
        if (person.getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    public CourseLoad getCourseLoadBySemester(String semester) {

        return transcript.getCourseLoadBySemester(semester);
    }

    public CourseLoad getCurrentCourseLoad() {

        return transcript.getCurrentCourseLoad();
    }
    public ArrayList<Course> getCurrentCourse() {

        return transcript.getCurrentCourse();
    }

    public CourseLoad newCourseLoad(String s){
        
        return transcript.newCourseLoad(s);
    }
     public void newCourseLoad(Course course){
        
         transcript.newCourseLoad(course);
    }
    
}
