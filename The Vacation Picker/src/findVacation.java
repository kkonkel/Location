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
					    			
					    			Scanner userInput2 = new Scanner (System.in);
					    			System.out.println("How many people are you planning on going with? 1-6");
					    			String next2 = userInput2.nextLine();
					    			
					    				if(next2.equals("1"))
					    					{
					    						Brochure.printWarmOne();
					    					}
					    					
					    				else if(next2.equals("2"))
					    					{
					    						System.out.println("You should go to Fiji!!");
					    					}
					    				else if(next2.equals("3"))
					    					{
					    						System.out.println("You should go to Hawaii!!");
					    					}
					    				else if(next2.equals("4"))
					    					{
					    						System.out.println("You should go to Mexico!!");
					    					}
					    				else if(next2.equals("5"))
					    					{
					    						System.out.println("You should go to Florida!!");
					    					}
					    				else if(next2.equals("6"))
					    					{
					    						System.out.println("You should go to California!!");
					    					}
					    				
					    		
					    		}
					    	else if(next1.equals("cold"))
					    		{
					    		    Brochure.printIfCold();
					    		}
					    				
					    					
					    					
					    					
					    					
					    					
					    				
					    
			    	}
			  
			    else if(next.equals("No"))
			    	{
			    		System.out.println("Have fun at home :)");	
			    	}
			    
				
			}

	}
