package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {

    private AndroidDriver driver;

    /*
     * nuevos
     */


  

    @FindBy(id = "com.example.app:id/username")
    private WebElement usernameField;

    @FindBy(id = "com.example.app:id/password")
    private WebElement passwordField;

    @FindBy(id = "com.example.app:id/login")
    private WebElement loginButton;

    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    

    public void login(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }

}
