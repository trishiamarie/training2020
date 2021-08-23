package org.ssglobal.training.codes;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TrapArray {
	
	private static Logger logger = LogManager.getLogger("trapLogger");
	
	public void arrayTransact() throws ElementDecimalException, 
									   ElementCharException, 
									   BadIndexException, 
									   InvalidSizeException, 
									   LetterSizeException, Exception  {
		logger.info("execute arrayTransact()");
	
		logger.info("validation: Traps and manages exceptions in the arrays");
		while (true) {
			
			try (Scanner scan = new Scanner(System.in);) {
				String input = "";
				Integer size = 0;
				System.out.print("Enter size of the Array: ");
				input = scan.nextLine();
				
				size = Integer.parseInt(input.toString());
				
				Integer[] number = new Integer[size];
				int i = 0;
				for(i = 0; i < number.length; i++) {		
					System.out.print("Please Enter the value: ");
					input = scan.nextLine();
					
				try {
						number[i] = Integer.parseInt(input.toString());
				} catch (NumberFormatException e1) {
					logger.error("Error message: {}", e1.getMessage() );
					try {
					Double.parseDouble(input.toString());
					logger.fatal("invalid real number element");
					throw new 
					ElementDecimalException("invalid real number element");
						
					} catch (NumberFormatException e2) {
					logger.error("Error message: {}", e2.getMessage());
							
					logger.info("validation: length of the input equals 1");
					if (input.length() == 1)
								
					logger.fatal("invalid character and string array element");
					throw new ElementCharException
					("invalid character and string array element");
						}
					}	
			}
				
				Integer index = 0;
				System.out.println("Please enter the index for a value: ");
				input = scan.nextLine();
				
				logger.info("validation: input /'E/' outputs /'Goodbye/'");
				if(input.toString().equalsIgnoreCase("E")) {
					System.err.println("Goodbye");
					break;
				}
				
				try {
					index = Integer.parseInt(input.toString());
				} catch(NumberFormatException e) {
				logger.error("Error message: {}", e.getMessage());
					

				logger.fatal
				("invalid index, not within the array range");
				throw new BadIndexException
				("invalid index, not within the array range");
				}
				
				try {
					System.out.printf("The value of index %d is %d\n",
									  index, number[index]);
				} catch(IndexOutOfBoundsException e) {
					logger.error("Error message: {}", e.getMessage());
					
					logger.fatal("invalid index, not within the array range");
					throw new BadIndexException
					("invalid index, not within the array range");
				}
				
				if (size.equals(0)) {
					logger.fatal("invalid letter size");
					throw new InvalidSizeException("invalid letter size");
				}else
					break;
	
			} catch(NumberFormatException e) {
				logger.error("Error message: {}", e.getMessage());
			
				logger.fatal("error letter size");
				throw new LetterSizeException("error letter size");
			}
					
		}
		
		logger.info("exit without errors arrayTransact()");
	}

}
		
