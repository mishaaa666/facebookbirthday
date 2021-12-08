import jdk.jfr.Threshold;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MiliTest extends TestManager {
    public String url = "https://mili.live/";

    @Test
    public void login() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.get(url);
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/section[1]/div/div[2]/div[1]/a")).click();
        findBackgroundAndWait(wait);
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div/div/div[2]/div[2]/div[1]/div/input")).click();

        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div/div/div[2]/div[2]/div[1]/div/input")).sendKeys(login);

        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div/div/div[2]/div[2]/div[2]/div/input")).click();

        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div/div/div[2]/div[2]/div[2]/div/input")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div/div/div[2]/div[2]/button[1]")).click();
        findBackgroundAndWait(wait);
//            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div/div/div[2]/div/div[1]/div/input"))));
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div/div/div[2]/div/div[1]/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div/div/div[2]/div/div[1]/div/input")).sendKeys(userName);
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div/div/div[2]/div/button")).click();
    }

    private void findBackgroundAndWait(WebDriverWait wait){
        if (driver.findElement(By.className("loading-background")) != null)
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loading-background")));
    }

}

