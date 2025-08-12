package LYB.Createsite.Campaign;

import LYB.Base.BaseSetup;
import LYB.Createsite.AdvanceForm.AdvanceSite;
import LYB.Createsite.SiteCategory.SiteCategory;
import LYB.Createsite.SiteEdit.SiteEdit;
import LYB.FileUpload.FileUpload;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.*;

import java.awt.*;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class CampaignEdit extends BaseSetup {
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
    public void t1CampaignPreviewShouldBeVisibleAfterViewDetailsOptionIsClicked() throws InterruptedException {
        Search();
        Search();
        Thread.sleep(500);
        SiteEdit.EditSite.click();
        CampaignElements.CampaignOption.click();
        Thread.sleep(500);
        CampaignElements.CampaignEdit.click();
        CampaignElements.CampaignInformation.should(visible);
    }

    @Test
    @Order(1)
    public void t2CampaignUpdateSideNavShouldBeVisibleAfterCampaignInformationIsClicked() throws InterruptedException {
        Search();
        Search();
        Thread.sleep(500);
        SiteEdit.EditSite.click();
        CampaignElements.CampaignOption.click();
        Thread.sleep(500);
        CampaignElements.CampaignEdit.click();
        CampaignElements.CampaignInformation.click();
        CampaignElements.CampEditBanner.should(visible);

    }

    @Test
    @Order(1)
    public void t3ErrorMessageShouldBeVisibleAfterBannerUpdatedAsInvalidType() throws InterruptedException, AWTException {
        Search();
        Search();
        Thread.sleep(500);
        SiteEdit.EditSite.click();
        CampaignElements.CampaignOption.click();
        Thread.sleep(500);
        CampaignElements.CampaignEdit.click();
        CampaignElements.CampaignInformation.click();
        CampaignElements.CampEditBanner.click();
        CampaignElements.BannerUploader.click();
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\SEO.pptx";
        new FileUpload(filepath);
        SiteCategory.ErrorToolTipMessage.should(visible);
        AdvanceSite.AlertMessage.shouldBe(visible);

    }

    @Test
    @Order(1)
    public void t4SuccessMessageShouldBeVisibleAfterGettingCampaignUpdatedWithValidDetails() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(500);
        SiteEdit.EditSite.click();
        CampaignElements.CampaignOption.click();
        Thread.sleep(500);
        CampaignElements.CampaignEdit.click();
        CampaignElements.CampaignInformation.click();
        CampaignElements.CampEditBanner.click();
        CampaignElements.BannerUploader.click();
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\kindpng_1300250.png";
        new FileUpload(filepath);
        AdvanceSite.Done.click();
        Thread.sleep(2500);
        CampaignElements.Save.click();
        Thread.sleep(500);
        CampaignElements.CampaignStartDate.click();
        Thread.sleep(500);
        CampaignElements.CalendarYear.click();
        CampaignElements.CalendarYearSelect.click();
        CampaignElements.CampStartMonthSelect.click();
        CampaignElements.CampStartDateSelect.click();
        CampaignElements.CampaignEndDate.click();
        Thread.sleep(500);
        CampaignElements.CalendarYear.click();
        CampaignElements.CalendarEndYearSelect.click();
        CampaignElements.CalendarEndMonthSelect.click();
        CampaignElements.CampEndDateSelect.click();
        CampaignElements.CampHeader.clear();
        CampaignElements.CampHeader.sendKeys("This is Header");
        CampaignElements.CampFooter.clear();
        CampaignElements.CampFooter.sendKeys("This is Footer");
        CampaignElements.CampaignSave.click();
        AdvanceSite.SuccessMessage.should(visible);

    }

    @Test
    @Order(1)
    public void t5AssignAndUnAssignCampaignVideoResource() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(500);
        SiteEdit.EditSite.click();
        CampaignElements.CampaignOption.click();
        Thread.sleep(500);
        CampaignElements.CampaignEdit.click();
        CampaignElements.CampaignResources.click();
        CampaignElements.CampaignVideo.click();
        CampaignElements.Assign.click();
        CampaignElements.Assign.click();
        CampaignElements.UnAssign.click();
        AdvanceSite.ConfirmCancel.click();

    }
    @Test
    @Order(1)
    public void t6AssignAndUnAssignCampaignDocumentResources() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(500);
        SiteEdit.EditSite.click();
        CampaignElements.CampaignOption.click();
        Thread.sleep(500);
        CampaignElements.CampaignEdit.click();
        CampaignElements.CampaignResources.click();
        CampaignElements.CampaignDocuments.click();
        CampaignElements.Assign.click();
        CampaignElements.Assign.click();
        CampaignElements.UnAssign.click();
        AdvanceSite.ConfirmCancel.click();

    }
    @Test
    @Order(1)
    public void t7AddNewDocumentsInCampaignDocument() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(500);
        SiteEdit.EditSite.click();
        CampaignElements.CampaignOption.click();
        Thread.sleep(500);
        CampaignElements.CampaignEdit.click();
        CampaignElements.CampaignResources.click();
        CampaignElements.CampaignDocuments.click();
        CampaignElements.CampaignNewDocument.click();
        CampaignElements.UploadDocument.click();
        Thread.sleep(1000);
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\Google_Adword_Project.pptx";
        new FileUpload(filepath);
        Thread.sleep(1000);
        AdvanceSite.DocumentTitle.clear();
        AdvanceSite.DocumentTitle.sendKeys("Doc");
        AdvanceSite.DocumentIcon.click();
        AdvanceSite.DocumentIconOption.click();
        AdvanceSite.DocumentDescription.sendKeys("Desc");
        Thread.sleep(1000);
        AdvanceSite.DocumentThumbnail.click();
        Thread.sleep(1000);
        filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\kindpng_1300250.png";
        new FileUpload(filepath);
        Thread.sleep(1000);
        AdvanceSite.Done.click();
        Thread.sleep(2500);
        CampaignElements.CampaignSave.click();
        Thread.sleep(500);
        AdvanceSite.SuccessMessage.shouldBe(visible);

    }

    @Test
    @Order(1)
    public void t7AssignAndUnAssignContacts() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(500);
        SiteEdit.EditSite.click();
        CampaignElements.CampaignOption.click();
        Thread.sleep(500);
        CampaignElements.CampaignEdit.click();
        CampaignElements.CampaignResources.click();
        CampaignElements.CampaignContact.click();
        CampaignElements.Assign.click();
        CampaignElements.Assign.click();
        CampaignElements.UnAssign.click();
        AdvanceSite.ConfirmCancel.click();

    }
    @Test
    @Order(1)
    public void t8AddNewContacts() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(500);
        SiteEdit.EditSite.click();
        CampaignElements.CampaignOption.click();
        Thread.sleep(500);
        CampaignElements.CampaignEdit.click();
        CampaignElements.CampaignResources.click();
        CampaignElements.CampaignContact.click();
        CampaignElements.CampaignNewContact.click();
        AdvanceSite.ContactTitle.sendKeys("Sample");
        AdvanceSite.ContactEmail.sendKeys("Lorem@gmail.com");
        AdvanceSite.ContactDescription.setValue("Lorem");
        AdvanceSite.ContactThumbnail.click();
        Thread.sleep(1000);
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\kindpng_1300250.png";
        new FileUpload(filepath);
        AdvanceSite.Done.click();
        Thread.sleep(3000);
        $(".modal-content .btn-secondary").click();
        AdvanceSite.SuccessMessage.should(visible);

    }
    @Test
    @Order(1)
    public void t7AssignAndUnAssignLink() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(500);
        SiteEdit.EditSite.click();
        CampaignElements.CampaignOption.click();
        Thread.sleep(500);
        CampaignElements.CampaignEdit.click();
        CampaignElements.CampaignResources.click();
        CampaignElements.CampaignLinks.click();
        CampaignElements.Assign.click();
        CampaignElements.Assign.click();
        CampaignElements.UnAssign.click();
        AdvanceSite.ConfirmCancel.click();

    }
    @Test
    @Order(1)
    public void t8AddNewLink() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(500);
        SiteEdit.EditSite.click();
        CampaignElements.CampaignOption.click();
        Thread.sleep(500);
        CampaignElements.CampaignEdit.click();
        CampaignElements.CampaignResources.click();
        CampaignElements.CampaignLinks.click();
        CampaignElements.CampaignNewLink.click();
        AdvanceSite.LinkTitle.sendKeys("NeLInk");
        AdvanceSite.LinkURl.sendKeys("https://www.youtube.com/");
        AdvanceSite.LinkThumbnail.click();
        Thread.sleep(1000);
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\kindpng_1300250.png";
        new FileUpload(filepath);
        AdvanceSite.Done.click();
        Thread.sleep(2500);
        AdvanceSite.LinkDescription.sendKeys("Lorem");
        Thread.sleep(1000);
        $(".modal-content .btn-secondary").click();
        AdvanceSite.SuccessMessage.should(visible);

    }
}

