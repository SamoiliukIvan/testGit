//Нарисовать обои
//+++***+++***+++***
//+++***+++***+++***
//+++***+++***+++***
//+++***+++***+++***
//
//Пользователь может ввести количество полос. В примере выше 6 полос
//ширина рисунка тоже задается пользователем. В данном примере 3
//Опционально: задать высоту


package com.Ivan;

import java.util.Scanner;

public class Papers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
    
		// ввод начальных параметров
		System.out.print("Введите количество линий:");		
		int countOfLines = scanner.nextInt();           // количество линий
    
		System.out.print("Введите ширину полос:");		
		int widthOfPapers = scanner.nextInt();          // ширина обоев
    
		System.out.print("Введите высоту обоев - ");		
		int heightOfPapers = scanner.nextInt();	        // высота обоев
		
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