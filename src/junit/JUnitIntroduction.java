package junit;

import org.junit.*;

public class JUnitIntroduction {
    @BeforeClass
    public static void connectToDB() { // Very First Method to be executed
        System.out.println("DB Connection");
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        System.out.println("Navigate To Login Page");
    }

    @Test
    public void test() {
        System.out.println("Test Method");
    }

    @Before
    public void openBrowser() {
        System.out.println("Opening The Browser");
    }

    @After
    public void closeBrowser() {
        System.out.println("Closing The Browser");
    }

    @AfterClass
    public static void closeDB() {
        System.out.println("DB Connection Out");
    }
}
