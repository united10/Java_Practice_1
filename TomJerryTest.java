package com.company;

import static org.junit.Assert.*;

7public class TomJerryTest {

    @org.junit.Test
    public void tomJerry1() {
    TomJerry input=new TomJerry();
    String expected="Jerry";
    String Imp =  input.TomJerry1(24);
    assertEquals(Imp,expected);
    }
}