package testrunner;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SelectFacilityPage;
import pages.UserPage;
import setup.Setup;

public class UserTestRunner extends Setup {

    LoginPage loginPage;
    SelectFacilityPage selectFacilityPage;
    UserPage userPage;

    @Test(priority = 0)
    public void testSearchPatient() throws InterruptedException {

        driver.get("https://staging-scweb.arcapps.org/");
        loginPage = new LoginPage(driver);
        loginPage.doLogin("tester", "tester2023!");
        Thread.sleep(1000);
        String textActual = driver.findElement(By.className("appTitle")).getText();
        String textExpected = "A Ministry of Health SmartCare System";
        Assert.assertTrue(textActual.contains(textExpected));
        Thread.sleep(1000);
        selectFacilityPage = new SelectFacilityPage(driver);
        selectFacilityPage.selectProvinceByIndex();
        selectFacilityPage.selectDistrictByIndex();
        selectFacilityPage.searchFacility("Dr Watson Dental Clinic");
        Thread.sleep(2000);
        userPage =new UserPage(driver);
        Thread.sleep(2000);
        userPage.searchPatient("111111111");
    }

    @Test(priority = 1)
    public void testServicePatient() throws InterruptedException {
        Thread.sleep(2000);
        userPage.servicePatient();
    }

    @Test(priority = 2)
    public void testPatientInformation() throws InterruptedException {
        Thread.sleep(5000);
        userPage.patientInformation("38","38","90","67","65","15","98","new");
        Thread.sleep(8000);

    }
}
