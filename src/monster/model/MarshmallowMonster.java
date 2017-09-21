package monster.model;

public class MarshmallowMonster 
{
	//Declaration section for the data members
	private String name;
	private int eyeCount;
	private int armCount;
	private double tentacleAmount;
	private boolean hasBloop;
	//Directly connects to MarshmallowMonster
	public MarshmallowMonster()
	{
		//Unless we specify values all data members
		//are a zero, false, or null
	}
	
	public MarshmallowMonster(String name, int eyeCount, int arms, double tentacles, boolean hasBloop)
	
	public String getName()
	{
		return name;
	}
	public int getarmCount()
	{
		return armCount;
	}
	public double getTentacleAmount()
	{
		return tentacleAmount;
	}
	public boolean hasBloop()
	{
		return hasBloop;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void seteyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}
	public void setarmCount(int armCount)
	{
		this.armCount = armCount;
	}
	public void TentacleAmount(double tentacleAmount)
	{
		this.tentacleAmount = tentacleAmount;
	}
	//Sets all inputs for later interactivity
	public void setBloop(boolean hasBloop)
	{
		this.hasBloop = hasBloop;
	}
	{
		this.name = name;
		this.eyeCount = eyeCount;
		int arms;
		this.armCount = arms;
		double tentacleCount;
		this.tentacleAmount = tentacleCount;
		this.hasBloop = hasBloop;
	}
	
	public String toString()
	{
		String description = "Hi, I am a scary monster! My name is " + name + ", and I have " + eyeCount;
		description += "eyes and I have " + armCount + "arms, and I have " + tentacleAmount + "tentacles";
		description += "and my bloop existence is " + hasBloop;
		
		return description;
	}
}