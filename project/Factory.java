

public class Factory  {

	public Flight getFlight(String a,String departure, String date, int capacity, int ticketNumber, String arrival,
			Fare fare){
		
		
		
		if(a.equals("emirates")){
			return new Emirates(departure,date,capacity,ticketNumber,arrival,fare);
		}
		else if(a.equals("flynass")){
			return new Flynass(departure,date,capacity,ticketNumber,arrival,fare);
		}
		else if(a.equals("qatar")){
			return new Qatar(departure,date,capacity,ticketNumber,arrival,fare);
		}
		return null;
	}
	
	
}
