package test;

import java.util.Scanner;

public class Lab1Ex1 {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter n:");
		int n=sc.nextInt();
		int sum=0;
		double average;
		System.out.println("Display the series:");
		for(int k=1000;k>=n;k--) {
			sum=sum+k;
			System.out.print(k+" ");
			}
		average=sum/(1000-n+1);
		System.out.println("\nsum= "+sum);
		System.out.println("average="+average);
sc.close();
	}

}
