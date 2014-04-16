public class Combat 
	{
	
	public static void main(String[] args) 
		{
		Hero.askName();
		Hero.generateCharacter();
		Hero.generatePlayerHitPoints();
		Monster.generateMonsterHitPoints();
		while (Fight.playAgainChoice == 1)
			{
			Fight.chooseAction();
			Fight.simulateCombat();
			}
		}		
	}