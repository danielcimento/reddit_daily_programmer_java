import java.util.*;

public class intermediate1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		input.useDelimiter("\n");
		String[] events = new String[24];
		String choice = "";
		String miscInput = "";
		int hour;
		while(!choice.equals("q")){
			choice = input.next();
			switch(choice){
				case "a":
					System.out.println("What hour would you like to create an event for?");
					hour = input.nextInt() - 1;
					if(hour > events.length || hour < 0){break;}
					if(events[hour] != null){
						System.out.println("That hour already has an event!");
					}else{
						System.out.println("What is your event?");
						events[hour] = input.next();
					}
					break;
				case "e":
					System.out.println("What hour would you like to edit an event for?");
					hour = input.nextInt() - 1;
					if(hour > events.length || hour < 0){break;}
					if(events[hour] == null){
						System.out.println("You don't have an event for that hour. Use 'a' to create one!");
					}else{
						System.out.println("What is your new event?");
						events[hour] = input.next();
					}
					break;
				case "d":
					System.out.println("What hour would you like to delete the event for?");
					hour = input.nextInt() - 1;
					if(hour > events.length || hour < 0){break;}
					if(events[hour] != null){
						events[hour] = null;
					}else{
						System.out.println("You don't have an event then to delete!");
					}
					break;
				case "h":
					System.out.println("a = add event, e = edit event, d = delete event, h = help, q = quit, l = list");
					break;
				case "l":
					for(int i = 0; i < events.length; i++){
						System.out.println((i%12 + 1) + ":00 : " + (events[i] == null ? "Nothing" : events[i]));	
					}
					break;
			}
		}


	}

}
