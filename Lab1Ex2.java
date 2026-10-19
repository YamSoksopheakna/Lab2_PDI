package test;

import java.util.Scanner;

public class Lab1Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("=============================================");
		System.out.println("   Welcome to our program   ");
		System.out.println("'Quadratic Equation Solver ax^2 +bx + c = 0'");
		System.out.println("=============================================");
		
		System.out.print("Input a: ");
		a = sc.nextInt();
		
		System.out.print("\nInput b: ");
		b = sc.nextInt();
		
		System.out.print("\nInput c: ");
		c = sc.nextInt();
		
		double delta = 0;
		double x1,x2;
		delta=(b*b)-(4*a*c);
		
		x1=+(-b+Math.sqrt(delta))/(2*a);
		x2=(-b-Math.sqrt(delta))/(2*a);
		
		System.out.println("-------------------------------------------------");
		System.out.println("Roots of this equation: "+a+"x^2 "+b+"x "+c+" = 0 are");
		System.out.println("    x1= "+x1);
		System.out.println("    x2= "+x2);
		System.out.println("-------------------------------------------------");
		sc.close();
	}

}
