package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class CommonApi {

    public WebDriver driver = null;

    @BeforeMethod
    public void setUp(@Optional("true") String url) {
        System.setProperty("webdriver.chrome.driver", "/Users/emdadripon/Downloads/chromedriver-3");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://providers.kaiserpermanente.org");
        driver.manage().window().maximize();
    }

    @Test
    public void home(){
        System.out.println(driver.getPageSource());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

