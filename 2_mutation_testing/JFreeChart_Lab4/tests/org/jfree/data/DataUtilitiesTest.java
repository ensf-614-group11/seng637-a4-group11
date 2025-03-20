package org.jfree.data;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jfree.data.KeyedValues;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;

public class DataUtilitiesTest extends DataUtilities {

	private Mockery context_values2d;
	private Values2D mockData_values2d;
	private Mockery context_keyed;
    	private KeyedValues mockData_keyed;
    	private double[] input1;
    	private double[] input2;
    	private double[] input3;
    	private double[] input4;
    	private double[] input5;
    	private double[][] input6;
    	private double[][] input7;
    	private double[][] input8;
    	private double[][] input9;
    	private double[][] input10;
    	private KeyedValues input11;
    	private double[][] input12;
    	private double[][] input13;
    	private int[] validIndicesInput1;

	@Before
	public void setUp() {
		context_values2d = new Mockery(); // used in test case 52, 54, 55, 57
		mockData_values2d = context_values2d.mock(Values2D.class); // used in test case 52, 54, 55, 57, 66, 67
		context_keyed = new Mockery(); // used in test case 48, 49, 51
        	mockData_keyed = context_keyed.mock(KeyedValues.class); // used in test case 48, 49, 51

		input1 = new double[] {1.1, 2.2, 3.3}; // Used in test case 36, 37
        	input2 = new double[] {5.5}; // Used in test case 38
        	input3 = new double[] {}; // Used in test case 39
        	input4 = null; // Used in test case 40
        	input5 = new double[] {Double.MAX_VALUE, Double.MIN_VALUE}; // Used in test case 41
        	input6 = new double[][] {{1.1, 2.2}, {3.3, 4.4}, {5.5, 6.6}}; // Used in test case 42, 43, 58, 59, 61, 62, 63, 64
        	input7 = new double[][] {{5.5}}; // Used in test case 44, 61
        	input8 = new double[][] {}; // Used in test case 45
        	input9 = null; // Used in test case 46, 58, 59, 60
        	input10 = new double[][] {{Double.MAX_VALUE, Double.MIN_VALUE}, {Double.MIN_VALUE, Double.MAX_VALUE}}; // Used in test case 47
        	input11 = null; // Used in test case 50
        	input12 = new double[][] {{1.1, 2.2}, {3.3, 4.4}, {5.5, 5.7}};
        	input13 = new double[][] {input4, input4, input4}; // Used in test case 65
        	validIndicesInput1 = new int[] {0, 1}; // Used in test case 66, 67
	}

	// Test case 36: Test that each element in the array is not null
    	@Test
    	public void testCreateNumberArray_ElementsNotNull() {
        	Number[] result = DataUtilities.createNumberArray(input1);

        	assertNotNull("Resulting array should not be null", result);
        	for (int i = 0; i < result.length; i++) {
            		assertNotNull("Element at index " + i + " should not be null", result[i]);
        	}
    	}

	// Test case 37: Test that each element matches the expected value
    @Test
    public void testCreateNumberArray_ValuesEqual() {
		Number[] result = DataUtilities.createNumberArray(input1);

		try {
	    		for (int i = 0; i < input1.length; i++) {
				assertEquals("Element at index " + i + " should match input", input1[i], result[i].doubleValue(), 0.0001);
	    		}
		} catch (NullPointerException e) {
	    		fail("Test failed: Null value encountered in result array.");
		} catch (AssertionError e) {
	    		fail("Test failed: Value mismatch detected.");
		}
    }

	// Test Case 38: Test createNumberArray with a single-element array
	@Test
	public void testCreateNumberArray_SingleElement() {
	    Number[] result = DataUtilities.createNumberArray(input2);

	    // Then: check that the output array is not null
	    assertNotNull("Resulting array should not be null", result);

	    // Check that the array has exactly one element
	    assertEquals("Array length should be 1", input2.length, result.length);

	    // Check that the single element is not null and matches the expected value
	    assertNotNull("Element at index 0 should not be null", result[0]);
	    assertEquals("Element at index 0 should match input", input2[0], result[0].doubleValue(), 0.0001);
	}

	// Test Case 39: Test createNumberArray with an empty array
	@Test
	public void testCreateNumberArray_EmptyArray() {
	    Number[] result = DataUtilities.createNumberArray(input3);

	    // Then: check that the output array is not null
	    assertNotNull("Resulting array should not be null", result);

	    // Check that the array length is 0
	    assertEquals("Array length should be 0", 0, result.length);
	}
	
