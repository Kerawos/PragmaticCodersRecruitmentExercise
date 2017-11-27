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

    }
}