package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectFacilityPage {

    @FindBy(className= "custom-input")
    List<WebElement> selectField;

    @FindBy(className= "button")
    WebElement btnEnter;

    @FindBy(className= "border")
    List<WebElement> txtValue;


    public WebDriver driver;
    public SelectFacilityPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void selectProvinceByIndex() throws InterruptedException {

        Select selectProvince  = new Select(selectField.get(0));
        selectProvince.selectByIndex(5);

    }
    public void selectDistrictByIndex(){

        Select selectDistrict  = new Select(selectField.get(1));
        selectDistrict.selectByIndex(5);

    }
    public void searchFacility(String searchFacility) throws InterruptedException {

        selectField.get(2).click();
        txtValue.get(3).click();
        Thread.sleep(1000);
        btnEnter.click();

    }
}
