/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

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
public class LoadFileTest {
    
    public LoadFileTest() {
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
     * Test of loadDataFromFile method, of class LoadFile.
     */
    @Test
    public void testLoadDataFromFile() {
        System.out.println("loadDataFromFile");
        String fileName = "test1.txt";
        List<ClassesInfo> expResult = LoadFile.loadDataFromFile(fileName);
        List<ClassesInfo> result = LoadFile.loadDataFromFile(fileName);
        assertEquals(expResult.size(), result.size());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
