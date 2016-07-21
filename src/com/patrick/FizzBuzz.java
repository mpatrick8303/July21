package com.patrick;

public class FizzBuzz
{
	
	public static void main(String[] args)
	{
		
		
//		for(int i = 1; i <= 110; i++)
//		{
//			System.out.print(i);
//			
//			if((i % 3) == 0)
//			{
//				System.out.print(" Fizz");
//			}
//			
//			if((i % 5) == 0)
//			{
//				System.out.print(" Buzz");
//				
//			}
//			if((i % 7) == 0)
//			{
//				System.out.print(" Bang");
//			}
//			System.out.println();
//		}
			
// this code would work for 15 and under but would need to check multiples to make this work for higher numbers
//			for (int i = 1; i <= 110; i++)
//			{
//				System.out.print(i);
//				
//				if((i % 15) == 0)
//				{
//					System.out.print(" Fizz Buzz");
//				}
//				else if((i % 7) == 0)
//				{
//					System.out.print(" Bang");
//				}
//				else if((i % 5) == 0)
//				{
//					 
//					System.out.print(" Buzz");
//					
//				}
//				else if((i % 3) == 0)
//				{
//					System.out.print(" Fizz");
//					
//				}
//				System.out.println();
//				
//			}
		
		
			for (int i = 110; i > 0; i--)
			{
				
				System.out.print(i);
				
				if(((i%3)==0) && ((i%5)==0) && ((i%7)==0))
				{
					System.out.print(" Fizz Buzz Bang");
				}
				else if(((i%3)==0) && ((i%5) == 0))
				{
					System.out.print(" Fizz Buzz");
				}
				else if(((i%3)== 0) && ((i%7)== 0))
				{
					System.out.print(" Fizz Bang");
				}
				else if(((i%5)== 0) && ((i%7)== 0))
				{
					System.out.print(" Buzz Bang");
				}
				else if((i%3)==0)
				{
					System.out.print(" Buzz");
				}
				else if((i%5) == 0)
				{
					System.out.print(" Buzz");
				}
				else if((i%7) == 0)
				{
					System.out.print(" Bang");
				}
				
				System.out.println();
			}
			
			
		

	}

}
