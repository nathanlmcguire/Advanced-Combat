import java.util.Random;


public class Loot 
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
	
	public static int lootBeast()//Randomly generates loot from the dead beast.(Only if you killed it.)
		{
		generateNumber();
		System.out.println("You open the bag of loot at your feet.");
		System.out.println("");
		switch (lootNumber)
			{ 
			case 1:
			case 2:
			case 3:
				{
				System.out.println("You have found a Shield Scroll!");
				System.out.println();
				System.out.println("Level 2 Item.");
				System.out.println();
				armorBonus = armorBonus + 4;
				System.out.println("Your max HP has now been increased by 4.");
				break;
				}
			case 4:
			case 5:
			case 6:
			case 7:	
				{
				System.out.println("You have found some Iron Armor!");
				System.out.println();
				System.out.println("Level 1 Item.");
				System.out.println();
				armorBonus = armorBonus + 2;
				System.out.println("Your max HP has now been increased by 2.");
				break;
				}
			case 8:
			case 9:
			case 10:
				{
				System.out.println("You have found some Steel Armor!");
				System.out.println();
				System.out.println("Level 2 Item.");
				System.out.println();
				armorBonus = armorBonus + 4;
				System.out.println("Your max HP has now been increased by 4.");
				break;
				}
			case 11:
			case 12:
				{
				System.out.println("You have found some Titanium Armor!");
				System.out.println();
				System.out.println("Level 3 Item.");
				System.out.println();
				armorBonus = armorBonus + 6;
				System.out.println("Your max HP has now been increased by 6.");
				break;
				}
			case 13:
			case 14:
			case 15:
			case 16:
				{
				System.out.println("You have found an Iron " + weaponName + "!");
				System.out.println();
				System.out.println("Level 1 Item.");
				System.out.println();
				weaponBonus = weaponBonus + 2;
				System.out.println("You now do 2 more damage with your " + weaponName + "!");
				break;
				}
			case 17:
			case 18:
			case 19:
				{
				System.out.println("You have found a Steel " + weaponName + "!");
				System.out.println();
				System.out.println("Level 2 Item.");
				System.out.println();
				weaponBonus = weaponBonus + 4;
				System.out.println("You now do 4 more damage with your " + weaponName + "!");
				break;
				}
			case 20:
			case 21:
				{
				System.out.println("You have found a Titanium " + weaponName + "!");
				System.out.println();
				System.out.println("Level 3 Item.");
				System.out.println();
				weaponBonus = weaponBonus + 6;
				System.out.println("You now do 6 more damage with your " + weaponName + "!");
				break;
				}
			case 22:
			case 23:
			case 24:
				{
				System.out.println("You have found a Fireball Scroll!");
				System.out.println();
				System.out.println("Level 2 Item.");
				System.out.println();
				fireballBonus = fireballBonus + 4;
				System.out.println("Your Fireball Spell does 4 more damage now.");
				break;
				}
			case 25:
			case 26:
			case 27:
				{
				System.out.println("You have found a Healing Scroll!");
				System.out.println();
				System.out.println("Level 2 Item.");
				System.out.println();
				healingSpellBonus = healingSpellBonus + 4;
				System.out.println("Your Healing Spell heals you up 4 more now.");
				break;
				}	
			case 28:
			case 29:
			case 30:
			case 31:
				{
				System.out.println("You have found Weak Boots of Dodging!");
				System.out.println();
				System.out.println("Level 1 Item.");
				System.out.println();
				dodgeBonus = dodgeBonus + 2;
				System.out.println("You dodge 2 more points of damage now!");
				break;
				}
			case 32:
			case 33:
			case 34:
				{
				System.out.println("You have found Average Boots of Dodging!");
				System.out.println();
				System.out.println("Level 2 Item.");
				System.out.println();
				dodgeBonus = dodgeBonus + 4;
				System.out.println("You dodge 4 more points of damage now!");
				break;
				}
			case 35:
			case 36:
				{
				System.out.println("You have found Legendary Boots of Dodging!");
				System.out.println();
				System.out.println("Level 3 Item.");
				System.out.println();
				dodgeBonus = dodgeBonus + 6;
				System.out.println("You dodge 6 more points of damage now!");
				break;
				}
			case 37:
				{
				System.out.println("You have found Excalibur!");
				System.out.println();
				System.out.println("Level 4 Item.");
				System.out.println();
				weaponBonus = weaponBonus + 8;
				System.out.println("You do 8 more points of damage with your sword now!");
				break;	
				}
			case 38:
				{
				System.out.println("You have found a Staff of Fire!");
				System.out.println();
				System.out.println("Level 4 Item.");
				System.out.println(); 
				fireballBonus = fireballBonus + 8;
				System.out.println("Your Fireball Spell now does 8 more points of damage.");
				break;	
				}
			case 39:
				{
				System.out.println("You have found a Ring of Healing!");	
				System.out.println();
				System.out.println("Level 4 Item.");
				System.out.println();
				healingSpellBonus = healingSpellBonus + 8;
				System.out.println("You heal yourself 8 more points now!");
				break;		
				}
			case 40:
				{
				System.out.println("You have found an Invisibility Cloak!");	
				System.out.println();
				System.out.println("Level 4 Item.");
				System.out.println();
				dodgeBonus = dodgeBonus + 8;
				System.out.println("You dodge 8 more points of damage now!");
				break;		
				}
			case 41:
				{
				System.out.println("YOu have found a suit of Dragon Scale Armor!");
				System.out.println();
				System.out.println("Level 4 Item.");
				System.out.println();
				armorBonus = armorBonus + 8;
				System.out.println("Your max health is 8 more points now!");
				}
			}
		return lootNumber;
		}
	
	public static int generateNumber()//Generates the random number for the lootBeast method.
		{
		Random randomNumber = new Random();
		lootNumber = 1 + randomNumber.nextInt(40);
		return lootNumber;
		}
	}
