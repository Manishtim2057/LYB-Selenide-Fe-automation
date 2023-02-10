package LYB.Createsite.AdvanceForm;

import LYB.Base.BaseSetup;

import LYB.Createsite.SiteCategory.SiteCategory;
import LYB.FileUpload.FileUpload;
import LYB.FileUpload.ZoomOut;
import LYB.Login.LoginTest;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Driver;
import com.codeborne.selenide.drivercommands.CloseDriverCommand;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebElement;

import java.awt.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AdvanceSiteCreateTest extends BaseSetup {
    TestMethodOrder Ascending;

    @BeforeEach
    public void setUp() throws InterruptedException, AWTException {
     open("https://staging.learnyourcare.com/auth/login");
     Thread.sleep(2000);





    }

    public void Status() throws InterruptedException {
        if(SiteCategory.Status == text("Unpublished") ) {
            SiteCategory.Published.click();
            Thread.sleep(1000);
            SiteCategory.PublishedColor.shouldBe(visible);
        }
        else
            SiteCategory.Unpub.click();
        Thread.sleep(500);
        AdvanceSite.ConfirmCancel.click();
        Thread.sleep(1000);
        SiteCategory.UnpublishedColor.shouldBe(visible);
    }

    public void openSiteModal() throws InterruptedException {
        AdvanceSite.NewSiteButton.click();
        Thread.sleep(1000);
        AdvanceSite.UseAdvanceForm.click();
    }


    public void fillSiteDetails() throws InterruptedException, AWTException {
        AdvanceSite.SubDomain.sendKeys("rty");
        AdvanceSite.SiteTitle.sendKeys("Dirt");

        AdvanceSite.SiteLogo.click();
        Thread.sleep(1000);
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
    public void UploadDocument() throws InterruptedException, AWTException {
        Thread.sleep(1000);
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\Google_Adword_Project.pptx";
        new FileUpload(filepath);
        Thread.sleep(1000);

    }

    public void AddMessageAndChooseVideos() throws InterruptedException, AWTException {


        AdvanceSite.SiteMessage.setValue("Lorem");
        AdvanceSite.SaveAndNextButton.is(enabled);
        AdvanceSite.SaveAndNextButton.click();
        Thread.sleep(500);
        AdvanceSite.GlobalAndCategoryVideos.click();
        AdvanceSite.SaveAndNextButton.click();
    }

    public void AddCategories() throws InterruptedException, AWTException {

        AdvanceSite.AddCategory.click();
        AdvanceSite.CategoryTitle.sendKeys("New Category");
        AdvanceSite.CategoryDescription.sendKeys("It is a long established fact that a reader will be distracted");
        AdvanceSite.CategoryHeader.sendKeys("It is a long established fact that a reader will be distracted");
        AdvanceSite.CategoryFooter.sendKeys("t is a long established fact that a reader will be distracted");
        AdvanceSite.StatusDropDown.click();
        AdvanceSite.Published.click();
//        AdvanceSite.CategoryStatusDropDown.click();
//        AdvanceSite.Unpublished.click();
        AdvanceSite.CategorySaveButton.click();

    }

    public void CancelButton() throws InterruptedException, AWTException {
        AdvanceSite.CancelButton.click();
        AdvanceSite.ConfirmCancel.click();

    }
    public void AddVideoBuckets() throws InterruptedException {
        AdvanceSite.SaveAndNextButton.click();
        AdvanceSite.AssignVideBucket.click();
        Thread.sleep(1000);
        AdvanceSite.AssignVideBucket.click();
        Thread.sleep(1000);
        AdvanceSite.AssignVideBucket.click();
        Thread.sleep(1000);
        AdvanceSite.AssignVideBucket.click();

    }
    public void AddVideos() throws InterruptedException {
        AdvanceSite.SaveAndNextButton.click();
        AdvanceSite.AssignVideo.click();
        Thread.sleep(500);
        AdvanceSite.AssignVideo.click();
        Thread.sleep(500);
        AdvanceSite.UnAssignVideo.click();
        Thread.sleep(1000);
        AdvanceSite.ConfirmCancel.click();
        Thread.sleep(500);
        AdvanceSite.SaveAndNextButton.click();

    }
    public void AddDocument() throws InterruptedException, AWTException {

        AdvanceSite.NewDocument.click();
        AdvanceSite.AddDocument.click();
        Thread.sleep(1000);
        UploadDocument();
        Thread.sleep(500);
        AdvanceSite.DocumentTitle.clear();
        AdvanceSite.DocumentTitle.sendKeys("Doc");

//        AdvanceSite.DocumentIcon.click();
//        AdvanceSite.DocumentIconOption1.click();
        AdvanceSite.DocumentDescription.sendKeys("Desc");
        Thread.sleep(1000);
        AdvanceSite.DocumentThumbnail.click();
        Thread.sleep(1000);
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\kindpng_1300250.png";
        new FileUpload(filepath);
        Thread.sleep(1000);
        AdvanceSite.Done.click();
        Thread.sleep(2000);
        AdvanceSite.StatusDropDown.click();
        Thread.sleep(500);
        AdvanceSite.Published.click();
        Thread.sleep(500);
        AdvanceSite.SaveButton.click();

    }

    public void AddContact() throws AWTException, InterruptedException {
        AdvanceSite.NewContact.click();
        AdvanceSite.ContactTypeDropDown.click();
        AdvanceSite.ContactType1.click();
        AdvanceSite.ContactTitle.sendKeys("Sample");
        AdvanceSite.ContactEmail.sendKeys("Lorem@gmail.com");
        AdvanceSite.ContactDescription.setValue("Lorem");
        AdvanceSite.ContactThumbnail.click();
        Thread.sleep(1000);
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\kindpng_1300250.png";
        new FileUpload(filepath);
        AdvanceSite.Done.click();
        Thread.sleep(3000);
        AdvanceSite.StatusDropDown.click();
        Thread.sleep(500);
        AdvanceSite.Published.click();
        Thread.sleep(1000);
        AdvanceSite.ContactSaveButton.click();
    }
    public void AddLink() throws AWTException, InterruptedException {
        AdvanceSite.NewLink.click();
        AdvanceSite.LinkTitle.sendKeys("NeLInk");
        AdvanceSite.LinkURl.sendKeys("https://www.youtube.com/");
        AdvanceSite.LinkThumbnail.click();
        Thread.sleep(1000);
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\kindpng_1300250.png";
        new FileUpload(filepath);
        AdvanceSite.Done.click();
        Thread.sleep(2000);
        AdvanceSite.StatusDropDown.click();
        AdvanceSite.Published.click();
        AdvanceSite.LinkDescription.sendKeys("Lorem");
        Thread.sleep(1000);
        AdvanceSite.LinkSaveButton.click();
    }

    public void AddCalculators(){
        AdvanceSite.SaveAndNextButton.click();
        AdvanceSite.CalculatorAssign.click();
        AdvanceSite.CalculatorAssign.click();
        AdvanceSite.CalculatorAssign.click();
        AdvanceSite.CalculatorUnAssign.click();
    }


    @Test
    @Order(1)
    public void t1advanceFormShouldOpen() throws InterruptedException, AWTException {
        Thread.sleep(2000);
        openSiteModal();
        $x("/html/body/app-root/admin-root/section/div/section/div/app-sites/div/section/app-site-create/div/div/div/div[2]/section/div/div/section/div/app-site-details/div[1]/h3").shouldBe(visible);
    }

    @Test
    @Order(2)
    public void t2saveAndNextButtonShouldBeDisabledBeforeDetailsFill() throws InterruptedException, AWTException {
        openSiteModal();
        AdvanceSite.SaveAndNextButton.is(disabled);

    }

    @Test
    @Order(3)
    public void t3SaveAndNextButtonShouldBeEnableAfterValidDataFilled() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        Thread.sleep(500);
        CancelButton();

    }

    @Test
    @Order(4)
    public void t4AddMessageShouldAppear() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AdvanceSite.SaveAndNextButton.click();
        AdvanceSite.SiteMessage.shouldBe(visible);

        Thread.sleep(500);
        CancelButton();
    }

    @Test
    @Order(5)
    public void t5AddMessageShouldAppearAndNextButtonShouldDisabled() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AdvanceSite.SaveAndNextButton.click();
        AdvanceSite.SiteMessage.shouldBe(visible);

        AdvanceSite.SaveAndNextButton.shouldBe(disabled);
        CancelButton();
    }

    @Test
    @Order(6)
    public void t6PreviousAndContinueLaterButtonShouldGetAppearInAddMessage() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AdvanceSite.SaveAndNextButton.click();
        AdvanceSite.SaveAndNextButton.shouldBe(visible);
        Thread.sleep(500);
        CancelButton();
    }

    @Test
    @Order(7)
    public void t7NextButtonShouldEnabledAfterAddingTheMessage() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AdvanceSite.SiteMessage.setValue("Lorem");
        AdvanceSite.SaveAndNextButton.shouldBe(enabled);
        Thread.sleep(500);
        CancelButton();

    }

    @Test
    @Order(8)
    public void t8ChooseVideoTypeShouldBeVisibleAfterSaveAndNextButtonIsClicked() throws InterruptedException, AWTException {

        openSiteModal();
        fillSiteDetails();
        AdvanceSite.SiteMessage.setValue("Lorem");
        AdvanceSite.SaveAndNextButton.click();
        AdvanceSite.ChooseVideoType.shouldBe(visible);
        CancelButton();


    }

    @Test
    @Order(9)
    public void t9VideoTypeShouldBeSelected() throws InterruptedException, AWTException {

        openSiteModal();
        fillSiteDetails();
        AdvanceSite.SiteMessage.setValue("Lorem");
        AdvanceSite.SaveAndNextButton.is(enabled);
        AdvanceSite.SaveAndNextButton.click();
//        AdvanceSite.GlobalVideos.click();
        AdvanceSite.GlobalAndCategoryVideos.click();
//        AdvanceSite.CategoryPublished.click();
        CancelButton();
    }

    @Test
    @Order(10)
    public void t10AddCategoriesShouldBeVisibleAfterSaveAndNextButtonIsClicked() throws InterruptedException, AWTException {


        openSiteModal();
        fillSiteDetails();
        AdvanceSite.SaveAndNextButton.click();
        AdvanceSite.SiteMessage.setValue("Lorem");
        AdvanceSite.SaveAndNextButton.is(enabled);
        AdvanceSite.SaveAndNextButton.click();
        AdvanceSite.GlobalAndCategoryVideos.click();
        AdvanceSite.SaveAndNextButton.click();
        AdvanceSite.AddCategory.shouldBe(visible);
        CancelButton();
    }

    @Test
    @Order(11)
    public void t11SaveAndNextButtonShouldBeDisabledBeforeAddingCategories() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AdvanceSite.SaveAndNextButton.shouldBe(disabled);
        CancelButton();


    }

    @Test
    @Order(12)
    public void t12AddCategoriesSaveAndNextButtonShouldBeEnabledAfterRequiredIsAdded() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AdvanceSite.SaveAndNextButton.is(enabled);
        Thread.sleep(500);
        CancelButton();

    }

    @Test
    @Order(13)
    public void t13PageShouldMoveBackToThePreviousPhaseAfterPreviousButtonIsClicked() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AdvanceSite.SaveAndNextButton.click();
        Thread.sleep(500);
        CancelButton();
