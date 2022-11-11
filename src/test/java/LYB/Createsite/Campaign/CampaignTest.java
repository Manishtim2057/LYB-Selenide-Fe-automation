package LYB.Createsite.Campaign;

import LYB.Base.BaseSetup;
import LYB.Createsite.AdvanceForm.AdvanceSite;
import LYB.Createsite.SiteCategory.CategoryLinkAdd_Edit_Remove_Move_Status;
import LYB.Createsite.SiteCategory.SiteCategory;
import LYB.Createsite.SiteConfigs.ConfigElement;
import LYB.Createsite.SiteEdit.SiteEdit;
import LYB.FileUpload.FileUpload;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.awt.*;

import static com.codeborne.selenide.Condition.disabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CampaignTest extends BaseSetup {
    TestMethodOrder Ascending;

    @BeforeEach
    public void setUp() throws InterruptedException {
        open("http://localhost:4200/auth/login");

    }

    public void Search() {
        SiteEdit.Search.setValue("atmsite");
        SiteEdit.Search.pressEnter();
    }
    @Test
    @Order(1)
    public void t1CampaignPageShouldBeVisible(){
        Search();
        SiteEdit.EditSite.click();
        CampaignElements.CampaignOption.click();
        CampaignElements.CampaignPage.shouldBe(visible);
    }
    @Test
    @Order(2)
    public void t2SimpleCreateCampaignShouldBeVisibleAfterCreateButtonIsClicked(){
        Search();
        SiteEdit.EditSite.click();
        CampaignElements.CampaignOption.click();
        CampaignElements.NewCampaign.click();
        $(".modal-content").shouldBe(visible);
    }
    @Test
    @Order(3)
    public void t3ErrorMessageShouldBeValidAfterCampaignTitleIsAddedAsUpperLimit() throws AWTException, InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        CampaignElements.CampaignOption.click();
        CampaignElements.NewCampaign.click();
        CampaignElements.Title.sendKeys("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).\n" +
                "\n");
       SiteCategory.ErrorToolTipMessage.shouldBe(visible);
        CampaignElements.SaveButton.is(disabled);
    }
    @Test
    @Order(4)
    public void t4EditCampaignSlugAfterTitleIsAdded() throws AWTException, InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        CampaignElements.CampaignOption.click();
        CampaignElements.NewCampaign.click();
        CampaignElements.Title.sendKeys("Campaign-Incomming");
        Thread.sleep(500);
        CampaignElements.Slug.clear();
        CampaignElements.Slug.sendKeys("EditedJustNow");
        CampaignElements.Banner.click();
        CampaignElements.BannerUploader.click();
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\kindpng_1300250.png";
        new FileUpload(filepath);
        AdvanceSite.Done.click();
        Thread.sleep(2500);
        CampaignElements.Save.click();
        Thread.sleep(500);
        CampaignElements.StartDate.click();
        Thread.sleep(500);
        CampaignElements.CalendarYear.click();
        CampaignElements.CalendarYearSelect.click();
        CampaignElements.CalendarMonthSelect.click();
        CampaignElements.CalendarDateSelect.click();
        CampaignElements.EndDate.click();
        CampaignElements.CalendarYear.click();
        CampaignElements.CalendarYearSelect.click();
        CampaignElements.CalendarEndMonthSelect.click();
        CampaignElements.CalendarDateSelect.click();
        CampaignElements.HeaderMessage.sendKeys("This is Header");
        CampaignElements.FooterMessage.sendKeys("This is Footer");
        CampaignElements.SaveButton.click();
    }
    @Test
    @Order(5)
    public void t5ErrorMessageShouldBeVisibleAfterSlugIsAddedAsUpperLimit() throws AWTException, InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        CampaignElements.CampaignOption.click();
        CampaignElements.NewCampaign.click();
        CampaignElements.Title.sendKeys("Campaign-Incomming");
        Thread.sleep(500);
        CampaignElements.Slug.clear();
        CampaignElements.Slug.sendKeys("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).\n" +
                "\n");
       SiteCategory.ErrorToolTipMessage.shouldBe(visible);
    }
    @Test
    @Order(6)
    public void t6ErrorMessageShouldBeVisibleAfterInvalidBannerIsAdded() throws AWTException, InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        CampaignElements.CampaignOption.click();
        CampaignElements.NewCampaign.click();
        CampaignElements.Title.sendKeys("Campaign-Incomming");
        CampaignElements.Banner.click();
        CampaignElements.BannerUploader.click();
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\SEO.pptx";
        new FileUpload(filepath);
        Thread.sleep(1500);
        SiteCategory.ErrorToolTipMessage.shouldBe(visible);
        AdvanceSite.AlertMessage.shouldBe(visible);
    }
    @Test
    @Order(7)
    public void t7CancelCampaignCreateModal() throws AWTException, InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        CampaignElements.CampaignOption.click();
        CampaignElements.NewCampaign.click();
        CampaignElements.Title.sendKeys("Campaign-Incomming");
        CampaignElements.Banner.click();
        CampaignElements.BannerUploader.click();
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\kindpng_1300250.png";
        new FileUpload(filepath);
        AdvanceSite.Done.click();
        Thread.sleep(2500);
        CampaignElements.Save.click();
        Thread.sleep(500);
        CampaignElements.StartDate.click();
        Thread.sleep(500);
        CampaignElements.CalendarYear.click();
        CampaignElements.CalendarYearSelect.click();
        CampaignElements.CalendarMonthSelect.click();
        CampaignElements.CalendarDateSelect.click();
        CampaignElements.EndDate.click();
        CampaignElements.CalendarYear.click();
        CampaignElements.CalendarYearSelect.click();
        CampaignElements.CalendarEndMonthSelect.click();
        CampaignElements.CalendarDateSelect.click();
        CampaignElements.HeaderMessage.sendKeys("This is Header");
        CampaignElements.FooterMessage.sendKeys("This is Footer");
        CampaignElements.Cancel.click();
        CampaignElements.CampaignPage.shouldBe(visible);
    }
    @Test
    @Order(8)
    public void t8CloseCampaignCreateModal() throws AWTException, InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        CampaignElements.CampaignOption.click();
        CampaignElements.NewCampaign.click();
        CampaignElements.Title.sendKeys("Campaign-Incomming");
        CampaignElements.Banner.click();
        CampaignElements.BannerUploader.click();
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\kindpng_1300250.png";
        new FileUpload(filepath);
        AdvanceSite.Done.click();
        Thread.sleep(2500);
        CampaignElements.Save.click();
        Thread.sleep(500);
        CampaignElements.StartDate.click();
        Thread.sleep(500);
        CampaignElements.CalendarYear.click();
        CampaignElements.CalendarYearSelect.click();
        CampaignElements.CalendarMonthSelect.click();
        CampaignElements.CalendarDateSelect.click();
        CampaignElements.EndDate.click();
        CampaignElements.CalendarYear.click();
        CampaignElements.CalendarYearSelect.click();
        CampaignElements.CalendarEndMonthSelect.click();
        CampaignElements.CalendarDateSelect.click();
        CampaignElements.HeaderMessage.sendKeys("This is Header");
        CampaignElements.FooterMessage.sendKeys("This is Footer");
        CampaignElements.CloseButton.click();
        CampaignElements.CampaignPage.shouldBe(visible);
    }

    @Test
    @Order(9)
    public void t9SuccessMessageShouldBeVisibleAfterAllValidDetailsAddedAndSaved() throws AWTException, InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        CampaignElements.CampaignOption.click();
        CampaignElements.NewCampaign.click();
        CampaignElements.Title.sendKeys("Campaign-Incomming");
        CampaignElements.Banner.click();
        CampaignElements.BannerUploader.click();
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\kindpng_1300250.png";
        new FileUpload(filepath);
        AdvanceSite.Done.click();
        Thread.sleep(2500);
        CampaignElements.Save.click();
        Thread.sleep(500);
        CampaignElements.StartDate.click();
        Thread.sleep(500);
        CampaignElements.CalendarYear.click();
        CampaignElements.CalendarYearSelect.click();
        CampaignElements.CalendarMonthSelect.click();
        CampaignElements.CalendarDateSelect.click();
        CampaignElements.EndDate.click();
        CampaignElements.CalendarYear.click();
        CampaignElements.CalendarYearSelect.click();
        CampaignElements.CalendarEndMonthSelect.click();
        CampaignElements.CalendarDateSelect.click();
        CampaignElements.HeaderMessage.sendKeys("This is Header");
        CampaignElements.FooterMessage.sendKeys("This is Footer");
        CampaignElements.SaveButton.click();
    }


}
