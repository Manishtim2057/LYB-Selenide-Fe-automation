package LYB.Createsite.SiteCreateSingleForm;

import LYB.Base.BaseSetup;
import LYB.Createsite.AdvanceForm.AdvanceSite;
import LYB.FileUpload.FileUpload;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.awt.*;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SingleFromSiteCreate extends BaseSetup {
    TestMethodOrder Ascending;

//    @BeforeEach
//    public void setUp() throws InterruptedException, AWTException {
//        open("http://localhost:4200/auth/login");
//        Thread.sleep(2000);
//    }
        @Test
    public void fillSiteDetails() throws InterruptedException, AWTException {
            AdvanceSite.NewSiteButton.click();
       Thread.sleep(1000);
        AdvanceSite.SubDomain.sendKeys("rty");
        AdvanceSite.SiteTitle.sendKeys("Dirt");

        $(".avatar-overlay.no-image").click();
        Thread.sleep(5000);
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\kindpng_1300250.png";
        new FileUpload(filepath);
        Thread.sleep(1000);

        AdvanceSite.SaveAndNextButton.is(enabled);//Button should be enabled after required field is added.
        AdvanceSite.SitePrimaryColor.click();
        AdvanceSite.SitePriColorInput.setValue("ea0f0f");
        AdvanceSite.SitePriColorOKButton.click();
        AdvanceSite.SiteSecondaryColor.click();
        AdvanceSite.SiteSecColorInput.setValue("0f81ea");
        AdvanceSite.SiteSecColorOkButton.click();
        AdvanceSite.SiteDescription.setValue("Lorem");
        AdvanceSite.SaveAndNextButton.click();
    }
}
