package com.Ivan;

import java.util.Scanner;

public class NumbersToDisplay {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число, состоящее из 6-ти цифр:");
		String str = scanner.nextLine();
		if(str.length()> 6 | str.length() < 6)
		{ do 
			{
			System.out.println("Вы ввели некорректное число. Попробуйте еще раз.");
			str = scanner.nextLine();
			}while(!(str.length() == 6));
		}
		for(int i = 0; i<str.length(); i++)
		{
			System.out.println(str.charAt(i));
		}
		
//===================== Дополнительное задание=========================
		
		System.out.println("Вы справились с первым заданием!!! Теперь введите любое число:");
		String str2 = scanner.nextLine();
		for(int i = 0; i<str2.length(); i++)
		{
			System.out.println(str2.charAt(i));
		}
		scanner.close();
	}
}
