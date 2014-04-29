import java.util.Random;


public class Loot 
	{
	static int lootNumber, findingLuck, playerLuck, dodgeAffect = 0; 
	static int armorBonus = 0, weaponBonus = 0, fireballBonus = 0, healingSpellBonus = 0, dodgeBonus = 0;
	static int numberOfPotions = 3;
	
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
				System.out.println();
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
				System.out.println();
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
				System.out.println();
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
				System.out.println();
				break;
				}
			case 13:
			case 14:
			case 15:
			case 16:
				{
				System.out.println("You have found an Iron " + Hero.weaponName + "!");
				System.out.println();
				System.out.println("Level 1 Item.");
				System.out.println();
				weaponBonus = weaponBonus + 2;
				System.out.println("You now do 2 more damage with your " + Hero.weaponName + "!");
				System.out.println();
				break;
				}
			case 17:
			case 18:
			case 19:
				{
				System.out.println("You have found a Steel " + Hero.weaponName + "!");
				System.out.println();
				System.out.println("Level 2 Item.");
				System.out.println();
				weaponBonus = weaponBonus + 4;
				System.out.println("You now do 4 more damage with your " + Hero.weaponName + "!");
				System.out.println();
				break;
				}
			case 20:
			case 21:
				{
				System.out.println("You have found a Titanium " + Hero.weaponName + "!");
				System.out.println();
				System.out.println("Level 3 Item.");
				System.out.println();
				weaponBonus = weaponBonus + 6;
				System.out.println("You now do 6 more damage with your " + Hero.weaponName + "!");
				System.out.println();
				break;
				}
			case 22:
			case 23:
			case 24:
				{
				System.out.println("You have found a Moderate Fireball Scroll!");
				System.out.println();
				System.out.println("Level 2 Item.");
				System.out.println();
				fireballBonus = fireballBonus + 4;
				System.out.println("Your Fireball Spell does 4 more damage now.");
				System.out.println();
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
				System.out.println("Your Healing Spell/Healing Potions heals you up 4 more now.");
				System.out.println();
				break;
				}	
			case 28:
			case 29:
			case 30:
			case 31:
				{
				System.out.println("You have found Weak Boots of " + Hero.dodgeTypeName + "ing!");
				System.out.println();
				System.out.println("Level 1 Item.");
				System.out.println();
				dodgeBonus = dodgeBonus + 2;
				System.out.println("You " + Hero.dodgeTypeName + " 2 more points of damage now!");
				System.out.println();
				break;
				}
			case 32:
			case 33:
			case 34:
				{
				System.out.println("You have found Average Boots of " + Hero.dodgeTypeName + "ing!");
				System.out.println();
				System.out.println("Level 2 Item.");
				System.out.println();
				dodgeBonus = dodgeBonus + 4;
				System.out.println("You " + Hero.dodgeTypeName + " 4 more points of damage now!");
				System.out.println();
				break;
				}
			case 35:
			case 36:
				{
				System.out.println("You have found Legendary Boots of " + Hero.dodgeTypeName + "ing!");
				System.out.println();
				System.out.println("Level 3 Item.");
				System.out.println();
				dodgeBonus = dodgeBonus + 6;
				System.out.println("You " + Hero.dodgeTypeName + " 6 more points of damage now!");
				System.out.println();
				break;
				}
			case 37:
				{
				System.out.println("You have found Excalibur!");
				System.out.println();
				System.out.println("Level 4 Item.");
				System.out.println();
				weaponBonus = weaponBonus + 8;
				System.out.println("You do 8 more points of damage with your " + Hero.weaponName + " now!");
				System.out.println();
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
				System.out.println();
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
				System.out.println();
				break;		
				}
			case 40:
				{
				System.out.println("You have found an Invisibility Cloak!");	
				System.out.println();
				System.out.println("Level 4 Item.");
				System.out.println();
				dodgeBonus = dodgeBonus + 8;
				System.out.println("You " + Hero.dodgeTypeName + " 8 more points of damage now!");
				System.out.println();
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
				System.out.println();
				break;
				}
			case 42:
			case 43:
			case 44:
			case 45:
				{
				System.out.println("You have found a Weak Fireball Scroll!");
				System.out.println();
				System.out.println("Level 1 Item.");
				System.out.println();
				fireballBonus = fireballBonus + 2;
				System.out.println("Your Fireball Spell does 2 more damage now.");
				System.out.println();
				break;	
				}
			case 46:
			case 47:
				{
				System.out.println("You have found an Advanced Fireball Scroll!");
				System.out.println();
				System.out.println("Level 3 Item.");
				System.out.println();
				fireballBonus = fireballBonus + 6;
				System.out.println("Your Fireball Spell does 6 more damage now.");
				System.out.println();
				break;	
				}
			case 48:
				{
				System.out.println("You have found 20 Healing Potions!");
				System.out.println();
				System.out.println("Level 4 Item.");
				System.out.println();
				Hero.numberOfPotions = Hero.numberOfPotions + 20;
				System.out.println("You have " + Hero.numberOfPotions + " healing potions now.");
				System.out.println();
				break;		
				}
			case 49:
			case 50:
				{
				System.out.println("You have found 15 Healing Potions!");
				System.out.println();
				System.out.println("Level 3 Item.");
				System.out.println();
				Hero.numberOfPotions = Hero.numberOfPotions + 15;
				System.out.println("You have " + Hero.numberOfPotions + " healing potions now.");
				System.out.println();
				break;
				}
			case 51:
			case 52:
			case 53:
				{
				System.out.println("You have found 10 Healing Potions!");
				System.out.println();
				System.out.println("Level 2 Item.");
				System.out.println();
				Hero.numberOfPotions = Hero.numberOfPotions + 10;
				System.out.println("You have " + Hero.numberOfPotions + " healing potions now.");
				System.out.println();
				break;
				}
			case 54:
			case 55:
			case 56:
			case 57:
				{
				System.out.println("You have found 5 Healing Potions!");
				System.out.println();
				System.out.println("Level 1 Item.");
				System.out.println();
				Hero.numberOfPotions = Hero.numberOfPotions + 5;
				System.out.println("You have " + Hero.numberOfPotions + " healing potions now.");
				System.out.println();
				break;
				}				
			}
		return lootNumber;
		}
	
	public static int generateNumber()//Generates the random number for the lootBeast method.
		{
		Random randomNumber = new Random();
		lootNumber = 1 + randomNumber.nextInt(57);
		return lootNumber;
		}
	}
