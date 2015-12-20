/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sia;
import sia.*;
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
public class LOGINIT {
    
    public LOGINIT() {
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
     * Test of login method, of class LOGIN.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String a = "";
        String b = "";
        LOGIN instance = new LOGIN();
        instance.login(a, b);
        assertEquals(a,b);
    }
 @Test
    public void testLogin1() {
        System.out.println("login");
        String a = "dewa";
        String b ="bismillah";
        LOGIN instance = new LOGIN();
        String a1 = "dewi";
        String b1 = "bismillah";
        instance.login(a, b);
        assertEquals(b,b1);
         
         }
}
