package day3.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SimpleFormTask1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hilal\\TechnoStudy\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        WebElement message = driver.findElement( By.id( "user-message" ) );
        String myMessage = "Test string!";
        message.sendKeys( myMessage );

        List<WebElement> buttons = driver.findElements( By.tagName( "button" ) );
        for(WebElement button: buttons){
//            System.out.println(button.getText());
            if(button.getText().equals( "Show Message" )){
                button.click();
            }
        }

        WebElement display = driver.findElement( By.id( "display" ) );
        String text = display.getText();

        if(text.equals( myMessage )){
            System.out.println("Success!");
        } else {
            System.out.println("Failure!");
        }


       // driver.quit();
    }
}

