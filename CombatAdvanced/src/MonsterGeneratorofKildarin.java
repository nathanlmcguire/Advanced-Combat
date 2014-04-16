import java.util.ArrayList;
import java.util.Random;

public class MonsterGeneratorofKildarin 
	{
	static String currentKildarinMonster;
	static int randomMonsterNumber;
	
	String[] listOfOpponentCards = {"Hunter Goblin", "Warrior Goblin", "Shaman Goblin", "Weak Goblin", "Giant Rat", "Rat Rider Goblin"};
	ArrayList<String> kildarinMonsterCollection = new ArrayList<String>()
	//currentKildarinMonster = kildarinMonsterCollection.get(randomMonsterNumber)
	switch(currentKildarinMonster.substring(0,2))
		{
		case "Hun":
			{
				
			}
		case "War":
			{
				
			}
		case "Sha":
			{
				
			}
		case "Wea":
			{
				
			}
		case "Gia":
			{
				
			}
		case "Rat":
			{
				
			}
		}
	
	public static int generateNumber()//Generates the random number for the lootBeast method.
		{
		Random randomNumber = new Random();
		randomMonsterNumber = randomNumber.nextInt(5);
		return randomMonsterNumber;
		}
	}
