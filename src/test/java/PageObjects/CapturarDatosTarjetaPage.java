package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CapturarDatosTarjetaPage {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//h4[1]")  private WebElement lbl_tarjeta;
    @FindBy(xpath = "//h4[2]")  private WebElement lbl_cvv;
    @FindBy(xpath = "//h4[3]")  private WebElement lbl_fecha;

    public CapturarDatosTarjetaPage(WebDriver d){
        driver=d;
        wait= new WebDriverWait(driver,30);
        PageFactory.initElements(driver,this);
    }
}
