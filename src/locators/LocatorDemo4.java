package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;


public class LocatorDemo4 extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before // First step to be executed
    public void setUp() {
        openBrowser(baseUrl); // Calling the method from BaseTest class
    }

    @Test
    public void locatorDemoTest2() {
        // CSS selector
        // tagName[attribute = 'value']
        // input[id='small-searchterms']
        driver.findElement(By.cssSelector("input[id='small-searchterms']")).sendKeys("Mobile");

        // input#small-searchterms # for ID
        // input.search-box-text.ui-autocomplete-input
    }

    @After
    public void tearDown() {
        closeBrowser(); // Calling the method from the BaseTest class to close the browser
    }
}




