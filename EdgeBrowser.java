package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","C:\\Users\\rinal\\IdeaProjects\\Software\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep (3000);
        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.findElement(By.className("ico-register")).click();

        Thread.sleep(3000);
        driver.navigate().back();

        Thread.sleep(3000);
        driver.navigate().forward();

        Thread.sleep(3000);
        driver.navigate().back();

        Thread.sleep(3000);
        driver.navigate().refresh();

        String url = driver.getTitle();
        System.out.println(url);

    }

}
