package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/";
        // Launch the browser
        WebDriver driver = new ChromeDriver();
        // Open the URL into browser
        driver.get(baseUrl);
        // Maximize the browser
        driver.manage().window().maximize();
        // We're giving the Implicit Wait to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Get the Title of the page
        String title = driver.getTitle();
        System.out.println(title);
        // Get the current URL
        System.out.println("The Current URL : " + driver.getCurrentUrl());
        // Get page source
        System.out.println("The Page Source : " + driver.getPageSource());
        // Find the login link element
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        // click on login link element
        loginLink.click();
        // Find the email field element
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("prime123@gmail.com");
        // Find the password field link element
        driver.findElement(By.name("Password")).sendKeys("Prime123");
        // closing the browser
        driver.close();
        driver.quit(); // find the difference between .close() and .quit();
    }
}
