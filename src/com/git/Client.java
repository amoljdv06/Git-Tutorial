package com.git;

import com.git.arithmatic.Substraction;

public class Client {

	public static void main(String[] args) {
		System.out.println("Welcome to Git Tutorial");
		Substraction subtraction = new Substraction();
		System.out.println(subtraction.sub(5,3,1));
	}
}
