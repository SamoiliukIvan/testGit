//Создать массив случайных элементов размер 10.
//Создать второй массив размером 20, где повторяются первые элементы, а остальные числа являются увеличенным вдвое значениями первого массива.
//1, 2, 3 ...
//1, 2, 3, 2, 4, 6 ...


package com.Ivan;

public class RandomNumbers {
	public static void main(String args[])
	{
	
		int[] arrayOf10Numbers = new int[10]; // массив из 10 чисел
		int[] arrayOf20Numbers = new int[20]; // массив из 20 чисел
		
		System.out.println("Набор случайных чисел:");
		for (int i = 0; i < arrayOf10Numbers.length; i++)
		{
			arrayOf10Numbers[i] = ((int)(Math.random() * 10));
		}
			for (int i = 0; i < 10; i++) 
			{
				arrayOf20Numbers[i]=arrayOf10Numbers[i];	
				
			System.out.print(arrayOf10Numbers[i]);	
			System.out.print("\t");
			}
			
	System.out.println("\n");
	
	
				for(int i = 10; i < arrayOf20Numbers.length; i++)
				{
					arrayOf20Numbers[i] = arrayOf10Numbers[i-10] * 2;	
				}
				
	System.out.println("Набор случайных чисел, где элементы после 9-го увеличены на 2:");
	
				for(int i = 0; i < arrayOf20Numbers.length; i++)
				{
					System.out.print(arrayOf20Numbers[i]);	
					System.out.print("\t");
				}
	}
}
