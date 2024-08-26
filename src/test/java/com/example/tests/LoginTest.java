package com.example.tests;

import com.example.base.BaseTest;
import com.example.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void testLogin() throws Exception {
        setUp();
        System.out.println("IT S WORKING");
        // LoginPage loginPage = new LoginPage(driver);
        // loginPage.login("username", "password");
        // Agregar aserciones y verificaciones

        
        tearDown();
    }

}
