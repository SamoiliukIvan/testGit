//���������� ����
//+++***+++***+++***
//+++***+++***+++***
//+++***+++***+++***
//+++***+++***+++***
//
//������������ ����� ������ ���������� �����. � ������� ���� 6 �����
//������ ������� ���� �������� �������������. � ������ ������� 3
//�����������: ������ ������


package com.Ivan;

import java.util.Scanner;

public class Papers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
    
		// ���� ��������� ����������
		System.out.print("������� ���������� �����:");		
		int countOfLines = scanner.nextInt();           // ���������� �����
    
		System.out.print("������� ������ �����:");		
		int widthOfPapers = scanner.nextInt();          // ������ �����
    
		System.out.print("������� ������ ����� - ");		
		int heightOfPapers = scanner.nextInt();	        // ������ �����
		
		scanner.close();
		
		for (int i = 0; i < heightOfPapers; i++) 
		{				
			for (int j = 0; j < countOfLines; j++) 
			{			
				if ((j % 2) == 0) 
				{						
					for (int k = 0; k < widthOfPapers; k++) 
					{	
						System.out.print("*");			
					}
				} 
				else	for (int k = 0; k < widthOfPapers; k++) 
						{	
						System.out.print("+");
						}
			}
			System.out.println();				
		}
	}
}