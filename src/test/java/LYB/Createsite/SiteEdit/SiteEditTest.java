package LYB.Createsite.SiteEdit;

import LYB.Base.BaseSetup;
import LYB.Createsite.AdvanceForm.AdvanceSite;
import LYB.Createsite.Site;
import LYB.FileUpload.FileUpload;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SiteEditTest extends BaseSetup {

    @BeforeEach
    public void setUp() throws InterruptedException, AWTException {
        open("http://localhost:4200/auth/login");
        Thread.sleep(2000);
    }

    @Test
    public void t1SiteListModalShouldGetAppear() {
        SiteEdit.SitesManagement.shouldBe(visible);

    }

    @Test
    public void t3PreviewSiteShouldBeVisibleAfterEditSiteIsClicked() {
        SiteEdit.EditSite.click();
        SiteEdit.SitePreview.shouldBe(visible);
    }

    @Test
    public void t4SiteInformationShouldBeClicked() {
        SiteEdit.EditSite.click();
        SiteEdit.SiteInformation.click();
    }

    @Test
    public void t5SiteInformationPageShouldBePreviewed() {
        SiteEdit.EditSite.click();
        SiteEdit.SiteInformation.click();
        SiteEdit.PrimaryInformation.shouldBe(visible);
    }

    @Test
    public void t6PrimaryInformationShouldBeVisible() {
        SiteEdit.EditSite.click();
        SiteEdit.SiteInformation.click();
        SiteEdit.PrimaryInformation.click();
        SiteEdit.DisplayLogo.should(visible);

    }

    @Test
    public void t7EditSitePrimaryInformation() throws InterruptedException, AWTException {

        SiteEdit.EditSite.click();
        SiteEdit.SiteInformation.click();
        SiteEdit.PrimaryInformation.click();
        SiteEdit.Logo.click();
        Thread.sleep(1000);
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\kindpng_1300250.png";
        new FileUpload(filepath);
        Thread.sleep(1000);
        SiteEdit.DisplayLogo.click();
        SiteEdit.SiteTitle.sendKeys("Automation");
        SiteEdit.PrimaryColor.click();
        SiteEdit.PrimaryColorInput.setValue("ea0f0f");
        SiteEdit.PrimaryColorOk.click();
        SiteEdit.SecondaryColor.click();
        SiteEdit.SecondaryColorInput.setValue("0f81ea");
        SiteEdit.SecondaryColorOK.click();
        SiteEdit.SiteDescription.sendKeys("This Site Was Created for the purpose of Automation Testing");
        SiteEdit.SiteMessage.sendKeys("Automation Test");
    }

    @Test
    public void t7EditSitePrimaryInformationWithInvalidDetails() throws AWTException, InterruptedException {

        SiteEdit.EditSite.click();
        SiteEdit.SiteInformation.click();
        SiteEdit.PrimaryInformation.click();

        SiteEdit.Logo.click();
        Thread.sleep(1000);
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\pptx1.pptx";
        new FileUpload(filepath);
        Thread.sleep(1000);
        SiteEdit.ErrorTooltipMessage.shouldBe(visible);
        SiteEdit.SiteTitle.sendKeys("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).\n" +
                "\n");
        SiteEdit.SaveButton.click();
        Thread.sleep(1000);
        SiteEdit.ErrorTooltipMessage.shouldBe(visible);
        SiteEdit.PrimaryColor.click();
        SiteEdit.PrimaryColorInput.setValue("ea0f0f");
        SiteEdit.PrimaryColorOk.click();
        SiteEdit.SecondaryColor.click();
        SiteEdit.SecondaryColorInput.setValue("0f81ea");
        SiteEdit.SecondaryColorOK.click();
        SiteEdit.SiteDescription.sendKeys("This Site Was Created for the purpose of Automation Testing");
        SiteEdit.SiteMessage.sendKeys("Automation Test");

    }
    @Test
    public void t8AddCustomerInformation(){
        SiteEdit.EditSite.click();
        SiteEdit.SiteInformation.click();
        SiteEdit.CustomerInformation.click();
        SiteEdit.CustomerName.sendKeys("Andre White");
        SiteEdit.NumberOfEmployee.sendKeys("125");
        SiteEdit.NumberOfUsers.sendKeys("36990");
        SiteEdit.OfficeAddress.sendKeys("Lalitpur, Gwarko, 45200");
        SiteEdit.SaveButton.click();

    }
    @Test
    public void t9SuccessMessageShouldGetAppearAfterCustomerInfoIsAdded() throws InterruptedException {
        SiteEdit.EditSite.click();
        SiteEdit.SiteInformation.click();
        SiteEdit.CustomerInformation.click();
        SiteEdit.CustomerName.sendKeys("Andre White");
        SiteEdit.NumberOfEmployee.sendKeys("125");
        SiteEdit.NumberOfUsers.sendKeys("36990");
        SiteEdit.OfficeAddress.sendKeys("Lalitpur, Gwarko, 45200");
        SiteEdit.SaveButton.click();
        Thread.sleep(500);
        SiteEdit.SuccessMessage.shouldBe(visible);

    }
    @Test
    public void t10AddCustomerInformationWithInvalidDetails(){
        SiteEdit.EditSite.click();
        SiteEdit.SiteInformation.click();
        SiteEdit.CustomerInformation.click();
        SiteEdit.CustomerName.sendKeys("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).\n" +
                "\n");
        SiteEdit.NumberOfEmployee.sendKeys("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).\n" +
                "\n");
        SiteEdit.NumberOfUsers.sendKeys("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).\n" +
                "\n");
        SiteEdit.OfficeAddress.sendKeys("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).\n" +
                "\n");
        SiteEdit.SaveButton.click();
        SiteEdit.ErrorTooltipMessage.shouldBe(visible);
    }
    @Test
    public void t11PasswordFieldShouldBeVisibleAfterSetSitePasswordISClicked() throws InterruptedException {
        SiteEdit.EditSite.click();
        SiteEdit.SiteInformation.click();
        SiteEdit.Security.click();
        SiteEdit.SetSitePwd.click();
        Thread.sleep(500);
        SiteEdit.Password.shouldBe(visible);
    }
    @Test
    public void t12PasswordFieldShouldBeDisappearAfterSetSitePasswordIsClickedTwice() throws InterruptedException {
        SiteEdit.EditSite.click();
        SiteEdit.SiteInformation.click();
        SiteEdit.Security.click();
        SiteEdit.SetSitePwd.doubleClick();
        Thread.sleep(500);
        SiteEdit.Password.shouldBe(disappear);
    }
    @Test
    public void t13SetSitePassword() throws InterruptedException {
        SiteEdit.EditSite.click();
        SiteEdit.SiteInformation.click();
        SiteEdit.Security.click();
        SiteEdit.SetSitePwd.click();
        Thread.sleep(500);
        SiteEdit.Password.sendKeys("1234");
    }
    @Test
    public void t14ViewTheSetSitePassword() throws InterruptedException {
        SiteEdit.EditSite.click();
        SiteEdit.SiteInformation.click();
        SiteEdit.Security.click();
        SiteEdit.SetSitePwd.click();
        Thread.sleep(500);
        SiteEdit.Password.sendKeys("1234");
        SiteEdit.EyeSlash.doubleClick();
        Thread.sleep(1000);
//        SiteEdit.Password.find("12345");
    }

}
