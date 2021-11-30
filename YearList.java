package SeleniumSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class YearList {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(3000);

        driver.findElement(By.className("ico-register")).click();
        Thread.sleep(3000);

        driver.findElement(By.name("DateOfBirthYear"));

        WebElement year = driver.findElement(By.name("DateOfBirthYear"));

        Select select = new Select(year);

        List<WebElement> yearList = select.getOptions();

        System.out.println(yearList.size());

        for(int i=0;i < yearList.size();i++) {
            String value = yearList.get(i).getText();
            System.out.println(value);
        }
    }
}
