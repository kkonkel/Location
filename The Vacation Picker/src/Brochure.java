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
			Brochure.brochure.remove(2);
			Brochure.brochure.remove(5);
			Brochure.brochure.remove(6);
			Brochure.brochure.remove(7);
			Brochure.brochure.remove(8);
			Brochure.brochure.remove(9);
			Brochure.brochure.remove(10);
			
		}
	public static void printIfCold()
	{
		Brochure.brochure.remove(0);
		Brochure.brochure.remove(1);
		Brochure.brochure.remove(3);
		Brochure.brochure.remove(4);
		Brochure.brochure.remove(11);
		Brochure.brochure.remove(12);
	}
	public static void printWarmOne()
	{
		
		System.out.println(Brochure.brochure.get(11).getPlace());
			
	}
	
		
	}
