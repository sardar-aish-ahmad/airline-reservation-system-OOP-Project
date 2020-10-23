
import java.util.*;
public class RunMutex {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		Admin admin =new Admin();
		Agent agent = new Agent();
		
		
		Factory factory;
		
			loginOptions();
			String lOption = input.nextLine();
			while(!(lOption.equals("0"))){
				
				if(lOption.equals("1")){
					System.out.println("Enter username:");
					String un = input.nextLine();
					System.out.println("Enter Password:");
					String pass = input.nextLine();
					
					if(un.equals("admin") && pass.equals("admin")){
						adminOption();
						String adminOption = input.nextLine();
						while(!(adminOption.equals("0"))){
							if(adminOption.equals("1")){
								String airName="";
								flightsName();
								int choice = input.nextInt();
								if(choice ==1){
									airName = "emirates";
								}//end choice 1
								else if(choice ==2){
									airName = "flynass";
								}// end choice 2
								else if(choice == 3){
									airName = "qatar";
								}//end choice 3
								
								input.nextLine();
								System.out.println("Enter the date:");
								String departure = "Sialkot";
								String date = input.nextLine();
								System.out.println("Enter No. of seats:");
								int capacity = input.nextInt();
								System.out.println("Enter Flight No.");
								int flightNo = input.nextInt();
								System.out.println("Enter Arrival");
								input.nextLine();
								String arrival = input.nextLine();
								System.out.println("Enter gross cost for this airline:");
								double grossCost = input.nextDouble();
								input.nextLine();
								Fare fare = new Fare(grossCost);
								factory = new Factory();
								admin.addFlight(factory.getFlight(airName,departure,date,capacity,flightNo,arrival,fare));
								
							}//end admin option equal 1
							if(adminOption.equals("2")){
								
								admin.printFlight();
								if(admin.arraySize()>0) {
								System.out.println("Enter the number to be removed:");
								int flightNo = input.nextInt();
								admin.removeFlight(flightNo-1);
								}// end arraysize check for remove 
								
							}// end admin option equal 2
							if(adminOption.equals("3")){
								admin.printFlight();
							}// admin option equall 3
							adminOption();
							adminOption = input.nextLine();
						}// end of while loop for admin options
					}// end of admin username and password check condition
				}//end of login option 1
					if(lOption.equals("2")){
						System.out.println("Enter username:");
						String un = input.nextLine();
						System.out.println("Enter Password:");
						String pass = input.nextLine();
						if(un.equals("agent") && pass.equals("agent")) {
							agentOption();
							String agentOption = input.nextLine();
							while(!(agentOption.equals("0"))){
								
								//first, last, phone ,passport
								if(agentOption.equals("1")) {
								admin.printFlight();
								if(admin.arraySize()>0) {
									System.out.println("Enter the SR#:");
									int choice = input.nextInt();
									input.nextLine();
								System.out.println("Enter first Name:");
								String fName = input.nextLine();
								System.out.println("Enter last Name:");
								String lName = input.nextLine();
								System.out.println("Enter phone Number:");
								int pNumber = input.nextInt();
								System.out.println("Enter your Passport number");
								input.nextLine();
								String passport = input.nextLine();
								agent.addPassenger(new Passenger(fName,lName,pNumber,passport));
								agent.addBooking(new Booking(admin.getFlight(choice-1)));
								
								}//end of if for checking after arraylist
								else {
									admin.printFlight();
								}// end of else
								}//end of agent option 1
								if(agentOption.equals("2")) {
									
									agent.printBooking();
								
								}//end of agent option 2
								if(agentOption.equals("3")) {
									agent.printBooking();
									if(agent.bookingSize()>0) {
										System.out.println("Enter the number to be removed:");
										int num = input.nextInt();
										input.nextLine();
										agent.removeBooking(num-1);
									}//end of if array size is greater than zero
								}// end of delete booking option8
								agentOption();
								agentOption = input.nextLine();
							}//end of while for agentlogin
						}// end of if for agent login check
					}// end of login option 2
					if(lOption.equals("3")) {
						System.out.println("Please Enter your Reference Number:");
						String reference = input.nextLine();
						boolean flag=false;
						if(agent.bookingSize()>0) {
							for(int i=0;i<agent.bookingSize();i++) {
								String a = agent.getBooking(i).getBookingReference();
								if(a.equals(reference)) {
									flag=true;
									System.out.println("Happy Journey\n You are ON Board.");
								}//end of match reference
								
							}// end of for loop
							if(flag=false) {
								System.out.println("ON Board Denied!\n No passenger Found");
							}//end of if for not matching passenger
						}//end of if for checking the arraylist size 
						else {
							agent.printBooking();
						}
					}// end of third login option
					loginOptions();
					lOption = input.nextLine();
			}// end of while login option is not 0
				
				
				
				
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//end of main

	public static void loginOptions(){
		System.out.println("Press 1 to login as admin");
		System.out.println("Press 2 to login as Agent");
		System.out.println("Press 3 to Check IN");
		System.out.println("Press 0 to exit");
		
	}
	

	 public static void adminOption(){
		 System.out.println("press 1 to add Flight");
		 System.out.println("press 2 to remove flight");
		 System.out.println("press 3 to view flights");
		 System.out.println("press 0 to logout");
	 }
	 public static void agentOption(){
		 System.out.println("Press 1 to book flight");
		 System.out.println("Press 2 to check booked flights");
		 System.out.println("Press 3 to delete booking");
		 System.out.println("Press 0 to exit");
	 }
	 public static void flightsName(){
		 System.out.println("1- Emirates");
		 System.out.println("2- Flynass");
		 System.out.println("3- Qatar");
	 }
	 

}
