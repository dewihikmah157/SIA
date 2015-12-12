/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sia;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dewi
 */
public class Input_Data_SiswaTest {
    
    public Input_Data_SiswaTest() {
    }
    
    @BeforeClass
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
    }

    /**
     * Test of BersihData method, of class Input_Data_Siswa.
     */
    @Test
    public void testBersihData() {
        System.out.println("BersihData");
        Input_Data_Siswa instance = new Input_Data_Siswa();
        instance.BersihData();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of kelas method, of class Input_Data_Siswa.
     */
    @Test
    public void testKelas() {
        System.out.println("kelas");
        Input_Data_Siswa instance = new Input_Data_Siswa();
        instance.kelas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Input_Data_Siswa.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Input_Data_Siswa.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
