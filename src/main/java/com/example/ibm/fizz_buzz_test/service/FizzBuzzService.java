package com.example.ibm.fizz_buzz_test.service;

public class FizzBuzzService {

	private static final int BUZZ_NO = 5;
	private static final int FIZZ_NO = 3;
	public static final String FIZZ_BUZZ = "Fizz Buzz";
	public static final String BUZZ = "Buzz";
	public static final String FIZZ = "Fizz";

	public String fizzBuzz(final int i) {
		return i % FIZZ_NO == 0 && i % BUZZ_NO == 0 ? FIZZ_BUZZ
				: i % FIZZ_NO == 0 ? FIZZ : i % BUZZ_NO == 0 ? BUZZ : Integer.toString(i);
	}

}
