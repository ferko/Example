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
    public void seleniumPageTest() {
        webDriver.navigate().to("http://www.seleniumhq.org/");
        Assert.assertTrue(webDriver.getTitle().startsWith("Selenium"));
        element = webDriver.findElement(By.xpath("//*[@id=\"menu_documentation\"]/a"));
        Assert.assertEquals(element.getText(), "Documentation");
        element.click();
        Assert.assertTrue(webDriver.getTitle().startsWith("Selenium Documentation"));
    }

    @Test
    public void bcitPageTest() {
        webDriver.navigate().to("http://www.bing.com/");
        element = webDriver.findElement(By.xpath("//*[@id=\"sb_form_q\"]"));
        element.sendKeys("bcit");
        element.submit();
        element = webDriver.findElement(By.linkText("BCIT : : British Columbia Institute of Technology"));
        element.click();
        Assert.assertTrue(webDriver.getTitle().startsWith("BCIT"));
    }
}
