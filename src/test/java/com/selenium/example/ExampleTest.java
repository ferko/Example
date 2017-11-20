package com.selenium.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Created by frank on 10/24/2017.
 */
public class ExampleTest {
    WebDriver webDriver;
    WebElement element;
    @Before
    public void init() {
        System.setProperty("webdriver.chrome.driver", "C://Tools/chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    @Test
    public void firstTest() {
        Assert.assertTrue(true);
    }

    @Test
    public void secondTest() {

        Assert.assertTrue(true);
    }
}
