package com.git.arithmatic;

public class Addition {

	private int add(int num1, int num2) {
		return num1 + num2;
	}

	public int add(int... numbers) {
		int result = 0;
		for (int num : numbers) {
			result = add(result, num);
		}
		return result;
	}

}
