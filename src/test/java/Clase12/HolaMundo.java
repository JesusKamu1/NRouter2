package Clase12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HolaMundo {
    public WebDriver driver;
    @Test(groups = {"testDos"})
    public  void facebookTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        String titulo = driver.getTitle();
        String url = driver.getCurrentUrl();

        System.out.println("Titulo ---> "+ titulo);
        System.out.println("URL --> "+ url);

        driver.findElement(By.id("email")).sendKeys("testing@test.com");
        driver.findElement(By.name("pass")).sendKeys("testing");
        // driver.findElement(By.name("login")).click();
        driver.findElement(By.tagName("button")).click();

//
        Thread.sleep(4000);
        driver.close();

    }
}
