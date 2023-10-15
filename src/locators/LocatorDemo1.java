package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LocatorDemo1 extends BaseTest {
    String baseUrl = "https://www.letskodeit.com/login";

    @Before // First step to be executed
    public void setUp() {
        openBrowser(baseUrl); // Calling the method from BaseTest class
    }

    @Test
    public void locatorDemoTest1() {
        // ID and Name locators
        driver.findElement(By.id("email")).sendKeys("prime123@gmail.com"); // Using the ID locator
        driver.findElement(By.name("password")).sendKeys("prime123"); // Using Name locator
        driver.findElement(By.linkText("Forgot Password?")).click(); // Link text locator
        driver.findElement(By.partialLinkText("Sign")).click(); // Partial Link Text Locator
    }

    @After
    public void tearDown() {
        closeBrowser(); // Calling the method from the BaseTest class to close the browser
    }
}
