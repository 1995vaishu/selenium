package week1.day1;

public class SumOfObjects 
{
	public static void main (String args[]) {
		int i =528 ,sum=0;
		System.out.println ("Sum of digits=" +i );
				
		while(i != 0)
			{
			int mod=i%10;
			sum = sum+mod;
			i=i/10;
		
		}
		
		System.out.println(sum);
		
	}

}