package com.example.ibm.fizz_buzz_test;

import static com.example.ibm.fizz_buzz_test.service.FizzBuzzService.BUZZ;
import static com.example.ibm.fizz_buzz_test.service.FizzBuzzService.FIZZ;
import static com.example.ibm.fizz_buzz_test.service.FizzBuzzService.FIZZ_BUZZ;
import static java.lang.String.format;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.example.ibm.fizz_buzz_test.service.FizzBuzzService;

class FizzBuzzServiceTest {

	private static final int NOT_MULTIPLE_OF_3_N_5 = 22;
	private FizzBuzzService fizzBuzzService = new FizzBuzzService();

	@Test
	void shoudlExistsFizzBuzzServiceInstance() {
		assertNotNull(fizzBuzzService, "The FizzBuzzService must exists");
	}

	@Test
	void shouldReturnFizzIfMulipleOf3() {
		assertEquals(fizzBuzzService.fizzBuzz(9), FIZZ, "Must be return 'Fizz' only ");
	}

	@Test
	void shouldReturnFizzIfzMulipleOf5() {
		assertEquals(fizzBuzzService.fizzBuzz(10), BUZZ, "Must be return 'Buzz' only ");
	}

	@Test
	void shouldReturnFizzBuzzIfzMulipleOf3An5() {
		assertEquals(fizzBuzzService.fizzBuzz(15), FIZZ_BUZZ, "Must be return 'Fizz Buzz' only ");
	}

	@Test
	void shouldReturnNumberIfNotMulipleOf3An5() {
		assertEquals(fizzBuzzService.fizzBuzz(NOT_MULTIPLE_OF_3_N_5), Integer.toString(NOT_MULTIPLE_OF_3_N_5),
				format("Response must be equal to '%d'", NOT_MULTIPLE_OF_3_N_5));
	}
}
