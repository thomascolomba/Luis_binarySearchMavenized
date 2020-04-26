package com.luis.simpleBinarySearch;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public AppTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testSimple()
    {
        BinarySearchClass bs = new BinarySearchClass();
		int m[] = {34,65,23,100,24,54,13,58,25,17};//{sorted: 13,17,23,24,25,34,54,58,65,100}
		assertTrue(bs.binarySearch(m, 24));
    }
    
    public void testEmptyArray()
    {
        BinarySearchClass bs = new BinarySearchClass();
		assertFalse(bs.binarySearch(new int[]{}, 24));
    }
    
    public void testValueNotInArray()
    {
        BinarySearchClass bs = new BinarySearchClass();
		assertFalse(bs.binarySearch(new int[]{1,2,3}, 24));
    }
    
    public void testNegativeValue()
    {
        BinarySearchClass bs = new BinarySearchClass();
		assertTrue(bs.binarySearch(new int[]{1,2,-7,3}, -7));
    }
    
    public void testValuePresentMultipleTimes()
    {
        BinarySearchClass bs = new BinarySearchClass();
		assertTrue(bs.binarySearch(new int[]{1,24,2,24,3,24,24,24}, 24));
    }
}
