//������� ������ ��������� ��������� ������ 10.
//������� ������ ������ �������� 20, ��� ����������� ������ ��������, � ��������� ����� �������� ����������� ����� ���������� ������� �������.
//1, 2, 3 ...
//1, 2, 3, 2, 4, 6 ...


package com.Ivan;

public class RandomNumbers {
	public static void main(String args[])
	{
	
		int[] arrayOf10Numbers = new int[10]; // ������ �� 10 �����
		int[] arrayOf20Numbers = new int[20]; // ������ �� 20 �����
		
		System.out.println("����� ��������� �����:");
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
				
	System.out.println("����� ��������� �����, ��� �������� ����� 9-�� ��������� �� 2:");
	
				for(int i = 0; i < arrayOf20Numbers.length; i++)
				{
					System.out.print(arrayOf20Numbers[i]);	
					System.out.print("\t");
				}
	}
}
