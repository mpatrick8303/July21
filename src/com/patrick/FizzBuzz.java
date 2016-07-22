package com.patrick;

public class FizzBuzz
{
	
	public static void main(String[] args)
	{
		
		
		for(int i = 1; i <= 110; i++)
		{
			
			if((i % 3) == 0)
			{
				System.out.print("Fizz ");
			}
			
			
			if((i % 5) == 0)
			{
				System.out.print("Buzz ");
				
			}
			
			if((i % 7) == 0)
			{
				System.out.print("Bang ");
			}
			
			if(!((i%7)==0) && !((i%5)== 0) && !((i%3)== 0))
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
//		for(int i = 1; i <= 110; i++)
//		{
//			String fbb = "";
//			
//			if((i % 3) == 0)
//			{
//				fbb = "Fizz";
//			}
//			
//			
//			if((i % 5) == 0)
//			{
//				fbb = "Buzz";
//				
//			}
//			
//			if((i % 7) == 0)
//			{
//				fbb = "Bang";
//			}
//			
//			System.out.println(fbb.length() == 0 ? i : fbb);
			
			// TERNARY (alternate to a if statement
			
			//fbb.length() == 0 is what it is checking
			//? shows java that it is a ternary
			//returns i if what it is checking is true
			//Returns fbb if it is false
			//bc it is in a print function it is returning those values to the print function
//		}
					
		
//			for (int i = 110; i > 0; i--)
//			{
//				
//				
//				
//				if(((i%3)==0) && ((i%5)==0) && ((i%7)==0))
//				{
//					System.out.print(" Fizz Buzz Bang");
//				}
//				else if(((i%3)==0) && ((i%5) == 0))
//				{
//					System.out.print(" Fizz Buzz");
//				}
//				else if(((i%3)== 0) && ((i%7)== 0))
//				{
//					System.out.print(" Fizz Bang");
//				}
//				else if(((i%5)== 0) && ((i%7)== 0))
//				{
//					System.out.print(" Buzz Bang");
//				}
//				else if((i%3)==0)
//				{
//					System.out.print(" Buzz");
//				}
//				else if((i%5) == 0)
//				{
//					System.out.print(" Buzz");
//				}
//				else if((i%7) == 0)
//				{
//					System.out.print(" Bang");
//				}
//				else
//				{
//					System.out.print(i);
//				}
//				
//				System.out.println();
//				
//			}
//			

		// this code would work for 15 and under but would need to check multiples to make this work for higher numbers
//		for (int i = 1; i <= 110; i++)
//		{
//			System.out.print(i);
//			
//			if((i % 15) == 0)
//			{
//				System.out.print(" Fizz Buzz");
//			}
//			else if((i % 7) == 0)
//			{
//				System.out.print(" Bang");
//			}
//			else if((i % 5) == 0)
//			{
//				 
//				System.out.print(" Buzz");
//				
//			}
//			else if((i % 3) == 0)
//			{
//				System.out.print(" Fizz");
//				
//			}
//			System.out.println();
//			
//		}
		

	}

}
