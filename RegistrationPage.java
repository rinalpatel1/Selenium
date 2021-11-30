package SeleniumSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.className("female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Rinal");
        driver.findElement(By.id("LastName")).sendKeys("Patel");

        WebElement day = driver.findElement(By.name("DateOfBirthDay"));
        Select select =new Select(day);
        select.selectByVisibleText("3");


        WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
        Select select1 =new Select(month);
        select1.selectByVisibleText("May");


        WebElement year = driver.findElement(By.name("DateOfBirthYear"));
        Select select2 = new Select(year);
        select2.selectByVisibleText("1983");

        driver.findElement(By.id("Email")).sendKeys("testerrinpatel@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("Unify Testing");

        driver.findElement(By.id("Password")).sendKeys("Dasnadas2020");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Dasnadas2020");
        driver.findElement(By.id("register-button")).click();






    }
}
