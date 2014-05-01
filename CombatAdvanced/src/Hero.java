import java.util.Random;
import java.util.Scanner;

public class Hero 
	{
	static int playerHitPoints, godHealth, levelOfPlayer = 1;
	static int diceRollOne, diceRollTwo, diceRollThree, totalDice;
	static int difficultyHealth, difficultyDamage, difficultyLevel;
	static int actionChoice;
	static int dodgeAffect = 0; 
	static int classWeaponBonus = 0, classFireballBonus = 0, classHealingBonus = 0, classDodgeBonus = 0, raceWeaponBonus = 0, raceFireballBonus = 0, raceHealingBonus = 0, raceDodgeBonus = 0;
	static String nameOfPlayer, jobOfPlayer, homeLand, raceOfPlayer;
	static String weaponName, healingTypeName, dodgeTypeName; 
	static String weaponSymbol;	
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
		System.out.println("Name:");
		Scanner userInput1 = new Scanner(System.in);        
	    nameOfPlayer = userInput1.nextLine();        
	    System.out.println("You recall your name.  It is " + nameOfPlayer + ".");
	    if ("TGM".equals(nameOfPlayer))
	    	{
	    	godHealth = 1000;
	    	levelOfPlayer = 20;
	    	}
	    else
	    	{
	    	godHealth = 0;
	    	}	
	    System.out.println();
	    Intros.delayOneSecond();
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
		totalDice = (diceRollOne + diceRollTwo + diceRollThree + Loot.weaponBonus + classWeaponBonus + raceWeaponBonus);
		Monster.monsterHitPoints = (Monster.monsterHitPoints - totalDice);
		System.out.println("You swing your " + weaponName + " and do " + totalDice + " damage!");
		Intros.delayOneSecond();
		return totalDice;
		}
	
	public static int generateCharacter() //Asks the player where he/she is from, what they want the difficulty level to be, and what they want their class to be.
		{
		System.out.println("But where are you from?"); 
		Scanner userInput1 = new Scanner(System.in);
		homeLand = userInput1.nextLine();
		System.out.println("You think back and remember that you are from " + homeLand + ".");
		System.out.println(" ");
		Intros.delayOneSecond();
		System.out.println("Choose the difficulty level.");
		System.out.println(" ");
		Intros.delayOneSecond();
		System.out.println("1) Trainee, 2) Adept, 3) Journyman(Recommended), 4) Master, or 5) DEATH.");
		Scanner userInput2 = new Scanner(System.in);
		difficultyLevel = userInput2.nextInt();
			if (1 == difficultyLevel)
				{
				difficultyHealth = 10;
				difficultyDamage = 2;
				}
			if (2 == difficultyLevel)
				{
				difficultyHealth = 20;
				difficultyDamage = 4;
				}
			if (3 == difficultyLevel)
				{	
				difficultyHealth = 30;
				difficultyDamage = 6;
				}
			if (4 == difficultyLevel)
				{
				difficultyHealth = 50;
				difficultyDamage = 8;
				}
			if (5 == difficultyLevel)
				{
				difficultyHealth = 100;
				difficultyDamage = 15;
				}
		System.out.println("You remember your fighting style.");	
		System.out.println(" ");
		Intros.delayOneSecond();
		System.out.println("Base Classes: Fighter, Healer, Thief, or Mage.");
		System.out.println();
		Intros.delayOneSecond();
		System.out.println("Advanced Classes: Paladin(Healer+Fighter), Battlemage(Fighter+Mage), Nightblade(Thief+Mage) or Swordsman(Fighter+Thief).");
		System.out.println();
		Intros.delayOneSecond();
		System.out.println("Type what you remember your stlye to be.");
		jobOfPlayer = userInput1.nextLine();
		if ("FIGHTER".equals(jobOfPlayer) || "fighter".equals(jobOfPlayer) || "Fighter".equals(jobOfPlayer))
			{
			classWeaponBonus = 3;
			classFireballBonus = -10;
			classHealingBonus = -1;
			classDodgeBonus = -3;
			weaponName = "Sword";
			dodgeTypeName = "Block";
			healingTypeName = "Health Potion";
			healingName = 3;
			classDamage = 8;
			classHealth = 16;
			weaponSymbol = "t  ";
			}
		if ("MAGE".equals(jobOfPlayer) || "mage".equals(jobOfPlayer) || "Mage".equals(jobOfPlayer))
			{
			classWeaponBonus = -10;
			classFireballBonus = 3;
			classHealingBonus = 2;
			classDodgeBonus = -1;
			dodgeTypeName = "Shield Spell";
			healingTypeName = "Healing Spell";
			healingName = 6;
			weaponName = "Staff";
			classDamage = 4;
			classHealth = 13;
			weaponSymbol = "*  ";
			}
		if ("HEALER".equals(jobOfPlayer) || "healer".equals(jobOfPlayer) || "Healer".equals(jobOfPlayer))
			{
			classWeaponBonus = 2;
			classFireballBonus = -2;
			classHealingBonus = 3;
			classDodgeBonus = -2;
			dodgeTypeName = "Block";
			healingTypeName = "Healing Spell";
			healingName = 6;
			weaponName = "Mace";
			classDamage = 7;
			classHealth = 15;
			weaponSymbol = "i";
			}
		if ("THIEF".equals(jobOfPlayer) || "thief".equals(jobOfPlayer) || "Thief".equals(jobOfPlayer))
			{
			classWeaponBonus = 1;
			classFireballBonus = -10;
			classHealingBonus = -2;
			classDodgeBonus = 3;
			dodgeTypeName = "Dodge";
			healingTypeName = "Healing Potion";
			healingName = 3;
			weaponName = "Dagger";
			classDamage = 5;
			classHealth = 14;
			weaponSymbol = "-  ";
			}
		if ("PALADIN".equals(jobOfPlayer) || "paladin".equals(jobOfPlayer) || "Paladin".equals(jobOfPlayer))
			{
			classWeaponBonus = 2;
			classFireballBonus = -10;
			classHealingBonus = 2;
			classDodgeBonus = -3;
			dodgeTypeName = "Block";
			healingTypeName = "Healing Spell";
			healingName = 6;
			weaponName = "Hammer";
			classDamage = 7;
			classHealth = 15;
			weaponSymbol = "--#";
			}
		if ("NIGHTBLADE".equals(jobOfPlayer) || "Nightblade".equals(jobOfPlayer) || "nightblade".equals(jobOfPlayer))
			{
			classWeaponBonus = 0;
			classFireballBonus = 3;
			classHealingBonus = -5;
			classDodgeBonus = 3;
			dodgeTypeName = "Dodge";
			healingTypeName = "Healing Spell";
			healingName = 6;
			weaponName = "Spear";
			classDamage = 5;
			classHealth = 13;
			weaponSymbol = "-  ";
			}
		if ("BATTLEMAGE".equals(jobOfPlayer) || "Battlemage".equals(jobOfPlayer) || "battlemage".equals(jobOfPlayer))
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
			weaponSymbol = "I  ";
			}
		if ("SWORDSMAN".equals(jobOfPlayer) || "swordsman".equals(jobOfPlayer) || "Swordsman".equals(jobOfPlayer))
			{
			classWeaponBonus = 2;
			classFireballBonus = -10;
			classHealingBonus = -2;
			classDodgeBonus = 2;
			dodgeTypeName = "Dodge";
			healingTypeName = "Healing Potion";
			healingName = 3;
			weaponName = "Katana";
			classDamage = 5;
			classHealth = 14;
			weaponSymbol = ")";
			}
		System.out.println("You see your reflection in a pool of water and realize your race. (Type: Elf, Human, Dwarf, or Hobbit)");
		raceOfPlayer = userInput1.nextLine();
		
			if("HUMAN".equals(raceOfPlayer) || "Human".equals(raceOfPlayer) || "human".equals(raceOfPlayer))
				{
				raceWeaponBonus = 2; 
				raceFireballBonus = 0;
				raceHealingBonus = 0;
				raceDodgeBonus = 0;	
				}
			if("ELF".equals(raceOfPlayer) || "Elf".equals(raceOfPlayer) || "elf".equals(raceOfPlayer))
				{
				raceWeaponBonus = 0; 
				raceFireballBonus = 0;
				raceHealingBonus = 2;
				raceDodgeBonus = 0;		
				}
			if("DWARF".equals(raceOfPlayer) || "Dwarf".equals(raceOfPlayer) || "dwarf".equals(raceOfPlayer))
				{
				raceWeaponBonus = 0; 
				raceFireballBonus = 2;
				raceHealingBonus = 0;
				raceDodgeBonus = 0;		
				}
			if("HOBBIT".equals(raceOfPlayer) || "Hobbit".equals(raceOfPlayer) || "hobbit".equals(raceOfPlayer))
				{
				raceWeaponBonus = 0; 
				raceFireballBonus = 0;
				raceHealingBonus = 0;
				raceDodgeBonus = 2;		
				}	
		System.out.println("You try hard, but you can't remember anything else about yourself.");
		System.out.println(" ");
		Intros.delayOneSecond();
		System.out.println("You raise up a torch to see your surroundings");
		System.out.println();
		Intros.delayOneSecond();
		Intros.startKildarinIntro();
		return difficultyLevel;	
		}
	}
