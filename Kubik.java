//Реализовать переворот матрицы на 90, 180, 270 градусов по часовой стрелке
//Размер массива задается пользователем.

package com.Ivan;
import java.util.Scanner;

public class Kubik {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Введите размерность квадратной матрицы (от 2 до 5):");
		String dimension = scanner.nextLine();
		scanner.close();
		
		if(dimension.equals("2")) 
		{
			int[][] kubik =
				{
						{1, 1},
						{2, 2}
				};
			turnArray(kubik);
		}
		else if(dimension.equals("3"))
		{
			int[][] kubik =
				{
						{1, 1, 1},
						{2, 2, 2}, 
						{3, 3, 3}
				};
			turnArray(kubik);
		}
		else if(dimension.equals("4"))
		{
			int[][] kubik =
				{
						{1, 1, 1, 1},
						{2, 2, 2, 2}, 
						{3, 3, 3, 3},
						{4, 4, 4, 4},
				};
			turnArray(kubik);
		}
		else if(dimension.equals("5"))
		{
			int[][] kubik =
				{
						{1, 1, 1, 1, 1},
						{2, 2, 2, 2, 2}, 
						{3, 3, 3, 3, 3},
						{4, 4, 4, 4, 4},
						{5, 5, 5, 5, 5},
				};
			turnArray(kubik);
		}
		else System.out.println("Для наглядности работы кода введи число от 2 до 5!");
		}
		
		static void turnArray(int[][] arr){
			System.out.println("Ваша первоначальная матрица:");
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " " );
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Поворот матрицы на 90 градусов:");
		for(int j = 0; j < arr.length; j++)
		{
			for(int i = arr.length-1; i >= 0; i--)
			{
				System.out.print(arr[i][j] + " " );
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Поворот матрицы на 180 градусов:");
		for(int i = arr.length-1; i > -1; i--) 
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " " );
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Поворот матрицы на 270 градусов:");
		for(int j = arr.length-1; j >=0; j--)
		{
			for(int i = 0; i < arr.length; i++)
			{
				System.out.print(arr[i][j] + " " );
			}
			System.out.println();
		}
	}
		
}
