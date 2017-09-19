package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;


public class MonsterController 
{
	public void start()
	{
		MarshmallowMonster sample = new MarshmallowMonster();
		System.out.println(sample);
		MarshmallowMonster realMonster = new MarshmallowMonster("Scary", 4, 3, 4, true);
		
		System.out.println(realMonster);
		System.out.println("John is hungry, so he is going to eat a tentacle");
		realMonster.TentacleAmount(3);
		System.out.println(realMonster);
		
		interactWithTheMonster(realMonster);
	}
		
	private void interactWithTheMonster(MarshmallowMonster currentMonster)
	{
		System.out.println(currentMonster.getName() + " wants to know what to eat next");
		System.out.println(currentMonster.getName() + " suggests arms, they have " + currentMonster.getarmCount());
		System.out.println("How many do you want to eat?");
		@SuppressWarnings("resource")
		Scanner myScanner = new Scanner(System.in);
		int consumed = myScanner.nextInt();
		
		if(consumed < 0)
		{
			System.out.println("You cannot eat a negative amount silly human");
		}
		else if(consumed == 0)
		{
			System.out.println("Not that hungry are you");
		}
		else if(consumed > currentMonster.getarmCount())
		{	
			System.out.println("That is impossible - I only have " + currentMonster.getarmCount());
		}
		else
		{
			currentMonster.setarmCount(currentMonster.getarmCount() - consumed);
			System.out.println("Thank you so much, I only have this many arms now: " + currentMonster.getarmCount());
		}
	
//		System.out.println(currentMonster.getName() + " wants to know what to eat next");
//		System.out.println(currentMonster.getName() + "suggests tentacles, they have " + currentMonster.getTentacleAmount());
//		System.out.println("How many do you want to eat?");
//		Scanner myScanner1 = new Scanner(System.in);
//		int consumed1 = myScanner1.nextInt();
//		
//		if(consumed1 < 0)
//		{
//			System.out.println("You cannot eat a negative amount silly human");
//		}
//		else if(consumed1 == 0)
//		{
//			System.out.println("Not that hungry are you");
//		}
//		else if(consumed1 > currentMonster.getTentacleAmount())
//		{	
//			System.out.println("That is impossible - I only have " + currentMonster.getTentacleAmount());
//		}
//		else
//		{
//			currentMonster.TentacleAmount(currentMonster.getTentacleAmount() - consumed1);
//			System.out.println("Thank you so much, I only have this many arms now: " + currentMonster.getarmCount());
		}
	}
}	