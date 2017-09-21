package monster.view;

import javax.swing.JOptionPane;

import javax.util.scanner
public class MonsterDisplay {
//Declaration of class
	public void displayText(String textDisplay) 
	{
		JOptionPane.showmessaageDialog(null, textToDisplay);
	}
//Displays the popups
	public String getResponse(String questionAsked) 
	{
		String response = "";
		
		response += JOptionPane.showInputDialog(null, questionAsked);
		
		return response;
	}
//Gets response from input earlier put in
}
