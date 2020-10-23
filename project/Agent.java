
import java.util.*;
public class Agent {
	private ArrayList<Booking> booking = new ArrayList<Booking>();
	private ArrayList<Passenger> passenger = new ArrayList<Passenger>();
	public void addBooking(Booking b){
		this.booking.add(b);
	}
	public void addPassenger(Passenger p){
		this.passenger.add(p);
	}
	public void removeBooking(int i) {
		this.booking.remove(i);
		this.passenger.remove(i);
	}
	public void printBooking() {
		if(booking.size()==0) {
			System.out.println("sorry there is no booking.");
		}
		else {
			for(int i=0;i<booking.size();i++) {
				String a = booking.get(i).toString();
				String b = passenger.get(i).toString();
				System.out.println((i+1)+" "+b + " \n" +a);
			}
		}
	}
	public void printPassengers() {
		if(passenger.size()<=0) {
			System.out.println("Sorry there is no passenger");
		}
		else {
			for(int i=0;i<passenger.size();i++) {
				String a = passenger.get(i).toString();
				System.out.println((i+1)+"  " +a );
			}
				
		}
		
	}
	public Booking getBooking(int i) {
		return this.booking.get(i);
	}
	public int bookingSize() {
		return this.booking.size();
	}
}
