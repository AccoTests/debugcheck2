package com.ht.debugcheck2;

import com.ht.debugcheck2.code.ICalc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

// Problem statement
// make the project compilable and successfully execute the tests.
// you can comment out t2 and focus on solving t1 first.
// once t1 is solved, you can solve t2
class Debugcheck2ApplicationTests {

	ICalc calc1;

	@Test
	void t1() throws IOException {
		Double add = calc1.add(2, 4);
		var expectedAnswer= Files.readAllLines(Paths.get("src/test/resources/answer.txt"));
				 // use streams to extract expected answer
		Assertions.assertEquals(expectedAnswer, add);
	}

	@Test
	void t2() throws IOException {
		Double d = calc1.divide(2, 4); // you need Calc2 object here, what would you do ?
		var expectedAnswer= 0.5;
		Assertions.assertEquals(expectedAnswer, d);
	}

}
