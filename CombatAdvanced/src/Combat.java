public class Combat 
	{
	static int playAgainChoice = 1;
	
	public static void main(String[] args) 
		{
		Hero.askName();
		Hero.generateCharacter();
		while (playAgainChoice == 1)
			{
			Fight.chooseAction();
			Fight.simulateCombat();
			}
		}		
	}