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
public class Iinpt_Data_MatapelajaranIT {
    
    public Iinpt_Data_MatapelajaranIT() {
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
     * Test of save method, of class Iinpt_Data_Matapelajaran.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        String KJ = "";
        String J = "";
        String L = "";
        Iinpt_Data_Matapelajaran instance = new Iinpt_Data_Matapelajaran();
        instance.save(KJ, J, L);
        
    }
}