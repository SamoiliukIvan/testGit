package com.Ivan;

import java.util.Scanner;

public class NumbersToDisplay {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �����, ��������� �� 6-�� ����:");
		String str = scanner.nextLine();
		if(str.length()> 6 | str.length() < 6)
		{ do 
			{
			System.out.println("�� ����� ������������ �����. ���������� ��� ���.");
			str = scanner.nextLine();
			}while(!(str.length() == 6));
		}
		for(int i = 0; i<str.length(); i++)
		{
			System.out.println(str.charAt(i));
		}
		
//===================== �������������� �������=========================
		
		System.out.println("�� ���������� � ������ ��������!!! ������ ������� ����� �����:");
		String str2 = scanner.nextLine();
		for(int i = 0; i<str2.length(); i++)
		{
			System.out.println(str2.charAt(i));
		}
		scanner.close();
	}
}
