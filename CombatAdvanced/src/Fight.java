import java.util.Random;
import java.util.Scanner;


public class Fight 
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
	
	public static int chooseAction()//Lets the player choose their action.
		{		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();//InputStream input = classLoader.getResourceAsStream("image.jpg");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		Hero.generatePlayerHitPoints();
		Monster.generateMonsterHitPoints();
		System.out.println("Would you like to use a 1)" + weaponName + ", 2)Fireball Spell, 3)" + healingTypeName + ",");
		System.out.println("4) Lightning Blast?(do not try unless Level 20) or 5)to " + dodgeTypeName + " the next Atack."); 
		Scanner userInput1 = new Scanner(System.in);
		actionChoice = userInput1.nextInt();
		switch (actionChoice)
			{
			case 1:
				{
				dodgeAffect = 0;	
				Hero.playerAttackRoll();
				monsterHitPoints = (monsterHitPoints - totalDice);
				break;
				}
	
			case 2:
				{
				dodgeAffect = 0;	
				Random randomNumber = new Random();
				diceRollOne = 1 + randomNumber.nextInt(3);
				diceRollTwo = 1 + randomNumber.nextInt(3);
				diceRollThree = 1 + randomNumber.nextInt(15);
				totalDice = (diceRollOne + diceRollTwo + diceRollThree + fireballBonus + classFireballBonus);
				monsterHitPoints = (monsterHitPoints - totalDice);				
				System.out.println("You blast the enemy with flames and do " + totalDice + " damage!");
				System.out.println();
				break;
				}
			case 3:	
				{
				if(numberOfPotions == 3)
					{
					dodgeAffect = 0;	
					Random randomNumber = new Random();
					diceRollOne = 1 + randomNumber.nextInt(healingName);
					diceRollTwo = 1 + randomNumber.nextInt(healingName);
					diceRollThree = 1 + randomNumber.nextInt(healingName);
					totalDice = diceRollOne + diceRollTwo + diceRollThree + healingSpellBonus;
					playerHitPoints = (playerHitPoints + totalDice + classHealingBonus);
					System.out.println("You heal yourself " + totalDice * classHealingBonus + " points of health with your " + healingTypeName + "!");
					if (healingName == 3)
						{
						numberOfPotions--;
						System.out.println();
						System.out.println(numberOfPotions + " potions left.");
						}
					}
				else if (numberOfPotions == 0)
					{
					System.out.println("You have no potions left.");
					}
				System.out.println();
				break;	
				}
			case 4:
				{
				if("TGM".equals(nameOfPlayer))	
					{
					dodgeAffect = 0;
					Random randomNumber = new Random();
					diceRollOne = 50 + randomNumber.nextInt(100);
					diceRollTwo = 50 + randomNumber.nextInt(100);
					diceRollThree = 50 + randomNumber.nextInt(100);
					totalDice = diceRollOne + diceRollTwo + diceRollThree;
					monsterHitPoints = (monsterHitPoints - totalDice);
					System.out.println("Lightning archs towards the beast doing " + totalDice + " damage");
					System.out.println();
					}
				if(levelOfPlayer >= 20)
					{
					dodgeAffect = 0;
					Random randomNumber = new Random();
					diceRollOne = 50 + randomNumber.nextInt(100);
					diceRollTwo = 50 + randomNumber.nextInt(100);
					diceRollThree = 50 + randomNumber.nextInt(100);
					totalDice = diceRollOne + diceRollTwo + diceRollThree;
					monsterHitPoints = (monsterHitPoints - totalDice);
					System.out.println("Lightning archs towards the beast doing " + totalDice + " damage");
					System.out.println();
					}
				else
					{
					dodgeAffect = 0;
					Random randomNumber = new Random();
					diceRollOne = 1 + randomNumber.nextInt(2);
					diceRollTwo = 1 + randomNumber.nextInt(2);
					diceRollThree = 1 + randomNumber.nextInt(2);
					totalDice = diceRollOne + diceRollTwo + diceRollThree;
					playerHitPoints = (playerHitPoints - totalDice);
					System.out.println("The spell backfires doing " + totalDice + " damage to yourself.");
					System.out.println();
					}
				break;
				}
			case 5:
				{
				dodgeAffect = 0;	
				Random randomNumber = new Random();
				diceRollOne = 1 + randomNumber.nextInt(10);
				dodgeAffect = diceRollOne + classDodgeBonus + dodgeBonus;
				System.out.println("You prepare to " + dodgeTypeName + " the enemie's next blow.");
				System.out.println();
				System.out.println("You will " + dodgeTypeName + " " + dodgeAffect + " points of damage.");
				System.out.println();
				break;
				}
			}
		return actionChoice;
		}
	
	public static int simulateCombat()//The whole combat package which makes it so that you fight until you or the beast is dead.
		{
		while(monsterHitPoints > 0)
			{
			Monster.monsterAttackRoll();
			if (playerHitPoints <= 0)
				{
				System.out.println("YOU DIED!");
				Fight.askPlayerIfTheyWantToPlayAgain();
				break;
				}
			else if (playerHitPoints != 0)
				{
				Fight.chooseAction();
				}
			}
	
		if (monsterHitPoints <= 0)
			{
			System.out.println("YOU HAVE SLAIN THE BEAST!");
			System.out.println();
			System.out.println("You find some treasure on the body of the beast.");
			System.out.println();
			numberOfSlainEnemies++;
			Loot.lootBeast();
			System.out.println();
			System.out.println("LEVEL UP!");
			levelOfPlayer++;
			System.out.println();
			System.out.println("You are now a Level " + levelOfPlayer + "!");
			Fight.askPlayerIfTheyWantToPlayAgain();
			}	
		return monsterHitPoints;
		}
	
	public static int askPlayerIfTheyWantToPlayAgain()//Asks the player if they want to play again or if they want to stop playing.
		{
		System.out.println();
		System.out.println("Would you like to play again " + nameOfPlayer + "?");
		System.out.println();
		System.out.println("Or does " + homeLand + " need you?");
		System.out.println();
		System.out.println("Press 1 to play again and press 2 to exit the game.");
		Scanner userInput1 = new Scanner(System.in);
		playAgainChoice = userInput1.nextInt();
		if (playAgainChoice == 2)
			{
			System.out.println("Farewell " + nameOfPlayer + " of " + homeLand + ".");
			System.out.println();
			if (numberOfSlainEnemies == 1)
				{
				pluralVariable = " 1 deadly beast.  Better one than none.";
				}
			else if (numberOfSlainEnemies == 0)
				{
				pluralVariable = "no deadly beasts.  You are a failure.";
				}
			else 
				{
				pluralVariable = "" + numberOfSlainEnemies + " deadly beasts.";
				if(numberOfSlainEnemies > 5)
					{
					System.out.println();
					System.out.println("You are a master at COMBAT.");
					}
				else if (numberOfSlainEnemies > 10)
					{
					System.out.println();
					System.out.println("You are a Legend of COMBAT.");
					}
				else if (numberOfSlainEnemies > 15)
					{
					System.out.println();
					System.out.println("You spend too much time on this game.");
					}
				}
			System.out.println("Let Everyone know that you were a Level " + levelOfPlayer + " " + jobOfPlayer + " and you fought "
					+ "valiantly, defeating " + pluralVariable + "");
			System.out.println();
			System.out.println("Best of luck to you.");
			System.exit(0);
			}
		return playAgainChoice;
		}
	}
