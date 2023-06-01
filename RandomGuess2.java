// Practice exercise, Joey Esencan, 5/31/2023

import javax.swing.JOptionPane;

public class RandomGuess2
{
	public static void main(String[] args)
	{
		//Variables and Constants
		int userGuess;
		int magicNumber;
		String msg;
		int attempts = 1;
		final int HIGHEST_NUM = 10;
		final int LOWEST_NUM = 1;
		

		// Input phase
		userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "Guess a number between " + LOWEST_NUM + " and " + HIGHEST_NUM));
		
		//Processing phase
		magicNumber = (int)	(Math.random() * HIGHEST_NUM) + LOWEST_NUM;

		while(userGuess != magicNumber)
		{
			if(userGuess > magicNumber)
			{
				msg = "Sorry, your guess was too high! ";

			} //End of if statement
			else
			{
				msg = "Sorry, your guess was too low! ";
			} //End of else statement

			userGuess = Integer.parseInt(JOptionPane.showInputDialog(null,  msg + " Guess a number between " + LOWEST_NUM + " and " + HIGHEST_NUM));
			//Increment the number of attempts by one
			attempts = attempts + 1;

		} //End of while loop

		//Output Phase
		JOptionPane.showMessageDialog(null, "YOU'VE WON!! \nThe magic number was: " + magicNumber + " \nYou guessed it in " + attempts + " attempt(s)!");

	} //End of main() method 

} //End of RandomGuess2 class