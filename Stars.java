//C помощью циклов нарисовать такую фигуру:
//*
//**
//***
//****
//***
//**
//*
//ћаксимальна€ высота вводитс€ с клавиатуры (в данном примере высота 4)

package com.Ivan;

import java.util.Scanner;

public class Stars {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int countOfStars; // переменна€, хран€ща€ значение макс. кол-ва звезд
		System.out.println("¬ведите положительное число:");
		countOfStars = scanner.nextInt();
		scanner.close();
	
		for(int i = 0; i < countOfStars; i++)
		{
			for(int x = 0; x <=i; x++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = countOfStars-1; i >= 0; i--)
		{
			for(int x = i-1; x >=0; x--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