//        AdvanceSite.AddVideoBucket.shouldBe(visible);


    }

    @Test
    @Order(14)
    public void t14AddVideoBucketShouldAppearAfterSaveAndNextButtonIsClicked() throws InterruptedException, AWTException {


        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AdvanceSite.SaveAndNextButton.click();
        AdvanceSite.AddVideoBucket.shouldBe(visible);
        Thread.sleep(500);
        CancelButton();


    }

    @Test
    @Order(15)
    public void t15SaveAndNextButtonShouldBeEnabled() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AdvanceSite.SaveAndNextButton.click();
        AdvanceSite.SaveAndNextButton.shouldBe(enabled);
        Thread.sleep(500);
        CancelButton();
    }

    @Test
    @Order(16)
    public void t16AssignAvailableBucketsToSelectedBuckets() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AdvanceSite.SaveAndNextButton.click();
        AdvanceSite.AssignVideBucket.click();
        Thread.sleep(1000);
        AdvanceSite.AssignVideBucket.click();
        Thread.sleep(500);
        CancelButton();


    }

    @Test
    @Order(17)
    public void t17AssignBucketsShouldBeVisibleToTheSelectedBuckets() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AdvanceSite.SaveAndNextButton.click();
        AdvanceSite.AssignVideBucket.click();
        Thread.sleep(1000);
        AdvanceSite.AssignVideBucket.click();
        AdvanceSite.SelectedBuckets.shouldBe(visible);
        Thread.sleep(500);
        CancelButton();
    }
    @Test
    @Order(18)
    public void t18ClearSelectionShouldBeClickedAndSelectedVideoBucketsShouldBeCleared() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AdvanceSite.SaveAndNextButton.click();
        Thread.sleep(500);
        AdvanceSite.AssignVideBucket.click();
        Thread.sleep(1000);
        AdvanceSite.AssignVideBucket.click();
        Thread.sleep(500);
        AdvanceSite.ClearSelection.click();
        Thread.sleep(1000);
        AdvanceSite.EmptySelectBuckets.shouldBe(visible);
        Thread.sleep(500);
        CancelButton();

    }
    @Test
    @Order(19)
    public void t19AvailableVideosListShouldBeAvailable() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AdvanceSite.AvailableVideosList.shouldBe(visible);
        Thread.sleep(500);
        CancelButton();

}
    @Test
    @Order(20)
    public void t20AvailableVideosListShouldBeClearedAfterClearSelectionIsClicked() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AdvanceSite.ClearSelection.click();
        AdvanceSite.EmptyAvailableVideo.shouldBe(visible);
        Thread.sleep(500);
        CancelButton();
    }

    @Test
    @Order(21)
    public void t21AddVideoShouldBeAppearAfterSaveAndNextButtonIsClicked() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AdvanceSite.AddVideos.shouldBe(visible);
        Thread.sleep(500);
        CancelButton();


    }

    @Test
    @Order(22)
    public void t22VideoListShouldAppearAfterAddVideosAppear() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AdvanceSite.AvailableVideos.shouldBe(visible);
        Thread.sleep(500);
        CancelButton();
    }
    @Test
    @Order(23)
    public void t23VideoShouldAssignedAfterAssignButtonIsClicked() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AdvanceSite.SaveAndNextButton.click();
        AdvanceSite.AssignVideo.click();
        Thread.sleep(500);
        CancelButton();

    }
    @Test
    @Order(24)
    public void t24VideoShouldBeVisibleAfterAssignButtonIsClicked() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AdvanceSite.SaveAndNextButton.click();
        AdvanceSite.VideosPlayList.shouldBe(visible);
        Thread.sleep(500);
        CancelButton();

    }
    @Test
    @Order(25)
    public void t25VideoShouldUnAssignFromTheVideoPlaylist() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AdvanceSite.SaveAndNextButton.click();
        Thread.sleep(500);
        AdvanceSite.AssignVideo.click();
        Thread.sleep(500);
        AdvanceSite.UnAssignVideo.click();
        Thread.sleep(1000);
        AdvanceSite.ConfirmCancel.click();
        Thread.sleep(1000);
        CancelButton();
    }

    @Test
    @Order(26)
    public void t26VideoShouldGetRemovedAfterUnAssignedFromVideoPlaylist() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AdvanceSite.SaveAndNextButton.click();
        AdvanceSite.AssignVideo.click();
        Thread.sleep(1000);

        AdvanceSite.UnAssignVideo.click();
        Thread.sleep(1000);
        AdvanceSite.ConfirmCancel.click();
        AdvanceSite.EmptyVideoPlaylist.shouldBe(visible);
        Thread.sleep(500);
        CancelButton();

    }
    @Test
    @Order(27)
    public void t27AddResourcesShouldAppearAfterSaveAndNextButtonIsClicked() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AddVideos();
        AdvanceSite.SaveAndNextButton.click();
        AdvanceSite.AddResources.shouldBe(visible);
        Thread.sleep(500);
        CancelButton();


    }
    @Test
    @Order(28)
    public void t28AddNewDocumentFormShouldGetAppearAfterButtonIsClicked() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AddVideos();

        Thread.sleep(1000);
        AdvanceSite.NewDocument.click();
        Thread.sleep(1000);
        AdvanceSite.Cancel.click();
        Thread.sleep(1000);
        CancelButton();

    }

    @Test
    @Order(29)
    public void t29AddNewDocumentWithValidDocumentCredentials() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AddVideos();
        AddDocument();
        Thread.sleep(500);
        CancelButton();



    }
    @Test
    @Order(30)
    public void t30SaveButtonShouldBeDisabledWithTheInvalidDocumentCredentials() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AddVideos();
        AdvanceSite.NewDocument.click();
