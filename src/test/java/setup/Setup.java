package setup;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.TestInstance;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Setup {

    public WebDriver driver;

    @BeforeTest
    public void setup() throws MalformedURLException {

        // Initiating the WebDriver
        DesiredCapabilities dc = new DesiredCapabilities();

        // Setting the browser as Chrome
        dc.setBrowserName("chrome");

        // Providing the URL for the docker Container
        URL url=new URL("http://localhost:4444/wd/hub");

        // Creating a webdriver
        RemoteWebDriver remoteWebDriver=new RemoteWebDriver(url,dc);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }

    @AfterTest
    public void closeBrowser() {

        driver.close();
    }
}
