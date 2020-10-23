
import java.util.*;


public class Booking {
	private Flight flight;
	private String bookingReference;
	
	
	public Booking(){
	
		
	}
	public Booking(Flight f) {
		this.flight = f;
		this.bookingReference = setBookingReference();
	}
	public String setBookingReference(){
		String s="ABCDEFGHIGKLMNOPQRSTUVYXYZ";
		String ns="123456789";

		String genrate="";
		Random r = new Random();
		

		for (int i=0;i<3 ;i++ ) {
			int r1 = r.nextInt(26);
			int r2 = r.nextInt(9);	

			char c=s.charAt(r1);
			char c1=ns.charAt(r2);
			genrate+=Character.toString(c);
			genrate+=Character.toString(c1);
			
		}


		return genrate;
	}
	public String getBookingReference() {
		return this.bookingReference;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	@Override
	public String toString() {
		String f = flight.toString();
		return "Booking [bookingReference=" + bookingReference +"\n "+f+ "]";
	}
	
	
}