//        AdvanceSite.AddDocument.click();
//        Thread.sleep(1000);
//        UploadDocument();
//        Thread.sleep(500);

        AdvanceSite.DocumentTitle.sendKeys("Doc");
        AdvanceSite.DocumentDescription.sendKeys("Desc");

        AdvanceSite.StatusDropDown.click();
        AdvanceSite.Unpublished.click();
        AdvanceSite.SaveButton.shouldBe(disabled);
        AdvanceSite.Cancel.click();
        Thread.sleep(1000);
        CancelButton();
    }
    @Test
    @Order(31)
    public void t31DocumentListShouldGetAppearAfterDocumentIsCreated() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AddVideos();
        AddDocument();
        Thread.sleep(1000);
        AdvanceSite.DocumentList.shouldBe(visible);
        Thread.sleep(1000);
        CancelButton();

    }
    @Test
    @Order(32)
    public void t32UpdateDocumentAfterItIsCreated() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AddVideos();
        AddDocument();
        Thread.sleep(2000);
        AdvanceSite.DocumentFlyoutMenu.click();
        Thread.sleep(1000);
        AdvanceSite.DocumentEdit.click();
        Thread.sleep(500);
        AdvanceSite.DocumentTitle.sendKeys("ertyasd");
        Thread.sleep(500);
        AdvanceSite.DocumentDescription.sendKeys("erwf");
        Thread.sleep(500);
        AdvanceSite.SaveButton.click();
        Thread.sleep(500);
        CancelButton();

    }
    @Test
    @Order(33)
    public void t33ChangeTheStatusOfTheCreatedDocuments() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AddVideos();
        AddDocument();
        Thread.sleep(1000);
        AdvanceSite.DocumentFlyoutMenu.click();
        Thread.sleep(500);
        AdvanceSite.ChangeStatus.click();
        Thread.sleep(500);
        CancelButton();



    }
    @Test
    @Order(34)
    public void t34ChangedStatusMustBeVisible() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AddVideos();
        AddDocument();
        AdvanceSite.DocumentFlyoutMenu.click();
        AdvanceSite.ChangeStatus.click();
        $x("//*[@id=\"undefined\"]/div[2]/div/nico-status/span").shouldBe(visible);
        Thread.sleep(500);
        CancelButton();

    }

    @Test
    @Order(35)
    public void t35RemoveCreatedDocument() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AddVideos();
        AddDocument();
        AdvanceSite.DocumentFlyoutMenu.click();
        AdvanceSite.RemoveDocument.click();
        Thread.sleep(500);
        CancelButton();

    }
    @Test
    @Order(36)
    public void t36AddContactWithTheAllRequiredInputs() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AddVideos();
        AddDocument();
        AddContact();
        Thread.sleep(500);
        CancelButton();



    }
    @Test
    @Order(37)
    public void t37AddContactWithInvalidCredentials() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AddVideos();
        AdvanceSite.NewContact.click();
        AdvanceSite.ContactTypeDropDown.click();
        AdvanceSite.ContactType1.click();
        AdvanceSite.ContactTitle.sendKeys("Sample");
        AdvanceSite.ContactEmail.sendKeys("adasdasdasdasdasdsadsadsad");
        AdvanceSite.ContactDescription.sendKeys("Dirt");
        Thread.sleep(1000);
        AdvanceSite.SaveButton.click();
        Thread.sleep(1000);
        AdvanceSite.AlertMessage.shouldBe(visible);

    }
    @Test
    @Order(38)
    public void t38UpdateContact() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AddVideos();
        AddContact();
        AdvanceSite.ContactFlyout.hover();
        Thread.sleep(500);
        AdvanceSite.ContactFlyout.click();
        Thread.sleep(500);
        AdvanceSite.ContactEdit.click();
        Thread.sleep(500);
        AdvanceSite.ContactTitle.sendKeys("Sample");
        AdvanceSite.ContactEmail.sendKeys("ERty@gmail.com");
        Thread.sleep(500);
        CancelButton();

 }

    @Test
    @Order(39)
    public void t39ChangeStatusOfContact() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AddVideos();
        AddContact();
        AdvanceSite.ContactFlyout.click();
        AdvanceSite.ContactEdit.click();
        AdvanceSite.ChangeStatus.click();
        Thread.sleep(500);
        CancelButton();

    }
    @Test
    @Order(40)
    public void t40RemoveCreatedContact() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AddVideos();
        AddContact();
        AdvanceSite.ContactFlyout.click();
        Thread.sleep(1000);
        AdvanceSite.ContactRemove.click();
        Thread.sleep(1000);
        AdvanceSite.ConfirmCancel.click();
        Thread.sleep(500);
        CancelButton();

    }
    @Test
    @Order(41)
    public void t41AddLinkWithAllRequiredInputs() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AddVideos();
