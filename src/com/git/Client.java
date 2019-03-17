package com.git;

import com.git.arithmatic.Substraction;
import com.git.arithmatic.Addition;

public class Client {

	public static void main(String[] args) {
		System.out.println("Welcome to Git Tutorial");
		Substraction subtraction = new Substraction();
		System.out.println(subtraction.sub(5, 3, 1));
		Addition addition = new Addition();
		System.out.println(addition.add(2, 4, 6, 8, 10));
	}
}
