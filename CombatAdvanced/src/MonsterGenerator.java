import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MonsterGenerator 
	{
	static String currentKildarinMonster, monsterAttackName, monsterName, areaOfBoss;
	static int randomMonsterNumber, monsterHealth = 0, monsterDamage = 0, areaChoiceOne, areaChoiceTwo, areaChoiceThree, bossFight = 0;
	
	
	public static int kildarinMonsterArray()
		{
		Monster.generateMonsterHitPoints();
		String[] listOfKildarinMonsters = {"Hunter Goblin", "Warrior Goblin", "Shaman Goblin", "Weak Goblin", "Giant Rat", "Rat Rider Goblin"};	
		switch (randomMonsterNumber)
			{
			case 0:
				{
				monsterName = "Hunter Goblin";
				monsterHealth = 1;
				monsterDamage = 3;
				monsterAttackName = " aims his bow and shoots at you";
				bossFight = 0;
				break;
				}
			case 1:
				{
				monsterName = "Warrior Goblin";	
				monsterHealth = 3;
				monsterDamage = 3;
				monsterAttackName = " swings his sword of bone at you";	
				bossFight = 0;
				break;
				}
			case 2:
				{
				monsterName = "Shaman Goblin";	
				monsterHealth = 0;
				monsterDamage = 4;
				monsterAttackName = " blasts a ball of fire at you";	
				bossFight = 0;
				break;
				}
			case 3:
				{
				monsterName = "Weak Goblin";
				monsterHealth = 0;
				monsterDamage = 0;
				monsterAttackName = " launches himself at you";	
				bossFight = 0;
				break;
				}
			case 4:
				{
				monsterName = "Giant Rat";
				monsterHealth = 2;
				monsterDamage = 3;
				monsterAttackName = " launches itself at you";	
				bossFight = 0;
				break;
				}
			case 5:
				{
				monsterName = "Rat Rider Goblin";
				monsterHealth = 4;
				monsterDamage = 5;
				monsterAttackName = " lowers his spear and charges at you";	
				bossFight = 0;
				break;
				}
			}
		return randomMonsterNumber;
		}
		
	public static int gormarMonsterArray()
		{
		Monster.generateMonsterHitPoints();
		System.out.println();
		System.out.println("Before is the might Plain Gormar.");
		String[] listOfGormarMonsters = {"Nightmare", "Wandering Zombie", "Hunter Zombie", "Zombie Nightmare Rider", "Ice Nightmare", "Nightmare Stallion"};	
		switch (randomMonsterNumber)
			{
			case 0:
				{
				monsterName = "Nightmare";
				monsterHealth = 3;
				monsterDamage = 3;
				monsterAttackName = " charges at you";
				bossFight = 0;
				break;
				}
			case 1:
				{
				monsterName = "Wandering Zombie";	
				monsterHealth = 1;
				monsterDamage = 1;
				monsterAttackName = " groans and slowly walks towards you";	
				bossFight = 0;
				break;
				}
			case 2:
				{
				monsterName = "Hunter Zombie";	
				monsterHealth = 0;
				monsterDamage = 4;
				monsterAttackName = " screams and runs at you";	
				bossFight = 0;
				break;
				}
			case 3:
				{
				monsterName = "Zombie Nightmare Rider";
				monsterHealth = 3;
				monsterDamage = 4;
				monsterAttackName = " turns the Nightmare towars you and charges";	
				bossFight = 0;
				break;
				}
			case 4:
				{
				monsterName = "Ice Nightmare";
				monsterHealth = 4;
				monsterDamage = 4;
				monsterAttackName = " charges at you";	
				bossFight = 0;
				break;
				}
			case 5:
				{
				monsterName = "Nightmare Stallion";
				monsterHealth = 5;
				monsterDamage = 5;
				monsterAttackName = " charges at you";	
				bossFight = 0;
				break;
				}
			}
		return randomMonsterNumber;
		}

	public static int farstarnMonsterArray()
		{
		Monster.generateMonsterHitPoints();
		System.out.println();
		System.out.println("Before you is the strange swamp Farstarn.");
		String[] listOfFarstarnMonsters = {"Fading Ghost", "Vengful Ghost", "Ghost Sailor", "Poisonous Mushroom", "Giant Toad", "Ghost Thief"};	
		switch (randomMonsterNumber)
			{
			case 0:
				{
				monsterName = "Fading Ghost";
				monsterHealth = 4;
				monsterDamage = 1;
				monsterAttackName = " turns toward you and attacks";
				bossFight = 0;
				break;
				}
			case 1:
				{
				monsterName = "Vengful Ghost";	
				monsterHealth = 4;
				monsterDamage = 3;
				monsterAttackName = " glares at you with its red eys and attacks";	
				bossFight = 0;
				break;
				}
			case 2:
				{
				monsterName = "Ghost Sailor";	
				monsterHealth = 4;
				monsterDamage = 2;
				monsterAttackName = " turns toward you and attacks";	
				bossFight = 0;
				break;
				}
			case 3:
				{
				monsterName = "Poisonous Mushroom";
				monsterHealth = 2;
				monsterDamage = 5;
				monsterAttackName = " blasts poison spores in your direction";	
				bossFight = 0;
				break;
				}
			case 4:
				{
				monsterName = "Giant Toad";
				monsterHealth = 6;
				monsterDamage = 1;
				monsterAttackName = " jumps out from the bank at you";
				bossFight = 0;
				break;
				}
			case 5:
				{
				monsterName = "Ghost THief";
				monsterHealth = 2;
				monsterDamage = 1;
				monsterAttackName = " tries to stab you with a ghostly knife";	
				bossFight = 0;
				break;
				}
			}
		return randomMonsterNumber;
		}
	
	public static int serebisMonsterArray()
		{
		Monster.generateMonsterHitPoints();
		System.out.println();
		System.out.println("Before you is the mysterious forest Serebis.");
		String[] listOfFarstarnMonsters = {"Giant Spider", "Two-Headed Spider", "Spider Swarm", "Giant Venus Fly Trap", "Giant Daddy Long Legs"};	
		switch (randomMonsterNumber)
			{
			case 0:
				{
				monsterName = "Giant Spider";
				monsterHealth = 3;
				monsterDamage = 2;
				monsterAttackName = " scuttles toward you and attacks";
				bossFight = 0;
				break;
				}
			case 1:
				{
				monsterName = "Two-Headed Spider";	
				monsterHealth = 4;
				monsterDamage = 3;
				monsterAttackName = " glares at you with all 16 eyes and attacks";
				bossFight = 0;
				break;
				}
			case 2:
				{
				monsterName = "Spider Swarm";	
				monsterHealth = 6;
				monsterDamage = 3;
				monsterAttackName = " scutles toward you in hube numbers";	
				bossFight = 0;
				break;
				}
			case 3:
				{
				monsterName = "Giant Venus Fly Trap";
				monsterHealth = 1;
				monsterDamage = 7;
				monsterAttackName = " snaps at you with it's giant mouth";	
				bossFight = 0;
				break;
				}
			case 4:
				{
				monsterName = "Giant Daddy Long Legs";
				monsterHealth = 6;
				monsterDamage = 1;
				monsterAttackName = " quickly scuttles towards you snapping its mandibles";	
				bossFight = 0;
				break;
				}
			}
		return randomMonsterNumber;
		}

	public static int areaChange()
		{
		if (Fight.numberOfSlainEnemies < 5)
			{
			generateMonsterNumber();
			kildarinMonsterArray();
			}
		 else if (Fight.numberOfSlainEnemies == 5)
			{
			System.out.println("You walk into a large cavern where the Goblin Chief awaits you.");
			System.out.println();
			System.out.println("Kill him.");
			System.out.println();
			monsterName = "Goblin Chief";
			monsterHealth = 10;
			monsterDamage = 10;
			monsterAttackName = " swings his scepter at you";
			bossFight = 1;
			areaOfBoss = "Kildarin";
			}
		 else if (Fight.numberOfSlainEnemies < 10)
			{
			 System.out.println("Three lands stretch out before you.");
			 System.out.println();
			 System.out.println("Do you wish to go to 1)Gormar, 2)Farstarn, or 3)Serebis?");
			 Scanner userInput1 = new Scanner(System.in);
			 areaChoiceOne = userInput1.nextInt();
			 switch(areaChoiceOne)
				{
				case 1:
					{
					generateMonsterNumber();
					gormarMonsterArray();
					break;
					}
				case 2:
					{
					generateMonsterNumber();	
					farstarnMonsterArray();
					break;
					}
				case 3:
					{
					generateMonsterNumber();
					serebisMonsterArray();
					break;
					}
				}
			}
		 else if (Fight.numberOfSlainEnemies == 10)
			{
			 switch(areaChoiceOne)
				{
				case 1:
					{
					areaOfBoss = "Gormar";	
					}
				case 2:
					{
					areaOfBoss = "Farstarn";	
					}
				case 3:
					{
					areaOfBoss = "Serebis";	
					}
				}			 
			}
		 else if (Fight.numberOfSlainEnemies < 15)
			{
			 generateMonsterNumber();
			 System.out.println("Three lands stretch out before you.");
			 System.out.println();
			 System.out.println("Do you wish to go to 1)Darktarn, 2)Deepstain, or 3)Vortonsin?");
			 Scanner userInput1 = new Scanner(System.in);
			 areaChoiceTwo = userInput1.nextInt();
			 switch(areaChoiceTwo)
				{
				case 1:
					{
						
					}
				case 2:
					{
						
					}
				case 3:
					{
						
					}
				}
			}
		 else if (Fight.numberOfSlainEnemies == 15)
			{
			 switch(areaChoiceTwo)
				{
				case 1:
					{
					areaOfBoss = "Darktarn";	
					}
				case 2:
					{
					areaOfBoss = "Deepstain";	
					}
				case 3:
					{
					areaOfBoss = "Vortonsin";	
					}
				}
			}
		 else if (Fight.numberOfSlainEnemies < 20)
			{
			 generateMonsterNumber();
			 System.out.println("Three lands stretch out before you.");
			 System.out.println();
			 System.out.println("Do you wish to go to 1)Terik, 2)Sorthus, or 3)Partok?");
			 Scanner userInput1 = new Scanner(System.in);
			 areaChoiceThree = userInput1.nextInt();
			 switch(areaChoiceThree)
				{
				case 1:
					{
						
					}
				case 2:
					{
						
					}
				case 3:
					{
						
					}
				}
			}
		 else if (Fight.numberOfSlainEnemies == 20)
			{
			 switch(areaChoiceThree)
				{
				case 1:
					{
					areaOfBoss = "Terik";	
					}
				case 2:
					{
					areaOfBoss = "Sorthus";	
					}
				case 3:
					{
					areaOfBoss = "Partok";	
					}
				}
			}
		 else if (Fight.numberOfSlainEnemies < 30)
			{
			 generateMonsterNumber();
			}
		 else if (Fight.numberOfSlainEnemies == 30)
			{
			 areaOfBoss = "Doomkeep";
			}
		 else if (Fight.numberOfSlainEnemies < 40)
			{
			 generateMonsterNumber();
			}
		 else if (Fight.numberOfSlainEnemies == 40)
			{
			 areaOfBoss = "Vale";
			}	
		return areaChoiceThree;
		}	
	
	public static int generateMonsterNumber()//Generates the random number for the lootBeast method.
		{
		randomMonsterNumber = 0;
		Random randomNumber = new Random();
		randomMonsterNumber = randomNumber.nextInt(5);
		return randomMonsterNumber;
		}
	
	public static String loreShardReveal()
		{
		if(bossFight == 1)
			{
			if("Kildarin".equals (areaOfBoss))
				{
				System.out.println("Kildarin:The land farthest away from the Vale is mostly comprised of huge cave systems.  These caves were once a rich mining facility owned by the dwarves.  Iron, Steel, and Precious Gems littered these caves, and riches flowed from Kildarin.  Most common materials were mined from this place.  Now it is derelict, barren rock, and overrun by goblins.  Wether the goblins overthrew the few dwarfs who did not retreat to the Vale, or they are what the dwarfs became, is lost in The Shadow.");
				}
			if("Gormar".equals (areaOfBoss))
				{
				System.out.println();
				}
			if("Farstarn".equals (areaOfBoss))
				{
				System.out.println();
				}
			if("Serebis".equals (areaOfBoss))
				{
				System.out.println();
				}
			if("Darktarn".equals (areaOfBoss))
				{
				System.out.println();
				}
			if("Deepstain".equals (areaOfBoss))
				{
				System.out.println();
				}
			if("Vortonsin".equals (areaOfBoss))
				{
				System.out.println();
				}
			if("Terik".equals (areaOfBoss))
				{
				System.out.println();
				}
			if("Sorthus".equals (areaOfBoss))
				{
				System.out.println();
				}
			if("Partok".equals (areaOfBoss))
				{
				System.out.println();
				}
			if("Doomkeep".equals (areaOfBoss))
				{
				System.out.println();
				}
			if("Vale".equals (areaOfBoss))
				{
				System.out.println();
				}
			}
		}
	}








