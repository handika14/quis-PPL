/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium_java;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Handika
 */
public class kuis {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/Semester 5/PPL/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.1crmcloud.com/login.php");
        driver.manage().window().maximize();
        driver.findElement(By.name("user_name")).sendKeys("admin");
        driver.findElement(By.name("user_password")).sendKeys("admin");
        WebElement website = driver.findElement(By.id("login_button"));
        website.click();
        Thread.sleep(6000);
        driver.findElement(By.className("default-avatar")).click();
        
    }
}
