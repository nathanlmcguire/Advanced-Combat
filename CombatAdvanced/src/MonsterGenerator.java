import java.util.ArrayList;
import java.util.Random;

public class MonsterGenerator 
	{
	static String currentKildarinMonster, monsterAttackName;
	static int randomMonsterNumber, monsterHealth = 0, monsterDamage = 0;
	
	String[] listOfKildarinMonsters = {"Hunter Goblin", "Warrior Goblin", "Shaman Goblin", "Weak Goblin", "Giant Rat", "Rat Rider Goblin"};
	
	switch (listOfKildarinMonsters[randomMonsterNumber].substring(0,3))
		{
		case "Hun":
			{
			monsterHealth = 1;
			monsterDamage = 3;
			monsterAttackName = " aims his bow and shoots at you";
			break;
			}
		case "War":
			{
			monsterHealth = 3;
			monsterDamage = 3;
			monsterAttackName = " swings his sword of bone at you";	
			break;
			}
		case "Sha":
			{
			monsterHealth = 0;
			monsterDamage = 4;
			monsterAttackName = " blasts a ball of fire at you";	
			break;
			}
		case "Wea":
			{
			monsterHealth = 0;
			monsterDamage = 0;
			monsterAttackName = " launches himself at you";	
			break;
			}
		case "Gia":
			{
			monsterHealth = 2;
			monsterDamage = 3;
			monsterAttackName = " launches itself at you";	
			break;
			}
		case "Rat":
			{
			monsterHealth = 4;
			monsterDamage = 5;
			monsterAttackName = " lowers his spear of bone and charges at you";	
			break;
			}
		}
	
	public static int generateNumber()//Generates the random number for the lootBeast method.
		{
		Random randomNumber = new Random();
		randomMonsterNumber = randomNumber.nextInt(5);
		return randomMonsterNumber;
		}
	}
