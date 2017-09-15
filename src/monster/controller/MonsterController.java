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
		realMonster.setTentacleAmount(3);
		System.out.println(realmonster);
		
		interactWithTheMonster(realMonster);
	}
		
	private void interactWithTheMonster(MarshmallowMonster currentMonster)
	{
		System.out.println(currentMonster.getName() + " wants to know what to eat next");
		System.out.println(currentMonster.getName() + " suggests arms, they have " + currentMonster.getArmCount());
		System.out.println("How many do you want to eat?");
		Scanner myScanner = new Scanner(System.in);
		int consumed = myScanner.nextInt();
		currentMonster.setArmCount(currentMonster.getArmCount() - consumed);
		System.out.println("Ok, now " + currentMonster.getName() + "has " currentMonster.getarmCount() + " arms left.");
		
		
	}
}
