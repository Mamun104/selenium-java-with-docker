# Automation Testing For Smart Healthcare System

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





