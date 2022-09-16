package LYB.Createsite.AdvanceForm;

import LYB.Base.BaseSetup;
import LYB.Createsite.Site;
import LYB.FileUpload.FileUpload;
import com.codeborne.selenide.conditions.Disabled;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static com.codeborne.selenide.Condition.disabled;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class AdvanceSiteCreateTest extends BaseSetup {


        AdvanceSite AdvanceSite = new AdvanceSite();

        @BeforeEach
        public void setUp() throws InterruptedException {
            open("http://localhost:4200/auth/login");
        }

        @Test
        public void AdvanceSiteDetails() throws InterruptedException, AWTException {
            Thread.sleep(2000);

            AdvanceSite.NewSiteButton.click();
            Thread.sleep(1000);
            AdvanceSite.UseAdvanceForm.click();



            AdvanceSite.SubDomain.sendKeys("rty");

            AdvanceSite.SiteTitle.sendKeys("DERTY");

            AdvanceSite.SiteLogo.click();
            Thread.sleep(1000);
            String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\kindpng_1300250.png";
            new FileUpload(filepath);
            Thread.sleep(2000);

            AdvanceSite.SitePrimaryColor.click();
            AdvanceSite.SitePriColorInput.setValue("ea0f0f");
            AdvanceSite.SitePriColorOKButton.click();
            AdvanceSite.SiteSecondaryColor.click();
            AdvanceSite.SiteSecColorInput.setValue("0f81ea");
            AdvanceSite.SiteSecColorOkButton.click();
            AdvanceSite.SiteDescription.setValue("Lorem");
            Thread.sleep(2000);
//            $x("//*[@id=\"nico-modal-body\"]/app-create-site-modal/div[3]/button").shouldBe(enabled);
            AdvanceSite.SiteNextButton.click();


        }

        @Test
        public void AddSiteDetails() throws InterruptedException, AWTException {
            Thread.sleep(2000);
            AdvanceSite.SiteMessage.setValue("Lorem");

            AdvanceSite.SiteNextButton.click();
        $x("/html/body/app-root/admin-root/section/div/section/div/app-sites/div/section/app-site-create/div/div/div/div[2]/section/div/div/section/div/app-site-message/section/button[4]").shouldBe(disabled);

        }


    }
