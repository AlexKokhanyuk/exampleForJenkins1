package com.epam;
import java.util.Random;


/**
 * Created by Oleksandr_Kokhanyuk on 8/15/2016.
 */
public class exampleforjankins1Test {

    @org.junit.Test
    public void testMain() throws Exception {
        Random random = new Random();
        assert (random.nextBoolean());
    }
}