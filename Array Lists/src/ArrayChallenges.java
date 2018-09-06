import java.util.Scanner;
public class ArrayChallenges
	{
		static boolean stillRunningCode = true;
		static Scanner userInput = new Scanner(System.in);
		static Scanner userStringput = new Scanner(System.in);
		static boolean stillAsking = true;
		static boolean stillPlaying = true;	
		static int codeSelection;
		public static void main(String[] args)
			{
//				stringArray();
//				intArray();
//				intArrayVertical();
//				averageOfNumbers();
				while (stillRunningCode)
					{
						askWhichCodeToRun();
						runSelectedCode();
						askToChangeCodes();
					}
			}
		public static void askWhichCodeToRun()
			{
				System.out.println("Would you like to run (1) StringArray, (2) IntArray, (3) IntArrayVertical, or (4) AverageOfNumbers?");
				codeSelection = userInput.nextInt();
			}
		public static void runSelectedCode()
			{
				stillAsking = true;
				while (stillAsking)
					{
						if (codeSelection == 1)
							{
								stringArray();
								stillAsking = false;
							}
						else if (codeSelection == 2)
							{
								intArray();
								stillAsking = false;
							}
						else if (codeSelection == 3)
							{
								intArrayVertical();
								stillAsking = false;
							}
						else if (codeSelection == 4)
							{
								averageOfNumbers();
								stillAsking = false;
							}
						else
							{
								System.out.println("Please choose (1) UseYourInsideVoice, (2) VerticalLetters, or (3) CountTheVowels.");
								codeSelection = userInput.nextInt();
							}
					}
			}
		public static void askToChangeCodes()
			{
				stillAsking = true;
				while (stillAsking)
					{
						System.out.println("Would you like to run another code?");
						System.out.println("(1) Yes or (2) No");
						int runAnotherCode = userInput.nextInt();
						if (runAnotherCode == 1)
							{
								stillAsking = false;
							}
						else if (runAnotherCode == 2)
							{
								System.out.println("Thank you for running ArrayChallenges.");
								stillRunningCode = false;
								stillAsking = false;
							}
						else
							{
								stillAsking = true;
							}
					}
				
			}
		public static void stringArray()
			{
				String [] dogs = {"Spot", "Tails", "Fluffy McFluffface", "Lazy", "Tiger"};
				System.out.println(dogs[2]);
			}
		public static void intArray()
			{
				int [] numbers = {20,32,27,24,25};
				System.out.println(numbers[numbers.length - 1]);
			}
		public static void intArrayVertical()
			{
				int [] numbers = {20,32,27,24,25};
				for (int i = 0; i < numbers.length; i++)
					{
						System.out.println(numbers[i]);
					}
			}
		public static void averageOfNumbers()
			{
				double average = 0;
				int [] numbers = {20,32,27,24,25};
				for (int i = 0; i < numbers.length; i++)
					{
						average += numbers[i];
					}
				average /= numbers.length;
				System.out.println(average);
			}
	}
