package LYB.Createsite;

import LYB.Base.BaseSetup;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import LYB.FileUpload.FileUpload;
import java.awt.AWTException;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class Sitetest extends BaseSetup {
    Site  site = new Site();

    @BeforeEach
    public void setUp() throws InterruptedException {
        open("http://localhost:4200/manage/sites");
    }

    @Test
    public void validCredential() throws InterruptedException, AWTException {
        Thread.sleep(2000);
//       $x("//*[@id=\"nico-modal-body\"]/app-create-site-modal/div[3]/button").shouldBe(disabled);
        site.NewSiteButton.click();
        Thread.sleep(1000);
        site.logo.click();
        Thread.sleep(1000);
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\kindpng_1300250.png";
        new FileUpload(filepath);
        Thread.sleep(2000);
        site.SiteTitle.sendKeys("DERTY");
        site.subdomain.sendKeys("rty");
        site.PrimaryColor.click();
        site.PriColorInput.setValue("ea0f0f");
        site.PriOkButton.click();
        site.SecondaryColor.click();
        site.SecColorInput.setValue("0f81ea");
        site.SecOkButton.click();
        site.message.setValue("Lorem Ipsum");
        $x("//*[@id=\"nico-modal-body\"]/app-create-site-modal/div[3]/button").shouldBe(enabled);
        site.SaveButton.click();


    }

    @Test
    public void InvalidLogoCredential() throws InterruptedException, AWTException {
        Thread.sleep(2000);
//       $x("//*[@id=\"nico-modal-body\"]/app-create-site-modal/div[3]/button").shouldBe(disabled);
        site.NewSiteButton.click();
        Thread.sleep(1000);
        site.logo.click();
        Thread.sleep(1000);
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\file_example_XLSX_50.xlsx";
        new FileUpload(filepath);
        Thread.sleep(2000);
        $x("/html/body/nico-empty-modal/div/div/div/app-create-site-modal/div[2]/form/div[1]/div[2]/div").shouldBe(visible);
        site.SiteTitle.sendKeys("There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.\n" +
                "\n");
        site.subdomain.sendKeys("-c");
        site.PrimaryColor.click();
        site.PriColorInput.setValue("ea0f0f");
        site.PriOkButton.click();
        site.SecondaryColor.click();
        site.SecColorInput.setValue("0f81ea");
        site.SecOkButton.click();
        site.message.setValue("Lorem Ipsum");
//        site.SaveButton.click();

    }

    @Test
    public void InvalidTitleDomainCredentials() throws InterruptedException, AWTException {
        Thread.sleep(2000);

        site.NewSiteButton.click();
        Thread.sleep(1000);
        site.logo.click();
        Thread.sleep(1000);
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\kindpng_1300250.png";
        new FileUpload(filepath);
        Thread.sleep(2000);
        site.SiteTitle.sendKeys("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).");

        site.subdomain.sendKeys("-c");
        site.PrimaryColor.click();
        site.PriColorInput.setValue("ea0f0f");
        site.PriOkButton.click();
        site.SecondaryColor.click();
        site.SecColorInput.setValue("0f81ea");
        site.SecOkButton.click();
        site.message.setValue("Lorem Ipsum");
        $x("//*[@id=\"nico-modal-body\"]/app-create-site-modal/div[3]/button").shouldBe(enabled);
        site.SaveButton.click();

        $x("/html/body/nico-empty-modal/div/div/div/app-create-site-modal/div[2]/form/div[2]/div/div").shouldBe(visible);
        $x("/html/body/nico-empty-modal/div/div/div/app-create-site-modal/div[2]/form/div[3]/div/div/div[2]").shouldBe(visible);


    }

    @Test
    public void CancelSiteCreate() throws InterruptedException {
        Thread.sleep(1000);
        site.NewSiteButton.click();
        site.cancel.click();


    }
    @Test
    public void CloseSiteCreate() throws InterruptedException {
        Thread.sleep(1000);
        site.NewSiteButton.click();
        site.close.click();

    }

}
