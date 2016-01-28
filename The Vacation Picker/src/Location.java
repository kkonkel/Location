
public class Location
	{
		private static String temperature;
		private static String place;
		private static int amount;
		
		public Location(String t, String p, int a)
		{
			t=temperature;
			p=place;
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

		public static String getPlace()
			{
				return place;
			}

		public static void setPlace(String place)
			{
				Location.place = place;
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
