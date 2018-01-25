package ru.test.addressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.test.addressbook.appmanager.AppManager;

public class TestBase {

    protected final AppManager app = new AppManager();

    @BeforeMethod
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "C:\\JavaTest\\geckodriver.exe");
        app.init();
    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }

}
