

public class Fare {

	private double grossFare;
	

	public Fare() {
		
	}


	public Fare(double grossFare) {
		super();
		setGrossFare(grossFare);
	}


	public double getGrossFare() {
		return calculateTax();
	}


	public void setGrossFare(double grossFare) {
		this.grossFare = grossFare;
		
	}
	public double calculateTax(){
		return this.grossFare+17000.25;
	}
	
	
	
}
