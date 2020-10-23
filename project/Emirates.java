

public class Emirates extends Flight {
	public Emirates(String departure, String date, int capacity, int ticketNumber, String arrival,
			Fare fare){
		super(departure,date,capacity,ticketNumber,arrival,fare);
	}
//	@Override
//	public void setFare(Fare fare){
//		Fare fare1 = new Fare();
//		fare1.setGrossFare(fare.getGrossFare()*2);
//		
//		
//		fare=fare1;
//		
//	}
	public String getBusinessClass(){
		return "Business Class";
	}
	@Override
	public String toString() {
		return "Emirates  \n\t" + super.toString() +"\t"+this.getBusinessClass()+ "";
	}
}
