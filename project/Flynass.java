

public class Flynass extends Flight {
	public Flynass(String departure, String date, int capacity, int ticketNumber, String arrival,
			Fare fare){
		super(departure,date,capacity,ticketNumber,arrival,fare);
	}
	public String getEconomyClass(){
		return "Economy Class";
	}
	@Override
	public String toString() {
		return "Flynass /n/t" + super.toString() +"/t"+this.getEconomyClass()+ "";
	}
	
}
