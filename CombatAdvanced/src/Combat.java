public class Combat 
	{
	
	public static void main(String[] args) 
		{
		Hero.askName();
		Hero.generateCharacter();
		while (Fight.playAgainChoice == 1)
			{
			Fight.chooseAction();
			Fight.simulateCombat();
			}
		}		
	}