//        AddDocument();
//        AddContact();
        AdvanceSite.NewLink.click();
        AdvanceSite.LinkTitle.sendKeys("NeLInk");
        AdvanceSite.LinkURl.sendKeys("https://www.youtube.com/");
        AdvanceSite.LinkThumbnail.click();
        Thread.sleep(1000);
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\kindpng_1300250.png";
        new FileUpload(filepath);
        AdvanceSite.Done.click();
        Thread.sleep(1000);
        AdvanceSite.StatusDropDown.click();
        AdvanceSite.Published.click();
        AdvanceSite.LinkDescription.sendKeys("Lorem");
        Thread.sleep(1000);
        AdvanceSite.LinkSaveButton.click();
        Thread.sleep(1000);
        CancelButton();

    }
    @Test
    @Order(41)
    public void t41AddLinkWithAllRequiredAndUnpublishedStatus() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AddVideos();
//        AddDocument();
//        AddContact();
        AdvanceSite.NewLink.click();
        AdvanceSite.LinkTitle.sendKeys("NeLInk");
        AdvanceSite.LinkURl.sendKeys("https://www.youtube.com/");
        AdvanceSite.LinkThumbnail.click();
        Thread.sleep(1000);
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\kindpng_1300250.png";
        new FileUpload(filepath);
        AdvanceSite.Done.click();
        Thread.sleep(1000);
        AdvanceSite.StatusDropDown.click();
        AdvanceSite.Unpublished.click();
        AdvanceSite.LinkDescription.sendKeys("Lorem");
        Thread.sleep(1000);
        AdvanceSite.LinkSaveButton.click();
        Thread.sleep(1000);
        CancelButton();

    }
    @Test
    @Order(42)
    public void t42AddLinkWithInvalidThumbnailType() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AddVideos();
