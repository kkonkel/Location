import java.util.Scanner;

public class findVacation
	{
		public static void main(String[] args)
			{
				Brochure.fillBrochure();
				Scanner userInput = new Scanner (System.in);
			    System.out.println ("Are you looking to go on vacation this spring break? Yes or No?");
			    String next = userInput.nextLine();
			    if(next.equals("Yes"))
			    	{
			    		Scanner userInput1 = new Scanner (System.in);
					    System.out.println ("Are you looking to go to a warm or cold location?");
					    String next1 = userInput1.nextLine();
					    	if(next1.equals("warm"))
					    		{
					    			Brochure.brochure.remove(2);
					    			Brochure.brochure.remove(5);
					    			Brochure.brochure.remove(6);
					    			Brochure.brochure.remove(7);
					    			Brochure.brochure.remove(8);
					    			Brochure.brochure.remove(9);
					    			Brochure.brochure.remove(10);
					    		}
					    	else if(next1.equals("cold"))
					    		{
					    			Brochure.brochure.remove(0);
					    			Brochure.brochure.remove(1);
					    			Brochure.brochure.remove(3);
					    			Brochure.brochure.remove(4);
					    			Brochure.brochure.remove(11);
					    			Brochure.brochure.remove(12);
					    		}
					    				
					    					
					    					
					    					
					    					
					    					
					    				
					    
			    	}
			  
			    else if(next.equals("No"))
			    	{
			    		System.out.println("Have fun at home :)");	
			    	}
			    
				
			}

	}
