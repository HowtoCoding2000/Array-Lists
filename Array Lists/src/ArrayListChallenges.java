import java.util.ArrayList;
public class ArrayListChallenges
	{
		public static void main(String[] args)
			{
				ArrayList decimalArray = new ArrayList();
				decimalArray.add(9.4);
				decimalArray.add(3.6);
				decimalArray.add(3.6);
				decimalArray.add(2.3);
				decimalArray.add(7.4);
				double total = 0;
				for (int i = 0; i < decimalArray.size(); i++)
					{
						System.out.println(decimalArray.get(i));
						total += (double)decimalArray.get(i);
					}
				System.out.println();
				
				
				System.out.println("The total is " + total + ".");
				System.out.println();
				
				
				decimalArray.remove(0);
				decimalArray.add(4.8);
				decimalArray.add(7.5);
				double average = 0;
				average = total / decimalArray.size();
				System.out.println("The average is " + average + ".");
			}
	}