	// Test Case 40: Test createNumberArray with a null input array
	@Test
	public void testCreateNumberArray_NullInput() {
	    try {
	        // When: calling createNumberArray
	        DataUtilities.createNumberArray(input4);
	        fail("Expected InvalidParameterException to be thrown");
	    } catch (InvalidParameterException e) {
	        // Then: Verify the exception message (if needed)
	        assertEquals("Input data array cannot be null", e.getMessage());
	    } catch (Exception e) {
	        // If any other exception is thrown, fail the test
	        fail("Unexpected exception thrown: " + e.getClass().getName());
	    }
	}
	
	// Test Case 41: Test createNumberArray with extremely large and small values
	@Test
	public void testCreateNumberArray_LargeSmallValues() {
	    Number[] result = DataUtilities.createNumberArray(input5);

	    // Then: check that the output array is not null
	    assertNotNull("Resulting array should not be null", result);

	    // Check that the output length matches the expected length
	    assertEquals("Array length should be 2", input5.length, result.length);

	    // Iterate through each element to check for null and correctness
	    for (int i = 0; i < input5.length; i++) {
	        assertNotNull("Element at index " + i + " should not be null", result[i]);
	        assertEquals("Element at index " + i + " should match input", input5[i], result[i].doubleValue(), 0.0001);
	    }
	}


	// Test case 42: Test that each element in the array of arrays is not null
	@Test
	public void testCreateNumberArray2D_ElementsNotNull() {
	    Number[][] result = DataUtilities.createNumberArray2D(input6);

	    // Then: check that the output array itself is not null
	    assertNotNull("Resulting array should not be null", result);
	    
	    for (int i = 0; i < result.length; i++) {
	        assertNotNull("Row " + i + " should not be null", result[i]);     
	        for (int j = 0; j < result[i].length; j++) {
	            assertNotNull("Element at position [" + i + "][" + j + "] should not be null", result[i][j]);
	        }
	    }
	}
	
	// Test case 43: Test that each element matches the expected value
	@Test
	public void testCreateNumberArray2D_ValuesEqual() {
	    Number[][] result = DataUtilities.createNumberArray2D(input6);

	    try {
	        for (int i = 0; i < input6.length; i++) {
	            for (int j = 0; j < input6[i].length; j++) {
	                assertEquals("Element at position [" + i + "][" + j + "] should match input", 
	                    input6[i][j], result[i][j].doubleValue(), 0.0001);
	            }
	        }
	    } catch (NullPointerException e) {
	        fail("Test failed: Null value encountered in result array.");
	    } catch (AssertionError e) {
	        fail("Test failed: Value mismatch detected.");
	    }
	}

	// Test Case 44: Test createNumberArray2D with a single-element 2D array
	@Test
	public void testCreateNumberArray2D_SingleElement() {
	    Number[][] result = DataUtilities.createNumberArray2D(input7);

	    // Then: check that the output array is not null
	    assertNotNull("Resulting array should not be null", result);

	    // Check that the outer array has exactly one row
	    assertEquals("Number of rows should be 1", input7.length, result.length);

	    // Check that the inner array has exactly one element
	    assertEquals("Number of columns in row 0 should be 1", input7[0].length, result[0].length);

	    // Check that the single element is not null and matches the expected value
	    assertNotNull("Element at position [0][0] should not be null", result[0][0]);
	    assertEquals("Element at position [0][0] should match input", input7[0][0], result[0][0].doubleValue(), 0.0001);
	}

	// Test Case 45: Test createNumberArray2D with an empty 2D array
	@Test
	public void testCreateNumberArray2D_EmptyArray() {
	    Number[][] result = DataUtilities.createNumberArray2D(input8);

	    // Then: check that the output array is not null
	    assertNotNull("Resulting array should not be null", result);

	    // Check that the array length is 0
	    assertEquals("Array length should be 0", 0, result.length);
	}

