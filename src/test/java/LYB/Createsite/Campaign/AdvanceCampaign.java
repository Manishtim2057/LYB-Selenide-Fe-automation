package LYB.Createsite.Campaign;
import LYB.Base.BaseSetup;
import LYB.Createsite.AdvanceForm.AdvanceSite;
import LYB.Createsite.SiteCategory.SiteCategory;
import LYB.Createsite.SiteEdit.SiteEdit;
import LYB.FileUpload.FileUpload;
import com.codeborne.selenide.conditions.Text;
import org.junit.jupiter.api.*;

import java.awt.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AdvanceCampaign extends BaseSetup {
    TestMethodOrder Ascending;

    @BeforeEach
    public void setUp() throws InterruptedException {
        open("https://staging.learnyourcare.com/auth/login");

    }

    public void Search() {
        SiteEdit.Search.setValue("atmsite");
        SiteEdit.Search.pressEnter();
    }
    public void Cancel(){
        AdvanceSite.CancelButton.click();
        AdvanceSite.ConfirmCancel.click();
    }
    public void CampaignDetails() throws InterruptedException, AWTException {
        CampaignElements.Title.sendKeys("Campaign-Incomming");
        Thread.sleep(1000);
        CampaignElements.Slug.clear();
        CampaignElements.Slug.sendKeys("EditedJustNow");
        CampaignElements.Banner.click();
        CampaignElements.BannerUploader.click();
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\kindpng_1300250.png";
        new FileUpload(filepath);
        AdvanceSite.Done.click();
        Thread.sleep(3000);
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
        CampaignElements.CalendarEndYearSelect.click();
        CampaignElements.CalendarMonthSelect.click();
        CampaignElements.CalendarDateSelect.click();
        CampaignElements.AdvHeaderMessage.sendKeys("This is Header");
        CampaignElements.AdvFooterMessage.sendKeys("This is Footer");
    }
    public void AssignAndUnAssignCampaignVideo() {
        int a = 1;
        for (a = 1; a <= 5; a++) {
            CampaignElements.Assign.click();
        }
        int u = 5;
        for (u = 5; u <= 1; u++) {
            CampaignElements.UnAssign.click();
            AdvanceSite.ConfirmCancel.click();
        }
    }
        public void SelectVideosAndDocument(){

            AdvanceSite.SaveAndNextButton.click();
            CampaignElements.Assign.click();
            AdvanceSite.SaveAndNextButton.click();
            CampaignElements.Assign.click();
            AdvanceSite.SaveAndNextButton.click();
        }
        public void AssignUnAssignLink(){
            if (CampaignElements.Assign.is(visible)){
                CampaignElements.Assign.click();
                CampaignElements.UnAssign.click();
                AdvanceSite.ConfirmCancel.click();
                CampaignElements.Assign.click();
            } else
                AdvanceSite.SaveAndNextButton.click();
        }

    @Test
    @Order(1)
    public void t1AddCampaignsDetailsShouldBeVisible() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(500);
        SiteEdit.EditSite.click();
        CampaignElements.CampaignOption.click();
        CampaignElements.NewCampaign.click();
        CampaignElements.AdvanceForm.click();
        $(".step-header-container").shouldBe(visible);
        Cancel();
    }

    @Test
    @Order(2)
    public void t2SaveAndNextButtonShouldBeDisabledBeforeAddingCampaignDetails() throws InterruptedException {
        Thread.sleep(500);
        SiteEdit.EditSite.click();
        CampaignElements.CampaignOption.click();
        CampaignElements.NewCampaign.click();
        CampaignElements.AdvanceForm.click();
        AdvanceSite.SaveAndNextButton.shouldBe(disabled);
        Cancel();
    }
    @Test
    @Order(3)
    public void t3AddCampaignDetailsShouldGetCanceledAfterCancelButtonIsClicked() throws InterruptedException {
        Thread.sleep(500);
        SiteEdit.EditSite.click();
        CampaignElements.CampaignOption.click();
        CampaignElements.NewCampaign.click();
        CampaignElements.AdvanceForm.click();
        AdvanceSite.CancelButton.click();
        AdvanceSite.ConfirmCancel.click();
        CampaignElements.CampaignPage.shouldBe(visible);


    }
    @Test
    @Order(4)
    public void t4ErrorMessageShouldBeVisibleAfterTitleIsAddedAsUpperLimit() throws InterruptedException {
        Thread.sleep(500);
        SiteEdit.EditSite.click();
        CampaignElements.CampaignOption.click();
        CampaignElements.NewCampaign.click();
        CampaignElements.AdvanceForm.click();
        CampaignElements.Title.sendKeys("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).");
        SiteCategory.ErrorToolTipMessage.is(visible);
        Cancel();

    }
    @Test
    @Order(5)
    public void t5ErrorMessageShouldBeVisibleAfterUrlIsAddedAsUpperLimit() throws InterruptedException {
        Thread.sleep(500);
        SiteEdit.EditSite.click();
        CampaignElements.CampaignOption.click();
        CampaignElements.NewCampaign.click();
        CampaignElements.AdvanceForm.click();
        CampaignElements.Title.sendKeys("DetailedInfo");
        Thread.sleep(1000);
        CampaignElements.Slug.clear();
        CampaignElements.Slug.sendKeys("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).");
        SiteCategory.ErrorToolTipMessage.is(visible);
        Cancel();

    }
    @Test
    @Order(6)
    public void t6ErrorMessageShouldBeVisibleAfterAddingInvalidBanner() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(500);
        SiteEdit.EditSite.click();
        CampaignElements.CampaignOption.click();
        CampaignElements.NewCampaign.click();
        CampaignElements.AdvanceForm.click();
        CampaignElements.Title.sendKeys("Campaign-Incomming");
        Thread.sleep(1000);
        CampaignElements.Slug.clear();
        CampaignElements.Slug.sendKeys("EditedJustNow");
        CampaignElements.Banner.click();
        CampaignElements.BannerUploader.click();
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\SEO.pptx";
        new FileUpload(filepath);
        SiteCategory.ErrorToolTipMessage.shouldBe(visible);
        AdvanceSite.AlertMessage.shouldBe(visible);
        $(".btn").click();
        Cancel();

    }

    @Test
    @Order(7)
    public void t7SaveAndNextButtonShouldBeEnabledAndClickedAfterValidCampaignDetailsIsAdded() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(500);
        SiteEdit.EditSite.click();
        CampaignElements.CampaignOption.click();
        CampaignElements.NewCampaign.click();
        CampaignElements.AdvanceForm.click();
        CampaignElements.Title.sendKeys("Campaign-Incomming");
        Thread.sleep(1000);
        CampaignElements.Slug.clear();
        CampaignElements.Slug.sendKeys("EditedJustNow");
        CampaignElements.Banner.click();
        CampaignElements.BannerUploader.click();
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\kindpng_1300250.png";
        new FileUpload(filepath);
        AdvanceSite.Done.click();
        Thread.sleep(3000);
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
        CampaignElements.CalendarEndYearSelect.click();
        CampaignElements.CalendarMonthSelect.click();
        CampaignElements.CalendarDateSelect.click();
        Thread.sleep(1000);
        AdvanceSite.SaveAndNextButton.click();
        Cancel();

    }
    @Test
    @Order(8)
    public void t8AddVideosPageShouldBeVisibleAfterSaveAndNextButtonIsClicked() throws InterruptedException, AWTException {
        Thread.sleep(500);
        SiteEdit.EditSite.click();
        CampaignElements.CampaignOption.click();
        CampaignElements.NewCampaign.click();
        CampaignElements.AdvanceForm.click();
        CampaignDetails();
        AdvanceSite.SaveAndNextButton.click();
        $(".campaign-step-title").shouldBe(visible);
        Cancel();

    }
    @Test
    @Order(9)
    public void t9AssignAndUnAssignVideos() throws InterruptedException, AWTException {
        Thread.sleep(500);
        SiteEdit.EditSite.click();
        CampaignElements.CampaignOption.click();
        CampaignElements.NewCampaign.click();
        CampaignElements.AdvanceForm.click();
        CampaignDetails();
        AdvanceSite.SaveAndNextButton.click();
        AssignAndUnAssignCampaignVideo();
        Cancel();

    }
        @Test
        @Order(10)
        public void t10SelectedVideoShouldBeVisibleAfterAvailableVideoIsAssigned() throws InterruptedException, AWTException {
            Thread.sleep(500);
            SiteEdit.EditSite.click();
            CampaignElements.CampaignOption.click();
            CampaignElements.NewCampaign.click();
            CampaignElements.AdvanceForm.click();
            CampaignDetails();
            AdvanceSite.SaveAndNextButton.click();
            CampaignElements.UnAssign.is(visible);
            Cancel();
        }
        @Test
        @Order(11)
        public void t11SelectDocumentPageShouldBeVisibleAfterSaveAndNextButtonIsClicked() throws InterruptedException, AWTException {
            Thread.sleep(500);
            SiteEdit.EditSite.click();
            CampaignElements.CampaignOption.click();
            CampaignElements.NewCampaign.click();
            CampaignElements.AdvanceForm.click();
            CampaignDetails();
            AdvanceSite.SaveAndNextButton.click();
            CampaignElements.Assign.click();
            AdvanceSite.SaveAndNextButton.click();
            $(".campaign-step-title").shouldBe(visible);
            Cancel();
        }
        @Test
        @Order(12)
        public void t12AssignAndUnAssignDocument() throws InterruptedException, AWTException {
            Thread.sleep(500);
            SiteEdit.EditSite.click();
            CampaignElements.CampaignOption.click();
            CampaignElements.NewCampaign.click();
            CampaignElements.AdvanceForm.click();
            CampaignDetails();
            AdvanceSite.SaveAndNextButton.click();
            CampaignElements.Assign.click();
            AdvanceSite.SaveAndNextButton.click();
            if (CampaignElements.Assign.is(visible)) {
                CampaignElements.Assign.click();
                CampaignElements.UnAssign.click();
                AdvanceSite.ConfirmCancel.click();
            } else
                AdvanceSite.SaveAndNextButton.click();
            Cancel();
        }
        @Test
        @Order(13)
        public void t13LinkPageShouldBeVisibleAfterDocumentIsAssignedAndSaveAndNextButtonIsClicked() throws InterruptedException, AWTException {
            Thread.sleep(500);
            SiteEdit.EditSite.click();
            CampaignElements.CampaignOption.click();
            CampaignElements.NewCampaign.click();
            CampaignElements.AdvanceForm.click();
            CampaignDetails();
            SelectVideosAndDocument();
            if (CampaignElements.Assign.is(visible)){
                CampaignElements.Assign.click();
            } else
                AdvanceSite.SaveAndNextButton.click();
            $(".campaign-step-title").shouldBe(visible);
            Cancel();
            }
        @Test
        @Order(14)
        public void t14AssignAndUnAssignLink() throws InterruptedException, AWTException {
            Thread.sleep(500);
            SiteEdit.EditSite.click();
            CampaignElements.CampaignOption.click();
            CampaignElements.NewCampaign.click();
            CampaignElements.AdvanceForm.click();
            CampaignDetails();
            SelectVideosAndDocument();
            if (CampaignElements.Assign.is(visible)) {
                CampaignElements.Assign.click();
                CampaignElements.UnAssign.click();
                AdvanceSite.ConfirmCancel.click();
            } else
                AdvanceSite.SaveAndNextButton.click();
            Cancel();
        }
        @Test
        @Order(15)
        public void t15ContactPageShouldBeVisibleAfterLinkIsAssignedAndSaveAndNextButtonIsClicked() throws InterruptedException, AWTException {
            Thread.sleep(500);
            SiteEdit.EditSite.click();
            CampaignElements.CampaignOption.click();
            CampaignElements.NewCampaign.click();
            CampaignElements.AdvanceForm.click();
            CampaignDetails();
            SelectVideosAndDocument();
            if (CampaignElements.Assign.is(visible)){
                CampaignElements.Assign.click();
            } else
                AdvanceSite.SaveAndNextButton.click();
            $(".campaign-step-title").shouldBe(visible);
            Cancel();
            }
        @Test
        @Order(16)
        public void t16AssignAndUnAssignContacts() throws InterruptedException, AWTException {
            Thread.sleep(500);
            SiteEdit.EditSite.click();
            CampaignElements.CampaignOption.click();
            CampaignElements.NewCampaign.click();
            CampaignElements.AdvanceForm.click();
            CampaignDetails();
            SelectVideosAndDocument();
            AssignUnAssignLink();
            if (CampaignElements.Assign.is(visible)){
                CampaignElements.Assign.click();
                CampaignElements.UnAssign.click();
                AdvanceSite.ConfirmCancel.click();

                CampaignElements.Assign.click();
            } else
                AdvanceSite.SaveAndNextButton.click();
                Cancel();
            }

        @Test
        @Order(17)
        public void t17CampaignShouldGetPreviewedAfterPreviewCampaignIsClicked() throws InterruptedException, AWTException {
            Thread.sleep(500);
            SiteEdit.EditSite.click();
            CampaignElements.CampaignOption.click();
            CampaignElements.NewCampaign.click();
            CampaignElements.AdvanceForm.click();
            CampaignDetails();
            SelectVideosAndDocument();
            AssignUnAssignLink();
            AdvanceSite.SaveAndNextButton.click();
            CampaignElements.Assign.click();
            AdvanceSite.SaveAndNextButton.click();
            Thread.sleep(1000);
            Cancel();
        }

        @Test
        @Order(18)
        public void t18SaveCampaign() throws InterruptedException, AWTException {
            Thread.sleep(500);
            SiteEdit.EditSite.click();
            CampaignElements.CampaignOption.click();
            CampaignElements.NewCampaign.click();
            CampaignElements.AdvanceForm.click();
            CampaignDetails();
            SelectVideosAndDocument();
            AssignUnAssignLink();
            AdvanceSite.SaveAndNextButton.click();
            CampaignElements.Assign.click();
            AdvanceSite.SaveAndNextButton.click();
            Thread.sleep(1000);
            AdvanceSite.SaveAndNextButton.click();
            AdvanceSite.SuccessMessage.shouldBe(visible);

            }

        }




