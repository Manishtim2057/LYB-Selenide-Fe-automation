package LYB.Base;
import LYB.Createsite.Sitetest;
import LYB.Login.Login;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.*;

public class BaseSetup {

    static BaseButtonVariable login = new BaseButtonVariable();

    public static void login()
    {
        open("http://localhost:4200/auth/login");
        login.username.sendKeys("superuser@learnyourbenefits.com");
        login.password.sendKeys("lyb@20!9");
        login.login.click();
    }

    @BeforeAll
    public static void setUpAll() throws InterruptedException {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
        BaseSetup.login();
        Thread.sleep(1000);
    }
}
