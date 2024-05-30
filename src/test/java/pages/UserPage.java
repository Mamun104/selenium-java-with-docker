package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UserPage {

    @FindBy(tagName= "button")
    List<WebElement> nrcBtn;
    @FindBy(name= "nrc")
    WebElement nrcValue;
    @FindBy(className = "flex")
    List<WebElement> selectService;

    @FindBy(xpath= "//button[normalize-space()='Add Vital']")
    WebElement addVitalBtn;

    @FindBy(className = "custom-input")
    List <WebElement> formData;

    @FindBy(className= "main_btn")
    WebElement btnSave;


    public WebDriver driver;
    public UserPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void searchPatient(String nrcInput) throws InterruptedException {
        nrcBtn.get(12).click();
        Thread.sleep(1000);
        nrcValue.sendKeys(nrcInput);
        nrcValue.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        nrcBtn.get(21).click();
    }
    public void servicePatient(){
        selectService.get(37).click();
    }
    public void patientInformation( String temperature, String systollc, String diastollc, String pulseRate, String resplratoryRate, String   Oxygen,String abdominal, String note) throws InterruptedException {
        addVitalBtn.click();
        Thread.sleep(2000);
        formData.get(4).sendKeys(temperature);
        formData.get(5).sendKeys(systollc);
        formData.get(6).sendKeys(diastollc);
        formData.get(8).sendKeys(pulseRate);
        formData.get(9).sendKeys(resplratoryRate);
        formData.get(10).sendKeys(Oxygen);
        formData.get(9).sendKeys(resplratoryRate);
        formData.get(13).sendKeys(abdominal);
        formData.get(16).sendKeys(note);
        btnSave.click();



    }


}
