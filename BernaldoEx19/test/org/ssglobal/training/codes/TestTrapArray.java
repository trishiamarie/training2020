package org.ssglobal.training.codes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTrapArray {
	
	private TrapArray trap;
	
	@BeforeEach
	public void setup() {
		this.trap = new TrapArray();
		
	}
	
	@Test
	public void testTrapArray() {
		
		Assertions.assertDoesNotThrow(() -> {
			trap.arrayTransact();
			
		});
	
	}
	
	@AfterEach
	public void teardown() {
		trap = null;
	}

}
