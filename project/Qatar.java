

public class Qatar extends Flight {
	public Qatar(String departure, String date, int capacity, int ticketNumber, String arrival,
			Fare fare){
		super(departure,date,capacity,ticketNumber,arrival,fare);
	}
	public String getEconomyPlusClass(){
		return "Economy Plus class";
	}
	@Override
	public String toString() {
		return "Qatar \n\t" + super.toString() +"\t"+this.getEconomyPlusClass()+ "";
	}
}
