import java.util.ArrayList;
public class Brochure
	{
		static ArrayList<Location>brochure = new ArrayList<Location>();
		public static void fillBrochure()
		{
			brochure.add(new Location("Warm", "Fiji", 2));
			brochure.add(new Location("Hot", "Florida", 5));
			brochure.add(new Location("Cold", "Alaska", 1));
			brochure.add(new Location("Hot", "Mexico", 4));
			brochure.add(new Location("Hot", "Hawaii", 3));
			brochure.add(new Location("Cold", "Ireland", 2));
			brochure.add(new Location("Rainy", "England", 3));
			brochure.add(new Location("Cloudy", "Seattle", 4));
			brochure.add(new Location("Cold", "Paris", 5));
			brochure.add(new Location("Cloudy", "New Zealand", 6));
			brochure.add(new Location("Cold", "Yellowstone", 7));
			brochure.add(new Location("Warm", "Cabo", 1));
			brochure.add(new Location("Hot", "California", 6));
		}
	public static void printIfWarm()
		{
			brochure.remove(2);
			brochure.remove(5);
			brochure.remove(6);
			brochure.remove(7);
			brochure.remove(8);
			brochure.remove(9);
			brochure.remove(10);
			
		}
	public static void printIfCold()
	{
		brochure.remove(0);
		brochure.remove(1);
		brochure.remove(3);
		brochure.remove(4);
		brochure.remove(11);
		brochure.remove(12);
		
	}
	public static void printWarmOne()
	{
		
		System.out.println(brochure.get(11).getLocation());
		 
			
	}
	
		
	}