//        AddDocument();
//        AddContact();
        AdvanceSite.NewLink.click();
        AdvanceSite.LinkTitle.sendKeys("NeLInk");
        AdvanceSite.LinkURl.sendKeys("https://www.youtube.com/");
        AdvanceSite.LinkThumbnail.click();
        Thread.sleep(1000);
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\SEO.pptx";
        new FileUpload(filepath);
        SiteCategory.ErrorToolTipMessage.shouldBe(visible);

    }
    @Test
    @Order(43)
    public void t43EditLinkWithValidRequiredDetails() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AddVideos();
//        AddDocument();
//        AddContact();
        AdvanceSite.DocumentFlyoutMenu.click();
        AdvanceSite.DocumentEdit.click();
        AdvanceSite.LinkTitle.clear();
        AdvanceSite.LinkTitle.sendKeys("Dash");
        AdvanceSite.LinkURl.clear();
        AdvanceSite.LinkURl.sendKeys("https://www.youtube.com/");
        AdvanceSite.LinkThumbnail.click();
        Thread.sleep(1000);
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\kindpng_1300250.png";
        new FileUpload(filepath);
        AdvanceSite.Done.click();
        Thread.sleep(1000);
        AdvanceSite.StatusDropDown.click();
        AdvanceSite.Unpublished.click();
        AdvanceSite.LinkDescription.clear();
        AdvanceSite.LinkDescription.sendKeys("Lorem");
        Thread.sleep(1000);
        AdvanceSite.LinkSaveButton.click();
        Thread.sleep(1000);
        CancelButton();
    }

    @Test
    @Order(44)
    public void t44EditLinkWithInvalidThumbnailType() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AddVideos();
