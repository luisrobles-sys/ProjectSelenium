package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class CapturarDatosTarjetaPage {
    //private --> Solo se usada dentro de la misma clase.
    //public --> Solo pueden ser usadas dentro de todo el proyecto.
    //protected static --> Pueden ser usadas dentro del mismo paquete.

    private WebDriver driver;
    private WebDriverWait wait;
    //protected static String tarjeta, cvv, mes, anio, monto;       //Es otra forma.
    protected static String tarjeta;
    protected static String cvv;
    protected static String mes;
    protected static String anio;
    protected static String monto;

    @FindBy(xpath = "//h4[1]")  private WebElement lbl_tarjeta;
    @FindBy(xpath = "//h4[2]")  private WebElement lbl_cvv;
    @FindBy(xpath = "//h4[3]")  private WebElement lbl_fecha;
    @FindBy(xpath = "//h4[4]")  private WebElement lbl_montoDisponible;

    public CapturarDatosTarjetaPage(WebDriver d){
        driver=d;
        wait= new WebDriverWait(driver,30);
        PageFactory.initElements(driver,this);
    }

    public void CambiarVentana(){
        int ventana=0;
        Set<String> identificadores = driver.getWindowHandles();         //Todos los identificadores de cada ventana
        for (String identificador: identificadores){
            ventana++;
            driver.switchTo().window(identificador);
            System.out.println(ventana+" : "+ identificador);
        }
    }

    public void CapturarTarjeta(){      //Método para lbl_tarjeta
        wait.until(ExpectedConditions.visibilityOf(lbl_tarjeta));
        tarjeta=lbl_tarjeta.getText().replace("Card Number:- ", "");
        System.out.println(tarjeta);
        //lbl_tarjeta.getText();
        //System.out.println(lbl_tarjeta.getText());
    }
    public void CapturarCVV(){      //Método para lbl_cvv
        //wait.until(ExpectedConditions.visibilityOf(lbl_cvv));     //Ya no es necesario porque capturó el primer wait.
        cvv=lbl_cvv.getText().replace("CVV:- ", "");
        System.out.println(cvv);
        //lbl_cvv.getText();
        //System.out.println(lbl_cvv.getText());
    }
    public void CapturarFecha(){      //Método para lbl_fecha
        //wait.until(ExpectedConditions.visibilityOf(lbl_fecha));
        //mes=lbl_fecha.getText().replace("Exp:- ", "");
        String dato []= lbl_fecha.getText().replace("Exp:- ","").split("/");
        mes = dato[0];
        anio = dato[1];
        //  Exp:-   01/2020
        //  replace("Exp:- ","")
        System.out.println(mes);
        System.out.println(anio);
        //lbl_fecha.getText();
        //System.out.println(lbl_fecha.getText());
    }
    public void CapturarMonto(){      //Método para lbl_montoDisponible
        //wait.until(ExpectedConditions.visibilityOf(lbl_montoDisponible));
        monto=lbl_montoDisponible.getText().replace("Credit Limit $", "");
        System.out.println(monto);
        //lbl_montoDisponible.getText();
        //System.out.println(lbl_montoDisponible.getText());
    }
    public void CerrarVenta(){
        driver.close();
        driver.switchTo().window("");
    }
}
