import java.util.Random;
import java.util.Scanner;


public class SideQuests 
	{
	static int randomQuestNumber, randomNameNumber, randomCallNumber, moralLeftOrRightChoice, randomOutcomeNumber, helpChoice;
	static String riddleGuess;
	
	public static int generateQuest()//Generates the random number for the lootBeast method.
		{
		Random randomNumber = new Random();
		randomQuestNumber = 1 + randomNumber.nextInt(10);
		return randomQuestNumber;
		}
	
	public static void generateName()
		{
		String [] firstPartOfName= {"Yorgund", "Seth", "Saird", "Martin", "Quarth", "Fend", "Tark", "Nor"};
		String [] secondPartOfName= {" a Mage", " a Thief", " a Fighter", " a Healer", " a Nightblade", " a Battlemage", " a Paladin", " a Swordsman"};
		String [] thirdPartOfName= {" of Deepstain", " of Serebis", " of Doomkeep", " of Terik", " of Kildarin", " of Vortonsin", " of Sorthus", " of the Unknown"};
		generateNameNumber();
		System.out.println("I am " + firstPartOfName[randomNameNumber] + secondPartOfName[randomNameNumber] + thirdPartOfName[randomNameNumber] + ".");
		}
	
	public static int generateNameNumber()//Generates the random number for the lootBeast method.
		{
		Random randomNumber = new Random();
		randomNameNumber = randomNumber.nextInt(7);
		return randomNameNumber;
		}
	
	public static int generateCallNumber()//Generates the random number for the lootBeast method.
		{
		Random randomNumber = new Random();
		randomCallNumber = randomNumber.nextInt(2);
		return randomCallNumber;
		}
	
	public static int generateOutcomeNumber()//Generates the random number for the lootBeast method.
		{
		Random randomNumber = new Random();
		randomOutcomeNumber = 1 + randomNumber.nextInt(2);
		return randomOutcomeNumber;
		}
	
	public static void collectionOfQuests()
		{
		generateQuest();
		switch (randomQuestNumber)
			{
			case 1:
				{
				moralChoice();
				}
			case 2:
				{
				savePerson();	
				}
			case 3:
				{
				fightBeast();	
				}
			case 4:
				{
				System.out.print("");	
				}
			case 5:
				{
				System.out.print("");	
				}
			case 6:
				{
				System.out.print("");	
				}
			case 7:
				{
				System.out.print("");	
				}
			case 8:
				{
				System.out.print("");	
				}
			case 9:
				{
				System.out.print("");	
				}
			case 10:
				{
				System.out.print("");	
				}	
			}
		}
			
	public static String savePerson()
		{
		System.out.println("You see, as you continue on your journey, a massive rock with runes inscribed on it.");
		System.out.println();
		Intros.delayTwoSeconds();
		System.out.println("As you look closer you see that the rock has two arms that are wrapped around something... no someone!");
		System.out.println();
		Intros.delayTwoSeconds();
		System.out.println("You hear a muffled, 'Help me, solve the riddle!'");
		System.out.println();
		Intros.delayTwoSeconds();
		System.out.println("Suddenly the stone lights up, and begins to speak.");
		System.out.println();
		Intros.delayTwoSeconds();
		System.out.println("I am lighter than a feather, yet no man can hold me for very long. What am I?(answer in one word, six letters, all lower case)");
		Scanner userInput3 = new Scanner(System.in);
		riddleGuess = userInput3.nextLine();		
		if ("breath".equals (riddleGuess))
			{
			System.out.println("Correct you may pass.");
			System.out.println();
			Intros.delayTwoSeconds();
			System.out.println("The stone releases it's captive and disapears.");
			System.out.println();
			Intros.delayTwoSeconds();
			System.out.println("The man you saved looks at you in wonder.");
			System.out.println();
			Intros.delayTwoSeconds();
			generateName();
			System.out.println();
			Intros.delayTwoSeconds();
			System.out.println("Here take this, it didn't help me much, but it might help you.");
			System.out.println();
			Intros.delayTwoSeconds();
			System.out.println("He throws a bag of loot to you and then runs off.");
			System.out.println();
			Intros.delayOneSecond();
			Loot.lootBeast();
			Intros.delayOneSecond();
			}
		else
			{
			System.out.println("You failed. Now I curse you.");
			System.out.println();
			Intros.delayTwoSeconds();
			System.out.println("You feel your health weaken 10 points as you are cursed, and the stone disappears, taking it's captive with it.");
			Hero.playerHitPoints = Hero.playerHitPoints - 10;
			System.out.println();
			Intros.delayOneSecond();
			}
		return riddleGuess;
		}

	public static int moralChoice()
		{
		System.out.println("As you are walking, you hear the sounds of combat.");	
		System.out.println();
		Intros.delayTwoSeconds();
		System.out.println("You turn to see two people locked in combat.");
		System.out.println();
		Intros.delayTwoSeconds();
		System.out.println("The fighter on the left is losing the battle while the fighter on the right is winning the battle." );
		System.out.println();
		Intros.delayTwoSeconds();
		generateCallNumber();
		String [] criesForHelp= {"'Please, help me!  I have nothing!'", "'Please help me, I am wealthy and will give you treasure!'", "'Leave me, I will hold this fiend off!'"};
		String [] criesForVengence= {"'Help me defeat this traitor!'", "'Help me, and I split his loot!'", "'Help me kill this man, he stole from me!'"};
		System.out.println("The person on the left calls out, " + criesForHelp[randomCallNumber] + "  The other person says, " + criesForVengence[randomCallNumber] + "");
		System.out.println();
		Intros.delayTwoSeconds();
		System.out.println("Choose to help the man on the left(type 1) or the man on the right(type 2)");
		Scanner userInput1 = new Scanner(System.in);        
		moralLeftOrRightChoice = userInput1.nextInt();     
		if (moralLeftOrRightChoice == 1)
			{
			System.out.println("You charge forward and swing your " + Hero.weaponName + " at the fighter on the right, cutting him down instantly.");
			System.out.println();
			Intros.delayTwoSeconds();
			generateOutcomeNumber();
			if (randomOutcomeNumber == 1)
				{
				System.out.println("The man you saved looks at you in wonder.");
				System.out.println();
				Intros.delayTwoSeconds();
				generateName();
				Intros.delayTwoSeconds();
				System.out.println();
				Intros.delayTwoSeconds();
				System.out.println("Here take this, it didn't help me much, but it might help you.");
				System.out.println();
				Intros.delayTwoSeconds();
				System.out.println("He throws a bag of loot to you and then runs off.");
				System.out.println();
				Intros.delayOneSecond();
				Loot.lootBeast();
				Intros.delayOneSecond();
				}
			if (randomOutcomeNumber == 2)
				{
				System.out.println("The man who you saved looks at you in wonder.");
				System.out.println();
				Intros.delayTwoSeconds();
				generateName();
				Intros.delayTwoSeconds();
				System.out.println("He holds out his hand to shake, and you do.  But instead of shaking your hand he takes your weapon.");
				System.out.println();
				Intros.delayTwoSeconds();
				System.out.println("He runs off far faster than you and soon he has lost you.");
				System.out.println();
				Intros.delayTwoSeconds();
				System.out.println("Now your weapon does -5 damage.");
				System.out.println();
				Intros.delayOneSecond();
				Loot.weaponBonus = Loot.weaponBonus - 5;
				Intros.delayOneSecond();
				}
			}
		if (moralLeftOrRightChoice ==2)
			{
			System.out.println("You charge forward and swing your " + Hero.weaponName + " at the fighter on the left, cutting him down instantly.");
			System.out.println();
			generateOutcomeNumber();
			if (randomOutcomeNumber == 1)
				{
				System.out.println("The man you helped grins at you.");
				System.out.println();
				Intros.delayTwoSeconds();
				generateName();
				Intros.delayTwoSeconds();
				System.out.println();
				System.out.println("Here let me teach you what I know.");
				System.out.println();
				Intros.delayTwoSeconds();
				System.out.println("LEVEL UP!");
				Hero.levelOfPlayer++;
				System.out.println();
				Intros.delayOneSecond();
				System.out.println("You are now a Level " + Hero.levelOfPlayer + "!");
				Hero.playerHitPoints = Hero.playerHitPoints + (Hero.levelOfPlayer * 5);
				System.out.println();
				Intros.delayOneSecond();
				}
			if (randomOutcomeNumber == 2)
				{
				System.out.println("The man who you helped grins at you.");
				System.out.println();
				Intros.delayTwoSeconds();
				generateName();
				Intros.delayTwoSeconds();
				System.out.println("Thanks for helping me take that traitor out.");
				System.out.println();
				Intros.delayTwoSeconds();
				System.out.println("He pats you on the back, but with the other hand he stabs a knife into your side.");
				System.out.println();
				Intros.delayTwoSeconds();
				System.out.println("He laughs maniacly as the poison flows into your body, and he runs away, screaming a strange song.");
				System.out.println();
				Intros.delayTwoSeconds();
				System.out.println("You lie there for days barely fending off monsters.");
				System.out.println();
				Intros.delayTwoSeconds();
				System.out.println("You survive, but your max health is decreased by 10");
				Hero.playerHitPoints = Hero.playerHitPoints - 10;
				Intros.delayOneSecond();
				}
			}
		return moralLeftOrRightChoice;
		}
	
	public static int fightBeast()
		{
		System.out.println("As you walk along you come to a traveler sitting at a campfire.");
		System.out.println();
		Intros.delayTwoSeconds();
		System.out.println("He looks up at you, 'Oh, a mighty adventurer!  Will you help me?'");
		System.out.println();
		Intros.delayTwoSeconds();
		System.out.println("Type 1 for yes, and 2 for no.");
		Scanner userInput3 = new Scanner(System.in);
		helpChoice = userInput3.nextInt();
		if (helpChoice == 1)
			{
			System.out.println("'You will?  Oh thank you so much!  Ut's jsut that, there is a deadly creature blocking my way to the Vale.  I am no warrior, could you kill it?'");
			System.out.println();
			Intros.delayTwoSeconds();
			generateName();
			Intros.delayTwoSeconds();
			System.out.println("You have already agreed to help so you say yes.");
			System.out.println();
			Intros.delayTwoSeconds();
			System.out.println("Thank you!  Here take this to help you.  You can keep it when you are done.");
			System.out.println();
			Intros.delayOneSecond();
			Loot.lootBeast();
			Intros.delayOneSecond();
			MonsterGenerator.monsterName = "Pathway Gaurdian";
			MonsterGenerator.monsterHealth = 9;
			MonsterGenerator.monsterDamage = 9;
			MonsterGenerator.monsterAttackName = " swings his Great Hammer at you";
			MonsterGenerator.bossFight = 1;
			MonsterGenerator.areaOfBoss = "Pathway";
			}
		if (helpChoice == 2)
			{
			System.out.println("'Well, thanks anyway.'  Says the traveler and slumps down at his fire.");
			System.out.println();
			Intros.delayOneSecond();
			}
		
		return helpChoice;
		}
	
	}
