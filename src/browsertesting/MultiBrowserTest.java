package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static String browser = "Chrome";
    static WebDriver driver;
    static String baseUrl = "https://demo.nopcommerce.com/";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser Name");
        }
        driver.manage().window().maximize();
        driver.get(baseUrl);
        System.out.println(driver.getTitle());
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
       // driver.quit();
    }
}
