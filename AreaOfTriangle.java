// ��������� ������ ������������ � �������� ������� ������������. 
// ������� �������� ������������� � �������.

package com.Ivan;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// ��������� ����������
		double sideA;
		double sideB;
		double sideC;
		double perimeter;
		double area;
		
		System.out.println("������ ����� ������� A");
		sideA = scanner.nextDouble();
		
		System.out.println("������ ����� ������� B");
		sideB = scanner.nextDouble();
		
		System.out.println("������ ����� ������� C");
		sideC = scanner.nextDouble();
		
		// ������� ��������
		perimeter = (sideA + sideB + sideC)/2; 
		
		// ������� ������� ������������
		area = Math.sqrt(perimeter*(perimeter - sideA)*(perimeter - sideB)*(perimeter - sideC));
		
		System.out.println("������� ������������ ����� " + area);
		
		scanner.close();
	}
}
