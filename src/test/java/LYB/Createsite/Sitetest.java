package LYB.Createsite;

import LYB.Base.BaseSetup;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import javax.swing.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class Sitetest extends BaseSetup {
    site  site = new site();
    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeEach
    public void setUp() throws InterruptedException {
        this.login();
        Thread.sleep(1000);
//        open("http://localhost:4200/manage/sites");
    }

    @Test
    public void InvalidCredential() throws InterruptedException {
        Thread.sleep(2000);
//        $x("//*[@id=\"nico-modal-body\"]/app-create-site-modal/div[3]/button").shouldBe(disabled);

        site.newsitebutton.click();
        site.sitetitle.sendKeys("DERTY");
        site.subdomain.sendKeys("rty");
//        site.primarycolor.sendKeys("background: rgb(194, 30, 30);");
//        site.secondarycolor.sendKeys("background: rgb(194, 30, 30);");
        site.message.setValue("Lorem Ipsum");
        $x("//*[@id=\"nico-modal-body\"]/app-create-site-modal/div[3]/button").shouldBe(disabled);

    }

    @Test
    public void CancelSiteCreate() throws InterruptedException {
        Thread.sleep(1000);

        site.newsitebutton.click();
        site.cancel.click();


    }
    @Test
    public void CloseSiteCreate() throws InterruptedException {
        Thread.sleep(1000);
        site.newsitebutton.click();
        site.close.click();

    }
}
