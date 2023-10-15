package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeOptionsExamples {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications"); // Disabling the browser notifications
        options.addArguments("--incognito"); // Opening browser in private window
        options.addArguments("--headless"); // Running the test without opening the browser

        String baseUrl = "https://www.justdial.com/";
        // Launch the browser
        WebDriver driver = new ChromeDriver(options);
        // Open the URL into browser
        driver.get(baseUrl);
        // Maximize the browser
        driver.manage().window().maximize();
        // We're giving the Implicit Wait to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        System.out.println("The Page Title : " + driver.getTitle());
    }
}
