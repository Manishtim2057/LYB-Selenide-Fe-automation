package LYB.Base;
import LYB.Createsite.Sitetest;
import LYB.FileUpload.ZoomOut;
import LYB.Login.Login;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebElement;

import java.awt.*;

import static com.codeborne.selenide.Selenide.*;

public class BaseSetup {

    static BaseButtonVariable login = new BaseButtonVariable();

    public static void login() throws InterruptedException {
        open("http://localhost:4200/auth/login");
        Thread.sleep(500);
        login.username.sendKeys("superuser@learnyourbenefits.com");
        login.password.sendKeys("lyb@20!9");
        Thread.sleep(1000);
        login.login.click();
    }

    @BeforeAll
    public static void setUpAll() throws InterruptedException, AWTException {
        Configuration.browserSize = "1366x784";

        SelenideLogger.addListener("allure", new AllureSelenide());
        BaseSetup.login();
        Thread.sleep(1000);
        new ZoomOut();
    }
}
