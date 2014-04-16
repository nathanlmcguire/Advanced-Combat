import java.util.Random;


public class Monster 
	{
	static int playerHitPoints, monsterHitPoints, godHealth, levelOfPlayer = 1;
	static int diceRollOne, diceRollTwo, diceRollThree, totalDice;
	static int difficultyHealth, difficultyDamage, difficultyLevel;
	static int playAgainChoice = 1, actionChoice;
	static int lootNumber, findingLuck, playerLuck, dodgeAffect = 0; 
	static int armorBonus = 0, weaponBonus = 0, fireballBonus = 0, healingSpellBonus = 0, dodgeBonus = 0, classWeaponBonus = 1, classFireballBonus = 1, classHealingBonus = 1, classDodgeBonus = 1;
	static int numberOfSlainEnemies;
	static String nameOfPlayer, jobOfPlayer, homeLand;
	static String pluralVariable;
	static String weaponName, healingTypeName, dodgeTypeName;	
	static int classDamage, classHealth, healingName, numberOfPotions = 3;
	
	public static int monsterAttackRoll()//Rolls dice for the damage done by the monster's claws.
		{
		System.out.println();
		System.out.println("The creature growls at you and attacks!");
		Random randomNumber = new Random();
		diceRollOne = 1 + randomNumber.nextInt(difficultyDamage);
		diceRollTwo = 1 + randomNumber.nextInt(difficultyDamage);
		diceRollThree = 1 + randomNumber.nextInt(difficultyDamage);
		totalDice = diceRollOne + diceRollTwo + diceRollThree - dodgeAffect;
		System.out.println("The creature does " + totalDice + " damage!");
		System.out.println();
		playerHitPoints = (playerHitPoints - totalDice);
		return totalDice;
		}	
	
	public static int generateMonsterHitPoints()//Generates the player's hit points and tell you what they are.
		{
		Random randomNumber = new Random(); 
		monsterHitPoints = (25 * levelOfPlayer) + randomNumber.nextInt(difficultyHealth);
		System.out.println("Enemy HP = " + monsterHitPoints + " 												Player HP = " + playerHitPoints + ".");
		System.out.println();
		return monsterHitPoints;
		}
	}
