package com.Ivan;

public class Ivan3 
{
	static int toSum(String argFromConsol)
	{
		int sum = 0;
		String[] arrayOfNumbers = argFromConsol.split("");
		for(int i = 0; i < arrayOfNumbers.length; i++)
		{
			sum += Integer.parseInt(arrayOfNumbers[i]);
		}
		return sum;
    }

	public static void main(String[] args) 
	{
		System.out.println(toSum(args[0]));
	}
}
