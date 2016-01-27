import java.util.ArrayList;
public class Brochure
	{
		static ArrayList<Location>brochure = new ArrayList<Location>();
		public static void fillBrochure()
		{
			brochure.add(new Location("Warm", "Fiji", 2));
			brochure.add(new Location("Hot", "Florida", 5));
			brochure.add(new Location("Cold", "Alaska", 3));
			brochure.add(new Location("Hot", "Mexico", 4));
			brochure.add(new Location("Hot", "Hawaii", 4));
			brochure.add(new Location("Cold", "Ireland", 4));
			brochure.add(new Location("Rainy", "England", 4));
			brochure.add(new Location("Cloudy", "Seattle", 6));
			brochure.add(new Location("Cold", "Paris", 4));
			brochure.add(new Location("Cloudy", "New Zealand", 2));
			brochure.add(new Location("Cold", "Yellowstone", 4));
			brochure.add(new Location("Warm", "Cabo", 2));
			brochure.add(new Location("Hot", "California", 6));
		}
	
		
	}
