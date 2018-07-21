// Программа должна вывести длину окружности. Радиус задается пользователем с консоли.

package com.Ivan;

import java.util.Scanner;

public class Сircumference {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// объявляем переменные
		
		double radius;
		double circumference;
		
		System.out.println("Ведите радиус окружности:");
		radius = scanner.nextDouble();
		
		// вычисляем длину окружности
		circumference = 2*Math.PI*radius;
		
		System.out.println("Длина окружности равна " + circumference);
		
		scanner.close();
	}
}