	// Test Case 46: Test createNumberArray2D with a null 2D array
	@Test
	public void testCreateNumberArray2D_NullInput() {
	    try {
	        // When: calling createNumberArray2D
	        DataUtilities.createNumberArray2D(input9);
	        fail("Expected InvalidParameterException to be thrown");
	    } catch (InvalidParameterException e) {
	        // Then: Verify the exception message
	        assertEquals("Input data array cannot be null", e.getMessage());
	    } catch (Exception e) {
	        // If any other exception is thrown, fail the test
	        fail("Unexpected exception thrown: " + e.getClass().getName());
	    }
	}

	// Test Case 47: Test createNumberArray2D with extremely large and small values
	@Test
	public void testCreateNumberArray2D_LargeSmallValues() {
	    Number[][] result = DataUtilities.createNumberArray2D(input10);

	    // Then: check that the output array is not null
	    assertNotNull("Resulting array should not be null", result);

	    // Check that the output array has the same dimensions as the input array
	    assertEquals("Number of rows should match", input10.length, result.length);
	    assertEquals("Number of columns in row 0 should match", input10[0].length, result[0].length);

	    // Iterate through each element to check for null and correctness
	    for (int i = 0; i < input10.length; i++) {
	        for (int j = 0; j < input10[i].length; j++) {
	            assertNotNull("Element at position [" + i + "][" + j + "] should not be null", result[i][j]);
	            assertEquals("Element at position [" + i + "][" + j + "] should match input", input10[i][j], result[i][j].doubleValue(), 0.0001);
	        }
	    }
	}

	// Test Case 48: Test getCumulativePercentages with regular data
	@Test
	public void testGetCumulativePercentages_ValidData() {
	    context_keyed.checking(new Expectations() {{
	        // Mocking the getKeys method to return the keys in order
	        allowing(mockData_keyed).getKeys();
	        will(returnValue(Arrays.asList(0, 1, 2)));

	        // Mocking getValue for each key
	        allowing(mockData_keyed).getValue(0);
	        will(returnValue(5.0));
	        allowing(mockData_keyed).getValue(1);
	        will(returnValue(9.0));
	        allowing(mockData_keyed).getValue(2);
	        will(returnValue(2.0));

	        // Mocking getItemCount to return the number of items (3 in this case)
	        allowing(mockData_keyed).getItemCount();
	        will(returnValue(3));
	        
	        // Mocking getKey for each index, this is where you explicitly mock the getKey method
	        allowing(mockData_keyed).getKey(0);
	        will(returnValue(0));
	        allowing(mockData_keyed).getKey(1);
	        will(returnValue(1));
	        allowing(mockData_keyed).getKey(2);
	        will(returnValue(2));
	    }});

	    KeyedValues result = DataUtilities.getCumulativePercentages(mockData_keyed);

	    assertNotNull("Resulting KeyedValues should not be null", result);
	    
	    // Since the keys are 0, 1, 2, we can directly check based on these keys
	    assertEquals("First cumulative percentage should be 0.3125", 0.3125, result.getValue(0).doubleValue(), 0.0001);
	    assertEquals("Second cumulative percentage should be 0.875", 0.875, result.getValue(1).doubleValue(), 0.0001);
	    assertEquals("Third cumulative percentage should be 1.0", 1.0, result.getValue(2).doubleValue(), 0.0001);
	}
	
	// Test Case 49: Keyed value pair with 0, negative number, and floating point value
	@Test
	public void testGetCumulativePercentages_ZeroNegativeAndFloatingValues() {
	    context_keyed.checking(new Expectations() {{
	        // Mocking the getKeys method to return the keys in order
	        allowing(mockData_keyed).getKeys();
	        will(returnValue(Arrays.asList(0, 1, 2)));

	        // Mocking getValue for each key (including 0, negative, and floating point values)
	        allowing(mockData_keyed).getValue(0);
	        will(returnValue(0.0));  // Zero value
	        allowing(mockData_keyed).getValue(1);
	        will(returnValue(-4.5)); // Negative value
	        allowing(mockData_keyed).getValue(2);
	        will(returnValue(3.2));  // Floating point value

	        // Mocking getItemCount to return the number of items (3 in this case)
	        allowing(mockData_keyed).getItemCount();
	        will(returnValue(3));

	        // Mocking getKey for each index, as done in the previous test
	        allowing(mockData_keyed).getKey(0);
	        will(returnValue(0));
	        allowing(mockData_keyed).getKey(1);
	        will(returnValue(1));
	        allowing(mockData_keyed).getKey(2);
	        will(returnValue(2));
	    }});

	    KeyedValues result = DataUtilities.getCumulativePercentages(mockData_keyed);

	    assertNotNull("Resulting KeyedValues should not be null", result);

	    // Calculating expected cumulative percentages:
	    // Total sum of values = 0.0 + (-4.5) + 3.2 = -1.3
	    // Cumulative percentages would be calculated as:
	    // 1st value: (0.0 / -1.3) = 0.0
	    // 2nd value: (-4.5 / -1.3) = 3.46153846 (rounded to 0.0001 precision)
	    // 3rd value: (0.0 + (-4.5) + 3.2) / -1.3 = -1.3 / -1.3 = 1.0

	    assertEquals("First cumulative percentage should be 0.0", 0.0, result.getValue(0).doubleValue(), 0.0001);
	    assertEquals("Second cumulative percentage should be 3.4615", 3.4615, result.getValue(1).doubleValue(), 0.0001);
	    assertEquals("Third cumulative percentage should be 1.0", 1.0, result.getValue(2).doubleValue(), 0.0001);
	}
	
