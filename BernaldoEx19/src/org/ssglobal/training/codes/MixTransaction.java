package org.ssglobal.training.codes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MixTransaction {
	
	
	private static Logger logger = LogManager.getLogger("matrixLogger");

		
	public static boolean fileExists(String filename) {
		logger.info("execute fileExists {}", filename);
	
		File file = new File ("./src/files/hellosample.txt");
		String message = "GoodAfternoon";
		
		if (file.exists()) {
			logger.info("validation: file existing");
            return true;
		}
		try { 
			FileOutputStream fos = new FileOutputStream(file);
			byte[] msgByte = message.getBytes();
			fos.write(msgByte);
			fos.flush();
			fos.close(); 
		} catch (FileNotFoundException e) {
			logger.error("FileNotFoundException has been encountered");
			return false;
		} catch (IOException e) {
			logger.error("IOException has been encountered");
		}
		 System.out.println("done accessing file");
		 
		 logger.info("exit without errors fileExists {}", filename);
		return true;
	
	}
	
	
	
	public static boolean isInt(String strVal) {
		logger.info("execute isInt {}", strVal);
		if (strVal == null) {
	        return false;
	    }
	    try {
	    
	    	Integer.parseInt(strVal);
	    } catch (NumberFormatException e) {
	    	logger.error("Error message: {}", e.getMessage());
	        return false;
	    }
	    System.out.println("done accessing integer value");
		logger.info("exit without errors isInt {}", strVal);
	    return true; 
	}
	
	

	public static boolean isDouble(String strVal) {
		logger.info("execute isDouble {}", strVal);
		if (strVal == null) {
	        return false;
	    }
		
	    try {
	    	logger.warn("Double value not used");
	       Double.parseDouble(strVal);
	    } catch (NumberFormatException e) {
	    	logger.error("NumberFormatException has been encountered");
	        return false;
	    }
	    System.out.println("done accessing real value");
	    logger.info("exit without errors isDouble {}", strVal);
	    return true;
	    
	}
	
		public static int[][] convertMatrix(String filename) throws 
		WrongMatrixValuesException, WrongMatrixDimensionsException, 
		FileNotFoundException, Exception{
			logger.info("execute convertMatrix filename = {}", filename);
			
			logger.info("validating if file exists");
			if (fileExists(filename) == false) {
				logger.error("FileNotFoundException has been encountered");
				throw new FileNotFoundException();
			}

			logger.info("file exists");
			File file = new File(filename);
			FileReader fr = new FileReader(file);
			StreamTokenizer st = new StreamTokenizer(fr);

			int[] matrixValues = new int[9];
			byte counter = 0;
			int token = st.nextToken();

			logger.info("validation: enters loop");
			while (token != StreamTokenizer.TT_EOF) {
				if (counter == 9) break;
				if (token != StreamTokenizer.TT_NUMBER) {
					logger.error
					("WrongMatrixValuesException has been encountered");
					throw new WrongMatrixValuesException();
				}
				matrixValues[counter] = (int) st.nval;
				token = st.nextToken();
				counter++;
			}

			fr.close();
			logger.info("validation: counter less than 9");
			if (counter < 9) {
				logger.error
				("WrongMatrixDimensionsException has been encountered");
				throw new WrongMatrixDimensionsException();
			}

			int[][] matrix = new int[3][3];
			counter = 0;

			for (int[] row: matrix) {
				for (int i = 0; i < row.length; i++) {
					row[i] = matrixValues[counter];
					counter++;
				}
			}
				logger.info("exit convertMatrix with no errors");
				return matrix;	
		}
		
}
