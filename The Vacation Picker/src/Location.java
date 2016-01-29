
public class Location
	{
		private static String temperature;
		private static String location;
		private static int amount;
		
		public Location(String t, String l, int a)
		{
			t=temperature;
			l=location;
			a=amount;
		}

		public static String getTemperature()
			{
				return temperature;
			}

		public static void setTemperature(String temperature)
			{
				Location.temperature = temperature;
			}

		public static String getLocation()
			{
				return location;
			}

		public static void setLocation(String location)
			{
				Location.location = location;
			}

		public static int getAmount()
			{
				return amount;
			}

		public static void setAmount(int amount)
			{
				Location.amount = amount;
			}

	}