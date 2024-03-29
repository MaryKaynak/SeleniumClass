package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAdjecentSibling {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hilal\\TechnoStudy\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.seleniumeasy.com/test/input-form-demo.html" );
        WebElement firstElement = driver.findElement( By.cssSelector( ".form-group" ) );

        System.out.println(firstElement.getAttribute( "outerHTML" ));
        System.out.println("---------------------------------------");
        WebElement siblingElement = driver.findElement( By.cssSelector( ".form-group + div" ) );

        System.out.println(siblingElement.getAttribute( "outerHTML" ));
       // driver.quit();
    }
    }

