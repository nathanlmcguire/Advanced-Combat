import java.util.Random;


public class Monster 
	{
	static int monsterHitPoints, playerHealthResetCounter = 0;
	static int diceRollOne, diceRollTwo, diceRollThree, totalDice;
	
	
	public static int monsterAttackRoll()//Rolls dice for the damage done by the monster's claws.
		{
		System.out.println("The creature growls at you and attacks!");
		System.out.println();
		Fight.resetDiceForRoll();
		Random randomNumber = new Random();
		diceRollOne = 1 + randomNumber.nextInt(Hero.difficultyDamage);
		diceRollTwo = 1 + randomNumber.nextInt(Hero.difficultyDamage);
		diceRollThree = 1 + randomNumber.nextInt(Hero.difficultyDamage);
		totalDice = diceRollOne + diceRollTwo + diceRollThree;
		for (Fight.dodgeAffect = Fight.dodgeAffect; Fight.dodgeAffect > totalDice; Fight.dodgeAffect++)
			{
			
			}
		totalDice = totalDice - Hero.dodgeAffect;	
		System.out.println("The creature does " + totalDice + " damage!");
		System.out.println();
		Hero.playerHitPoints = (Hero.playerHitPoints - totalDice);
		playerHealthResetCounter = playerHealthResetCounter + totalDice;
		return totalDice;
		}	
	
	public static int generateMonsterHitPoints()//Generates the player's hit points and tell you what they are.
		{
		Random randomNumber = new Random(); 
		monsterHitPoints = (10 * Hero.levelOfPlayer) + randomNumber.nextInt(Hero.difficultyHealth);
		System.out.println("Enemy HP = " + monsterHitPoints + " 												Player HP = " + Hero.playerHitPoints + ".");
		System.out.println();
		return monsterHitPoints;
		}
	}
