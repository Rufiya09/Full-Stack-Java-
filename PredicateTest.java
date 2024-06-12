package com.odigos.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateTest {

	public static void main(String[] args) {
		Predicate<Integer> predicate = i -> i % 2 == 0;
		System.out.println(predicate.test(10));

		Predicate<String> predicate1 = i -> i.length() > 6;
		System.out.println(predicate1.test("sandeep"));

		Function<Integer, Integer> function = a -> a * a * a;
		System.out.println(function.apply(2));

		Function<String, String> function1= a -> a.toUpperCase();
		System.out.println(function1.apply("odigos"));
		
		Consumer<String> consumer=name->System.out.println("Name Length: "+name.length());
		consumer.accept("Odigos");
		
		Supplier<String> otps = () -> {
		     String otp = "";
		     for (int i = 1; i <= 4; i++) {
		        otp = otp + (int) (Math.random() * 10);
		     }
		   return otp;
		};
		System.out.println(otps.get());
		System.out.println(otps.get());
		System.out.println(otps.get());

	}

}
