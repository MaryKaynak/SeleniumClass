package day3.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingElementOnPage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hilal\\TechnoStudy\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/hilal/selenium/src/day3/resources/form.html");
        List<String> tagsForTesting = new ArrayList<>( Arrays.asList( "h1", "h2", "h3", "p", "input", "option", "br", "select" ) );
        for(String tag : tagsForTesting) {
            printNumberOfElementsOnAPage( driver, tag );
        }

        //driver.quit();
    }
    static void printNumberOfElementsOnAPage(WebDriver driver, String tagName) {
        List<WebElement> elements = driver.findElements( By.tagName( tagName ) );
        System.out.println( "There is(are) " + elements.size() + " " + tagName + " tag(s) on page!" );
    }
}
