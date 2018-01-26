package ru.test.addressbook.tests;


import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ContactCreationTest extends ContactHelper{

    @BeforeMethod
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "C:\\JavaTest\\geckodriver.exe");
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void contactTestCreation() {
        wd.get("http://localhost/addressbook/");
        login("admin", "secret");
        ClickAddNewContact();
        fillName("Name");
        fillMiddlename("Middle");
        fillLastname("Last");
        fillNickname("Nick");
        fillCompany("test comp");
        fillAddress("address");
        fillHomeNumber();
        fillMobileNumber();
        fillEmail();
        fillBirthdate();
        fillSecondAddress("test");
        fillNotes("note");
        sendForm();
        gotoHome();
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
