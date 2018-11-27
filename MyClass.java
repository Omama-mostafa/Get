package MyClass;

import java.util.ArrayList;
import java.util.Scanner;

public class MyClass
{
	public static void Get_Minimum()
	{
		ArrayList<Integer> Numbers = new ArrayList<>();
		Numbers.add(4);
		Numbers.add(6);
		Numbers.add(8);
		Numbers.add(9);
		Numbers.add(3);
		Numbers.add(4);
		Numbers.add(10);
		int Temp = 0;
		ArrayList<Integer> Mini = new ArrayList<>();
		for(int i=0; i<Numbers.size(); i++)
		{
			for(int j=i+1; j<Numbers.size(); j++)
			{
				if(Numbers.get(i) > Numbers.get(j))
				{
					Temp = Numbers.get(i);
					Numbers.set(i , Numbers.get(j));
					Numbers.set(j , Temp);
				}
				if(j == Numbers.size() - 1 && !(Mini.contains(Numbers.get(i))))
				{
					Mini.add(Numbers.get(i));
				}
			}
		}
		System.out.print("\nFirst Three Minimum Elements : ");
		System.out.println(Mini.get(0) + " , " + Mini.get(1) + " , " + Mini.get(2));
	}
	public static void main(String [] args)
	{
		Scanner Read = new Scanner(System.in);
		int Choice = 0;
		System.out.println("1.Check palindrome.");
		System.out.println("2.Most repeated value.");
		System.out.println("3.Return only primes.");
		System.out.println("4.Get median.");
		System.out.println("5.Distinct Array.");
		System.out.println("6.Sort.");
		System.out.println("7.Shuffle.");
		System.out.println("8.Check Sorted.");
		System.out.println("9.Get The Maximum 3 Numbers.");
		System.out.println("10.Zero if less than zero.");
		System.out.println("11.Get Average.");
		System.out.println("12.Reverse Array.");
		System.out.println("13.Count primes.");
		System.out.println("14.Find Largest Prime.");
		System.out.println("15.Get the minimum 3 numbers.");
		System.out.println("16.Find smallest prime.");
		System.out.println("17.Shift Array.");
		System.out.println("18.Execute All Methods.");
		
		System.out.print("\nEnter Number of Chosen Option : ");
		
		Choice = Read.nextInt();
		if(Choice == 15)
			Get_Minimum();
	}
}
