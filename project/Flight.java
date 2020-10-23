

public class Flight {
	private String name;
	private String departure;
	private String date;
	private int capacity;
	private int ticketNumber;
	private String arrival;
	private Fare fare;
	public Flight() {
		super();
	}
	
	
	public Flight( String departure, String date, int capacity, int ticketNumber, String arrival,
			Fare fare) {
		
		
		this.departure = departure;
		this.date = date;
		this.capacity = capacity;
		this.ticketNumber = ticketNumber;
		this.arrival = arrival;
		this.fare = fare;
	}
		
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public Fare getFare() {
		return fare;
	}
	public void setFare(Fare fare) {
		this.fare = fare;
	}


	@Override
	public String toString() {
		return "Flight [departure=" + departure + ", date=" + date + ", capacity=" + capacity
				+ ", ticketNumber=" + ticketNumber + ", arrival=" + arrival + ", fare=" + fare.getGrossFare() + "]";
	}
	
	
	
	
	
}
      
