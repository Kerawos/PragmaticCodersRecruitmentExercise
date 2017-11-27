package main.java.pl.mareksowa.models;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CommissionTest {

    private static Commission commission;

    @BeforeClass public static void start(){
        commission = new Commission();
    }

    @AfterClass public static void stop(){
        commission = null;
    }

    @Test public void testExample1() throws Exception {
        assertEquals(commission.calculateCommissions("2016-11-11", "2017-01-11", 1), "100PLN");
    }

    @Test public void testExample2() throws Exception {
        assertEquals(commission.calculateCommissions("2016-06-01", "2017-06-01", 2), "0PLN");
    }

    @Test public void testExample3() throws Exception {
        assertEquals(commission.calculateCommissions("2016-06-01", "2017-06-01", 3), "810.03KC");
    }
}