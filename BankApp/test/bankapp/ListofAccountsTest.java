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
public class ListofAccountsTest {
    
    public ListofAccountsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of findAcc method, of class ListofAccounts.
     */
    @Test
    public void testFindAcc() {
        System.out.println("findAcc");
        String name = "Piper";
        ListofAccounts instance = new ListofAccounts();
        instance.createCheckings("Piper", 10);
        int result = instance.findAcc(name);
        int expResult = 0;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of findAccString method, of class ListofAccounts.
     */
    @Test
    public void testFindAccString() {
        System.out.println("findAccString");
        String name = "Piper";
        ListofAccounts instance = new ListofAccounts();
        instance.createCheckings("Piper", 10);
        int i = instance.findAcc(name);
        String expResult = "You have $ " + instance.getAcc(i).getBalance();
        String result = instance.findAccString(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of createSavings method, of class ListofAccounts.
     */
    @Test
    public void testCreateSavings() {
        System.out.println("createSavings");
        String name = "Piper";
        double balance = 10.0;
        ListofAccounts instance = new ListofAccounts();
        instance.createSavings(name, balance);
        assertEquals(instance.sizeAcc(), 1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of createCheckings method, of class ListofAccounts.
     */
    @Test
    public void testCreateCheckings() {
        System.out.println("createCheckings");
        String name = "Piper";
        double balance = 10.0;
        ListofAccounts instance = new ListofAccounts();
        instance.createCheckings(name, balance);
        assertEquals(instance.sizeAcc(), 1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removeAcc method, of class ListofAccounts.
     */
    @Test
    public void testRemoveAcc() {
        System.out.println("removeAcc");
        String name = "Piper";
        ListofAccounts instance = new ListofAccounts();
        instance.createCheckings(name, 10.0);
        instance.removeAcc(name);
        assertEquals(instance.sizeAcc(), 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAcc method, of class ListofAccounts.
     */
    @Test
    public void testGetAcc() {
        System.out.println("getAcc");
        int i = 0;
        ListofAccounts instance = new ListofAccounts();
        instance.createCheckings("Piper", 10.0);
        String expResult = "Piper";
        String result = instance.getAcc(i).getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sizeAcc method, of class ListofAccounts.
     */
    @Test
    public void testSizeAcc() {
        System.out.println("sizeAcc");
        ListofAccounts instance = new ListofAccounts();
        int expResult = 0;
        int result = instance.sizeAcc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of displaySavingsAcc method, of class ListofAccounts.
     */
    @Test
    public void testDisplaySavingsAcc() {
        System.out.println("displaySavingsAcc");
        ListofAccounts instance = new ListofAccounts();
        instance.createSavings("Piper", 10.0);
        String expResult = "Piper has a total of $10.0 in the Savings Account.\n";
        String result = instance.displaySavingsAcc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of displayCheckingsAcc method, of class ListofAccounts.
     */
    @Test
    public void testDisplayCheckingsAcc() {
        System.out.println("displayCheckingsAcc");
        ListofAccounts instance = new ListofAccounts();
        instance.createCheckings("Piper", 10.0);
        String expResult = "Piper has a total of $10.0 in the Checkings Account.\n";
        String result = instance.displayCheckingsAcc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
