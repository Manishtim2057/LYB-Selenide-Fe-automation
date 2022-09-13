package LYB.Login;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import javax.swing.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class LoginTest {
    Login login = new Login();

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());

    }

    @BeforeEach
    public void setUp() {
        open("http://localhost:4200/auth/login");
    }

    @Test
    public void invalidCredentialPassword() throws InterruptedException {
        Thread.sleep(2000);
        $x("//*[@id=\"loginToast\"]/div[2]/span").shouldBe(hidden);

        login.username.sendKeys("superuser@learnyourbenefits.com");
        login.password.sendKeys("lyb@44554");
        login.login.click();

        $x("//*[@id=\"loginToast\"]/div[2]/span").shouldBe(visible);

        //login.username.shouldHave(attribute("value", "superuser@learnyourbenefits.com"));
    }

    @Test
    public void invalidCredentialUsername() throws InterruptedException {
        Thread.sleep(2000);
        $x("//*[@id=\"loginToast\"]/div[2]/span").shouldBe(hidden);

        login.username.sendKeys("superusers@learnyourbenefits.com");
        login.password.sendKeys("lyb@2019");
        login.login.click();

    }

    @Test
    public void invalidCredentialBoth() throws InterruptedException {
        Thread.sleep(2000);
        $x("//*[@id=\"loginToast\"]/div[2]/span").shouldBe(hidden);

        login.username.sendKeys("superusers@learnyourbenefits.com");
        login.password.sendKeys("lyb@20199");
        login.login.click();
    }

    @Test
    public void OneUsernameEmptyCredential() throws InterruptedException {
        Thread.sleep(2000);
        $x("//*[@id=\"loginForm\"]/div[3]/button").shouldBe(enabled);

        login.username.sendKeys("");
        login.password.sendKeys("lyb@2019");
        login.login.click();
        $x("//*[@id=\"loginForm\"]/div[3]/button").shouldBe(disabled);
    }

    public void OnePasswordEmptyCredential() throws InterruptedException {
        Thread.sleep(2000);
        $x("//*[@id=\"loginForm\"]/div[3]/button").shouldBe(enabled);

        login.username.sendKeys("superuser@learnyourbenefits.com");
        login.password.sendKeys("");
        login.login.click();
        $x("//*[@id=\"loginForm\"]/div[3]/button").shouldBe(disabled);
    }

    @Test
    public void validCredential() throws InterruptedException {
        Thread.sleep(2000);
        $x("//*[@id=\"loginToast\"]/div[2]/span").shouldBe(hidden);
        login.username.sendKeys("superuser@learnyourbenefits.com");
        login.password.sendKeys("lyb@2019");
        login.login.click();

        $x("//*[@id=\"loginToast\"]/div[2]/span").shouldBe(hidden);

        //login.username.shouldHave(attribute("value", "superuser@learnyourbenefits.com"));
    }

    @Test
    public void ForgotPassword() throws InterruptedException {


        $x("//*[@id=\"cvAngoxemI\"]/div[1]/i").shouldBe(hidden);
        ;
        login.forgot.click();
        Thread.sleep(2000);
        login.email.sendKeys("manish.timalsina@ensue.us");
        login.send.click();
        Thread.sleep(4000);

        $x("//*[@id=\"cvAngoxemI\"]/div[1]/i").shouldBe(hidden);

    }

    @Test
    public void CancelForgotPassword() throws InterruptedException {
        Thread.sleep(2000);
        $x("//*[@id=\"loginToast\"]/div[2]/span").shouldBe(hidden);

        login.forgot.click();
        login.email.sendKeys("manish.timalsina@ensue.us");
        login.cancel.click();

        $x("//*[@id=\"loginToast\"]/div[2]/span").shouldBe(hidden);
    }

    @Test
    public void InvalidForgotPassword() throws InterruptedException{
        Thread.sleep(2000);
        $x("//*[@id=\"nico-toast-container\"]").shouldBe(hidden);

        login.forgot.click();
        login.email.sendKeys("manish.timalsina.us");
        Thread.sleep(2000);
        login.cancel.click();

        $x("//*[@id=\"nico-toast-container\"]").shouldBe(hidden);
    }

    
}
