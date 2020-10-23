
import java.util.*;


public class Admin {
	
	private ArrayList<Flight> flight;
	
	public Admin(){
		flight = new ArrayList<Flight>();
	}
	
	
	public void addFlight(Flight f){
		flight.add(f);
	}
	public void removeFlight(int a){
		
		this.flight.remove(a);
	}
	public void printFlight(){
		if(flight.size()==0){
			System.out.println("sorry there is no flight");
		}
		else{
			for(int i=0;i<flight.size();i++){
				String a = flight.get(i).toString();
				System.out.println((i+1)+ " "+a);
			}
		}
	}
	public int arraySize() {
		return this.flight.size();
	}
	public Flight getFlight(int i) {
		return flight.get(i);
	}
}
