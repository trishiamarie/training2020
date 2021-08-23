package org.ssglobal.training.codes;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestMixTransaction {
	
	private MixTransaction mt;
	
	@BeforeEach
	public void setup() {
		this.mt = new MixTransaction();
		
	}
	
	@SuppressWarnings("static-access")
	@ParameterizedTest
	@ValueSource(strings = "./src/files/hellosample.txt")
	public void testFileExists(String filename) {
		boolean actual = mt.fileExists(filename);
		assertTrue(actual);
		
	
	}
	
	@SuppressWarnings("static-access")
	@ParameterizedTest
	@ValueSource(strings = "100")
	public void testisInt(String strval) {
		boolean actual = mt.isInt(strval);
		assertTrue(actual);
		
	
	}
	
	@SuppressWarnings("static-access")
	@ParameterizedTest
	@ValueSource(strings = "200.00")
	public void testisDouble(String strval) {
		boolean actual = mt.isDouble(strval);
		assertTrue(actual);
	
	}
	
	@SuppressWarnings("static-access")
	@ParameterizedTest
	@ValueSource(strings = "./src/files/hellosample.txt" )
	public void testConvertMatrix(String filename) {
			try {
				mt.convertMatrix(filename);
			} catch (FileNotFoundException e) {
			} catch (WrongMatrixValuesException e) {
			} catch (WrongMatrixDimensionsException e) {
			} catch (Exception e) {
		}
		
	}
	
	@AfterEach
	public void teardown() {
		mt = null;
	}

}
