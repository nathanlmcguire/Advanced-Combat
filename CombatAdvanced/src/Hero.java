import java.util.Random;
import java.util.Scanner;


public class Hero 
	{
	static int playerHitPoints, godHealth, levelOfPlayer = 1;
	static int diceRollOne, diceRollTwo, diceRollThree, totalDice;
	static int difficultyHealth, difficultyDamage, difficultyLevel;
	static int actionChoice;
	static int dodgeAffect = 0; 
	static int classWeaponBonus = 0, classFireballBonus = 0, classHealingBonus = 0, classDodgeBonus = 0;
	static String nameOfPlayer, jobOfPlayer, homeLand;
	static String weaponName, healingTypeName, dodgeTypeName;	
	static int classDamage, classHealth, healingName, numberOfPotions = 3;
	
	public static int generatePlayerHitPoints()//Generates the monster's hit points and tell you what they are.
		{
	    Random randomNumber = new Random();
	    playerHitPoints = 5 + randomNumber.nextInt(godHealth + (levelOfPlayer * 10) + Loot.armorBonus + classHealth);
		System.out.println();
	    return playerHitPoints;
	    }
	
	public static String askName() //Asks the name of the player.
		{
		System.out.println("Hello, and welcomd to COMBAT. What is your name?");
		Scanner userInput1 = new Scanner(System.in);        
	    nameOfPlayer = userInput1.nextLine();        
	    System.out.println("Nice to meet you " + nameOfPlayer + ".");
	    if ("TGM".equals(nameOfPlayer))
	    	{
	    	godHealth = 300;
	    	}
	    else
	    	{
	    	godHealth = 0;
	    	}	
	    System.out.println();
	    return nameOfPlayer;
		}
	
	public static int playerAttackRoll()//Rolls dice for the damage done by the player's sword.
		{
		dodgeAffect = 0;
		Fight.resetDiceForRoll();
		Random randomNumber = new Random();
		diceRollOne = 2 + randomNumber.nextInt(classDamage);
		diceRollTwo = 2 + randomNumber.nextInt(classDamage);
		diceRollThree = 2 + randomNumber.nextInt(classDamage);
		totalDice = (diceRollOne + diceRollTwo + diceRollThree + Loot.weaponBonus + classWeaponBonus);
		Monster.monsterHitPoints = (Monster.monsterHitPoints - totalDice);
		System.out.println(diceRollOne + " " + diceRollTwo + " " + diceRollThree);
		System.out.println("You swing your " + weaponName + " and do " + totalDice + " damage!");
		System.out.println();
		return totalDice;
		}
	
	public static int generateCharacter() //Asks the player where he/she is from, what they want the difficulty level to be, and what they want their class to be.
		{
		System.out.println("Where are you from " + nameOfPlayer + "?"); 
		Scanner userInput1 = new Scanner(System.in);
		homeLand = userInput1.nextLine();
		System.out.println("So you are from " + homeLand + "?!  Interesting.");
		System.out.println(" ");
		System.out.println("Choose the difficulty level.");
		System.out.println(" ");
		System.out.println("1)Trainee, 2)Adept, 3)Journyman(Recommended), 4)Master, or 5)DEATH.");
		Scanner userInput2 = new Scanner(System.in);
		difficultyLevel = userInput2.nextInt();
			if (1 == difficultyLevel)
				{
				System.out.println("The easiest of the levels.  A novice player I see.");
				difficultyHealth = 20;
				difficultyDamage = 4;
				}
			if (2 == difficultyLevel)
				{
				System.out.println("The normal level. A smart choice " + nameOfPlayer + "." );
				difficultyHealth = 40;
				difficultyDamage = 6;
				}
			if (3 == difficultyLevel)
				{
				System.out.println("This level is difficult but not immposible.");
				System.out.println("Maybe soon you can try the Master level.");		
				difficultyHealth = 80;
				difficultyDamage = 8;
				}
			if (4 == difficultyLevel)
				{
				System.out.println("I bow in respect to a Master of COMBAT.");
				difficultyHealth = 100;
				difficultyDamage = 10;
				}
			if (5 == difficultyLevel)
				{
				System.out.println("I will attend your funeral.");
				difficultyHealth = 1000;
				difficultyDamage = 20;
				}
		System.out.println(" ");	
		System.out.println("Choose your class "
				+ "" + nameOfPlayer + " of " + homeLand + ".");	
		System.out.println(" ");
		System.out.println("You can be an Fighter, Healer, Thief or a Mage.");
		System.out.println();
		System.out.println("You could also be a Paladin(Healer+Fighter) a Battlemage(Fighter+Mage) a Nightblade(Thief+Mage) or a Swordsman(Fighter+Thief).");
		jobOfPlayer = userInput1.nextLine();
		System.out.println("An interesting choice.  Hail " + nameOfPlayer + " the "+ jobOfPlayer + "!");
		if ("Fighter".equals(jobOfPlayer))
			{
			classWeaponBonus = 3;
			classFireballBonus = -3;
			classHealingBonus = -1;
			classDodgeBonus = -3;
			weaponName = "Sword";
			dodgeTypeName = "Block";
			healingTypeName = "Health Potion";
			healingName = 3;
			classDamage = 8;
			classHealth = 16;
			}
		if ("Mage".equals(jobOfPlayer))
			{
			classWeaponBonus = -3;
			classFireballBonus = 3;
			classHealingBonus = 2;
			classDodgeBonus = -1;
			dodgeTypeName = "Shield Spell";
			healingTypeName = "Healing Spell";
			healingName = 6;
			weaponName = "Staff";
			classDamage = 4;
			classHealth = 13;
			}
		if ("Healer".equals(jobOfPlayer))
			{
			classWeaponBonus = 2;
			classFireballBonus = 0;
			classHealingBonus = 3;
			classDodgeBonus = -2;
			dodgeTypeName = "Block";
			healingTypeName = "Healing Spell";
			healingName = 6;
			weaponName = "Mace";
			classDamage = 7;
			classHealth = 15;
			}
		if ("Thief".equals(jobOfPlayer))
			{
			classWeaponBonus = 1;
			classFireballBonus = -3;
			classHealingBonus = -1;
			classDodgeBonus = 3;
			dodgeTypeName = "Dodge";
			healingTypeName = "Healing Potion";
			healingName = 3;
			weaponName = "Dagger";
			classDamage = 5;
			classHealth = 14;
			}
		if ("Paladin".equals(jobOfPlayer))
			{
			classWeaponBonus = 2;
			classFireballBonus = -3;
			classHealingBonus = 2;
			classDodgeBonus = -3;
			dodgeTypeName = "Block";
			healingTypeName = "Healing Spell";
			healingName = 6;
			weaponName = "Hammer";
			classDamage = 7;
			classHealth = 15;
			}
		if ("Nightblade".equals(jobOfPlayer))
			{
			classWeaponBonus = 0;
			classFireballBonus = 3;
			classHealingBonus = -3;
			classDodgeBonus = 3;
			dodgeTypeName = "Dodge";
			healingTypeName = "Healing Spell";
			healingName = 6;
			weaponName = "Spear";
			classDamage = 5;
			classHealth = 13;
			}
		if ("Battlemage".equals(jobOfPlayer))
			{
			classWeaponBonus = 1;
			classFireballBonus = 3;
			classHealingBonus = 1;
			classDodgeBonus = -3;
			dodgeTypeName = "Shield Spell";
			healingTypeName = "Healing Spell";
			healingName = 6;
			weaponName = "Battle Staff";
			classDamage = 6;
			classHealth = 14;
			}
		
		System.out.println();	
		System.out.println("You will awake soon " + nameOfPlayer + " of " + homeLand + ".");
		System.out.println(" ");
		System.out.println("Good luck.");
		System.out.println();
		System.out.println("You awake in an areana with a vicious beast in front of you.");
		System.out.println();
		System.out.println();
		return difficultyLevel;	
		}
	}
