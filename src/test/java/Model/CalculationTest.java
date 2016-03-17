/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Controller;
import java.util.List;
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
public class CalculationTest {
    
    public CalculationTest() {
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
     * Test of average method, of class Calculation.
     */
    @Test
    public void testAverage() {
        System.out.println("average");
        String fileName = "test1.txt";
        Controller instance = new Controller();
        List<ClassesInfo> classInfoList = instance.loadClassInfo(fileName); 
        double expResult = 2.801517529591993;
        double result = Calculation.average(classInfoList);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of variance method, of class Calculation.
     */
    @Test
    public void testVariance() {
        System.out.println("variance");
        String fileName = "test1.txt";
        Controller instance = new Controller();
        List<ClassesInfo> classInfoList = instance.loadClassInfo(fileName); 
        double expResult = 0.43625283003464466;
        double result = Calculation.variance(classInfoList);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
