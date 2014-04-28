import java.util.Random;


public class SideQuests 
	{
	static int randomdQuestNumber;
	
	public static int generateQuest()//Generates the random number for the lootBeast method.
		{
		Random randomNumber = new Random();
		randomdQuestNumber = 1 + randomNumber.nextInt(7);
		return randomdQuestNumber;
		}
	public static void generateName()
		{
		String [] firstPartOfName= {"Yorgund", "Seth", "Saird", "Martin", "Quarth", "Fend", "Tark", "Nor"};
		String [] secondPartOfName= {" the Mage", " the Thief", " the Fighter", " the Healer", " the Nightblade", " the Battlemage", " the Paladin", " the Swordsman"};
		String [] thirdPartOfName= {" of Deepstain", "of Serebis", " of Doomkeep", " of Terik", " of Kildarin", " of Vortonsin", " of Sorthus", " of the Unknown"};
		generateQuest();
		System.out.println("");
		}
	
	
	
	
	}
