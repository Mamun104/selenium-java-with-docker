# Run Selenium Tests In Docker

## Below are the steps to follow to run the Selenium Tests in Docker

## Prerequisites:
- Docker: Ensure you have Docker installed on your machine. You can download and install Docker from the official website (https://www.docker.com/get-started).

                      C:\Users\user>docker --version
                      Docker version 24.0.7, build afdd53b
## Step 1: Create the Selenium Grid Hub

- Create a Docker container for the Selenium Grid hub. The hub coordinates the test execution on various nodes.

                      docker run -d -p 4444:4444 --name selenium-hub selenium/hub:4.0.0


- This command pulls the Selenium Grid hub image (if not already available) and starts a container named “selenium-hub” on port 4444.

## Step 2: Create Selenium Grid Nodes

- Now, create Docker containers for the Selenium Grid nodes. Nodes are responsible for executing test scripts on specific browser and platform configurations.

- For example, to create a Chrome node:

                                 docker run -d -P -e HUB_HOST=selenium-hub --name selenium-node-chrome selenium/node-chrome:4.0.0

- And for a Firefox node:

                               docker run -d -P -e HUB_HOST=selenium-hub --name selenium-node-firefox selenium/node-firefox:4.0.0
- These commands start Docker containers for Chrome and Firefox nodes and connect them to the Selenium Grid hub.

## Step 3: Verify the Grid Setup

- To ensure that the Selenium Grid is set up correctly, you can access the Selenium Grid console in your web browser. Open a browser and navigate to:

                              http://localhost:4444/grid/console

- Open the browser and navigate to http://localhost:4444/. It reflects Selenium Grid UI, as shown below.

![image](https://github.com/Mamun104/selenium-java-with-docker/assets/78067017/415ba077-9d90-4bd3-b80d-ddfc808aa8ff)


## Step 4: Run Automation Scripts

- Now that the Selenium Grid is set up, we can run our automation scripts. Modify the test scripts to target the Selenium Grid hub instead of a local WebDriver instance.

Here’s an example using Java and the Selenium WebDriver:

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

public class GridExample {
    public static void main(String[] args) throws Exception {
        // Define desired capabilities for the browser and platform you want to test
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        
        // Replace "localhost" with the actual address of your Selenium Grid hub
        URL hubUrl = new URL("http://localhost:4444/wd/hub");

        // Create a RemoteWebDriver instance pointing to the hub
        WebDriver driver = new RemoteWebDriver(hubUrl, capabilities);

        // Your test code here

        // Close the WebDriver session
        driver.quit();
    }
}
- With this setup, we can run our automation scripts on different browser and platform configurations by specifying the desired capabilities in the tests, and Selenium Grid will distribute the execution across the available nodes.


## Step 4: Executing the test case

## Technology:

- Tool: selenium Webdriver

- IDE: IntelIJ IDEA

- Build tool: Gradle

- Language: Java

- Test runner: TestNG

## Prerequisite:

- Need to install jdk 8, gradle and allure

- Configure Environment variable for jdk 8, gradle and allure
- Need good internet connectivity

- Clone this project and unzip it

- Open the project folder

- Double click on "build.gradle" and open it through IntellIJ IDEA

- Let the project build successfully

- Click on "Terminal" and run the automation scripts

## Test Plan Documents

https://docs.google.com/document/d/1AuAot7TGxCRED2okhmZd3D5PgqckopctTzbeYeRh7hk/edit

## Test Methodology Documents

https://docs.google.com/document/d/1zCKFvLERpI_yTcrIkCaAMwycvi0v4ohGA_ZIcAkC05I/edit

## Scenario of this project

- The user can't log in with an invalid email
- The user can't log in with an invalid password
- The user can't log in with an invalid email and a valid password
- The user can't log in with a valid email and an invalid password
- The user can get different facilities
- The user can add new patients with valid data
- The user can't add new patients with invalid data
- The user can search for patients

## Run the automation script:

- Type the command:

           gradle clean test
      
- Selenium will open the browser and start automation

- To view report, type this command one after another:

           allure generate allure-results --clean -o allure-report
        
           allure serve allure-results
 
 ## Output:
 
 # These are the snapshots of the allure reports:
 
![1](https://github.com/Mamun104/-smartcare_health_system_automation_testing/assets/78067017/d8086ad5-5203-4cda-9c94-0e2732a11e33)
![2](https://github.com/Mamun104/-smartcare_health_system_automation_testing/assets/78067017/8071d4bb-3402-42ec-a3bb-a358ef3e658e)
![3](https://github.com/Mamun104/-smartcare_health_system_automation_testing/assets/78067017/f92656df-ff56-40c2-985b-c022cf257b22)





