package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\rinal\\IdeaProjects\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);

        String title = driver.getTitle();
        System.out.println(title);

        Thread.sleep(3000);
        driver.findElement(By.className("ico-login")).click();

        driver.findElement(By.id("Email")).sendKeys("testerrinpatel@gmail.com");
        Thread .sleep(3000);

        driver.findElement(By.id("Password")).sendKeys("Dasnadas2020");
        Thread.sleep(3000);

        driver.findElement(By.className("login-button")).click();


        driver.close();

        if(title.equals(" demo.nopcommerce.com")){
            System.out.println("The title is correct");
        }else{
            System.out.println("The title is incorrect");
        }
    }
}
