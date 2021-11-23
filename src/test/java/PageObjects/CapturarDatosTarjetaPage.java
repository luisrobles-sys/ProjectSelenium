package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CapturarDatosTarjetaPage {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//h4[1]")  private WebElement lbl_tarjeta;
    @FindBy(xpath = "//h4[2]")  private WebElement lbl_cvv;
    @FindBy(xpath = "//h4[3]")  private WebElement lbl_fecha;
    @FindBy(xpath = "//h4[4]")  private WebElement lbl_montoDisponible;

    public CapturarDatosTarjetaPage(WebDriver d){
        driver=d;
        wait= new WebDriverWait(driver,30);
        PageFactory.initElements(driver,this);
    }
    public void CapturarTarjeta(){      //Método para lbl_tarjeta
        wait.until(ExpectedConditions.visibilityOf(lbl_tarjeta));
        lbl_tarjeta.getText();
        System.out.println(lbl_tarjeta.getText());
    }
    public void CapturarCVV(){      //Método para lbl_cvv
        //wait.until(ExpectedConditions.visibilityOf(lbl_cvv));     //Ya no es necesario porque capturó el primer wait.
        lbl_cvv.getText();
        System.out.println(lbl_cvv.getText());
    }
    public void CapturarFecha(){      //Método para lbl_fecha
        //wait.until(ExpectedConditions.visibilityOf(lbl_fecha));
        lbl_fecha.getText();
        System.out.println(lbl_fecha.getText());
    }
    public void CapturarMonto(){      //Método para lbl_montoDisponible
        //wait.until(ExpectedConditions.visibilityOf(lbl_montoDisponible));
        lbl_montoDisponible.getText();
        System.out.println(lbl_montoDisponible.getText());
    }
}
