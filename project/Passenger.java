

//show flights
//which flight
//by defualt routes
//select a rout
//passenger details
//reservation number to passenger
//Book class for book flight and cancel already booking ticket
//ticket number in flights
//check booked tickets
//for boarding pass airport require all flight details 
//check for valid ticket
//that's all


public class Passenger{
	
	private String firstName;
	private String lastName;
	private int phone;
	private String passportNumber;
	public Passenger(String firstName, String lastName, int phone, String passportNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.passportNumber = passportNumber;
	}
	public Passenger(){
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	@Override
	public String toString() {
		return "Passenger [firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone + ", passportNumber="
				+ passportNumber + "]";
	}
	
}
