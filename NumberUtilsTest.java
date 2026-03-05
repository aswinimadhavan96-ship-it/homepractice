/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class NumberUtilsTest {
    @Test
    public void testFactorial() {

        int result = NumberUtils.factorial(5);

        assertEquals(120, result);
    }

     @Test
    public void testPrimeNumber() {

        boolean result = NumberUtils.isPrime(5);

        assertTrue(result);
    }

     @Test
    public void testNotPrimeNumber() {

        boolean result = NumberUtils.isPrime(8);

        assertFalse(result);
    }
}