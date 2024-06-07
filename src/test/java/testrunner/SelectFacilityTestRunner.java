package testrunner;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SelectFacilityPage;
import setup.Setup;

public class SelectFacilityTestRunner extends Setup {
    LoginPage loginPage;
    SelectFacilityPage selectFacilityPage;

    @Test(priority = 0)
    public void testSelectProvinceByIndex() throws InterruptedException {
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

    }

    @Test(priority = 1)
    public void testSelectDistrictByIndex() throws InterruptedException {
        Thread.sleep(2000);
        selectFacilityPage.selectDistrictByIndex();

    }

    @Test(priority = 2)
    public void testSearchFacility() throws InterruptedException {
        Thread.sleep(2000);
        selectFacilityPage.searchFacility("Dr Watson Dental Clinic");
        Thread.sleep(2000);

    }
}
