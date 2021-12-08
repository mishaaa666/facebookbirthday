
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MiliTest extends TestManager {
    public String url = "https://mili.live/";

    @Test
    public void registration() {
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
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div/div/div[2]/div/div[1]/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div/div/div[2]/div/div[1]/div/input")).sendKeys(userName);
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div/div/div[2]/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div/div/div[2]/div/div/div[1]/div[1]/div")).click();;
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div/div/div[2]/div/div/div[2]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div/div/div[2]/div[2]/div[2]/div/div[2]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div/div[2]/div/header/div[2]/div[2]/div[1]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/a[3]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[2]/div[2]/div/div[2]/div/button[1]")).click();
    }

    @Test
    public void login() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.get(url);
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/section[1]/div/div[2]/div[1]/a")).click();
        findBackgroundAndWait(wait);
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div/div/div[2]/div[1]/ul/li[2]/a")).click();
        findBackgroundAndWait(wait);
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div/div/div[2]/div[2]/div[1]/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div/div/div[2]/div[2]/div[1]/div/input")).sendKeys(login1);
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div/div/div[2]/div[2]/div[2]/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div/div/div[2]/div[2]/div[2]/div/input")).sendKeys(password1);
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div/div/div[2]/div[2]/button[1]")).click();


    }

    private void findBackgroundAndWait(WebDriverWait wait){
        if (driver.findElement(By.className("loading-background")) != null)
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loading-background")));
    }

}