	// Test Case 50: Test getCumulativePercentages with null input
	@Test
	public void testGetCumulativePercentages_NullInput() {
	    try {
	        // When: calling getCumulativePercentages with a null input
	        DataUtilities.getCumulativePercentages(input11);
	        
	        // Then: we expect an InvalidParameterException to be thrown
	        fail("Expected InvalidParameterException to be thrown");
	    } catch (InvalidParameterException e) {
	        // Verify the exception message
	        assertEquals("Input data cannot be null", e.getMessage());
	    } catch (Exception e) {
	        // If any other exception is thrown, fail the test
	        fail("Unexpected exception thrown: " + e.getClass().getName());
	    }
	}  

	// Test Case 51: Empty KeyedValues input
	@Test
	public void testGetCumulativePercentages_EmptyKeyValues() {
	    context_keyed.checking(new Expectations() {{
	        // Mocking the getKeys method to return an empty list
	        allowing(mockData_keyed).getKeys();
	        will(returnValue(Collections.emptyList()));

	        // Mocking getItemCount to return 0 since there are no items
	        allowing(mockData_keyed).getItemCount();
	        will(returnValue(0));
	    }});

	    // When: Calling getCumulativePercentages with an empty dataset
	    KeyedValues result = DataUtilities.getCumulativePercentages(mockData_keyed);

	    // Then: The result should not be null but should be empty
	    assertNotNull("Resulting KeyedValues should not be null", result);
	    assertEquals("Result should have zero items", 0, result.getItemCount());
	}

	// Test Case 52: Valid data, valid column index
	@Test
	public void testCalculateColumnTotalValidDataAndColumn() {
		context_values2d.checking(new Expectations() {
			{
				allowing(mockData_values2d).getRowCount();
				will(returnValue(2));
				allowing(mockData_values2d).getColumnCount();
				will(returnValue(2));
				allowing(mockData_values2d).getValue(0, 1);
				will(returnValue(2.0));
				allowing(mockData_values2d).getValue(1, 1);
				will(returnValue(4.0));
			}
		});

		double result = DataUtilities.calculateColumnTotal(mockData_values2d, 1);
		assertEquals(6.0, result, 0.0001);
	}

	// Test Case 53: Null Values2D data object
	@Test
	public void testCalculateColumnTotalInvalidDataAndValidColumn() {
		try {
			double result = DataUtilities.calculateColumnTotal(null, 0);
			// If no exception is thrown, the test should fail
			fail("Expected InvalidParameterException but no exception was thrown.");
		} catch (InvalidParameterException e) {
			// Test passes because the correct exception was thrown
			assertEquals("Input data cannot be null", e.getMessage());
		} catch (Exception e) {
			// Test fails because the wrong exception was thrown
			fail("Expected InvalidParameterException but got " + e.getClass().getSimpleName());
		}
	}

