package org.labs;

import org.labs.Five.MakeCoffee;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MakeCoffeeTest {

    MakeCoffee mc;
    @BeforeAll
    void init(){
        mc = new MakeCoffee();
    }

    @Test
    void testMakeCoffee(){

        String steps = "Y21456";
        ByteArrayInputStream bais = new ByteArrayInputStream(steps.getBytes());
        System.setIn(bais);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);

        MakeCoffee.main(null);

        String actual = baos.toString();
        //TODO
        //String expected
        //assertion todo
    }
}
