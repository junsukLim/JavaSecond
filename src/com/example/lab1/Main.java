package com.example.lab1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("What is your nickname?");
		String name = s.next();
		System.out.print("Your nickname is "+name);
	}
}