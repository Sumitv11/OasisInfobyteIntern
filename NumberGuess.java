import java.util.*;
class NumberGuess
{
	static Scanner sc=new Scanner(System.in);
	public static int numberguess()
	{
		int Max_score=20;
		int s=0;
	    int count=0;
		int rand=(int)(Math.random()*25);
		System.out.println("Guess any value betwwen 1 to 25");
		while(true){
		try{
		s=sc.nextInt();
		++count;
		}
		catch(Exception e)
		{
			System.out.println("You Enter Wrong values");
			System.exit(0);
		}
		if(count==10)
		{
			System.out.println("You are out of attempt"); 
			System.exit(0);
		}
		if(rand>s)
		{
			System.out.println("Guess bigger no. than previous");
		}
		else if(rand<s)
		{
			System.out.println("Guess smaller no. than previous");
		}
		if(rand==s)
		{
			System.out.println("You guess correct Number="+rand);
		System.out.println("You guess in "+count+" times");
			// System.exit(0);
			break;
		}
		
}
return Max_score-count*2;
}
	public static void main(String ar[])
	{
		boolean game=true;
		int score=0;
		int c=0;
		int  s=0;
		while(game){
		score+=numberguess();
		c++;
		System.out.println("Do you want to play again if yes enter 1 otherwise enter 2 for exit");
		try{
			s=sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("You Enter Wrong values");
			System.exit(0);
		}
			if(s==1)game=true;
	        else {
				game=false;
				System.out.println("Exit Done");
			}
		}
		System.out.println("Well Played");
		System.out.printf("Your score out of %d is %d",c*20,score);
			
		}
	}
		


