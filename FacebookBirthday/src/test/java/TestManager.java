import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TestManager {

    protected static WebDriver driver;
    public static String login;
    public static String password;
    @BeforeAll
    public static void setUp () throws IOException {
      /*  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter the user login and password :: ");
        login=br.readLine();
        password= br.readLine();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Facebook login and password");*/

        login="+380505280917";
        password="testpassword123";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\annwr\\IdeaProjects\\FacebookBirthday\\src\\test\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);

    }

    @AfterAll
    public static void tearDown (){
    //    driver.quit();
    }
    public static WebDriver getDriver() {
        return driver;
    }
}
