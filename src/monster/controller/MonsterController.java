package monster.controller;
//I imported this from gitHub but now everything is not compatible and won't run properly
import monster.model.MarshmallowMonster;
import java.util.Scanner;
import monster.view.MonsterDisplay;
import java.util.list;
import java.util.ArrayList;
//imports all data from other classes
public class MonsterController 
{
	private MonsterDisplay popup;
	private List<Marshmallow> mosnterList;
	
	public MonsterController()
	{
		popup = new MonsterDisplay();
		monsterList = new ArrayList
	}
	
	public void start()
	{
		boolean finished = true;
		int count = 0;
//		while(count < 100)
//		{
//			popup.displayText("I am so neat");
//			count+=1;
//		}
//
		for(int loop= 0; loop < 15; loop += 1) 
		{
			popup.displayText("I an looping " + (loop + 1) + "times out of 15");
		}
		
		MarshmallowMonster sample = new MarshmallowMonster();
//		System.out.println(sample);
		popup.displayText(sample.toString());
		MarshmallowMonster realMonster = new MarshmallowMonster("Scary", 4, 3, 4, true);
		
//		System.out.println(realMonster);
		popup.displayText(realMonster.toString());
//		System.out.println("John is hungry, so he is going to eat a tentacle");
		popup.displayText("John is hungry, so he is going to eat a tentacle");
		realMonster.TentacleAmount(3);
//		System.out.println(realMonster);
		popup.displayText(realMonster.toString());
		
		monsterList.add(realMonster);
		monsterList.add(sample);
		
		interactWithTheMonster(realMonster);
	}
	
	private void testList()
	{
		for(int index = 0; index < monsterList.size(); index++)
		{
			MarshmallowMonster currentMonster = monsterList.get(index);
			popup.displayText(currentMonster.getname());
			String newName = popupgetResponse("What should my new name be?");
			popup.displayText(currentMonster.getName());
		}
			for (marshmallowMosnter current : MonsterList)
			{
				popup.displayText(current.getName());
				String newName = popup.getResponse("what should my name be?");
				current.setName(newName);
				popup.displayText(current.getName());
			}
	
//creates popups for the application
//took over the in app text
	private void interactWithTheMonster(MarshmallowMonster currentMonster)
	{
//		System.out.println(currentMonster.getName() + " wants to know what to eat next");
		popup.displayText(currentMonster.getName() + "wants to know what to eat next");
//		System.out.println(currentMonster.getName() + " suggests arms, they have " + currentMonster.getarmCount());
		popup.displayText(currentMonster.getName() + " suggests arms, they have " + currentMonster.getarmCount());
//		System.out.println("How many do you want to eat?");
		int specialAnswer;
		String unconverted = popup.getResponse("How many do you want to eat?");
		
		if(isValidInteger(unconverted))
		{
			specialAnswer = Integer.parseInt(unconverted);
		}
		
		while(!isValidInteger(unconverted))
		{
			specialAnswer = Integer.parseInt(unconverted);
		}
		
		
		
			
		specialAnswer = Integer.parseInt(unconverted);
		@SuppressWarnings("resource")
		Scanner myScanner = new Scanner(System.in);
		int consumed = 0;
		consumed = specialAnswer;
		if(consumed < 0)
//		{
//			System.out.println("You cannot eat a negative amount silly human");
//		}
//		else if(consumed == 0)
//		{
//			System.out.println("Not that hungry are you");
//		}
//		else if(consumed > currentMonster.getarmCount())
//		{	
//			System.out.println("That is impossible - I only have " + currentMonster.getarmCount());
//		}
//		else
//		{

		int consumed = 0;
		String answerNumber = popup.getResponse("Q to ask");
		
		while(!isValidInteger(unconverted))
		{
			popup.displayText("Try again!");
		}
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
	popup.displayText("Hey, look at me");
	String answer = popup.getResponse("How many meals are you eating today");
	System.out.println(answer);
	popup.displayText(answer);
	
	}
//code for interconnecting the different classes creating an interactive app
	//helper methods
	private boolean isValidInteger(String sample)
	{
		boolean valid = false;
		
		try
		{
			Integer.parseInt(sample);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			popup.displayText("Only integer values are valid: " + sample + "is not");
		}
		
		return valid;
	}
	
	private boolean isValidDouble(String sampleDouble)
	{
		boolean valid = false;
		
		try
		{
			Double.parseDouble(sampleDouble);
			valid = true;
		}
		catch (NumberFormatException error)
		{
			popup.displayText("Only double values are valid" + sampleDouble + " is not");
		}
		
		return valid;
	}
		private boolean isValidBoolean(String sampleBoolean)
		{
			boolean valid = false;
			
			try
			{
			Boolean.parseBoolean(sampleBoolean);
			valid = true;
			}
			catch(NumberFormatException error)
			{
				popup.displayText("Only boolean values are allowed " + sampleBoolean + " is not valid");
			}
			
			return value;
	}
//Booleans created to state things as true or false, but also giving a catch in case something is incorrectly inputted	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}