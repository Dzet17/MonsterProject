package monster.view;

import javax.swing.JOptionPane;

import javax.
public class MonsterDisplay {

	public void displayText(String textDisplay) 
	{
		JOptionPane.showmessaageDialog(null, textToDisplay);
	}

	public String getResponse(String questionAsked) 
	{
		String response = "";
		
		response += JOptionPane.showInputDialog(null, questionAsked);
		
		return response;
	}

}
