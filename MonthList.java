package SeleniumSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MonthList {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(3000);

        driver.findElement(By.className("ico-register")).click();
        Thread.sleep(3000);

        driver.findElement(By.name("DateOfBirthMonth"));

        WebElement month = driver.findElement(By.name("DateOfBirthMonth"));

        Select select = new Select(month);

        List<WebElement> monthList = select.getOptions();

        System.out.println(monthList.size());

        for(int i=0;i < monthList.size();i++) {
            String value = monthList.get(i).getText();
            System.out.println(value);
        }
    }
}
