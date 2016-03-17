/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carolina.caceres
 */
public class StandarDeviationTest {
    
    public StandarDeviationTest() {
    }
    
    /*@BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }*/

    /**
     * Test of getVerySmall method, of class StandarDeviation.
     */
    @Test
    public void testGetVerySmall() {
        System.out.println("getVerySmall");
        StandarDeviation instance = new StandarDeviation();
        double expResult = 1.0;
        double result = instance.getVerySmall();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setVerySmall method, of class StandarDeviation.
     */
    @Test
    public void testSetVerySmall() {
        System.out.println("setVerySmall");
        double verySmall = 1.0;
        StandarDeviation instance = new StandarDeviation();
        instance.setVerySmall(verySmall);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSmall method, of class StandarDeviation.
     */
    @Test
    public void testGetSmall() {
        System.out.println("getSmall");
        StandarDeviation instance = new StandarDeviation();
        double expResult = 1.0;
        double result = instance.getSmall();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSmall method, of class StandarDeviation.
     */
    @Test
    public void testSetSmall() {
        System.out.println("setSmall");
        double small = 1.0;
        StandarDeviation instance = new StandarDeviation();
        instance.setSmall(small);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMedium method, of class StandarDeviation.
     */
    @Test
    public void testGetMedium() {
        System.out.println("getMedium");
        StandarDeviation instance = new StandarDeviation();
        double expResult = 1.0;
        double result = instance.getMedium();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMedium method, of class StandarDeviation.
     */
    @Test
    public void testSetMedium() {
        System.out.println("setMedium");
        double medium = 0.0;
        StandarDeviation instance = new StandarDeviation();
        instance.setMedium(medium);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLarge method, of class StandarDeviation.
     */
    @Test
    public void testGetLarge() {
        System.out.println("getLarge");
        StandarDeviation instance = new StandarDeviation();
        double expResult = 1.0;
        double result = instance.getLarge();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLarge method, of class StandarDeviation.
     */
    @Test
    public void testSetLarge() {
        System.out.println("setLarge");
        double large = 0.0;
        StandarDeviation instance = new StandarDeviation();
        instance.setLarge(large);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVeryLarge method, of class StandarDeviation.
     */
    @Test
    public void testGetVeryLarge() {
        System.out.println("getVeryLarge");
        StandarDeviation instance = new StandarDeviation();
        double expResult = 1.0;
        double result = instance.getVeryLarge();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setVeryLarge method, of class StandarDeviation.
     */
    @Test
    public void testSetVeryLarge() {
        System.out.println("setVeryLarge");
        double veryLarge = 0.0;
        StandarDeviation instance = new StandarDeviation();
        instance.setVeryLarge(veryLarge);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAverage method, of class StandarDeviation.
     */
    @Test
    public void testGetAverage() {
        System.out.println("getAverage");
        StandarDeviation instance = new StandarDeviation();
        double expResult = 0.0;
        double result = instance.getAverage();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAverage method, of class StandarDeviation.
     */
    @Test
    public void testSetAverage() {
        System.out.println("setAverage");
        double average = 0.0;
        StandarDeviation instance = new StandarDeviation();
        instance.setAverage(average);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVariance method, of class StandarDeviation.
     */
    @Test
    public void testGetVariance() {
        System.out.println("getVariance");
        StandarDeviation instance = new StandarDeviation();
        double expResult = 0.0;
        double result = instance.getVariance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setVariance method, of class StandarDeviation.
     */
    @Test
    public void testSetVariance() {
        System.out.println("setVariance");
        double variance = 0.0;
        StandarDeviation instance = new StandarDeviation();
        instance.setVariance(variance);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getStandardDeviation method, of class StandarDeviation.
     */
    @Test
    public void testGetStandardDeviation() {
        System.out.println("getStandardDeviation");
        StandarDeviation instance = new StandarDeviation();
        double expResult = 0.0;
        double result = instance.getStandardDeviation();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
