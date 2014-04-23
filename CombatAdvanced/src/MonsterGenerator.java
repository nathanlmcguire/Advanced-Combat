import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MonsterGenerator 
	{
	static String currentKildarinMonster, monsterAttackName, monsterName, areaOfBoss;
	static int randomMonsterNumber, monsterHealth = 0, monsterDamage = 0, areaChoiceOne, areaChoiceTwo, areaChoiceThree, bossFight = 0;
		
	public static int kildarinMonsterArray()
		{
		Intros.startKildarinIntro();
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
		System.out.println();
		Intros.startGormarIntro();
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
		String[] listOfFarstarnMonsters = {"Giant Spider", "Two-Headed Spider", "Spider Swarm", "Giant Venus Fly Trap", "Giant Daddy Long Legs", "Hardened Spider"};	
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
			case 5:
				{
				monsterName = "Hardened Spider";
				monsterHealth = 8;
				monsterDamage = 2;
				monsterAttackName = " quickly scuttles towards you snapping its mandibles";	
				bossFight = 0;
				break;	
				}
			}
		return randomMonsterNumber;
		}

	public static int darktarnMonsterArray()
		{
		Monster.generateMonsterHitPoints();
		System.out.println();
		System.out.println("Before you is the fiery volcano Darktarn.");
		String[] listOfDarktarnMonsters = {"Lava Elemental", "Troll Worker", "Troll Fighter", "Rusty Automaton", "Troll Crossbowman", "Crazed Troll"};	
		switch (randomMonsterNumber)
			{
			case 0:
				{
				monsterName = "Lava Elemental";
				monsterHealth = 3;
				monsterDamage = 3;
				monsterAttackName = " lurches out of a pool of lava and comes towards you";
				bossFight = 0;
				break;
				}
			case 1:
				{
				monsterName = "Troll Worker";	
				monsterHealth = 1;
				monsterDamage = 0;
				monsterAttackName = " raises its tools and attacks you";
				bossFight = 0;
				break;
				}
			case 2:
				{
				monsterName = "Troll Fighter";	
				monsterHealth = 2;
				monsterDamage = 6;
				monsterAttackName = " dips its blade in the lava and come at you with it";	
				bossFight = 0;
				break;
				}
			case 3:
				{
				monsterName = "Rusty Automoton";
				monsterHealth = 5;
				monsterDamage = 5;
				monsterAttackName = " wakes from its slumber and shakes of the rust as it charges you";	
				bossFight = 0;
				break;
				}
			case 4:
				{
				monsterName = "Troll Crossbowman";
				monsterHealth = 0;
				monsterDamage = 9;
				monsterAttackName = " raises its expertly crafted crossbow and fires at you";	
				bossFight = 0;
				break;
				}
			case 5:
				{
				monsterName = "Crazed Troll";
				monsterHealth = 1;
				monsterDamage = 3;
				monsterAttackName = " charges at you screaming dwarvish curses";	
				bossFight = 0;
				break;	
				}
			}
		return randomMonsterNumber;
		}

	public static int deepstainMonsterArray()
		{
		Monster.generateMonsterHitPoints();
		System.out.println();
		System.out.println("Before you is the fiery volcano Darktarn.");
		String[] listOfDeepstainMonsters = {"Ancient Skeleton", "Vengful Skeleton", "Wraith", "Dark Automotan", "Necromancer", "Corrupted Soul"};	
		switch (randomMonsterNumber)
			{
			case 0:
				{
				monsterName = "Ancient Skeleton";
				monsterHealth = 0;
				monsterDamage = 1;
				monsterAttackName = " its bone grates together as it comes at you with an ancient blade";
				bossFight = 0;
				break;
				}
			case 1:
				{
				monsterName = "Vengful Skeleton";	
				monsterHealth = 0;
				monsterDamage = 5;
				monsterAttackName = " charges at you wishing to avenge the wrongs done to it";
				bossFight = 0;
				break;
				}
			case 2:
				{
				monsterName = "Wraith";	
				monsterHealth = 6;
				monsterDamage = 3;
				monsterAttackName = " blasts dark magic at you";	
				bossFight = 0;
				break;
				}
			case 3:
				{
				monsterName = "Dark Automaton";
				monsterHealth = 7;
				monsterDamage = 7;
				monsterAttackName = " wakes from its slumber and shakes of the rust as it charges you";	
				bossFight = 0;
				break;
				}
			case 4:
				{
				monsterName = "Necromancer";
				monsterHealth = 3;
				monsterDamage = 9;
				monsterAttackName = " blasts evil magic at you";	
				bossFight = 0;
				break;
				}
			case 5:
				{
				monsterName = "Corrupted Soul";
				monsterHealth = 7;
				monsterDamage = 2;
				monsterAttackName = " charges at you wishing to use you as a host";	
				bossFight = 0;
				break;	
				}
			}
		return randomMonsterNumber;
		}

	public static int vortonsinMonsterArray()
		{
		Monster.generateMonsterHitPoints();
		System.out.println();
		System.out.println("Before you is the fiery volcano Darktarn.");
		String[] listOfVortonsinMonsters = {"Wolf", "Ferocious Man", "Snow Leopard", "Dark Druid", "Werewolf", "Alpha Wolf"};	
		switch (randomMonsterNumber)
			{
			case 0:
				{
				monsterName = "Wolf";
				monsterHealth = 3;
				monsterDamage = 3;
				monsterAttackName = " growls and lunges at you";
				bossFight = 0;
				break;
				}
			case 1:
				{
				monsterName = "Ferocious Man";	
				monsterHealth = 6;
				monsterDamage = 3;
				monsterAttackName = " growls and lunges at you";
				bossFight = 0;
				break;
				}
			case 2:
				{
				monsterName = "Snow Leapard";	
				monsterHealth = 7;
				monsterDamage = 4;
				monsterAttackName = " growls and lunges at you";	
				bossFight = 0;
				break;
				}
			case 3:
				{
				monsterName = "Dark Druid";
				monsterHealth = 1;
				monsterDamage = 7;
				monsterAttackName = " moves the earth to slay you";	
				bossFight = 0;
				break;
				}
			case 4:
				{
				monsterName = "Wherewolf";
				monsterHealth = 6;
				monsterDamage = 5;
				monsterAttackName = " growls and lunges at you";	
				bossFight = 0;
				break;
				}
			case 5:
				{
				monsterName = "Alpha Wolf";
				monsterHealth = 7;
				monsterDamage = 7;
				monsterAttackName = " growls and lunges at you";	
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
			Monster.generateMonsterHitPoints();
			System.out.println("You walk into a large cavern where the Goblin Chief awaits you.");
			System.out.println();
			System.out.println("You can see that his throne is nade up of bones, but you can't tell what or who they are from.");
			System.out.println();
			System.out.println("This Chief screams a challenge to you, and you know that he will not let you pass from these cave to journey on to the Vale.");
			System.out.println();
			System.out.println("You must slay him.");
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
					Monster.generateMonsterHitPoints();	
					System.out.println("You see a Nightmare coming towards you being ridden by a zombie wearing heavy armor.");
					System.out.println();
					System.out.println("The zombie is wearing the armor of a Captain, and it clutches a hardy steel lance.");
					System.out.println();
					System.out.println("He believes that you the one who destroyed all of the troops under him.  You con not continue to the Vale unless he is dead.");
					System.out.println();
					System.out.println("Slay him.");
					System.out.println();
					monsterName = "Captain Morthusk";
					monsterHealth = 10;
					monsterDamage = 10;
					monsterAttackName = " attacks you with his lance";
					bossFight = 1;	
					areaOfBoss = "Gormar";	
					break;
					}
				case 2:
					{
					Monster.generateMonsterHitPoints();	
					System.out.println("You walk onto a boat floating on murky water.");
					System.out.println();
					System.out.println("This boat is the only way out of Farstarn that eventually leads to the Vale.");
					System.out.println();
					System.out.println("A Ghostly Captain materializes, intent on keeping you off his ship.  Kill him.");
					System.out.println();
					monsterName = "Ghost Captain";
					monsterHealth = 10;
					monsterDamage = 10;
					monsterAttackName = " swings his ghostly at you";
					bossFight = 1;	
					areaOfBoss = "Farstarn";	
					break;
					}
				case 3:
					{
					Monster.generateMonsterHitPoints();	
					System.out.println("You walk into a large clearing where overhanging trees block out the moon.");
					System.out.println();
					System.out.println("A throne of silver stands before, it would have been beutiful if not for the thousands of webs covering it.");
					System.out.println();
					System.out.println("You hear a sound a look up to see a massive spider attached to the trees.  She leaps down in front of the exit to Serebis");
					System.out.println();
					System.out.println("You must slay her to leave the forest.");
					monsterName = "Spider Queen";
					monsterHealth = 10;
					monsterDamage = 10;
					monsterAttackName = " bites at you with her mandibles";
					bossFight = 1;	
					areaOfBoss = "Serebis";	
					break;
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
					generateMonsterNumber();
					darktarnMonsterArray();
					break;
					}
				case 2:
					{
					generateMonsterNumber();	
					deepstainMonsterArray();
					break;	
					}
				case 3:
					{
					generateMonsterNumber();	
					vortonsinMonsterArray();	
					break;	
					}
				}
			}
		 else if (Fight.numberOfSlainEnemies == 15)
			{
			 switch(areaChoiceTwo)
				{
				case 1:
					{
					Monster.generateMonsterHitPoints();	
					System.out.println("You walk to the edge of the fiery volcano, and see a massive rusty suit of armor in the lava.");
					System.out.println();
					System.out.println("Without anyone wearing it, it begins to move, and with a massive gauntlet it attacks you.");
					System.out.println();
					System.out.println("You must sdestroy it before you proceed to the Vale.");
					System.out.println();
					monsterName = "Ancient Pierced Armor";
					monsterHealth = 10;
					monsterDamage = 10;
					monsterAttackName = " swings its great metal claymore at you";
					bossFight = 1;	
					areaOfBoss = "Darktarn";	
					break;		
					}
				case 2:
					{
					Monster.generateMonsterHitPoints();	
					System.out.println("You walk into a massive throne room littered with millions of bones.  The Liche Emperor is sitting at his throne, waiting for you.");
					System.out.println();
					System.out.println("You sense that he wants your body for some dark purpose.");
					System.out.println();
					System.out.println("He will not let you pass alive, you must kill him.");
					System.out.println();
					monsterName = "Liche Emperor";
					monsterHealth = 10;
					monsterDamage = 10;
					monsterAttackName = " blasts dark hexes at you";
					bossFight = 1;		
					areaOfBoss = "Deepstain";
					break;
					}
				case 3:
					{
					Monster.generateMonsterHitPoints();	
					System.out.println("You see a wolf coming towards you.  Or is it a man?");
					System.out.println();
					System.out.println("The being morphs continously between a hideous beast and a rabid man.");
					System.out.println();
					System.out.println("This creature will not let you trespass its territory on your quest to get to the Vale.  Slay it.");
					System.out.println();
					monsterName = "Mutant Elder";
					monsterHealth = 10;
					monsterDamage = 10;
					monsterAttackName = " claws and bites at you";
					bossFight = 1;		
					areaOfBoss = "Vortonsin";	
					break;
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
					generateMonsterNumber();	
						
					break;	
					}
				case 2:
					{
					generateMonsterNumber();	
						
					break;	
					}
				case 3:
					{
					generateMonsterNumber();	
						
					break;	
					}
				}
			}
		 else if (Fight.numberOfSlainEnemies == 20)
			{
			 switch(areaChoiceThree)
				{
				case 1:
					{
					Monster.generateMonsterHitPoints();	
					System.out.println("You see a wolf coming towards you.  Or is it a man?");
					System.out.println();
					System.out.println("The being morphs continously between a hideous beast and a rabid man.");
					System.out.println();
					System.out.println("This creature will not let you trespass its territory on your quest to get to the Vale.  Slay it.");
					System.out.println();
					monsterName = "Mutant Elder";
					monsterHealth = 10;
					monsterDamage = 10;
					monsterAttackName = " claws and bites at you";
					bossFight = 1;			
					areaOfBoss = "Terik";	
					}
				case 2:
					{
					Monster.generateMonsterHitPoints();	
					System.out.println("You see a wolf coming towards you.  Or is it a man?");
					System.out.println();
					System.out.println("The being morphs continously between a hideous beast and a rabid man.");
					System.out.println();
					System.out.println("This creature will not let you trespass its territory on your quest to get to the Vale.  Slay it.");
					System.out.println();
					monsterName = "Mutant Elder";
					monsterHealth = 10;
					monsterDamage = 10;
					monsterAttackName = " claws and bites at you";
					bossFight = 1;			
					areaOfBoss = "Sorthus";	
					}
				case 3:
					{
					Monster.generateMonsterHitPoints();	
					System.out.println("You see a wolf coming towards you.  Or is it a man?");
					System.out.println();
					System.out.println("The being morphs continously between a hideous beast and a rabid man.");
					System.out.println();
					System.out.println("This creature will not let you trespass its territory on your quest to get to the Vale.  Slay it.");
					System.out.println();
					monsterName = "Frozen Adventurer";
					monsterHealth = 10;
					monsterDamage = 10;
					monsterAttackName = " claws and bites at you";
					bossFight = 1;			
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
	
	public static void loreShardReveal()
		{
		if(bossFight == 1)
			{
			if("Kildarin".equals (areaOfBoss))
				{
				System.out.println("Kildarin:The land farthest away from the Vale is mostly comprised of huge cave systems.  These caves were once a rich mining facility owned by the dwarves.  Iron, Steel, and Precious Gems littered these caves, and riches flowed from Kildarin.  Most common materials were mined from this place.  Now it is derelict, barren rock, and overrun by goblins.  Wether the goblins overthrew the few dwarfs who did not retreat to the Vale, or they are what the dwarfs became, is lost in The Shadow.");
				}
			if("Gormar".equals (areaOfBoss))
				{
				System.out.println("Gormar:The massive plains were roamed by the quickest Horses in the land.  The Humans tried to tame them for warfare against The Shadow.  But the Horses were quickly corrupted by The Shadow and developed their flaming manes and tails along with their violent attitudes.  Some of the corpses of the dead human soldiers still roam this plain looking for their mounts who forsake them in battle with the Shadow.");
				}
			if("Farstarn".equals (areaOfBoss))
				{
				System.out.println("Farstarn:The swamp was dangerous even before The Shadow came, and travelers paid ferries to guide them through.  Farstarn was a place where adventurers and sailors could make an honest liveing, however, most didn't.  Thieves, conmen, and pirates abounded in this mysterious swamp.  No one knows what they did when The Shadow came, only that now the ghosts of their guilt, and anger still haunt Farstarn looking for a waylaid traveler to take out their anger on.");
				}
			if("Serebis".equals (areaOfBoss))
				{
				System.out.println("Serebis:The grand forest where the Elf Queen reigned.  It was infested with spiders and the Queen spent many soldiers to keep them at bay.  But when The Shadow came those soldiers were pulled from their task to fight IT.  Their mistake cost them, and the corpses of their army are still preserved in various webs all over Serebis.");
				}
			if("Darktarn".equals (areaOfBoss))
				{
				System.out.println("Darktarn:The massive volcano was once the great forge of the Dwarves.  They crafted many a Legendary Blade here, but they were not warriors. When The Shadow came they begged for their lives.  The Shadow made a deal with the Dwarves that if they made him a suit of armor worthy of him he would grant them immortality.  The dwarves agreed a began to make it, but a few wished to defeat The Shadow.  They built the armor with a flaw so that a hero could strike The Shadow and slay it.  The flaw went unnoticed and the Shadow let Darktarn in peace.  The Dwarf Rebels sent word to Darnth, a great Dwarven Mage who mounted an assault on Doomkeep with the entire Rebel Dwarf army.  While the army was slaughtered out side the walls, Darnth snuck in and faced The Shadow.  Darnth struck the chink with his full might, and pierced it, but The Shadow was unharmed.  After The Shadow destroyed Darnth and the Rebel Dwarves, he went back to Darktarn, furious with the Dwarven smiths there.  They pleaded for their lives, and The Shadow would have taken them, but immortal beings are bound by their word, so he cursed them.  For ever more the traitorous Dwarves of Darktarn will burn inside skin of stone:  the Trolls of the Dwarf Forge.");
				}
			if("Deepstain".equals (areaOfBoss))
				{
				System.out.println("Deepstain:The pit that carves its way into the earth was the Capital of the Dwarven Empire.  Here the miners found rare Shardium Ore.  They mined so far down that some accounts even say that they got to the core of the planet.  They were masters of metal work, and they made automatons run on magic to act as soldiers.  These automatons made up the finest army in the land, but they crumbled easily against The Shadow.  The Dwarf Emperor thought that if the automatons were more intelligent they could be effective against The Shadow.  But all attempts simulated intelligence failed, so the King began to use the human brains of the dead to give the fighting machines intelligence.  When this failed as well, the King began to steal the brains of those still alive.  When it proved that human organs powered the machines better than magic most of the Emperor's subjects were robbed to create an army to resist The Shadow.  By the time The Shadow arrived, the Dwarven Emperor was the lone Dwarf in Deepstain, and since The Shadow's to corrupt had already occurred in Deepstain, he let it lie in its twisted state.");
				}
			if("Vortonsin".equals (areaOfBoss))
				{
				System.out.println("Vortonsin:The cold plains of Vortonsin were populated by scattered Human settlements.  The Humans there were tough, hardy people.  When news of The Shadow came, they did not flee to the Vale like all those who were sane.  They thought themselves superior to all who lived in comfort.   They all allied together and met with The Shadow at the borders of Vortonsin.  The survivors of the bloodbath were led by Elder Warthon.  He was a very skilled Druid and he convinced the remaining people that the only way to survive was to live as the wolf did.  Wolves still prowl this icy tundra, and ever since Warthon marred the line between beast and man it is hard to tell if the wolves living there were born as wolf, or as man.");
				}
			if("Terik".equals (areaOfBoss))
				{
				System.out.println("Terik:The jungle domain of the elves.  Once the home to proud tribes of human barbarians the elves who overthrew them were wild and powerful.  Arguably they had the best change of defeating The Shadow out of all the races.  They rose the whole forest from its slumber, and prepared it for war.  The trees, the plants, the animals, the very grass was ready to fight The Shadow.  The fearsome Elvish warriors amassed themselves and destroyed old feuds. The Great Elvish Resistance stood waiting for The Shadow, but The Shadow knew of their power.  Wisely he did not engage them, but instead he rallied the Barbarians who used to own Terik.  He gave them the gift of Dark Pyromancy and enraged their very essence's.  The Barbarians mounted a surprise attack on the Wild Elves(as they were nicknamed) from the flank and burned them down with Dark Fire.  The elves died, but the jungle lived on, corrupted and twisted.  Not even The Shadow could destroy The Great Tree at the center of Terik, but he could corrupt it, and he did.");
				}
			if("Sorthus".equals (areaOfBoss))
				{
				System.out.println("Sorthus:A canyon that stands just before Doomkeep.  The people there lived in peace, and had little defense against the Shadow.  The merchant Morton, who tamed wild beasts as guards for a living, came up with a plan.  He had recently discovered a species of scorpion that was deadly, resilient, hardy, and not aggressive on sight.  He had caught a few, and with the help of mages quickly bred them larger, faster, and easier to train.  In fear of The Shadow he spent weeks breeding them, never sleeping and barely eating.  But unfortunately the scorpions wouldn't work in a unit, for they were independent creatures and they needed a leader. He began to go insane, and in a last attempt to defend the town before The Shadow came he used magic to meld himself with a scorpion to act as a leader.  But the magic corrupted him, and he was more scorpion and fear, than leadership and reason.  Once again The Shadow's goal of corruption had been achieved without him even entering the area.  He was content to let Morton tear his own town apart trying to prepare defense.  Even today Morton still trains his scorpions to follow his lead, and he will not hesitate to use wandering Humans as rewards for his minions.");
				}
			if("Partok".equals (areaOfBoss))
				{
				System.out.println("Partok:The unexplored in-land-sea of Partok is shrouded in mystery.  It is so frozen with ice that you can walk upon Partok without fear.  But the area is unmapped, and many wanted to know more of the mysterious place.  The famous explorer Quar, who had journeyed to every land known was sent by the Human King to map this place.  He never came back, but the year after he disappeared The Shadow came forth.  For this reasons many believe that Quar discovered The Shadow's prison here and foolishly opened it.  But no one truly knows.");
				}
			if("Doomkeep".equals (areaOfBoss))
				{
				System.out.println("Doomkeep:The legendary keep of the Humans.  During the Age of Shadow Thornwir ruled as King and he was a strong one.  He sent scouts to The Shadow, but none came back.  He was offered advice, and sent reports of destroyed villages, and asked for help.  He sent his quickest cavalry to help defend the forest of Serebis, where the Elf Queen resided.  He was quite close with the Elf Queen and mourned for days when he heard of her death.  This changed him, and he pulled all his soldiers back to the castle, along with all refugees, of any race.  as The Shadow descended on Doomkeep he consulted his old friend, the great mage Yolvar.  Yolvar knew what he needed to do, and began to build the Vale, a refuge for those pursued by The Shadow.  Thornwir gathered every wizard he could to help Yolvar but when The Shadow arrived at the walls of Doomkeep he was not finished. The walls of Doomkeep, however, were heavily enchanted and The Shadow would have to spend months unraveling those wards.  But Thornwir was betrayed by his Steward, Wherem.  Wherem made a bargain with The Shadow and then marred the magic protection of DoomKeep.  The Shadow entered the castle, and Yolvar, knowing that he must buy time, challenged The Shadow to combat.  The Shadow agreed, and Yolvar gave battle, the most difficult battle ever fought by The Shadow, it went on for three hours.  But still Yolvar was mortal, and The Shadow smote him down.  By then, The Vale was complete and all the refugees and soldiers fell back into The Vale.  The Shadow pursued but was unable to follow.  No one knows what happened to Wherem, or what his bargain was, but it must have been fulfilled, for immortal beings must keep their word.");
				}
			if("Vale".equals (areaOfBoss))
				{
				System.out.println("The Vale:The magical safe-haven made by Yolvar for protection from The Shadow.  It proved effective, unless The Shadow was given permission to enter in a mortal host.  When " + Hero.nameOfPlayer + " unwittingly acted as that host The Shadow corrupted everyone in the Vale and used King Thornwir as his host.  When the Hero awoke he fought through to The Shadow, and faced him in combat.  Although this Hero came closer than any who came before, all accounts tell that he was slain, and that The Shadow reigned on until the Third Era.  The Age of Redemption.");
				}
			}
		}
	}








