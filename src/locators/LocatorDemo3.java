package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;


public class LocatorDemo3 extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before // First step to be executed
    public void setUp() {
        openBrowser(baseUrl); // Calling the method from BaseTest class
    }

    @Test
    public void locatorDemoTest3() {
        // Relative X-path
        driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Mobile");
        // X-path with "or"
        //input[@id='small-searchterms' or @name = 'q']

        // X-path with "and"
        //input[@id='small-searchterms' and @placeholder = 'Search store']

        // X-path with "contains()"
        //tagName[contains(@attribute,'value')]
        // input[contains(@id, 'sear')]

        // X-path with "starts-with"
        // tagName[starts-with(@attribute, 'value')]
        // input[starts-with(@id, 'small')]

        // X-path with "text()"
        // tagName[text() = 'value')]
        //a[text() = 'Log in']

        // X-path with "chained"
        // ul[@class= 'top-menu notmobile']//a[text() = 'Computers ']
    }

    @After
    public void tearDown() {
        closeBrowser(); // Calling the method from the BaseTest class to close the browser
    }
}




