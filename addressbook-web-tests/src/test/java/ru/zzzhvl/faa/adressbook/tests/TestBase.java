package ru.zzzhvl.faa.adressbook.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ru.zzzhvl.faa.adressbook.appmanager.ApplicationManager;

import static org.openqa.selenium.remote.BrowserType.CHROME;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager(CHROME);

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();
    }

}
