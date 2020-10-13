package com.icitinstitute.functions;

import java.util.function.Supplier;

/**
 * The Class SayHello is a spring boot function.
 * it will expose a endpoint to invoke from client "localhost:8080/sayHelloFunction"
 * This is another way by implementing Supplier FunctionalInterface
 */
public class SayHelloFunction implements Supplier<String>{

	/**
	 * Gets the.
	 *
	 * @return the string
	 */
	@Override
	public String get() {
		return "Hello Friend";
	}

}
