package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        // http://the-internet.herokuapp.com/add_remove_elements/
        // write a function that takes a number, and clicks the "Add Element" button
        // given number of times, and then validate that given number of
        // "Delete" buttons is displayed
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hilal\\TechnoStudy\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get( "http://the-internet.herokuapp.com/add_remove_elements/" );
        clickAndValidateButtons(driver, 100);

        //driver.quit();
    }

    private static void clickAndValidateButtons(WebDriver driver, int num) {
        WebElement btn = driver.findElement( By.xpath("//*[@onclick='addElement()']"));
        for (int i = 0; i < num; i++) {
            btn.click();
        }
        List<WebElement> list = driver.findElements(By.className("added-manually"));
        if (list.size() == num) {
            System.out.println("success!");
        }
        else
            System.out.println("fail!");
    }
}

