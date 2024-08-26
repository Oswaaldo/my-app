package com.example.base;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.functions.ExpectedCondition;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {

    protected AndroidDriver driver;

    public void setUp() throws MalformedURLException, InterruptedException {
        try{
            String sauceUsername = "sso-walmart-Osvaldo.Barajas";
            String sauceAccessKey = "66884158-2742-457a-bd10-07781d9cbd4f";
            URL sauceURL = new URL("https://sso-walmart-Osvaldo.Barajas:66884158-2742-457a-bd10-07781d9cbd4f@ondemand.us-west-1.saucelabs.com:443/wd/hub");

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("deviceName", "Samsung Galaxy S9");
            capabilities.setCapability("app", "sauce-storage:app-walmartqa-debug.apk");
            capabilities.setCapability("username", sauceUsername);
            capabilities.setCapability("accessKey", sauceAccessKey);
            capabilities.setCapability("autoGrantPermissions", true);
            driver = new AndroidDriver(sauceURL, capabilities);

            // Runtime.getRuntime().exec("adb shell pm grant com.example.app android.permission.CAMERA");
            // Runtime.getRuntime().exec("adb shell pm grant com.walmart.cam.walmart.qa android.permission.LOCATION");
            
            //driver.executeScript("mobile: shell", ImmutableMap.of("command", "pm grant com.walmart.cam.walmart.qa android.permission.ACCESS_FINE_LOCATION"));

        //    AppiumBy.ByAccessibilityId sortButtonLocator = new AppiumBy.ByAccessibilityId("Selecciona un país");
        //    driver.findElement(sortButtonLocator).click();

        
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

           // driver.findElement(By.xpath("//android.widget.Button[@content-desc='Selecciona un país']"));

           Thread.sleep(15000);

           WebElement dropDown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc='Selecciona un país']")));
           dropDown.click();
          // dropDown.click();

          // AppiumBy.ByAccessibilityId optionCR = new AppiumBy.ByAccessibilityId("Costa Rica");
          WebElement optionCR = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc='Costa Rica']")));
          optionCR .click();
           
          //Click boton continuar
           AppiumBy.ByAccessibilityId continuarButtonLocator = new AppiumBy.ByAccessibilityId("Continuar");
           WebElement continuarButton = wait.until(ExpectedConditions.elementToBeClickable(continuarButtonLocator));
           continuarButton.click();

           //Provincia
           WebElement provinciaDropDown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[2]")));
           provinciaDropDown.click();

           //Seleccionar provincia Cartago
           AppiumBy.ByAccessibilityId cartagoProvinciaOptionLocator = new AppiumBy.ByAccessibilityId("Cartago");
           WebElement cartagoProvinciaOption = wait.until(ExpectedConditions.elementToBeClickable(cartagoProvinciaOptionLocator));
           cartagoProvinciaOption.click();

            //Canton
            WebElement cantonDropDown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[3]")));
            cantonDropDown.click();

            //Seleccionar canton Cartago
           AppiumBy.ByAccessibilityId cartagoCantonOptionLocator = new AppiumBy.ByAccessibilityId("Cartago");
           WebElement cartagoCantonOption = wait.until(ExpectedConditions.elementToBeClickable(cartagoCantonOptionLocator));
           cartagoCantonOption.click();

           //Distrito
           WebElement distritoDropDown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[4]")));
           distritoDropDown.click();

           //Seleccionar canton Cartago
          AppiumBy.ByAccessibilityId carmenDistritoOptionLocator = new AppiumBy.ByAccessibilityId("Carmen");
          WebElement carmenDistritoOption = wait.until(ExpectedConditions.elementToBeClickable(carmenDistritoOptionLocator));
          carmenDistritoOption.click();

            //Click Continuar button
            AppiumBy.ByAccessibilityId continuarLoginButtonLocator = new AppiumBy.ByAccessibilityId("Continuar");
            WebElement continuarLoginButton = wait.until(ExpectedConditions.elementToBeClickable(continuarLoginButtonLocator));
            continuarLoginButton.click();

            //Click Iniciar sesión
            AppiumBy.ByAccessibilityId iniciarSesionButtonLocator = new AppiumBy.ByAccessibilityId("Iniciar sesión");
            WebElement iniciarSesionButton = wait.until(ExpectedConditions.elementToBeClickable(iniciarSesionButtonLocator));
            iniciarSesionButton.click();

            //Ingresar email
            WebElement correoElectronicoField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText")));
            correoElectronicoField.click();
            correoElectronicoField.sendKeys("diego.parra@walmart.com");

            driver.hideKeyboard();

            //Click Iniciar sesion en Inciar sesion pantalla
            //Click Iniciar sesión
            AppiumBy.ByAccessibilityId iniciarSesionCtnButtonLocator = new AppiumBy.ByAccessibilityId("Iniciar sesión");
            WebElement iniciarSesionCtnButton = wait.until(ExpectedConditions.elementToBeClickable(iniciarSesionCtnButtonLocator));
            iniciarSesionCtnButton.click();

            // aquí se rompe por el radio button //
            
            // //Click Iniciar sesión con Contrasena raddio
            // AppiumBy.ByAccessibilityId iniciarSesionConContrasenaRadioButtonLocator = new AppiumBy.ByAccessibilityId("Iniciar sesión con contraseña");    
            // WebElement iniciarSesionConContrasenaRadioButton = wait.until(ExpectedConditions.elementToBeClickable(iniciarSesionConContrasenaRadioButtonLocator));
            // iniciarSesionConContrasenaRadioButton.click();

            // //Click Continuar button
            // AppiumBy.ByAccessibilityId continuarNewButtonLocator = new AppiumBy.ByAccessibilityId("Continuar");
            // WebElement continuarNewButton = wait.until(ExpectedConditions.elementToBeClickable(continuarNewButtonLocator));
            // continuarNewButton.click();

            // //Ingresar contrasena
            // WebElement contrasenaField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText")));
            // contrasenaField.click();
            // contrasenaField.sendKeys("Pass-1234");

            // driver.hideKeyboard();

            // //Click Continuar button
            // AppiumBy.ByAccessibilityId continuarNew2ButtonLocator = new AppiumBy.ByAccessibilityId("Continuar");
            // WebElement continuarNew2Button = wait.until(ExpectedConditions.elementToBeClickable(continuarNew2ButtonLocator));
            // continuarNew2Button.click();

            // //Click omitir
            // AppiumBy.ByAccessibilityId omitirButtonLocator = new AppiumBy.ByAccessibilityId("Omitir");
            // WebElement omitirButton = wait.until(ExpectedConditions.elementToBeClickable(omitirButtonLocator));
            // omitirButton.click();



           
           
            
         

        }catch(IOException e){
            e.printStackTrace();
        }     
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


}