	// Test Case 54: Valid Values2D data object but invalid column index (negative)
	@Test
	public void testCalculateColumnTotalValidDataAndInvalidColumn() {
		context_values2d.checking(new Expectations() {
			{
				allowing(mockData_values2d).getRowCount();
				will(returnValue(2));
				allowing(mockData_values2d).getColumnCount();
				will(returnValue(2));
				allowing(mockData_values2d).getValue(0, 1);
				will(returnValue(2.0));
				allowing(mockData_values2d).getValue(1, 1);
				will(returnValue(4.0));
				allowing(mockData_values2d).getValue(0, 0);
				will(returnValue(1.0));
				allowing(mockData_values2d).getValue(1, 0);
				will(returnValue(3.0));

				allowing(mockData_values2d).getValue(0, -10);
				will(throwException(new IndexOutOfBoundsException("Invalid column index")));

				allowing(mockData_values2d).getValue(1, -10);
				will(throwException(new IndexOutOfBoundsException("Invalid column index")));
				// Javadoc specifies invalid columns in the getValue function in Values2D
				// throws an IndexOutOfBoundsException.
				// Therefore this behaviour will be simulated with the mock.
			}
		});

		try {
			double result = DataUtilities.calculateColumnTotal(mockData_values2d, -10);
			assertEquals(0.0, result, 0.0001);
		} catch (Exception e) {
			fail("Expected to return 0 but got a " + e.getClass().getSimpleName());
		}
	}
	
	

	// Test Case 55: Test valid Values2D data object and valid row index
	@Test
	public void testCalculateRowTotalValidDataAndRow() {
		context_values2d.checking(new Expectations() {
			{
				allowing(mockData_values2d).getRowCount();
				will(returnValue(2));
				allowing(mockData_values2d).getColumnCount();
				will(returnValue(2));
				allowing(mockData_values2d).getValue(0, 1);
				will(returnValue(2.0));
				allowing(mockData_values2d).getValue(1, 1);
				will(returnValue(4.0));
				allowing(mockData_values2d).getValue(0, 0);
				will(returnValue(1.0));
				allowing(mockData_values2d).getValue(1, 0);
				will(returnValue(3.0));
			}
		});

		double result = DataUtilities.calculateRowTotal(mockData_values2d, 1);
		assertEquals(7.0, result, 0.0001);
	}

	// Test Case 56: Test invalid Values2D data object and valid row index
	@Test
	public void testCalculateRowTotalInvalidDataAndValidRow() {
		try {
			double result = DataUtilities.calculateRowTotal(null, 1);
			// If no exception is thrown, the test should fail
			fail("Expected InvalidParameterException but no exception was thrown.");
		} catch (InvalidParameterException e) {
			// Test passes because the correct exception was thrown
			assertEquals("Input data cannot be null", e.getMessage());
		} catch (Exception e) {
			// Test fails because the wrong exception was thrown
			fail("Expected InvalidParameterException but got " + e.getClass().getSimpleName());
		}
	}

	// Test Case 57: Test valid Values2D data object and invalid row index
	@Test
	public void testCalculateRowTotalValidDataAndInvalidRow() {

		context_values2d.checking(new Expectations() {
			{
				allowing(mockData_values2d).getRowCount();
				will(returnValue(2));
				allowing(mockData_values2d).getColumnCount();
				will(returnValue(2));
				allowing(mockData_values2d).getValue(0, 1);
				will(returnValue(2.0));
				allowing(mockData_values2d).getValue(1, 1);
				will(returnValue(4.0));
				allowing(mockData_values2d).getValue(0, 0);
				will(returnValue(1.0));
				allowing(mockData_values2d).getValue(1, 0);
				will(returnValue(3.0));

				allowing(mockData_values2d).getValue(-10, 0);
				will(throwException(new IndexOutOfBoundsException("Invalid column index")));

				allowing(mockData_values2d).getValue(-10, 1);
				will(throwException(new IndexOutOfBoundsException("Invalid column index")));
				// Javadoc specifies invalid rows in the getValue function in Values2D
				// throws an IndexOutOfBoundsException.
				// Therefore this behaviour will be simulated with the mock.
			}
		});

		try {
			double result = DataUtilities.calculateRowTotal(mockData_values2d, -10);
			assertEquals(0.0, result, 0.0001);
		} catch (Exception e) {
			fail("Expected to return 0 but got a " + e.getClass().getSimpleName());
		}
	}
	
	// ******Testing Equal Method*****
	// Test case 58: Test equals method for when double array a is null
	@Test
	public void testEqualsMethod_nullA() {
    	boolean equal = DataUtilities.equal(input9, input6);

    	assertEquals(false, equal);
	}
	
	// Test case 59: Test equals method for when double array b is null
	@Test
	public void testEqualsMethod_nullB() {
	    boolean equal = DataUtilities.equal(input6, input9);

	    assertEquals(false, equal);
	}
	
