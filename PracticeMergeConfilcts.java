public class PracticeMergeConflictis{
	
	private ArrayList<String> events = new ArrayList<String>();
	
	public void createEvents(){
        	events.add("Upcoming Events Header");
        	events.add("Party at SFO California Pizza");

        }
	public void thoughoftheday(){

		System.out.println("Do something wonderful others can imitate");

	}
	public void upcomingEvents(){
		System.out.println("Upcoming Events");
		for(String event : events)
			System.out.println(event);

	}

	public static void main (String[] args)

	{

		PracticeMergeConflictis mc = new PracticeMergeConflictis();
		mc.thoughtoftheday();
		mc.createEvents();
		mc.upcomingEvents();

	}

}
