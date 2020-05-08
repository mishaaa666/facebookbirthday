
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;
import java.util.*;

public class FacebookTest extends TestManager {
    public String url = "https://www.facebook.com/";
    List<String> phrases = new LinkedList<>();

    @Test
    public void login() {
        driver.get(url);
        driver.findElement(By.cssSelector("input[id='email']")).sendKeys(login);
        driver.findElement(By.cssSelector("input[id='pass']")).sendKeys(password);
        driver.findElement(By.cssSelector("label[id='loginbutton']")).click();
    }

    @Test
    public void HappyBirthday() {
       phrases.add("be healthy and wealthy");
        //phrases.add("good luck have fun");
       // phrases.add("")*/
        phrases.add("! Щастя здоровля");
        phrases.add("! Море удачи и дачу у моря");
        phrases.add("! Чтобы у тебя все было и ничего тебе за это не было");
        phrases.add("! Діточок як в небі зірочок");
        phrases.add("flalalal");
        phrases.add("befthe");
        phrases.add("flalwhtrhtehalal");
        phrases.add("alqehw4alal");
        phrases.add("aehtjjdyuhmu");
        phrases.add("1111111111111");
        Random rand = new Random();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        //   wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("a[href='/events?ref=46&action_history=null']"))));
        driver.findElement(By.cssSelector("a[href='/events?ref=46&action_history=null']")).click();
        driver.findElement(By.cssSelector("a[href='/events/birthdays/?acontext=%7B%22ref%22%3A%222%22%2C%22ref_dashboard_filter%22%3A%22upcoming%22%2C%22action_history%22%3A%22%5B%7B%5C%22surface%5C%22%3A%5C%22dashboard%5C%22%2C%5C%22mechanism%5C%22%3A%5C%22main_list%5C%22%2C%5C%22extra_data%5C%22%3A%7B%5C%22dashboard_filter%5C%22%3A%5C%22upcoming%5C%22%7D%7D%5D%22%7D']")).click();
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div#birthdays_today_card")));
        } catch (TimeoutException ex) {
            System.out.println("There are no birthdays today");
        }
        String userName="";
        List<WebElement> list = driver.findElements(By.cssSelector("textarea[class='enter_submit uiTextareaNoResize uiTextareaAutogrow uiStreamInlineTextarea inlineReplyTextArea mentionsTextarea textInput']"));
        for (int i = 1; i <= list.size(); i++) {
            String xPath = "//*[@id='birthdays_content']/div[1]/div[2]/ul/li/div/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/a";
            StringBuffer b = new StringBuffer (xPath);
            String si = "[" + i + "]";
            xPath = xPath.substring(0, 47 + 1) + si + xPath.substring(47 + 1);
            System.out.println(xPath);
            WebElement element = driver.findElement(By.xpath(xPath));
            userName=element.getText();
            System.out.println(userName);
            driver.findElement(By.cssSelector("textarea[class='enter_submit uiTextareaNoResize uiTextareaAutogrow uiStreamInlineTextarea inlineReplyTextArea mentionsTextarea textInput']")).sendKeys("Привет, " + userName + phrases.get(rand.nextInt(phrases.size())) + Keys.ENTER);
           wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("textarea[class='enter_submit uiTextareaNoResize uiTextareaAutogrow uiStreamInlineTextarea inlineReplyTextArea mentionsTextarea textInput']")));
        }


    }
}
