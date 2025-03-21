package org.jfree.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RangeTest {
    private Range exampleRange;
    private Range exampleRange2;
    private Range exampleRange3;
    private Range exampleRange4;
    private Range exampleRange5; 
    private Range exampleRange6; 
    private Range exampleRange7; 
    private Range exampleRange8;
    private Range exampleRange9;
    private Range exampleRange10;
    private Range exampleRange11;  
    private Range exampleRange12; 
    private Range exampleRange13; 
    private Range exampleRange14; 
    private Range exampleRange15; 
    private Range exampleRange16; 
    private Range exampleRange17; 
    private Range exampleRange18; 
    private Range exampleRange19; 
    private Range exampleRange20; 
    private Range exampleRange21;
    private Range exampleRange22;
    private Range exampleRange23;
    private Range exampleRange24;
    private Range exampleRange25;
	private Range exampleRange26;
    private Range exampleRange27;
    private Range exampleRange28;
    private Range exampleRange29;
	private Range exampleRange30;
	private Range exampleRange31;
	private Range exampleRange32;
	private Range exampleRange33;
	private Range exampleRange34;
	private Range exampleRange35;
	private Range exampleRange36;
	private Range exampleRange37;
	private Range exampleRange38;
	private Range exampleRange39;
	private Range exampleRange40;
	private Range exampleRange41;
	private Range exampleRange42;
	private Range exampleRange43;
	private Range exampleRange44;
	private Range exampleRange45;
	private Range exampleRange46;
	private Range exampleRange47;
	private Range exampleRange48;
	private Range exampleRange49;
	private Range exampleRange50;
	private Range exampleRange51;
	private Range exampleRange52;
	private Range exampleRange53;
    private Object exampleObject; 
   

    
    @BeforeClass public static void setUpBeforeClass() throws Exception {
    }


    @Before
    public void setUp() throws Exception { 
    	exampleRange = new Range(-1, 1); //Range variable for example test from Section 2.1 of the Assignment Instructions 
    	exampleRange2 = new Range(5.5, 10.5); // Range variable for tests 1, 2, 3, 4, 5, 76, 87, 88, 89, 90, 91, 92, 93, 95, 97, 98, 104, 105, 106, 119
    	exampleRange3 = new Range(15.0, 25.0); // Range variable for tests 7, 8, 103
    	exampleRange4 = new Range(10.0, 17.5); // Range variable for tests 9, 92
    	exampleRange5 = new Range(0.5, 35.0); // Range variable for test 9
    	exampleRange6 = new Range(-10.5, 5.5); // Range variable for test 10, 121
        exampleRange7 = new Range(45.5, 75.5); // Range variable for tests 10, 68, 72, 121
        exampleRange8 = new Range(-10.5, 75.5); // Range variable for tests 10, 69
        exampleRange9 = new Range(2.9, 6.1); // Range variable for tests 11, 80
        exampleRange10 = new Range(2.9, 5.1); // Range variable for tests 12, 13, 81, 82
        exampleRange11 = new Range(1.0, 3.0); // Range variable for tests 14, 83
        exampleRange12 = new Range(1.0, 4.0); // Range variable for tests 15, 16, 84, 85, 123
        exampleRange13 = new Range(3.0, 3.0); // Range variable for tests 17, 86, 122
        exampleRange14 = new Range(0.0, 0.0); // Range variable for tests 19, 20, 70, 74, 114
        exampleRange15 = new Range(1.0, 1.0); // Range variable for tests 19, 78, 102
        exampleRange16 = new Range(-1.0, -1.0); // Range variable for test 20
        exampleRange17 = new Range(1.0, 5.0); // Range variable for tests 21, 23, 24, 124, 125, 126, 127, 128, 129
        exampleRange18 = new Range(3.0, 7.0); // Range variable for test 21
        exampleRange19 = new Range(-7.0, -3.0); // Range variable for tests 22, 41, 45, 73, 77, 146
        exampleRange20 = new Range(0.0, 3.9);  // Range variable for test 23
        exampleRange21 = new Range(-0.1, 3.9); // Range variable for test 24
        exampleRange22 = new Range(-3.9, 0.0); // Range variable for test 25
        exampleRange23 = new Range(-3.9, 0.1); // Range variable for test 26
        exampleRange24 = new Range(0.0, 0.0); // Range variable for test 30
		exampleRange25 = new Range(Double.MAX_VALUE / 2, Double.MAX_VALUE); // Range variable for test 27
        exampleRange26 = new Range(Double.MAX_VALUE, Double.MAX_VALUE + Double.MAX_VALUE / 2); // Range variable for test 27
        exampleRange27 = new Range(Double.MIN_VALUE, Double.MIN_VALUE * 2); // Range variable for test 28
        exampleRange28 = new Range(Double.MIN_VALUE + Double.MIN_VALUE, Double.MIN_VALUE * 2 + Double.MIN_VALUE); // Range variable for test 28
        exampleRange29 = new Range(Double.NaN, Double.NaN); // Range variable for test 35, 97, 98, 99, 100, 101, 145
		exampleRange30 = new Range(-5.0, -1.0); // Range variable for test 22
		exampleRange31 = new Range(3.0, 5.0); // Range variable for tests 81, 82
		exampleRange32 = new Range(3.1, 5.0); // Range variable for test 83
		exampleRange33 = new Range(4.0, 6.0); // Range variable for test 84
		exampleRange34 = new Range(0.0, 1.0); // Range variable for test 85
		exampleRange35 = new Range(3.0, 3.0); // Range variable for test 86, 105
		exampleRange36 = new Range(5.5, 17.5); // Range variable for test 92
		exampleRange37 = new Range(5.0, Double.NaN); // Range variable for test 95, 96, 144
		exampleRange38 = new Range(5.0, 10.5); // Range variable for test 95, 96, 104, 119
		exampleRange39 = new Range(Double.NaN, 10.5); // Range variable for test 96, 145
		exampleRange40 = new Range(5.0, 10.0); // Range variable for test 107, 108, 109, 110, 111, 112, 113, 114, 115, 117, 118
		exampleRange41 = new Range(0.0, 10.0); // Range variable for test 107, 153
		exampleRange42 = new Range(5.0, 15.0); // Range variable for test 108, 120, 142
		exampleRange43 = new Range(2.5, 12.5); // Range variable for test 109
		exampleRange44 = new Range(5.0, 7.5); //Range variable for test 110, 120
		exampleRange45 = new Range(7.5, 15.0); //Range variable for test 112
		exampleRange46 = new Range(2.5, 5.0); //Range variable for test 115
		exampleRange47 = new Range(5.0, 10.0); // Range variable for test 118
		exampleRange48 = new Range(3.0, 5.0); // Range variable for test 131
		exampleRange49 = new Range(-5.0, 5.0); // Range variable for test 154
        exampleRange50 = new Range(1.0, 1.0); // Range variable for test 155
        exampleRange51 = new Range(-20.0, -10.0);// range variable for test 157
        exampleRange52 = new Range(1000000.0, 2000000.0); // range variable for test 158 
        exampleRange53 = new Range(0.1, 0.3); // range variable for test 159 
        
        exampleObject = new Object();
    }

    // Example Test from Section 2.1 of the Assignment Instructions 
    @Test
    public void centralValueShouldBeZero() {
        assertEquals("The central value of -1 and 1 should be 0",
        0, exampleRange.getCentralValue(), .000000001d);
    }
    // ================== contains Method Tests ==================
    
    // Test Case 1: Test method contains(double value) with the partition of value between lower and upper (within the range) 
    // The value tested is 0.1 larger than the value of lower in the range, therefore this is also testing a boundary condition of being within the range
    @Test
    public void testContains_ValueWithinRange() {
    	assertTrue("Value 5.6 should be within (5.5, 10.5)", exampleRange2.contains(5.6));
    }
    
    // Test Case 2: Test method contains(double value) with the partition of value within the range, and value is equal to lower
    // This is testing a boundary condition where value is equal to lower 
    @Test
    public void testContains_ValueEqualtoLower() {
    	assertTrue("Value 5.5 should be within (5.5, 10.5)", exampleRange2.contains(5.5));
    }
    
    // Test Case 3: Test method contains(double value) with the partition of value within the range, and value is equal to upper 
    // This is testing a boundary condition where value is equal to upper 
    @Test
    public void testContains_ValueEqualtoUpper() {
    	assertTrue("Value 10.5 should be within (5.5, 10.5)", exampleRange2.contains(10.5));
    }
    
    // Test Case 4: Test method contains(double value) with the partition of value below range 
    // The value tested is 0.1 smaller than the value of lower in the range, therefore this is also testing a boundary condition of being below the range
    @Test
    public void testContains_ValueBelowRange() {
    	assertFalse("Value 5.4 should not be within (5.5, 10.5)", exampleRange2.contains(5.4));
    }
    
    // Test Case 5: Test method contains(double value) with the partition of value above range
    // The value test is 0.1 larger than the value of upper in the range, therefore this is also testing a boundary condition of being above the range 
    @Test
    public void testContains_ValueAboveRange() {
    	assertFalse("Value 10.6 should not be within (5.5, 10.5)", exampleRange2.contains(10.6));
    }
    
    // ================== combine Method Tests ==================
    
    // Test Case 6: Test method combine(Range range1, Range range2) for the partition in which range1 and range2 are both null
    @Test
    public void testCombine_BothRangesNull() {
    	assertNull("Combined range of null and null should be null", Range.combine(null, null));
    }
    
    // Test Case 7: Test method combine(Range range1, Range range2) for the partition in which range1 is null and range2 is non-null 
    @Test
    public void testCombine_Range1NullRange2NonNull() {
    	assertEquals("Combined range of (15.0, 25.0) and null should be equal to (15.0, 25.0)", exampleRange3, Range.combine(null, exampleRange3));
    }
  
    
    // Test Case 8: Test method combine(Range range1, Range range2) for the partition in which range1 is non-null and range2 is null
    @Test
    public void testCombine_Range1NonNullRange2Null() {
    	assertEquals("Combined range of null and (15.0, 25.0) should be equal to (15.0, 25.0)", exampleRange3, Range.combine(exampleRange3, null));
    }
  
    
    // Test Case 9: Test method combine(Range range1, Range range2) for the partition in which range1 and range2 are both non-null 
    // This also tests a boundary condition where range1 is completely within range2
    @Test
    public void testCombine_Range1WithinRange2() {
    	assertEquals("Combined range of (0.5, 35.0) and (10.0, 17.5) should be equal to (0.5, 35.0)", exampleRange5, Range.combine(exampleRange4, exampleRange5));
    }
   
    
    // Test Case 10: Test method combine(Range range1, Range range2) for the partition in which range1 and range2 are both non-null
    // This also tests a boundary condition where and range1 and range2 do not overlap at all (upper of range1 is less than lower of range2) 
    @Test
    public void testCombine_Range1AndRange2DoNotOverlap() {
    	// This test originally resulted in an error due to an Illegal Argument Exception, therefore a try/catch was added to allow the test to gracefully fail 
    	try {
    		assertEquals("Combined range of (-10.5, 5.5) and (45.5, 75.5) should be (-10.5, 75.5)", exampleRange8, Range.combine(exampleRange6, exampleRange7));
    	} catch (IllegalArgumentException e) {
    	fail("Exception should not be thrown, but Illegal Argument Exception was thrown: " + e.getMessage());
    	}	
    }
    
    // ================== intersects(double lower, double upper) Method Tests ==================

    // Test Case 11: Test method intersects(double lower, double upper) for the partition where lower > upper
    // This tests the boundary condition where lower must be <= upper, and an exception is expected
	@Test
	public void testIntersects_LowerGreaterThanUpper() {
	    try {
	        exampleRange9.intersects(5.0, 3.0); 
	        fail("Expected IllegalArgumentException but no exception was thrown.");
	    } catch (IllegalArgumentException e) {
	        assertEquals("Lower bound must be less than or equal to upper bound.", e.getMessage()); 
	    } catch (Exception e) {
	        fail("Expected IllegalArgumentException but got " + e.getClass().getSimpleName());
	        }
	    }
    
	 // Test Case 12: Test method intersects(double lower, double upper) for the partition where there is full overlap
	 // This tests the condition where the specified range fully overlaps with the range object
	 @Test
	 public void testIntersects_FullOverlap() {
	     assertTrue("The range (2.9, 5.1) should fully overlap with (3.0, 5.0)",
	                exampleRange10.intersects(3.0, 5.0));
	 }
	
	 // Test Case 13: Test method intersects(double lower, double upper) for the partition where there is partial overlap
	 // This tests the condition where the specified range partially overlaps with the range object
	 @Test
	 public void testIntersects_PartialOverlap() {
	     assertTrue("The range (2.9, 5.1) should partially overlap with (3.0, 5.0)",
	                exampleRange10.intersects(3.0, 5.0));
	 }
	
	 // Test Case 14: Test method intersects(double lower, double upper) for the partition where there is no overlap
	 // This tests the condition where the specified range does not overlap with the range object
	 @Test
	 public void testIntersects_NoOverlap() {
	     assertFalse("The range (1.0, 3.0) should not overlap with (3.1, 5.0)",
	                 exampleRange11.intersects(3.1, 5.0));
	 }
	
	 // Test Case 15: Test method intersects(double lower, double upper) for the partition where the lower boundary touches
	 // This tests the boundary condition where the lower bound of the specified range touches the upper bound of the range object
	 @Test
	 public void testIntersects_TouchingLowerBoundary() {
	     assertTrue("The range (1.0, 4.0) should touch the lower boundary of (4.0, 6.0)",
	                exampleRange12.intersects(4.0, 6.0));
	 }
	
	 // Test Case 16: Test method intersects(double lower, double upper) for the partition where the upper boundary touches
	 // This tests the boundary condition where the upper bound of the specified range touches the lower bound of the range object
	 @Test
	 public void testIntersects_TouchingUpperBoundary() {
	     assertTrue("The range (1.0, 4.0) should touch the upper boundary of (0.0, 1.0)",
	                exampleRange12.intersects(0.0, 1.0));
	 }
	
	 // Test Case 17: Test method intersects(double lower, double upper) for the partition where both ranges are a single point
	 // This tests the condition where both the range object and the specified range are single-point ranges
	 @Test
	 public void testIntersects_RangeEqualToPoint() {
	     assertTrue("The range (3.0, 3.0) should intersect with (3.0, 3.0)",
	                exampleRange13.intersects(3.0, 3.0));
	 }
	
	// ================== shift Method Tests ==================
	
	// Test Case 18: Test method shift(Range base, double delta, boolean allowZeroCrossing) for the partition where base is null
	@Test
	public void testShift_RangeWithNaN() {
	    Range nanRange = new Range(Double.NaN, 5.0);
	    Range shiftedRange = Range.shift(nanRange, 1.0, true);
	    assertTrue("Shifted range should contain NaN",
	            Double.isNaN(shiftedRange.getLowerBound()));
	}
	
	// Test Case 19: Test method shift(Range base, double delta) for the partition where the base range is a zero-length range and delta is positive
    // This test case was modified to remove the additional argument for allowZeroCrossing to test method shift(Range base, double delta)
    @Test
    public void testShift_ZeroRangePositiveDelta() {
        Range shiftedRange = Range.shift(exampleRange14, 1.0);
        assertEquals("The shifted range of (0.0, 0.0) with delta 1.0 should be (1.0, 1.0)",
                exampleRange15, shiftedRange);
    }
	
    // Test Case 20: Test method shift(Range base, double delta) for the partition where the base range is a zero-length range and delta is negative
    // This test case was modified to remove the additional argument for allowZeroCrossing to test method shift(Range base, double delta)
    @Test
    public void testShift_ZeroRangeNegativeDelta() {
        Range shiftedRange = Range.shift(exampleRange14, -1.0);
        assertEquals("The shifted range of (0.0, 0.0) with delta -1.0 should be (-1.0, -1.0)",
                exampleRange16, shiftedRange);
    }
	
	// Test Case 21: Test method shift(Range base, double delta, boolean allowZeroCrossing) for the partition where the base range is fully positive and delta is positive
	@Test
	public void testShift_PositiveRangePositiveDelta() {
	    Range shiftedRange = Range.shift(exampleRange17, 2.0, true);
	    assertEquals("The shifted range of (1.0, 5.0) with delta 2.0 should be (3.0, 7.0)",
	            exampleRange18, shiftedRange);
	}
	
	// Test Case 22: Test method shift(Range base, double delta, boolean allowZeroCrossing) for the partition where the base range is fully negative and delta is negative
	@Test
	public void testShift_NegativeRangeNegativeDelta() {
	    Range shiftedRange = Range.shift(exampleRange30, -2.0, true);
	    assertEquals("The shifted range of (-5.0, -1.0) with delta -2.0 should be (-7.0, -3.0)",
	            exampleRange19, shiftedRange);
	}
	
	// Test Case 23: Test method shift(Range base, double delta, boolean allowZeroCrossing) for the partition where the base range is positive and delta causes the lower bound to cross zero
	@Test
	public void testShift_PositiveRangeCrossZeroLower() {
	    Range shiftedRange = Range.shift(exampleRange17, -1.1, false);
	    assertEquals("The shifted range of (1.0, 5.0) with delta -1.1 should be (0.0, 3.9)",
	            exampleRange20, shiftedRange);
	}
	
	// Test Case 24: Test method shift(Range base, double delta, boolean allowZeroCrossing) for the partition where the base range is positive and delta causes the lower bound to cross zero (zero crossing allowed)
	 @Test
	 public void testShift_PositiveRangeCrossZeroLowerAllowed() {
	     Range shiftedRange = Range.shift(exampleRange17, -1.1, true);
	     assertEquals("The shifted range of (1.0, 5.0) with delta -1.1 should be (-0.1, 3.9)",
	                  -0.1, shiftedRange.getLowerBound(), 1e-10);
	     assertEquals(3.9, shiftedRange.getUpperBound(), 1e-10); 
	 }
	
	// Test Case 25: Test method shift(Range base, double delta, boolean allowZeroCrossing) for the partition where the base range is negative and delta causes the upper bound to cross zero
	@Test
	public void testShift_NegativeRangeCrossZeroUpper() {
	    Range shiftedRange = Range.shift(exampleRange30, 1.1, false);
	    assertEquals("The shifted range of (-5.0, -1.0) with delta 1.1 should be (-3.9, 0.0)",
	            exampleRange22, shiftedRange);
	}
	
	// Test Case 26: Test method shift(Range base, double delta, boolean allowZeroCrossing) for the partition where the base range is negative and delta causes the upper bound to cross zero (zero crossing allowed)
	 @Test
	 public void testShift_NegativeRangeCrossZeroUpperAllowed() {
	     Range shiftedRange = Range.shift(exampleRange30, 1.1, true);
	     assertEquals("The shifted range of (-5.0, -1.0) with delta 1.1 should be (-3.9, 0.1)",
	                  -3.9, shiftedRange.getLowerBound(), 1e-10); 
	     assertEquals(0.1, shiftedRange.getUpperBound(), 1e-10); 
	 }
	
	// Test Case 27: Test method shift(Range base, double delta, boolean allowZeroCrossing) for very large doubles
	@Test
	public void testShift_VeryLargeDoubles() {
		Range shiftedRange = Range.shift(exampleRange25, Double.MAX_VALUE / 2, true);
		assertEquals("The shifted range of (Double.MAX_VALUE / 2, Double.MAX_VALUE) with delta Double.MAX_VALUE / 2 should be (Double.MAX_VALUE, Double.MAX_VALUE + Double.MAX_VALUE / 2)",
				exampleRange26, shiftedRange);
	}

	// Test Case 28: Test method shift(Range base, double delta, boolean allowZeroCrossing) for very small doubles
	@Test
	public void testShift_VerySmallDoubles() {
		Range shiftedRange = Range.shift(exampleRange27, Double.MIN_VALUE, true);
		assertEquals("The shifted range of (Double.MIN_VALUE, Double.MIN_VALUE * 2) with delta Double.MIN_VALUE should be (Double.MIN_VALUE + Double.MIN_VALUE, Double.MIN_VALUE * 2 + Double.MIN_VALUE)",
				exampleRange28, shiftedRange);
	}
	
	// ================== equals Method Tests ==================
	
	// Test Case 29: Test method equals(Object obj) for the partition where the input is a range but not equivalent
	@Test
	public void testEquals_NotEquivalentRange() {
	    assertFalse("The range (0.0, 0.0) should not be equal to (1.0, 5.0)",
	            exampleRange14.equals(exampleRange17));
	}
	
	// Test Case 30: Test method equals(Object obj) for the partition where the input is an equivalent range
	@Test
	public void testEquals_EquivalentRange() {
	    assertTrue("The range (0.0, 0.0) should be equal to (0.0, 0.0)",
	            exampleRange14.equals(exampleRange24));
	}
	
	// Test Case 31: Test method equals(Object obj) for the partition where the input is the same instance
	@Test
	public void testEquals_Itself() {
	    assertTrue("The range (0.0, 0.0) should be equal to itself",
	            exampleRange14.equals(exampleRange14));
	}
	
	// Test Case 32: Test method equals(Object obj) for the partition where the input is null
	@Test
	public void testEquals_NullRange() {
	    assertFalse("The range (0.0, 0.0) should not be equal to null",
	            exampleRange14.equals(null));
	}
	
	// Test Case 33: Test method equals(Object obj) for the partition where the input is not a range object
	@Test
	public void testEquals_NotARangeObject() {
	    assertFalse("The range (0.0, 0.0) should not be equal to an arbitrary object",
	            exampleRange14.equals(exampleObject));
	}
	
	// Test Case 35: Test method equals(Object obj) for the partition where the range contains NaN values
	@Test
	public void testEquals_RangeWithNaNValues() {
	    assertTrue("The range (NaN, NaN) should be equal to (NaN, NaN)",
	            exampleRange29.equals(new Range(Double.NaN, Double.NaN)));
	}
	
    // ================== getLowerBound Method Tests ==================
	
	// Test Case 68: Test method getLowerBound() for the partition where lower is positive 
	@Test
	    public void testGetLowerBound_LowerIsPositive() {
	    	assertEquals(45.5, exampleRange7.getLowerBound(), 0.001);
	    }
	// Test Case 69: Test method getLowerBound() for the partition where lower is negative 
	@Test
    public void testGetLowerBound_LowerIsNegative() {
    	assertEquals(-10.5, exampleRange8.getLowerBound(), 0.001);
    }
	
	// Test Case 70: Test method getLowerBound() for the partition where lower is zero 
	@Test
    public void testGetLowerBound_LowerIsZero() {
    	assertEquals(0.0, exampleRange14.getLowerBound(), 0.001);
    }
	// Test Case 71: Test method getLowerBound for the partition where range/lower is invalid 
	@Test(expected = IllegalArgumentException.class)
    public void testGetLowerBound_InvalidRange() {
    	Range range = new Range(10.0, 5.0);
    	range.getLowerBound();
    }
	 
	 // ================== getUpperBound Method Tests ==================
	
	// Test Case 72: Test method getUpperBound() for the partition where upper is positive 
	@Test
	    public void testGetUpperBound_UpperIsPositive() {
	    	assertEquals(75.5, exampleRange7.getUpperBound(), 0.001);
	    }
	// Test Case 73: Test method getUpperBound() for the partition where upper is negative 
	@Test
    public void testGetUpperBound_UpperIsNegative() {
    	assertEquals(-3.0, exampleRange19.getUpperBound(), 0.001);
    }
	
	// Test Case 74: Test method getUpperBound() for the partition where upper is zero 
	@Test
    public void testGetUpperBound_UpperIsZero() {
    	assertEquals(0.0, exampleRange14.getUpperBound(), 0.001);
    }
	// Test Case 75: Test method getUpperBound for the partition where range/upper is invalid 
	@Test(expected = IllegalArgumentException.class)
    public void testGetUpperBound_InvalidRange() {
    	Range range = new Range(10.0, 5.0);
    	range.getUpperBound();
    }
	
	 // ================== getLength Method Tests ==================
	
	// Test Case 76: Test method getLength() for the partition where range is positive 
	@Test
    public void testGetLength_RangeIsPositive() {
    	assertEquals(5.0, exampleRange2.getLength(), 0.001);
    }
	
	// Test Case 77: Test method getLength() for the partition where range is negative
	@Test
    public void testGetLength_RangeIsNegative() {
    	assertEquals(4.0, exampleRange19.getLength(), 0.001);
    }
	
	// Test Case 78: Test method getLength() for the partition where length is 0 
	@Test
    public void testGetLength_LengthIsZero() {
    	assertEquals(0.0, exampleRange15.getLength(), 0.001);
    }
	
	// Test Case 79: Test method getLength() for the partition where range is invalid 
	@Test(expected = IllegalArgumentException.class) 
	public void testGetLength_InvalidRange() {
	    Range range = new Range(10.0, 5.0);
	    range.getLength();
	}
	
	 // ================== intersects(Range range) Method Tests ==================
	
	// Test Case 80: Test method intersects(Range range) for the partition where lower > upper
	// This tests the boundary condition where lower must be <= upper, and an exception is expected
	@Test(expected = IllegalArgumentException.class)
	public void testIntersects_RangeArgument_LowerGreaterThanUpper() {
	    Range invalidRange = new Range(5.0, 3.0); 
	    exampleRange9.intersects(invalidRange); 
	}
    
	 // Test Case 81: Test method intersects(Range range) for the partition where there is full overlap
	 // This tests the condition where the specified range fully overlaps with the range object
	 @Test
	 public void testIntersects_RangeArgument_FullOverlap() {
	     assertTrue("The range (2.9, 5.1) should fully overlap with (3.0, 5.0)",
	                exampleRange10.intersects(exampleRange31));
	 }
	
	 // Test Case 82: Test method intersects(Range range) for the partition where there is partial overlap
	 // This tests the condition where the specified range partially overlaps with the range object
	 @Test
	 public void testIntersects_RangeArgument_PartialOverlap() {
	     assertTrue("The range (2.9, 5.1) should partially overlap with (3.0, 5.0)",
	                exampleRange10.intersects(exampleRange31));
	 }
	
	 // Test Case 83: Test method intersects(Range range) for the partition where there is no overlap
	 // This tests the condition where the specified range does not overlap with the range object
	 @Test
	 public void testIntersects_RangeArgument_NoOverlap() {
	     assertFalse("The range (1.0, 3.0) should not overlap with (3.1, 5.0)",
	                 exampleRange11.intersects(exampleRange32));
	 }
	
	 // Test Case 84: Test method intersects(Range range) for the partition where the lower boundary touches
	 // This tests the boundary condition where the lower bound of the specified range touches the upper bound of the range object
	 @Test
	 public void testIntersects_RangeArgument_TouchingLowerBoundary() {
	     assertTrue("The range (1.0, 4.0) should touch the lower boundary of (4.0, 6.0)",
	                exampleRange12.intersects(exampleRange33));
	 }
	
	 // Test Case 85: Test method intersects(Range range) for the partition where the upper boundary touches
	 // This tests the boundary condition where the upper bound of the specified range touches the lower bound of the range object
	 @Test
	 public void testIntersects_RangeArgument_TouchingUpperBoundary() {
	     assertTrue("The range (1.0, 4.0) should touch the upper boundary of (0.0, 1.0)",
	                exampleRange12.intersects(exampleRange34));
	 }
	
	 // Test Case 86: Test method intersects(Range range) for the partition where both ranges are a single point
	 // This tests the condition where both the range object and the specified range are single-point ranges
	 @Test
	 public void testIntersects_RangeArgument_RangeEqualToPoint() {
	     assertTrue("The range (3.0, 3.0) should intersect with (3.0, 3.0)",
	                exampleRange13.intersects(exampleRange35));
	 }
	 
	 
	 // ================== constrain Method Tests ==================
	 
	 // Test Case 87: Test method constrain(double value) for the partition where value is within the range 
	 @Test
	 public void testConstrain_ValueWithinRange() {
		 assertEquals(7.0, exampleRange2.constrain(7.0), 0.001);
	 }
	
	 // Test Case 88: Test method constrain(double value) for the partition where value is equal to the lower bound of the range
	 @Test
	 public void testConstrain_ValueEqualToLowerBound() {
		 assertEquals(5.5, exampleRange2.constrain(5.5), 0.001);
	 }
	 
	 // Test Case 89: Test method constrain(double value) for the partition where value is equal to the upper bound of the range
	 @Test
	 public void testConstrain_ValueEqualToUpperBound() {
		 assertEquals(10.5, exampleRange2.constrain(10.5), 0.001);
	 }
	 
	 // Test Case 90: Test method constrain(double value) for the partition where value is less than the lower bound of the range
	 @Test
	 public void testConstrain_ValueLessThanLowerBound() {
		 assertEquals(5.5, exampleRange2.constrain(3.0), 0.001);
	 }
	 
	 // Test Case 91: Test method constrain(double value) for the partition where value is greater than the upper bound of the range
	 @Test
	 public void testConstrain_ValueGreaterThanUpperBound() {
		 assertEquals(10.5, exampleRange2.constrain(12.5), 0.001);
	 }
	 
	 
	 // ================== combineIgnoringNaN Method Tests ==================
	 
	 // Test Case 92: Test method combineIgnoringNaN for the partition where both ranges are non-null and contain valid numbers (no NaNs)
	 @Test
	 public void testCombineIgnoringNaN_ValidRanges() {
		 assertEquals("Combined range of (5.5, 10.5) and (10.0, 17.5) should be equal to (10.0, 17.5)", exampleRange36, Range.combineIgnoringNaN(exampleRange2, exampleRange4));
	 }
	 
	 // Test Case 93: Test method combineIgnoringNaN for the partition where one range is valid and one range is null
	 @Test
	 public void testCombineIgnoringNaN_Range1NotNull_Range2Null() {
		 assertEquals("Combined range of (5.5, 10.5) and null should be equal to (5.5, 10.5)", exampleRange2, Range.combineIgnoringNaN(exampleRange2, null));
	 }
	 
	 // Test Case 94: Test method combineIgnoringNaN for the partition where both ranges are null 
	 @Test
	 public void testCombineIgnoringNaN_BothRangesNull() {
		 assertNull("Combined range of null and null should be null", Range.combineIgnoringNaN(null, null));
	 }
	 
	 // Test Case 95: Test method combineIgnoringNaN for the partition where one range contains a NaN and the other range contains valid numbers 
	 @Test 
	 public void testCombineIgnoringNaN_OneRangeContainsNaN() {
		 assertEquals("Combined range of (5.0, Double.NaN) and (5.5, 10.5) should be equal to (5.0, 10.5)",exampleRange38, Range.combineIgnoringNaN(exampleRange37, exampleRange2));
	 }
	 
	 // Test Case 96: Test method combineIgnoringNaN for the partition where both ranges contain one NaN value and one valid number
	@Test
	public void testCombineIgnoringNaN_BothRangesContainANaN() {
		assertEquals("Combined range of (5.0, Double.NaN) and (Double.NaN, 10.5) should be equal to (5.0, 10.5)", exampleRange38, Range.combineIgnoringNaN(exampleRange37, exampleRange39));
	}
	
	// Test Case 97: Test method combineIgnoringNaN for the partition where range1 is fully NaN and range2 is valid 
	@Test
	public void testCombineIgnoringNaN_Range1FullyNaN_Range2Valid() {
		assertEquals("Combined range of (Double.NaN, Double.NaN) and (5.5, 10.5) should be equal to (5.5, 10.5)", exampleRange2, Range.combineIgnoringNaN(exampleRange29, exampleRange2));
	}
	
	
	// Test Case 98: Test method combineIgnoringNaN for the partition where range2 is fully NaN and range1 is valid 
	@Test
	public void testCombineIgnoringNaN_Range1Valid_Range2FullyNaN() {
		assertEquals("Combined range of (5.5, 10.5) and (Double.NaN, Double.NaN) should be equal to (5.5, 10.5)", exampleRange2, Range.combineIgnoringNaN(exampleRange2, exampleRange29));
	}
	
	// Test Case 99: test method combineIgnoringNan for the partition where range1 is null and range2 is fully NaN 
	 @Test
	 public void testCombineIgnoringNaN_Range1Null_Range2NaN() {
		 assertNull("Combined range of null and (Double.NaN, Double.NaN) should be null", Range.combineIgnoringNaN(null, exampleRange29));
	 }

	// Test Case 100: test method combineIgnoringNaN for the partition where range1 is fully NaN and range2 is null
		 @Test
		 public void testCombineIgnoringNaN_Range1NaN_Range2Null() {
			 assertNull("Combined range of(Double.NaN, Double.NaN) and null should be null", Range.combineIgnoringNaN(exampleRange29, null));
		 }
		 
	// Test Case 101: test method combineIgnoringNaN for the partition where range1 and range2 are both fully NaN 
		 @Test 
		 public void testCombineIgnoringNaN_BothRangesFullyNaN() {
			 assertNull("Combined range of(Double.NaN, Double.NaN) and (Double.NaN, Double.NaN) should be null", Range.combineIgnoringNaN(exampleRange29, exampleRange29));
		 }
	
		 // ================== expandToInclude Method Tests ==================
		 
	// Test Case 102: test method expandToInclude for the partition where range is null and the value is a valid number
		 @Test
		 public void testExpandToInclude_RangeIsNull() {
			 assertEquals("Expand a null range to include 1.0 should result in range of (1.0, 1.0)", exampleRange15, Range.expandToInclude(null, 1.0));
		 }
		 
	// Test Case 103: test method expandToInclude for the partition where value is within the given range
		 @Test
		 public void testExpandToInclude_ValueIsWithinRange() {
			 assertEquals("Expand range (15.0, 25.0) to include (17.0) should result in range of (15.0, 25.0)", exampleRange3, Range.expandToInclude(exampleRange3, 17.0));
		 }
		 
	// Test Case 104: test method expandToInclude for the partition where value is below the given range
		 @Test
		 public void testExpandToInclude_ValueIsBelowRange() {
			 assertEquals("Expand range (5.5, 10.5) to include (5.0) should result in range of (5.0, 10.5)", exampleRange38, Range.expandToInclude(exampleRange2, 5.0));
		 }
		 
  // Test Case 105:  test method expandToInclude for the partition where value is above the given range
		 @Test
		 public void testExpandToInclude_ValueIsAboveRange() {
			 assertEquals("Expand range (5.5, 10.5) to include (17.5) should result in range of (5.5, 17.5)", exampleRange36, Range.expandToInclude(exampleRange2, 17.5));
		 }
		 
		 // ================== expand Method Tests ==================
		 
		 // Test Case 106: test method expand for the partition where range is a valid Range, and lowerMargin and upperMargin are 0% 
	
		 @Test
		 public void testExpand_ZeroMargins() {
			 assertEquals("Expand range (5.5, 10.5) with lowerMargin 0.0 and upperMargin 0.0 should result in range of (5.5, 10.5)", exampleRange2, Range.expand(exampleRange2, 0.0, 0.0));
		 }
		// Test Case 107: test method expand for the partition where range is a valid Range, lowerMargin is 100% and upperMargin is 0% 
		 @Test
		 public void testExpand_LowerMargin100Percent() {
			 assertEquals("Expand range (5.0, 10.0) with lowerMargin 1.0 and upperMargin 0.0 should result in range of (0.0, 10.0)", exampleRange41, Range.expand(exampleRange40, 1.0, 0.0));
		 }
		 
		 // Test Case 108: test method expand for the partition where range is a valid Range, lowerMargin is 0% and upperMargin is 100% 
		 @Test
		 public void testExpand_UpperMargin100Percent() {
			 assertEquals("Expand range (5.0, 10.0) with lowerMargin 0 and upperMargin 1.0 should result in range of (5.0, 15.0)", exampleRange42, Range.expand(exampleRange40, 0.0, 1.0));
		 }
		 
		 // Test Case 109: test method expand for the partition where range is a valid Range, lowerMargin is 50% and upperMargin is 50%
		 @Test
		 public void testExpand_50PercentMargins() {
			 assertEquals("Expand range (5.0, 10.0) with lowerMargin 0.50 and upperMargin 0.50 should result in range of (2.5, 12.5)", exampleRange43, Range.expand(exampleRange40, 0.50, 0.50));
		 }
		 // Test Case 110: test method expand for the partition where range is a valid Range, and lowerMargin and upperMargin are negative
		@Test
		public void testExpand_NegativeMargins() {
			 assertEquals("Expand range (5.0, 10.0) with lowerMargin -0.50 and upperMargin -1.0 should result in range of (5.0, 7.5)", exampleRange44, Range.expand(exampleRange40, 0.0, -0.50));
		 }
		
		 // ================== scale Method Tests ==================
		// Test Case 111: test method scale for the partition where base is valid range and the factor is 1.0 
		@Test
		public void testScale_FactorOne() {
			 assertEquals("Scale (5.0, 10.0) with factor 1 should result in range of (5.0, 10.0)", exampleRange40, Range.scale(exampleRange40, 1.0));
		 }
		
		// Test Case 112: test method scale for the partition where base is valid range and the factor is greater than 1.0
		@Test
		public void testScale_FactorGreaterThanOne() {
			 assertEquals("Scale (5.0, 10.0) with factor 1.5 should result in range of (7.5, 15.0)", exampleRange45, Range.scale(exampleRange40, 1.5));
		 }
		
		// Test Case 113: test method scale for the partition where base is valid range and the factor is negative 
		@Test(expected = IllegalArgumentException.class)
		public void testScale_FactorNegative() {
			Range.scale(exampleRange40, -2); 
		 }
		
		// Test Case 114: test method scale for the partition where base is valid range and the factor is zero 
		@Test
		public void testScale_FactorZero() {
			assertEquals("Scale (5.0, 10.0) with factor 0 should result in range of (0.0, 0.0)", exampleRange14, Range.scale(exampleRange40, 0.0));
			 
		}
		
		// Test Case 115: test method scale for the partition where base is valid range and factor is less than 1.0
		@Test
		public void testScale_FactorLessThanOne() {
			 assertEquals("Scale (5.0, 10.0) with factor 0.5 should result in range of (2.5, 5.0)", exampleRange46, Range.scale(exampleRange40, 0.5));
		 }
		
		// Test Case 116: test method scale for the partition where base is invalid range (null) 
		@Test(expected = IllegalArgumentException.class)
		public void testScale_InvalidRange() {
			Range.scale(null, 1.0);
		 }
		
		 // ================== hashCode Method Tests ==================
		
		// Test Case 117: test method hashCode with the same range object to confirm the same value is returned
		@Test
		public void testHashCode_SameObjectCheck() {
			assertEquals("Hash code for range (5.0, 10.0) should equal hash code for range (5.0, 10.0)", exampleRange40.hashCode(), exampleRange40.hashCode());
		}
		
		// Test Case 118: test method hashCode with two range objects that are equivalent to confirm the same value is returned 
		
		@Test 
		public void testHashCode_EqualObjects() {
			assertEquals("Hash code for range (5.0, 10.0) should equal hash code for range (5.0, 10.0)", exampleRange40.hashCode(), exampleRange47.hashCode());
		}
		
		// Test Case 119: test method hashCode with two range objects that have different lower bounds but the same upper bound
		@Test
		public void testHashCode_UnequalObjectsDifferentUpperBounds() {
			assertNotEquals("Hash code for range (5.5, 10.5) should not equal hash code for range (5.0, 10.5)", exampleRange2.hashCode(), exampleRange38.hashCode());
		}
		// Test Case 120: test method hashCode with two range objects that have the same lower bound but different upper bounds
		@Test
		public void testHashCode_UnequalObjectsDifferentLowerBounds() {
			assertNotEquals("Hash code for range (5.0, 15.0) should not equal hash code for range (5.0, 7.5)", exampleRange42.hashCode(), exampleRange44.hashCode());
		}
		
		// Test Case 121: test method hashCode for two range objects that have different lower bounds and different upper bounds 
		@Test
		public void testHashCode_UnequalObjectsDifferentBounds() {
			assertNotEquals("Hash code for range (45.5, 75.5) should not equal hash code for range (-10.5, 5.5)", exampleRange7.hashCode(), exampleRange6.hashCode());
		}
		
		// ================== intersects Method Tests ==================
		
		// Test Case 122: test method intersects for two points that are not equivalent
		@Test 
		public void testIntersects_SinglePointRange_NotEqual() {;
		    assertFalse("Single-point ranges (3.0, 3.0) should not intersect with (4.0, 4.0)",
		                exampleRange13.intersects(4.0, 4.0));
		}
		
		// Test Case 123: Test method intersects(double lower, double upper) for the partition where lower > upper
		// This tests the boundary condition where lower must be <= upper, and an exception is expected
		@Test(expected = IllegalArgumentException.class)
		public void testIntersects_InvalidInputRange() {
		    exampleRange12.intersects(4.0, 1.0); // Invalid input range (lower > upper)
		}
		
		// Test Case 124: tests the method intersects for the boundary condition for valid intersection with a range
		// containing the minimum value for a lower boundary of a double at the minimum value
		@Test
		public void testIntersects_InputRangeAtMinValue() {
		    assertTrue("Input range (Double.MIN_VALUE, 2.0) should intersect with (1.0, 5.0)",
		    		exampleRange17.intersects(Double.MIN_VALUE, 2.0));
		}

		// Test Case 125: tests the method intersects for the boundary condition for valid intersection with a range
			// containing the minimum value for a upper boundary of a double at the maximum value
		@Test
		public void testIntersects_InputRangeAtMaxValue() {
		    assertTrue("Input range (5.0, Double.MAX_VALUE) should intersect with (1.0, 5.0)",
		    		exampleRange17.intersects(5.0, Double.MAX_VALUE));
		}
		
		// Test Case 126: tests the method intersects for the boundary condition for valid intersection with a range
			// containing NaN on the lower boundary
		@Test
		public void testIntersects_InputRangeLowerBoundContainsNaN() {
		    assertTrue("Input range (NaN, 2.0) should intersect with (1.0, 5.0)",
		    		exampleRange17.intersects(Double.NaN, 2.0));
		}
		
		// Test Case 127: tests the method intersects for the boundary condition for valid intersection with a range
		// containing NaN on the upper boundary
		@Test
		public void testIntersects_InputRangeUpperBoundContainsNaN() {
		    assertTrue("Input range (4.0, NaN) should intersect with (1.0, 5.0)",
		    		exampleRange17.intersects(4.0, Double.NaN));
		}


		// Test Case 128: tests the method intersects for the boundary condition for valid intersection with a range
			// containing infinity on the upper boundary
		@Test
		public void testIntersects_InputRangeContainsUpperInfinity() {
		    assertTrue("Input range (4.0, Double.POSITIVE_INFINITY) should intersect with (1.0, 5.0)",
		    		exampleRange17.intersects(4.0, Double.POSITIVE_INFINITY));
		}
		
		// Test Case 129: tests the method intersects for the boundary condition for valid intersection with a range
			// containing infinity on the upper boundary
		@Test
		public void testIntersects_InputRangeContainsLowerNegativeInfinity() {
		    assertTrue("Input range (Double.NEGATIVE_INFINITY, 2.0) should intersect with (1.0, 5.0)",
		    		exampleRange17.intersects(Double.NEGATIVE_INFINITY, 2.0));
		}
		
		// Test Case 130: test the method intersects for the boundary condition when input range is entirely within the current range
		@Test
		public void testIntersects_InputRangeWithinCurrentRange() {
		    assertTrue("Input range (2.0, 4.0) should intersect with (1.0, 5.0)",
		    		exampleRange17.intersects(2.0, 4.0));
		}

		// Test Case 131: test the method intersects for the boundary condition when input range overlaps on the lower boundary
		@Test
		public void testIntersects_InputRangeOverlapsLowerBoundary() {
		    assertTrue("Input range (2.0, 4.0) should intersect with (3.0, 5.0)",
		    		exampleRange48.intersects(2.0, 4.0));
		}

		// Test Case 132: test the method intersects for the boundary condition when input range overlaps on the upper boundary
		@Test
		public void testIntersects_InputRangeOverlapsUpperBoundary() {
		    assertTrue("Input range (4.0, 6.0) should intersect with (3.0, 5.0)",
		    		exampleRange17.intersects(4.0, 6.0));
		}
		
		// ================== Mutation Testing Additional Test Cases ==================
		
		// Test Case 133: test construction of a new invalid Range object where lower is greater than upper and verify that the exception message is as expected
		// test to kill mutant: removed call to java/lang/StringBuilder::toString 
		@Test 
		public void testIllegalArgumentExceptionWithMessage_invalidRange() {
			try {
				new Range(10.0, 5.0); // lower is greater than upper
				fail("Expected IllegalArgumentException to be thrown");
			} catch (IllegalArgumentException e){
				String message = e.getMessage();
				assertTrue("Message should contain 'require lower'", message.contains("require lower"));
				assertTrue("Message should contain 'upper'", message.contains("upper"));
			
			}
		}
		
		// Test Case 134: test construction of a new invalid Range object where lower is greater than upper and verify that the exception message is as expected
		// test to kill mutant: replaced call to StringBuilder::append with receiver 
		@Test 
		public void testIllegalArgumentExceptionWithMessageAfterAppendChange_invalidRange() {
			try {
				new Range(10.0, 5.0); // lower is greater than upper
				fail("Expected IllegalArgumentException to be thrown");
			} catch (IllegalArgumentException e){
				String message = e.getMessage();
				assertTrue("Message should contain 'Range(double, double): require lower'", message.contains("Range(double, double): require lower"));
				assertTrue("Message should contain 'upper'", message.contains("upper"));
				assertTrue(message.contains("10"));
				assertTrue(message.contains("5"));
			
			}
		}
		
		// Test Case 135: test construction of a new invalid Range object where lower is greater than upper and verify that the exception message is as expected
		// test to kill mutant: replaced call to StringBuilder::append with receiver 
		@Test 
		public void testIllegalArgumentExceptionWithExactMessage_invalidRange() {
			try {
				new Range(10.0, 5.0); // lower is greater than upper
				fail("Expected IllegalArgumentException to be thrown");
			} catch (IllegalArgumentException e){
				String expectedMessage = "Range(double, double): require lower (10.0) <= upper (5.0).";
				assertEquals("Exception message does not match expected.", expectedMessage, e.getMessage());
			
			}
		}
		
		// Test Case 136: test construction of a new valid Range object to ensure that exception is not thrown 
		// test to kill mutant: Negated double local variable number 1 
		@Test 
		public void testValidRange() {
			Range range = new Range(5.0, 10.0); 
			assertNotNull(range); // no exception should be thrown 
		}
		
		// Test Case 137: test construction of a new Range object with values close together 
		// test to kill mutant: decremented double local variable number 1 
		@Test
		public void testDecrementedLowerBound() {
			try {
				new Range (9.5, 9.0); // if lower is decremented by mutant, then the range will be valid
				fail("Expected Illegal Argument Exception to be thrown");
				
			} catch (IllegalArgumentException e) {
				String message = e.getMessage();
				assertTrue(message.contains("9.5"));
				assertTrue(message.contains("9.0"));
			}
		}
		
		// Test Case 138: test construction of a new Range object with values close together
		// test to kill mutant: decremented double local variable number 3 
		
		@Test
		public void testDecrementedUpperBound() {
				Range range = new Range (9.0, 9.5); // range should be valid, but if upper is decremented by mutator it would be invalid
				assertNotNull(range);
			
		}
		// Test Case 139: test construction of a new Range object with values close together
		// test to kill mutant: incremented double local variable number 3 
		  @Test
		    public void testIncrementedUpperBound() {
		        try {
		           
		            new Range(0.1, 0.0); // this range is invalid and should create an exception, if upper is incremented it will not create exception 
		            fail("Expected IllegalArgumentException to be thrown");
		        } catch (IllegalArgumentException e) {
		            String message = e.getMessage();
		            assertTrue(message.contains("0.1"));
		            assertTrue(message.contains("0.0"));
		        }
		    }
		  
		  // Test Case 140: test construction of a new Range object with values close together
		  // test to kill mutant: incremented double local variable number 1 
		  @Test
			public void testIncrementedLowerBound() {
					Range range = new Range (0.0, 0.1); // range should be valid, but if lower is incremented by mutator it would be invalid
					assertNotNull(range);
				
			}
		  
		  // Test Case 141: test getCentralValue on a Range where the central value is not 0 
		  // test to kill mutants: replaced double return with 0.0d for getCentralValue and replaced double addition with modulus
		  @Test
		  public void testGetCentralValue_NormalCase() {
			  Range range = new Range(10.0, 20.0); //will not result in central value of 0 and modulus is not equal to addition for these numbers
			  double centralValue = range.getCentralValue();
			  assertEquals(15.0, centralValue, 0.001);
		  }
	
		  // Test Case 142: test isNaNRange with a valid positive range 
		  // test to kill mutant: replaced equality check with true 
		  @Test 
		  public void testIsNaNRange_ValidRange() {
			  assertFalse("Expected false, since lower and upper bound are not NaN", exampleRange42.isNaNRange());
		  }
		  
		  // Test Case 143: test isNaNRange with lower NaN and upper valid 
		  @Test
		  public void testIsNaNRange_LowerNaNBound() {
			  assertFalse("Expected false, since upper is not NaN", exampleRange39.isNaNRange());
		  }
		  
		  // Test Case 144: test isNaNRange with lower valid and upper NaN
		  @Test
		  public void testIsNaNRange_UpperNaNBound() {
			  assertFalse("Expected false, since lower is not NaN", exampleRange37.isNaNRange());
		  }
		  
		  // Test Case 145: test isNaNRange with both NaN bounds
		  @Test 
		  public void testIsNaNRange_NaN() {
			  assertTrue("Expected true, since both lower and upper are NaN", exampleRange29.isNaNRange()); 
		  }
		  
		  // Test Case 146: test isNaNRange with a valid negative range 
		  @Test
		  public void testIsNaNRange_ValidNegativeRange() {
			  assertFalse("Expected false, since both lower and upper are valid", exampleRange19.isNaNRange());
		  }
		  
		  // Test Case 147: Test Range constructor for valid range partition 
		  @Test 
		  public void testRange_ValidRange() {
			  Range range = new Range(0,10);
			  assertNotNull(range);
			  assertEquals(0, range.getLowerBound(), 0.001);
			  assertEquals(10, range.getUpperBound(), 0.001);
			  
		  }
		  
		  // Test Case 148: Test Range constructor for valid range partition with lower equal to upper
		  @Test
		  public void testRange_ValidRangeWithLowerEqualUpper() {
			  Range range = new Range(10, 10);
			  assertNotNull(range);
			  assertEquals(10, range.getLowerBound(), 0.001);
			  assertEquals(10, range.getUpperBound(), 0.001);
		  }
		  
		  // Test Case 149: Test Range constructor for invalid range with positive upper and lower
		  @Test(expected = IllegalArgumentException.class)
		  public void testRange_InvalidRange() {
			  new Range(10,9);
		  }
		  
		  //Test case 150: Test Range constructor for invalid range with 0 lower and negative upper
		  @Test(expected = IllegalArgumentException.class)
		  public void testRange_InvalidRangeWithNegative() {
			  new Range(0, -1);
		  }
		  
		  // Test case 151: Test Range constructor for boundary case where lower is equal to upper
		  @Test
		  public void testRange_BoundaryValid() {
			  Range range = new Range(0, 0);
			  assertNotNull(range);
			  assertEquals(0, range.getLowerBound(), 0.001);
			  assertEquals(0, range.getUpperBound(), 0.001);
			  }
		  // Test case 152: Test Range constructor for boundary case where lower is 1 greater than upper
		  @Test(expected = IllegalArgumentException.class)
		  public void testRange_BoundaryInvalid() {
			  new Range(1, 0);
		  }
		  
		  // Test case 153: Test getCentralValue for valid positive range including 0 
		  @Test
		  public void testGetCentralValue_PositiveRange() {
			  assertEquals(5.0, exampleRange41.getCentralValue(), 0.001);
		  }
		  
		  // Test case 154: test getCentralValue for valid range that spans negative and positive 
		@Test
		public void testGetCentralValue_NegativeAndPositiveRange() {
			assertEquals(0.0, exampleRange49.getCentralValue(), 0.001);
		}
		
		// Test case 155: test getCentralValue for valid range where lower is equal to upper 
		@Test
		public void testGetCentralValue_LowerEqualUpper() {
			assertEquals(1.0, exampleRange50.getCentralValue(), 0.001);
		}
		
		// Test case 156: test getCentralValue for valid positive range that doesn't include 0 
		@Test
		public void testGetCentralValue_PositiveRangeNotIncludingZero() {
			assertEquals(7.5, exampleRange47.getCentralValue(), 0.001);
		}
		
		// Test case 157: test getCentralValue for valid negative range 
		@Test
		public void testGetCentralValue_NegativeRange() {
			assertEquals(-15.0, exampleRange51.getCentralValue(), 0.001);
		}
		
		// Test case 158: test getCentralValue for valid very large range
		@Test
		public void testGetCentralValue_LargeRange() {
			assertEquals(1500000.0, exampleRange52.getCentralValue(), 0.001);
		}
		
		// Test case 159: test getCentralValue for valid very small range 
		@Test
		public void testGetCentralValue_SmallRange() {
			assertEquals(0.2, exampleRange53.getCentralValue(), 0.001);
		}
		
		// Test case 160: test toString() for positive range including 0
		@Test
		public void testToString_PositiveRangeIncludingZero() {
			assertEquals("Range[0.0,10.0]", exampleRange41.toString());
		}
		// Test case 161: test ToString() for negative and positive range
		@Test
		public void testToString_PositiveAndNegativeRange() {
			assertEquals("Range[-5.0,5.0]", exampleRange49.toString());
		}
	// Test case 162: test toString() for range where lower equals upper
		@Test
		public void testToString_LowerEqualsUpper() {
			assertEquals("Range[1.0,1.0]", exampleRange50.toString());
		}
		
		// Test case 163: test toString() for positive range that doesn't include 0 
		@Test
		public void testToString_PositiveRangeNotIncludingZero() {
			assertEquals("Range[5.0,10.0]", exampleRange47.toString());
		}
		// Test case 164: test toString() for negative range
		@Test
		public void testToString_NegativeRange() {
			assertEquals("Range[-20.0,-10.0]", exampleRange51.toString());
		}
		
		// Test case 165: test toString() for very large range
		@Test
		public void testToString_LargeRange() {
			assertEquals("Range[1000000.0,2000000.0]", exampleRange52.toString());
		}
		// Test case 166: test toString() for small range
		@Test
		public void testToString_SmallRange() {
			assertEquals("Range[0.1,0.3]", exampleRange53.toString());
		}
		
		// Test case 167 test scale for case where factor is negative but greater than -1 
		@Test(expected = IllegalArgumentException.class)
		public void testScale_FactorBetweenNegativeOneAndZero() {
			Range.scale(exampleRange40, -1); 
		 }
		
	
	
	@After
	public void tearDown() throws Exception {
	    exampleRange = null;
	    exampleRange2 = null;
	    exampleRange3 = null;
	    exampleRange4 = null;
	    exampleRange5 = null;
	    exampleRange6 = null;
	    exampleRange7 = null;
	    exampleRange8 = null;
	    exampleRange9 = null;
	    exampleRange10 = null;
	    exampleRange11 = null;
	    exampleRange12 = null;
	    exampleRange13 = null;
	    exampleRange14 = null;
	    exampleRange15 = null;
	    exampleRange16 = null;
	    exampleRange17 = null;
	    exampleRange18 = null;
	    exampleRange19 = null;
	    exampleRange20 = null;
	    exampleRange21 = null;
	    exampleRange22 = null;
	    exampleRange23 = null;
	    exampleRange24 = null;
	    exampleRange25 = null;
		exampleRange26 = null;
		exampleRange27 = null;
		exampleRange28 = null;
		exampleRange29 = null;
		exampleRange30 = null;
		exampleRange31 = null;
		exampleRange32 = null;
		exampleRange33 = null;
		exampleRange34 = null;
		exampleRange35 = null;
		exampleRange36 = null;
		exampleRange37 = null;
		exampleRange38 = null;
		exampleRange39 = null;
		exampleRange40 = null;
		exampleRange41 = null;
		exampleRange42 = null;
		exampleRange43 = null;
		exampleRange44 = null;
		exampleRange45 = null;
		exampleRange46 = null;
		exampleRange47 = null;
		exampleRange48 = null;

	    
	    exampleObject = null;
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
}