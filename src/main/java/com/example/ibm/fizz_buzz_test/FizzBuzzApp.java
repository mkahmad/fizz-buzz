package com.example.ibm.fizz_buzz_test;

import java.util.function.Consumer;
import java.util.stream.IntStream;

import com.example.ibm.fizz_buzz_test.service.FizzBuzzService;

public class FizzBuzzApp {

	private static final String EMPTY = "";
	private static final String SEPARATOR = ", ";

	public static void main(String[] args) {
		final int start = 1;
		final int end = 100;
		FizzBuzzService fizzBuzzService = new FizzBuzzService();
		IntStream.rangeClosed(start, end).mapToObj(n -> fizzBuzzService.fizzBuzz(n)).forEach(new Consumer<String>() {
			int counter = 0;

			@Override
			public void accept(final String s) {
				System.out.print(s + (++counter < end ? SEPARATOR : EMPTY));
			}
		});
	}
}