//        AddDocument();
//        AddContact();
        AdvanceSite.DocumentFlyoutMenu.click();
        AdvanceSite.DocumentEdit.click();
        AdvanceSite.NewLink.click();
        AdvanceSite.LinkTitle.sendKeys("NeLInk");
        AdvanceSite.LinkURl.sendKeys("https://www.youtube.com/");
        AdvanceSite.LinkThumbnail.click();
        Thread.sleep(1000);
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\SEO.pptx";
        new FileUpload(filepath);
        SiteCategory.ErrorToolTipMessage.shouldBe(visible);

    }

    @Test
    @Order(45)
    public void t45ChangeStatusOfLink() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AddVideos();
//        AddDocument();
//        AddContact();
        AdvanceSite.DocumentFlyoutMenu.click();
        Status();


    }
    @Test
    @Order(46)
    public void t46RemoveAddedLink() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AddVideos();
//        AddDocument();
//        AddContact();
        AdvanceSite.DocumentFlyoutMenu.click();
        AdvanceSite.RemoveDocument.click();


    }

    @Test()
    @Order(47)
   public void t47CalculatorPageShouldBeVisible() throws InterruptedException, AWTException {
       openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AddVideos();
        AddLink();
        AdvanceSite.SaveAndNextButton.click();
        AdvanceSite.SelectCalculator.shouldBe(visible);
        Thread.sleep(500);
        CancelButton();
    }
    @Test
    @Order(48)
    public void t48AssignCalculator() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AddVideos();
        AddLink();

        AdvanceSite.SaveAndNextButton.click();
        AdvanceSite.CalculatorAssign.click();
        AdvanceSite.SelectCalculator.shouldBe(visible);
        Thread.sleep(500);
        CancelButton();

    }

    @Test
    @Order(49)
    public void t49UnAssignCalculator() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AddVideos();
        AddLink();

        AdvanceSite.SaveAndNextButton.click();
        AdvanceSite.CalculatorAssign.click();
        AdvanceSite.CalculatorAssign.click();
        AdvanceSite.CalculatorAssign.click();
        AdvanceSite.CalculatorUnAssign.click();
        Thread.sleep(500);
        CancelButton();

    }
    @Test
    @Order(50)
    public void t50PreviewSiteButtonShouldBeClicked() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AddVideos();
        AddLink();
        AddCalculators();
        AdvanceSite.SaveAndNextButton.click();
        Thread.sleep(1000);
        CancelButton();

    }
    @Test
    @Order(51)
    public void t51PreviewSiteShouldAppear() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AddVideos();
        AddLink();
        AddCalculators();
        AdvanceSite.SaveAndNextButton.click();
        AdvanceSite.PreviewSite.shouldBe(visible);
        Thread.sleep(1000);
        CancelButton();
    }
    @Test
    @Order(52)
    public void t52MoveToPreviousPageFromPreviewPage() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AddVideos();
        AddLink();
        AddCalculators();
        AdvanceSite.SaveAndNextButton.click();
        Thread.sleep(1000);
        AdvanceSite.PreviousButton.click();
        Thread.sleep(2000);
        CancelButton();

    }
    @Test
    @Order(53)
    public void t53SelectCalculatorPageShouldBeVisibleAfterPreviousButtonIsClicked() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AddVideos();
        AddLink();
        AddCalculators();
        AdvanceSite.SaveAndNextButton.click();
        Thread.sleep(1000);
        AdvanceSite.PreviousButton.click();
        AdvanceSite.SelectCalculator.shouldBe(visible);
        Thread.sleep(2000);
        CancelButton();

    }
    @Test
    @Order(54)
    public void t54ProcessShouldBecCanceledAfterCancelButtonIsClicked() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AddVideos();
        AddLink();
        AddCalculators();
        AdvanceSite.SaveAndNextButton.click();
        Thread.sleep(1000);
        CancelButton();

    }

    @Test
    @Order(55)
    public void t55ShouldBeRedirectToTheSitePageAfterCancelButtonIsClicked() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AddVideos();
        AddLink();
        AddCalculators();
        AdvanceSite.SaveAndNextButton.click();
        Thread.sleep(1000);
        AdvanceSite.CancelButton.click();
        Thread.sleep(500);
        AdvanceSite.ConfirmCancel.click();
        AdvanceSite.SiteManagement.shouldBe(visible);
        Thread.sleep(1000);

    }
    @Test
    @Order(56)
    public void t56ContinueButtonShouldBeClicked() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AddVideos();
        AddLink();
        AddCalculators();
        AdvanceSite.SaveAndNextButton.click();
        Thread.sleep(500);
        AdvanceSite.ContinueLater.click();
        Thread.sleep(1000);

    }
    @Test
    @Order(57)
    public void t57ShouldRedirectAfterContinueLaterButtonIsClicked() throws InterruptedException, AWTException {
        openSiteModal();
        Thread.sleep(1000);
        AdvanceSite.CancelButton.click();

    }

    @Test
    @Order(58)
    public void t58SaveTheCreateSite() throws InterruptedException, AWTException {
        openSiteModal();
        fillSiteDetails();
        AddMessageAndChooseVideos();
        AddCategories();
        AddVideoBuckets();
        AddVideos();
        AddLink();
        AddCalculators();
        AdvanceSite.SaveAndNextButton.click();
        Thread.sleep(1000);
        CancelButton();

    }



}