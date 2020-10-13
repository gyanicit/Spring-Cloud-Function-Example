package com.icitinstitute.functions;

import java.util.function.Consumer;
import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.google.common.base.Supplier;

/**
 * The Class CommonFunctions.
 */
@Component
public class CommonFunctions {

	/**
	 * Function.
	 * 
	 * This is a way to create function(Lambda)
	 * It will expose a endpoint to invoke from client "localhost:8080/function/india" 
	 *
	 * @return the function
	 */
	@Bean
	public Function<String, String> function(){
		return input->input;
	}
	
	
	
	/**
	 * Consume.
	 * 
	 * This is a way to create function(Lambda)
	 * It will expose a endpoint to invoke from client "localhost:8080/consume/india" 
	 *
	 * @return the consumer
	 */
	@Bean
	public Consumer<String> consume(){
		return input->System.out.println("Input->"+input);
		
	}
	
	/**
	 * Supply.
	 * 
	 * This is a way to create function(Lambda)
	 * It will expose a endpoint to invoke from client "localhost:8080/supply"
	 *
	 * @return the supplier
	 */
	@Bean
	public Supplier<String> supply(){
		return ()-> "Hello India";
	}
}
