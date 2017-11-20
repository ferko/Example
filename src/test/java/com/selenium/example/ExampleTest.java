package com.selenium.example;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by frank on 10/24/2017.
 */
public class ExampleTest {

    NameFormatter formatter = new NameFormatter();

    @Test
    public void firstTest() {
        Assert.assertEquals(formatter.formatName("frank berenyi"), "Frank Berenyi");
    }

    @Test
    public void secondTest() {
        Assert.assertEquals(formatter.formatName("FRANK BERENYI"), "Frank Berenyi");
    }
}
