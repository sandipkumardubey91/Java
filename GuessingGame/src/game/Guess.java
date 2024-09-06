package game;


import java.util.*;

class Guesser
{
	int guessNum;
	int guessingnumber()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Guesser kindly Guess a number: ");
		guessNum = scan.nextInt();
		return guessNum;
	}
}
class Player
{
	int guessNum;
	int guessingNumber()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Player! Guess the that Guesser Guessed:");
		guessNum = scan.nextInt();
		return guessNum;
	}
}
class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser()
	{
		Guesser g = new Guesser();
		numFromGuesser = g.guessingnumber();
	}
	void collectNumFromPlayer()
	{
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		numFromPlayer1= p1.guessingNumber();
		numFromPlayer2= p3.guessingNumber();
		numFromPlayer3= p3.guessingNumber();
	}
	
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			System.out.println("Player1 has Won the game.");
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			System.out.println("Player2 has Won the game.");
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player3 has Won the game.");
		}
		else
		{
			System.out.println("No One Guessed correct.");
		}
	}
	
}
public class Guess 
{
	public static void main(String[] args)
	{
		System.out.println("Game Started.");
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();
	}
	
}

