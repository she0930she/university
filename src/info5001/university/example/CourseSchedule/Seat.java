/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5001.university.example.CourseSchedule;

/**
 *
 * @author kal bugrara
 */
public class Seat {
    
    Boolean occupied; 
    int number;
    SeatAssignment seatassignment;
    CourseOffer courseoffer;
    public Seat (CourseOffer co, int n){
        courseoffer = co;
        number = n;
        occupied = true;
        
    }
    
    public Boolean isOccupied(){
        return occupied;

    }
    
    public void assignSeat(SeatAssignment sa){
            
            seatassignment = sa;
    }
    
}
