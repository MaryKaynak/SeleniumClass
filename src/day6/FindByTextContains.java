package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FindByTextContains {
    // https://www.seleniumeasy.com/test/input-form-demo.html
    // fill in the form using xpath by attribute,
    // by contains(),
    // by index,
    // also by child
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hilal\\TechnoStudy\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
        driver.findElement(By.xpath("//*[@name='first_name']")).sendKeys("Hilal");
        driver.findElement(By.xpath("//*[@name='last_name']")).sendKeys("Kaynak");
        driver.findElement(By.xpath("//*[@name='email']")).sendKeys("marykaynak@gmail.com");
        driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("8622628941");
        driver.findElement(By.xpath("//*[@name='address']")).sendKeys("148 Merselis ave Clifton");
        driver.findElement(By.xpath("//*[@name='city']")).sendKeys("Clifton");
        driver.findElement(By.xpath("//*[@name='zip']")).sendKeys("07011");
        driver.findElement(By.xpath("//*[@name='website']")).sendKeys("chrome");
        List<WebElement> radio = driver.findElements(By.xpath("//*[@name='hosting']"));
        WebElement select = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[7]/div/div/select"));
        Select dropdown = new Select(select);
          dropdown.selectByIndex(31);
        WebElement elementRadio = radio.get(1);
        elementRadio.click();
        driver.findElement(By.xpath("//*[@name='comment']")).sendKeys("Project description");
       // WebElement submitbutton = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[13]/div/button"));
      //  submitbutton.click();
    }
}
