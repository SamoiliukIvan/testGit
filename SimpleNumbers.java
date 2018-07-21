//Вывести только простые числа от 1 до 100

package com.Ivan;

public class SimpleNumbers {

	public static void main(String[] args) {
		boolean flag;
		for (int i = 2; i <= 100; i++) 
		{
			flag = true;
			for(int j = 2; j < i; j++) 
			{
				if(i % j == 0) 
					{
					flag = false;
					}
			}
			
			if(flag == true) 
				{
				System.out.println(i);
				}
		}
	}
}