	// Test case 60: Test equals method for when double array a and b is null
	@Test
	public void testEqualsMethod_nullA_nullB() {
		boolean equal = DataUtilities.equal(input9, input9);

		assertEquals(true, equal);
	}
	
	// Test case 61: Test equals method for when a and b are different lengths
	@Test
	public void testEqualsMethod_A_and_B_different_lengths() {
		boolean equal = DataUtilities.equal(input6, input7);

		assertEquals(false, equal);
	}
	
	// Test case 61: Test equals method for when a and b are the same length but different.
	@Test
	public void testEqualsMethod_A_B_sameLengthButDifferent() {
		boolean equal = DataUtilities.equal(input6,  input12);
		
		assertEquals(false, equal);
	}
	
	// Test case 62: Test equals method for a and b when they are the equal
	@Test
	public void testEqualsMethod_A_B_whenTheyAreTheSame() {
		boolean equal = DataUtilities.equal(input6,  input6);
		assertEquals(true, equal);
	}
	
	
	// ******* TESTING CLONE METHOD ********
	
	// Test case 63: Test clone method creates a double[][] that is equal to original.
	@Test
	public void testCloneMethod() {
		double[][] cloned = DataUtilities.clone(input6);
		
		boolean equal = DataUtilities.equal(cloned,  input6);
		
		assertEquals(true, equal);
	}
	
	// Test case 64: Test clone method is creating a deep copy and not shallow copy.
	@Test
	public void testCloneMethodDeepCopy() {
		double[][] cloned = DataUtilities.clone(input6);
		
		boolean equal = (cloned == input6);
		
		assertEquals(false, equal);
	}
	
	// Test case 65: Test clone method with double[][] array of nulls.
	@Test
	public void testCloneMethodWithNull() {
		try {
			double[][] cloned = DataUtilities.clone(input13);
				
			boolean equal = DataUtilities.equal(cloned,  input13);
				
			assertEquals(true, equal);
		}catch(Exception e) {
			fail("Expected to return true but got a " + e.getClass().getSimpleName());
		}
	}
	
	// ********** Testing overloaded calculateRowTotal and calculateColumnTotal methods ***********
	
	// Test Case 66: Test overloaded CalculateColumnTotal method with additional int[] argument.
	@Test
	public void testCalculateColumnTotalOverloadedMethod() {
		context_values2d.checking(new Expectations() {
			{
				allowing(mockData_values2d).getRowCount();
				will(returnValue(2));
				allowing(mockData_values2d).getColumnCount();
				will(returnValue(2));
				allowing(mockData_values2d).getValue(0, 1);
				will(returnValue(2.0));
				allowing(mockData_values2d).getValue(1, 1);
				will(returnValue(4.0));
			}
		});

		double result = DataUtilities.calculateColumnTotal(mockData_values2d, 1, validIndicesInput1);
		assertEquals(6.0, result, 0.0001);
	}

	// Test Case 67: Test overloaded CalculateRowTotal method.
	@Test
	public void testCalculateRowTotalOverloadedMethod() {
		context_values2d.checking(new Expectations() {
			{
				allowing(mockData_values2d).getRowCount();
				will(returnValue(2));
				allowing(mockData_values2d).getColumnCount();
				will(returnValue(2));
				allowing(mockData_values2d).getValue(0, 1);
				will(returnValue(2.0));
				allowing(mockData_values2d).getValue(1, 1);
				will(returnValue(4.0));
				allowing(mockData_values2d).getValue(0, 0);
				will(returnValue(1.0));
				allowing(mockData_values2d).getValue(1, 0);
				will(returnValue(3.0));
			}
		});

		double result = DataUtilities.calculateRowTotal(mockData_values2d, 1, validIndicesInput1);
		assertEquals(7.0, result, 0.0001);
	}
				

	@After
	public void tearDown() {
		context_values2d = null;
		mockData_values2d = null; 
		context_keyed = null;
        	mockData_keyed = null;
        
        	input1 = null;
        	input2 = null;
        	input3 = null;
        	input4 = null;
        	input5 = null;
        	input6 = null;
        	input7 = null;
        	input8 = null;
        	input9 = null; 
        	input10 = null;
        	input11 = null;
	}

	@AfterClass
	public static void afterAllTests() {
		// Not Required
	}

}
