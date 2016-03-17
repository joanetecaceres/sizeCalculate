/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static java.lang.Double.NaN;
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
public class ClassesInfoTest {
    
    public ClassesInfoTest() {
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
     * Test of getClassName method, of class ClassesInfo.
     */
    @Test
    public void testGetClassName() {
        System.out.println("getClassName");
        ClassesInfo instance = new ClassesInfo();
        String expResult = null;
        String result = instance.getClassName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setClassName method, of class ClassesInfo.
     */
    @Test
    public void testSetClassName() {
        System.out.println("setClassName");
        String className = "";
        ClassesInfo instance = new ClassesInfo();
        instance.setClassName(className);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLoc method, of class ClassesInfo.
     */
    @Test
    public void testGetLoc() {
        System.out.println("getLoc");
        ClassesInfo instance = new ClassesInfo();
        double expResult = 0.0;
        double result = instance.getLoc();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLoc method, of class ClassesInfo.
     */
    @Test
    public void testSetLoc() {
        System.out.println("setLoc");
        double loc = 0.0;
        ClassesInfo instance = new ClassesInfo();
        instance.setLoc(loc);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfMethods method, of class ClassesInfo.
     */
    @Test
    public void testGetNumberOfMethods() {
        System.out.println("getNumberOfMethods");
        ClassesInfo instance = new ClassesInfo();
        double expResult = 0.0;
        double result = instance.getNumberOfMethods();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberOfMethods method, of class ClassesInfo.
     */
    @Test
    public void testSetNumberOfMethods() {
        System.out.println("setNumberOfMethods");
        double numberOfMethods = 0.0;
        ClassesInfo instance = new ClassesInfo();
        instance.setNumberOfMethods(numberOfMethods);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of naturalLogarithmOfLocPerMethod method, of class ClassesInfo.
     */
    @Test
    public void testNaturalLogarithmOfLocPerMethod() {
        System.out.println("naturalLogarithmOfLocPerMethod");
        ClassesInfo instance = new ClassesInfo();
        double expResult = NaN;
        double result = instance.naturalLogarithmOfLocPerMethod();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
