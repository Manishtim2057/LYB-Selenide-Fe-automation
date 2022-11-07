package LYB.Createsite.SiteCategory.BulkAction;

import LYB.Base.BaseSetup;
import LYB.Createsite.AdvanceForm.AdvanceSite;
import LYB.Createsite.SiteCategory.SiteCategory;
import LYB.Createsite.SiteEdit.SiteEdit;
import LYB.FileUpload.FileUpload;
import org.junit.jupiter.api.*;

import java.awt.*;

import static com.codeborne.selenide.Condition.disabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BulkActionTest extends BaseSetup {

    @BeforeEach
    public void setUp() throws InterruptedException {
        open("http://localhost:4200/auth/login");

    }

    public void Search() {
        SiteEdit.Search.setValue("atmsite");
        SiteEdit.Search.pressEnter();

    }


    public void UploadDocument() throws InterruptedException, AWTException {
        Thread.sleep(1000);
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\Google_Adword_Project.pptx";
        new FileUpload(filepath);
        Thread.sleep(1000);

    }


    @Test
    @Order(1)
    public void t1AddMultipleDocumentWithAllValidCredentials() throws AWTException, InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryDocuments.click();
        Thread.sleep(1000);
        SiteCategory.NewDocument.click();
        Thread.sleep(1000);
        SiteCategory.MultipleDocument.click();
        Thread.sleep(1000);
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\\"Google_Adword_Project.pptx\" \"pptx1.pptx\" \"SEO.pptx\" ";
        new FileUpload(filepath);
        Thread.sleep(1000);
        SiteCategory.MulDocumentTitle1.clear();
        SiteCategory.MulDocumentTitle1.setValue("Document1");
        SiteCategory.MulDocumentTitle2.clear();
        SiteCategory.MulDocumentTitle2.sendKeys("Document2");
        SiteCategory.MulDocumentTitle3.clear();
        SiteCategory.MulDocumentTitle3.sendKeys("Document3");
        SiteCategory.MulDocumentIcon1.click();
        SiteCategory.MulDocumentIconOption1.click();
        SiteCategory.MulDocumentIcon2.click();
        SiteCategory.MulDocumentIconOption2.click();
        SiteCategory.MulDocumentIcon3.click();
        SiteCategory.MulDocumentIconOption3.click();
        SiteCategory.MulDocumentDesc1.sendKeys("Document1 Description");
        SiteCategory.MulDocumentDesc2.sendKeys("Document2 Description");
        SiteCategory.MulDocumentDesc3.sendKeys("Document3 Description");
        SiteCategory.MulDocumentThumbnail1.click();
        Thread.sleep(1000);
        filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\kindpng_1300250.png";
        new FileUpload(filepath);
        AdvanceSite.Done.click();
        Thread.sleep(2000);
        SiteCategory.MulDocumentThumbnail2.click();
        filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\kindpng_1300250.png";
        new FileUpload(filepath);
        AdvanceSite.Done.click();
        Thread.sleep(2000);
        SiteCategory.MulDocumentThumbnail3.click();
        filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\kindpng_1300250.png";
        new FileUpload(filepath);
        AdvanceSite.Done.click();
        Thread.sleep(2000);
        SiteCategory.MulDocumentStatus1.click();
        SiteCategory.MulDocument1Published.click();
        SiteCategory.MulDocumentStatus2.click();
        SiteCategory.MulDocument2Unpublished.click();
        SiteCategory.MulDocumentStatus3.click();
        SiteCategory.MulDocument3Published.click();
        SiteCategory.SaveButton.click();

    }


    @Test
    @Order(2)
    public void t2InfoMessageAndSelectAllOptionShouldBeVisibleAfterBulkActionIsClicked() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryDocuments.click();
        Thread.sleep(1000);
        BulkActionElement.BulkAction.click();
        AdvanceSite.AlertMessage.shouldBe(visible);
        BulkActionElement.SelectAllCheckBox.shouldBe(visible);
    }

    @Test
    @Order(3)
    public void t3SelectAllOptionShouldNotBeVisibleAfterDeselectBulkActionButtonIsClicked() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryDocuments.click();
        Thread.sleep(1000);
        BulkActionElement.BulkAction.click();
        BulkActionElement.DeselectBulkAction.click();
        Thread.sleep(1000);
        BulkActionElement.SelectAllCheckBox.shouldNot(visible);
    }

    @Test
    @Order(4)
    public void t4EditingOptionShouldBeVisibleAfterSelectAllOptionISClicked() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryDocuments.click();
        Thread.sleep(1000);
        BulkActionElement.BulkAction.click();
        BulkActionElement.SelectAllCheckBox.click();
        Thread.sleep(500);
        BulkActionElement.BulkDelete.shouldBe(visible);
        BulkActionElement.BulkEdit.shouldBe(visible);
        BulkActionElement.BulkFlyout.shouldBe(visible);

    }

    @Test
    @Order(5)
    public void t5EditModelShouldBeVisible() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryDocuments.click();
        Thread.sleep(1000);
        BulkActionElement.BulkAction.click();
        BulkActionElement.SelectAllCheckBox.click();
        Thread.sleep(500);
        BulkActionElement.BulkEdit.click();
        $(".modal-content").shouldBe(visible);

    }

    @Test
    @Order(6)
    public void t6EditDocumentWithValidDetails() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryDocuments.click();
        Thread.sleep(1000);
        BulkActionElement.BulkAction.click();
        BulkActionElement.SelectAllCheckBox.click();
        Thread.sleep(500);
        BulkActionElement.BulkEdit.click();
        SiteCategory.MulDocumentTitle1.clear();
        SiteCategory.MulDocumentTitle1.setValue("Document1");
        SiteCategory.MulDocumentTitle2.clear();
        SiteCategory.MulDocumentTitle2.sendKeys("Document2");
        SiteCategory.MulDocumentTitle3.clear();
        SiteCategory.MulDocumentTitle3.sendKeys("Document3");
        SiteCategory.MulDocumentIcon1.click();
        SiteCategory.MulDocumentIconOption1.click();
        SiteCategory.MulDocumentIcon2.click();
        SiteCategory.MulDocumentIconOption2.click();
        SiteCategory.MulDocumentIcon3.click();
        SiteCategory.MulDocumentIconOption3.click();
        SiteCategory.MulDocumentDesc1.sendKeys("Document1 Description");
        SiteCategory.MulDocumentDesc2.sendKeys("Document2 Description");
        SiteCategory.MulDocumentDesc3.sendKeys("Document3 Description");
        SiteCategory.MulDocumentThumbnail1.click();
        Thread.sleep(1000);
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\kindpng_1300250.png";
        new FileUpload(filepath);
        AdvanceSite.Done.click();
        Thread.sleep(2000);
        SiteCategory.MulDocumentThumbnail2.click();
        filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\kindpng_1300250.png";
        new FileUpload(filepath);
        AdvanceSite.Done.click();
        Thread.sleep(2000);
        SiteCategory.MulDocumentThumbnail3.click();
        filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\kindpng_1300250.png";
        new FileUpload(filepath);
        AdvanceSite.Done.click();
        Thread.sleep(2000);
        SiteCategory.MulDocumentStatus1.click();
        SiteCategory.MulDocument1Published.click();
        SiteCategory.MulDocumentStatus2.click();
        SiteCategory.MulDocument2Unpublished.click();
        SiteCategory.MulDocumentStatus3.click();
        SiteCategory.MulDocument3Published.click();
        SiteCategory.SaveButton.click();

    }

    @Test
    @Order(7)
    public void t7ErrorMessageShouldBeVisibleAndSaveButtonShouldBeDisabledAfterAddingTitleAsUpperLimit() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryDocuments.click();
        Thread.sleep(1000);
        BulkActionElement.BulkAction.click();
        BulkActionElement.SelectAllCheckBox.click();
        Thread.sleep(500);
        BulkActionElement.BulkEdit.click();
        SiteCategory.MulDocumentTitle1.clear();
        SiteCategory.MulDocumentTitle1.setValue("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).\n" +
                "\n");
        SiteCategory.MulDocumentTitle2.clear();
        SiteCategory.MulDocumentTitle2.sendKeys("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).\n" +
                "\n");
        SiteCategory.MulDocumentTitle3.clear();
        SiteCategory.MulDocumentTitle3.sendKeys("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).\n" +
                "\n");
        SiteCategory.MulDocumentIcon1.click();
        SiteCategory.MulDocumentIconOption1.click();
        SiteCategory.MulDocumentIcon2.click();
        SiteCategory.MulDocumentIconOption2.click();
        SiteCategory.MulDocumentIcon3.click();
        SiteCategory.MulDocumentIconOption3.click();
        SiteCategory.MulDocumentDesc1.sendKeys("Document1 Description");
        SiteCategory.MulDocumentDesc2.sendKeys("Document2 Description");
        SiteCategory.MulDocumentDesc3.sendKeys("Document3 Description");
        SiteCategory.MulDocumentThumbnail1.click();
        Thread.sleep(1000);
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\kindpng_1300250.png";
        new FileUpload(filepath);
        AdvanceSite.Done.click();
        Thread.sleep(2000);
        SiteCategory.MulDocumentThumbnail2.click();
        filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\kindpng_1300250.png";
        new FileUpload(filepath);
        AdvanceSite.Done.click();
        Thread.sleep(2000);
        SiteCategory.MulDocumentThumbnail3.click();
        filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\kindpng_1300250.png";
        new FileUpload(filepath);
        AdvanceSite.Done.click();
        Thread.sleep(2000);
        SiteCategory.MulDocumentStatus1.click();
        SiteCategory.MulDocument1Published.click();
        SiteCategory.MulDocumentStatus2.click();
        SiteCategory.MulDocument2Unpublished.click();
        SiteCategory.MulDocumentStatus3.click();
        SiteCategory.MulDocument3Published.click();
        SiteCategory.SaveButton.click();
        SiteCategory.ErrorToolTipMessage.shouldBe(visible);

    }

    @Test
    @Order(8)
    public void t8ErrorMessageShouldBeVisibleAfterAddingInvalidThumbnail() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryDocuments.click();
        Thread.sleep(1000);
        BulkActionElement.BulkAction.click();
        BulkActionElement.SelectAllCheckBox.click();
        Thread.sleep(500);
        BulkActionElement.BulkEdit.click();
        SiteCategory.MulDocumentTitle1.clear();
        SiteCategory.MulDocumentTitle1.setValue("Document1\n" +
                "\n");
        SiteCategory.MulDocumentTitle2.clear();
        SiteCategory.MulDocumentTitle2.sendKeys("Document2\n" +
                "\n");
        SiteCategory.MulDocumentTitle3.clear();
        SiteCategory.MulDocumentTitle3.sendKeys("Document 3\n" +
                "\n");
        SiteCategory.MulDocumentIcon1.click();
        SiteCategory.MulDocumentIconOption1.click();
        SiteCategory.MulDocumentIcon2.click();
        SiteCategory.MulDocumentIconOption2.click();
        SiteCategory.MulDocumentIcon3.click();
        SiteCategory.MulDocumentIconOption3.click();
        SiteCategory.MulDocumentDesc1.sendKeys("Document1 Description");
        SiteCategory.MulDocumentDesc2.sendKeys("Document2 Description");
        SiteCategory.MulDocumentDesc3.sendKeys("Document3 Description");
        SiteCategory.MulDocumentThumbnail1.click();
        Thread.sleep(1000);
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\pptx1.pptx";
        new FileUpload(filepath);
        SiteCategory.ErrorToolTipMessage.shouldBe(visible);
    }




    @Test
    @Order(10)
    public void t10FlyoutMenuOptionShouldBeVisibleAfterFlyoutButtonIsClicked() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryDocuments.click();
        Thread.sleep(1000);
        BulkActionElement.BulkAction.click();
        Thread.sleep(500);
        BulkActionElement.SelectAllCheckBox.click();
        Thread.sleep(500);
        BulkActionElement.BulkFlyout.click();
        $(".dropdown-menu.show").shouldBe(visible);
    }

    @Test
    @Order(11)
    public void t11CancelUnpublishedProcessOfMultipleDocument() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryDocuments.click();
        Thread.sleep(1000);
        BulkActionElement.BulkAction.click();
        Thread.sleep(500);
        BulkActionElement.SelectAllCheckBox.click();
        Thread.sleep(500);
        BulkActionElement.BulkFlyout.click();
        Thread.sleep(1000);
        BulkActionElement.BulkUnpublished.click();
        Thread.sleep(500);
        $(".modal-footer .btn").click();

    }

    @Test
    @Order(12)
    public void t12CloseConfirmPanel() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryDocuments.click();
        Thread.sleep(1000);
        BulkActionElement.BulkAction.click();
        Thread.sleep(500);
        BulkActionElement.SelectAllCheckBox.click();
        Thread.sleep(500);
        BulkActionElement.BulkFlyout.click();
        BulkActionElement.BulkUnpublished.click();
        Thread.sleep(500);
        $(".close").click();
        AdvanceSite.SuccessMessage.shouldBe(visible);

    }

    @Test
    @Order(13)
    public void t13SuccessMessageShouldBeVisibleAfterUnpublishedMultipleDocument() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryDocuments.click();
        Thread.sleep(1000);
        BulkActionElement.BulkAction.click();
        Thread.sleep(500);
        BulkActionElement.SelectAllCheckBox.click();
        Thread.sleep(500);
        BulkActionElement.BulkFlyout.click();
        Thread.sleep(500);
        BulkActionElement.BulkUnpublished.click();
        Thread.sleep(500);
        AdvanceSite.ConfirmCancel.click();
        Thread.sleep(500);
        AdvanceSite.SuccessMessage.shouldBe(visible);

    }

    @Test
    @Order(14)
    public void t14SuccessMessageShouldBeVisibleAfterPublishedMultipleDocument() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryDocuments.click();
        Thread.sleep(1000);
        BulkActionElement.BulkAction.click();
        Thread.sleep(500);
        BulkActionElement.SelectAllCheckBox.click();
        Thread.sleep(500);
        BulkActionElement.BulkFlyout.click();
        BulkActionElement.BulkPublished.click();
        Thread.sleep(500);
        AdvanceSite.SuccessMessage.shouldBe(visible);

    }

    @Test
    @Order(15)
    public void t15MoveMultipleDocumentPanelShouldBeVisible() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryDocuments.click();
        Thread.sleep(1000);
        BulkActionElement.BulkAction.click();
        Thread.sleep(500);
        BulkActionElement.SelectAllCheckBox.click();
        Thread.sleep(500);
        BulkActionElement.BulkFlyout.click();
        BulkActionElement.BulkMove.click();
        Thread.sleep(500);
        SiteCategory.MoveCategoryModel.shouldBe(visible);

    }
    @Test
    @Order(16)
    public void t16CancelTheMoveDocumentPanel() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryDocuments.click();
        Thread.sleep(1000);
        BulkActionElement.BulkAction.click();
        Thread.sleep(500);
        BulkActionElement.SelectAllCheckBox.click();
        Thread.sleep(500);
        BulkActionElement.BulkFlyout.click();
        BulkActionElement.BulkMove.click();
        Thread.sleep(500);
        AdvanceSite.Cancel.click();

    }
    @Test
    @Order(17)
    public void t17CloseMoveDocumentPanel() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryDocuments.click();
        Thread.sleep(1000);
        BulkActionElement.BulkAction.click();
        Thread.sleep(500);
        BulkActionElement.SelectAllCheckBox.click();
        Thread.sleep(500);
        BulkActionElement.BulkFlyout.click();
        BulkActionElement.BulkMove.click();
        Thread.sleep(500);
        SiteCategory.Close.click();
    }
    @Test
    @Order(18)
    public void t18SaveButtonShouldBeDisabledBeforeMultipleDocumentIsMoved() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryDocuments.click();
        Thread.sleep(1000);
        BulkActionElement.BulkAction.click();
        Thread.sleep(500);
        BulkActionElement.SelectAllCheckBox.click();
        Thread.sleep(500);
        BulkActionElement.BulkFlyout.click();
        Thread.sleep(500);
        BulkActionElement.BulkMove.click();
        Thread.sleep(500);
        SiteCategory.SaveButton.is(disabled);
    }
    @Test
    @Order(19)
    public void t19SuccessMessageShouldBeVisibleAfterMultipleDocumentIsMoved() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryDocuments.click();
        Thread.sleep(1000);
        BulkActionElement.BulkAction.click();
        Thread.sleep(500);
        BulkActionElement.SelectAllCheckBox.click();
        Thread.sleep(500);
        BulkActionElement.BulkFlyout.click();
        BulkActionElement.BulkMove.click();
        SiteCategory.MoveCategoryDropDown.click();
        Thread.sleep(1000);
        SiteCategory.SelectedCategory.click();
        Thread.sleep(1000);
        AdvanceSite.SaveButton.click();
        Thread.sleep(500);
        AdvanceSite.SuccessMessage.shouldBe(visible);
    }

    /////Delete Multiple Documents/////////////////

    @Test
    @Order(20)
    public void t20AddMultipleDocumentWithAllValidCredentials() throws AWTException, InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryDocuments.click();
        Thread.sleep(1000);
        SiteCategory.NewDocument.click();
        Thread.sleep(1000);
        SiteCategory.MultipleDocument.click();
        Thread.sleep(1000);
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\\"Google_Adword_Project.pptx\" \"pptx1.pptx\" \"SEO.pptx\" ";
        new FileUpload(filepath);
        Thread.sleep(1000);
        SiteCategory.MulDocumentTitle1.clear();
        SiteCategory.MulDocumentTitle1.setValue("Document1");
        SiteCategory.MulDocumentTitle2.clear();
        SiteCategory.MulDocumentTitle2.sendKeys("Document2");
        SiteCategory.MulDocumentTitle3.clear();
        SiteCategory.MulDocumentTitle3.sendKeys("Document3");
        SiteCategory.MulDocumentIcon1.click();
        SiteCategory.MulDocumentIconOption1.click();
        SiteCategory.MulDocumentIcon2.click();
        SiteCategory.MulDocumentIconOption2.click();
        SiteCategory.MulDocumentIcon3.click();
        SiteCategory.MulDocumentIconOption3.click();
        SiteCategory.MulDocumentDesc1.sendKeys("Document1 Description");
        SiteCategory.MulDocumentDesc2.sendKeys("Document2 Description");
        SiteCategory.MulDocumentDesc3.sendKeys("Document3 Description");
        SiteCategory.MulDocumentThumbnail1.click();
        Thread.sleep(1000);
        filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\kindpng_1300250.png";
        new FileUpload(filepath);
        AdvanceSite.Done.click();
        Thread.sleep(2000);
        SiteCategory.MulDocumentThumbnail2.click();
        filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\kindpng_1300250.png";
        new FileUpload(filepath);
        AdvanceSite.Done.click();
        Thread.sleep(2000);
        SiteCategory.MulDocumentThumbnail3.click();
        filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\kindpng_1300250.png";
        new FileUpload(filepath);
        AdvanceSite.Done.click();
        Thread.sleep(2000);
        SiteCategory.MulDocumentStatus1.click();
        SiteCategory.MulDocument1Published.click();
        SiteCategory.MulDocumentStatus2.click();
        SiteCategory.MulDocument2Unpublished.click();
        SiteCategory.MulDocumentStatus3.click();
        SiteCategory.MulDocument3Published.click();
        SiteCategory.SaveButton.click();

    }
    @Test
    @Order(21)
    public void t21CancelTheDeletionProcessOfMultipleDocument() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryDocuments.click();
        Thread.sleep(1000);
        BulkActionElement.BulkAction.click();
        Thread.sleep(500);
        BulkActionElement.SelectAllCheckBox.click();
        Thread.sleep(500);
        BulkActionElement.BulkDelete.click();
        Thread.sleep(500);
        $(".modal-footer .btn").click();

    }

    @Test
    @Order(22)
    public void t22CloseMultipleDocumentDeletionProcess() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryDocuments.click();
        Thread.sleep(1000);
        BulkActionElement.BulkAction.click();
        Thread.sleep(500);
        BulkActionElement.SelectAllCheckBox.click();
        Thread.sleep(500);
        BulkActionElement.BulkDelete.click();
        Thread.sleep(500);
        $(".close").click();
    }
    @Test
    @Order(23)
    public void t23DeleteMultipleDocument() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryDocuments.click();
        Thread.sleep(1000);
        BulkActionElement.BulkAction.click();
        BulkActionElement.SelectAllCheckBox.click();
        Thread.sleep(500);
        BulkActionElement.BulkDelete.click();
        AdvanceSite.ConfirmCancel.click();
        Thread.sleep(500);
        AdvanceSite.SuccessMessage.shouldBe(visible);

    }
}
