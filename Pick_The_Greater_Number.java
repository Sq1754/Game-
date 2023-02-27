package methods;
import java.util.*;
import java.util.Random;


public class Pick_The_Greater_Number {

	static int totalPlay =0;
	static int wins =0;
	static int lost =0;
	static int tie =0;
	
	
   public static int newChoices(int newUser) {
	   System.out.println("choose a number from 1 to 10");
		Scanner A = new Scanner(System.in); 
		newUser= A.nextInt(10);
		return newUser;
   }
   public static int newBot(int newBot) {
	   Random B = new Random();
	   newBot = B.nextInt(10);
	   return newBot;
   }
   
   
	public static void play(int userChoice,int botChoice) {
		totalPlay++;
		int newUserChoice ,newBotChoice;
		System.out.println("Computer choose: "+botChoice);
		
		 Pick_The_Greater_Number.result(userChoice,botChoice);
		 
		if(userChoice>botChoice) {
			System.out.println("Choose again, this Time I will win.");
		    newUserChoice = newChoices(0);
		    newBotChoice = newBot(0);
		   play(newUserChoice,newBotChoice);
		}else {
			System.out.println("Try again!");
		    System.out.println("Choose: \n Press 1 to play again \n press 2 to Exit");
	     	Scanner sc = new Scanner(System.in);
		    int choice = sc.nextInt();
		    if(choice == 1) {
		    	newUserChoice = newChoices(0);
		    	newBotChoice = newBot(0);
		    	play(newUserChoice,newBotChoice);
		    }else {
			   System.out.println("Thanks for Playing");
			   System.out.println("Here is your Stat:-");
			   System.out.println("Total times you played: "+ totalPlay);
			   System.out.println("You won "+ wins +" times");
			   System.out.println("You lost "+ lost +" times");
			   System.out.println("Tied "+ tie + "times");
		   }
		}
	}
	
	
public static void result(int a, int b){
	
	if(a==b) {
		System.out.println("It's a tie");
		tie++;
	}
	else if(a>b) {
		System.out.println( "You chose greater number,You won!");
		wins++;
	}
	else {
		System.out.println("Computer Chose greater number computer Won!");
	    lost++;
	}

}
 public static void main(String[]args) {
	 
	 System.out.println("choose a number from 1 to 10");
		Scanner sc = new Scanner(System.in); 
		int userChoice,botChoice;
		Random B = new Random();
		userChoice= sc.nextInt(10);
		botChoice = B.nextInt(10);
				
		play(userChoice,botChoice);		
 }
}



