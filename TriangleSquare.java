package com.Ivan;
import java.util.Scanner;

public class TriangleSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		int choise=1;
		double square, p;
		String temp;
		Scanner in = new Scanner(System.in);
		do {		
			temp = "";
			System.out.println("������� ����� ������ ������ � ������� ��� ��� ������� ������������:");
			//do {
			//	if(in.hasNextLine()) 
					temp += in.nextLine();
			//}while(temp=="");
				
			String[] split = temp.split(" ");
			if(split.length==2) {
				square = 0.5 * Integer.parseInt(split[0])*Integer.parseInt(split[1]);
				System.out.println("������� ������������ ����� 1//2 * a * h = " + square);
			}
			else {
				p = (Integer.parseInt(split[0])+Integer.parseInt(split[1])+Integer.parseInt(split[2]))/2;
				square = Math.sqrt(p*(p-Integer.parseInt(split[0]))*(p-Integer.parseInt(split[1]))*(p-Integer.parseInt(split[2])));
				System.out.println("������� ������������ ����� ����� ����������� �� (p*(p-a)*(p-b)*(p-c)) = " + square);
			}
			
			System.out.println("Input 0 to exit, to continue input any other digit:");
			choise = in.nextInt();
			
		}while(choise!=0);
		in.close();
	}

}