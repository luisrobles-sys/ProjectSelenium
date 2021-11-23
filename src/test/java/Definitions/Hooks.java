package Definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    public static WebDriver driver;

    @Before  //Inicializa y maximiza
    public static void setUp() {

        //System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");   -- para Mac no lleva extensión
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        //driver = new FirefoxDriver(); -- para Firefox
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    // El trabajo del Robot Automatizado.
    @After  //Limpia los Cookies y cerrar la conexión.
    public static void tearDown (){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
