// ��������� ������ ������� ����� ����������. ������ �������� ������������� � �������.

package com.Ivan;

import java.util.Scanner;

public class �ircumference {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// ��������� ����������
		
		double radius;
		double circumference;
		
		System.out.println("������ ������ ����������:");
		radius = scanner.nextDouble();
		
		// ��������� ����� ����������
		circumference = 2*Math.PI*radius;
		
		System.out.println("����� ���������� ����� " + circumference);
		
		scanner.close();
	}
}
