package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFireFox {
    public static void main(String[] args) throws InterruptedException{
    System.setProperty("webdriver.geckodriver.driver","C:\\Users\\rinal\\IdeaProjects\\Software\\geckodriver.exe");

    WebDriver driver = new FirefoxDriver();
    driver.get("https://demo.nopcommerce.com/");
    Thread.sleep(3000);
    driver.manage().window().maximize();

    Thread.sleep(3000);
    driver.findElement(By.className("ico-login")).click();

    driver.findElement(By.id("Email")).sendKeys("testerrinpatel@gmail.com");
    Thread .sleep(3000);

    driver.findElement(By.id("Password ")).sendKeys("Dasnadas2020");
    Thread.sleep(3000);

        driver.findElement(By.className("login-button")).click();


    }
}
