package com.Ivan;

public class Ivan2 {
											// a----b
static int nod(int a, int b)				// 21---49	
{											// 21---7 // тут уже без остатка
	while(b != 0)  							//  7---3
	{										//  3---1
		int temp = a % b; 					//  1---0
        a = b;
        b = temp;
        System.out.println(a);
	}
	return a;
}
public static void main(String[] args) {
	
	int c = nod(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
	System.out.println(c);
	
}
}
