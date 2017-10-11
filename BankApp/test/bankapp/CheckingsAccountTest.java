/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapp;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ziwang
 */
public class CheckingsAccountTest {
    
    public CheckingsAccountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of withdraw method, of class CheckingsAccount.
     */
    @Test
    public void testWithdraw() {
        System.out.println("withdraw");
        double d = 1.0;
        CheckingsAccount instance = new CheckingsAccount("Piper", 10.0);
        double expResult = 8.9;
        double result = instance.withdraw(d);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class CheckingsAccount.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        CheckingsAccount instance = new CheckingsAccount("Piper", 10.0);
        String expResult = "Piper has a total of $10.0 in the Checkings Account.";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
