package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) {
        System.setProperty( "webdriver.chrome.driver", "C:\\Users\\hilal\\TechnoStudy\\Selenium\\chromedriver\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.techno.study/" );
    }
}
