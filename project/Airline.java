

public class Airline {
	private Agent a;
	public Airline(Agent agent){
		a=agent;
	}
	
	public Airline(){
		
	}
	
	public void setAgent(Agent agent){
		a = agent;
	}
	public Agent getAgent(){
		return this.a;
	}
}
