package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

public class Opera {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.opera.driver", "C:\\Users\\rinal\\IdeaProjects\\Software\\operadriver_win64\\operadriver.exe");

        WebDriver driver = new OperaDriver();
        driver.get("https://demo.nopcommerce.com/registerresult/1?returnUrl=/");
        Thread.sleep(4000);
        driver.manage().window().maximize();
        Thread.sleep(4000);

        driver.findElement(By.className("ico-login")).click();

        driver.findElement(By.id("Email")).sendKeys("testerrinpatel@gmail.com");
        Thread.sleep(4000);

        driver.findElement(By.id("Password")).sendKeys("Dasnadas2020");
        Thread.sleep(4000);

        driver.findElement(By.className("login-button")).click();

        driver.close();


    }
}
