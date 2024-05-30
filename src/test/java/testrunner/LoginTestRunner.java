package testrunner;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import setup.Setup;

public class LoginTestRunner extends Setup {
        LoginPage loginPage;

        @Test(priority = 0, description = "User can login with valid credentials")
        public void doLoginWithValidCreds() throws InterruptedException {
            driver.get("https://staging-scweb.arcapps.org/");
            Thread.sleep(1000);
            loginPage = new LoginPage(driver);
            loginPage.doLogin("tester", "tester2023!");
            String textActual = driver.findElement(By.className("appTitle")).getText();
            String textExpected = "A Ministry of Health SmartCare System";
            Assert.assertTrue(textActual.contains(textExpected));
        }

}
