/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5001.university.example.CourseSchedule;

import info5001.university.example.CourseCatalog.Course;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class CourseOffer {
    
    Course course;
    ArrayList<Seat> seatlist;
    
        public CourseOffer(Course c){
            course =c;    
            seatlist = new ArrayList();
        
    }
    public String getCourseNumber(){
        return course.getCOurseNumber();
    }
    
    public void generatSeats(int n){
        
        for (int i=0; i<n; i++){
            
            seatlist.add(new Seat(this, i));
            
        }
            
        }
    public Seat getEmptySeat(){
        
        for(Seat s: seatlist){
            
            if(s.isOccupied()) return s;
        }
        return null;
    }
    
    public SeatAssignment assignEmptySeat(CourseLoad cl){
        
        Seat seat = getEmptySeat();
        if (seat==null) return null;
        return cl.newSeatAssignment(this);
        
    }
    
    public int getTotalCourseRevenues(){
        int sum = 0;
        for(Seat s: seatlist){
            if(s.isOccupied()==true) sum = sum + course.getCoursePrice();
                
        }
        return sum;
    }
    
}
