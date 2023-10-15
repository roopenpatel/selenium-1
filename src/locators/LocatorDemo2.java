package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class LocatorDemo2 extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before // First step to be executed
    public void setUp() {
        openBrowser(baseUrl); // Calling the method from BaseTest class
    }

    @Test
    public void locatorDemoTest2() {
        // Class name locator  ---> To find multiple elements
        List<WebElement> sliderElementList = driver.findElements(By.className("nivo-imageLink"));
        System.out.println("Total Number Of Slides Are : " + sliderElementList.size());

        // Tage name locator ---> To find multiple elements
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total Number Of Links : " + links.size());
    }

    @After
    public void tearDown() {
        closeBrowser(); // Calling the method from the BaseTest class to close the browser
    }
}



