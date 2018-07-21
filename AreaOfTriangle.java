// Программа должна подсчитывать и выводить площадь треугольника. 
// Стороны задаются пользователем с консоли.

package com.Ivan;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// объявляем переменные
		double sideA;
		double sideB;
		double sideC;
		double perimeter;
		double area;
		
		System.out.println("Ведите длину стороны A");
		sideA = scanner.nextDouble();
		
		System.out.println("Ведите длину стороны B");
		sideB = scanner.nextDouble();
		
		System.out.println("Ведите длину стороны C");
		sideC = scanner.nextDouble();
		
		// находим периметр
		perimeter = (sideA + sideB + sideC)/2; 
		
		// находим площадь треугольника
		area = Math.sqrt(perimeter*(perimeter - sideA)*(perimeter - sideB)*(perimeter - sideC));
		
		System.out.println("Площадь треугольника равна " + area);
		
		scanner.close();
	}
}
