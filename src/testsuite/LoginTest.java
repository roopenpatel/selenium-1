package testsuite;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before // First step to be executed
    public void setUp() {
        openBrowser(baseUrl); // Calling the method from BaseTest class
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        System.out.println("The Page Title : " + driver.getTitle());
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        String expectedMessage = "Welcome, Please Sign In!"; // Test case to compare the text displayed on the webpage
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(), 'Welcome, Please Sign In!')]"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
        // Or
        // Assert.assertEquals("Not Redirected To Login Page ", "Welcome, Please Sign In!", "Welcome, PLease Sign In!");
    }

    @After
    public void tearDown() {
        closeBrowser(); // Calling the method from the BaseTest class to close the browser
    }
}
