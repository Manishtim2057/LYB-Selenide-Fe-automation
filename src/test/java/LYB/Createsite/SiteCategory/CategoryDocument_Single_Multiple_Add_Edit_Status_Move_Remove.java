package LYB.Createsite.SiteCategory;

import LYB.Base.BaseSetup;
import LYB.Createsite.AdvanceForm.AdvanceSite;
import LYB.Createsite.Site;
import LYB.Createsite.SiteEdit.SiteEdit;
import LYB.FileUpload.FileUpload;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.commands.SelectOptionByValue;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import io.qameta.allure.internal.shadowed.jackson.databind.ser.Serializers;
import org.junit.jupiter.api.*;


import java.awt.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CategoryDocument_Single_Multiple_Add_Edit_Status_Move_Remove extends BaseSetup {
    TestMethodOrder Ascending;

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
    public void t1DocumentPageShouldBeVisibleAfterCategoryDocumentIsClicked() throws InterruptedException {
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
        SiteEdit.Title.shouldBe(visible);
    }

    @Test
    @Order(2)
    public void t2AddDocumentWithValidDetails() throws InterruptedException, AWTException {

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
        SiteCategory.SingleDocument.click();
        Thread.sleep(1000);
        AdvanceSite.AddDocument.click();
        Thread.sleep(1000);
        UploadDocument();
        Thread.sleep(500);
        AdvanceSite.DocumentTitle.clear();
        AdvanceSite.DocumentTitle.sendKeys("Doc");
        AdvanceSite.DocumentIcon.click();
        AdvanceSite.DocumentIconOption.click();
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
        Thread.sleep(500);
        AdvanceSite.SuccessMessage.shouldBe(visible);
    }




    @Test
    @Order(3)
    public void t3SuccessMessageShouldBeVisibleAfterAddingDocumentWithValidDetails() throws InterruptedException, AWTException {

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
        SiteCategory.SingleDocument.click();
        Thread.sleep(1000);
        AdvanceSite.AddDocument.click();
        Thread.sleep(1000);
        UploadDocument();
        Thread.sleep(500);
        AdvanceSite.DocumentTitle.clear();
        AdvanceSite.DocumentTitle.sendKeys("Doc");
        AdvanceSite.DocumentIcon.click();
        AdvanceSite.DocumentIconOption.click();
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
        Thread.sleep(500);
        AdvanceSite.SuccessMessage.shouldBe(visible);

    }

    @Test
    @Order(4)
    public void t4DocumentCardShouldBeVisibleAfterAddingTheDocument() throws InterruptedException, AWTException {

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
        SiteCategory.SingleDocument.click();
        Thread.sleep(1000);
        AdvanceSite.AddDocument.click();
        Thread.sleep(1000);
        UploadDocument();
        Thread.sleep(500);
        AdvanceSite.DocumentTitle.clear();
        AdvanceSite.DocumentTitle.sendKeys("Doc");
        AdvanceSite.DocumentIcon.click();
        AdvanceSite.DocumentIconOption.click();
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
        Thread.sleep(2000);
        SiteCategory.DocumentCard.shouldBe(visible);
    }

    @Test
    @Order(5)
    public void t5SaveButtonShouldBeDisabledAfterInvalidDetailIsAdded() throws InterruptedException, AWTException {

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
        SiteCategory.SingleDocument.click();
        Thread.sleep(1000);
        UploadDocument();
        Thread.sleep(500);
        AdvanceSite.DocumentTitle.clear();
        AdvanceSite.DocumentTitle.sendKeys("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).\n" +
                "\n");
        Thread.sleep(500);
        AdvanceSite.SaveButton.shouldBe(disabled);
    }

    @Test
    @Order(6)
    public void t6TooltipErrorMessageShouldBeVisibleAfterAddingInvalidDetails() throws InterruptedException, AWTException {

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
        SiteCategory.SingleDocument.click();
        Thread.sleep(1000);
        UploadDocument();
        Thread.sleep(500);
        AdvanceSite.DocumentTitle.clear();
        AdvanceSite.DocumentTitle.sendKeys("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).\n" +
                "\n");
        Thread.sleep(500);
        SiteEdit.ErrorTooltipMessage.shouldBe(visible);
    }

    @Test
    @Order(7)
    public void t7TooltipErrorMessageShouldBeVisibleAfterAddingInvalidThumbnail() throws InterruptedException, AWTException {


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
        SiteCategory.SingleDocument.click();
        Thread.sleep(1000);
        UploadDocument();
        Thread.sleep(500);
        AdvanceSite.DocumentTitle.clear();
        AdvanceSite.DocumentTitle.sendKeys("Doc");
        AdvanceSite.DocumentIcon.click();
        AdvanceSite.DocumentIconOption.click();
        AdvanceSite.DocumentDescription.sendKeys("Desc");
        Thread.sleep(1000);
        AdvanceSite.DocumentThumbnail.click();
        Thread.sleep(1000);
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\SEO.pptx";
        new FileUpload(filepath);
        Thread.sleep(1000);
        AdvanceSite.Done.click();
        Thread.sleep(2000);
        AdvanceSite.StatusDropDown.click();
        Thread.sleep(500);
        AdvanceSite.Published.click();
        Thread.sleep(500);
        SiteEdit.ErrorTooltipMessage.shouldBe(visible);
    }

    @Test
    @Order(8)
    public void t8ErrorMessageShouldGetAppearAfterAddingInvalidDocuments() throws AWTException, InterruptedException {
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
        SiteCategory.SingleDocument.click();
        Thread.sleep(1000);
        AdvanceSite.AddDocument.click();
        Thread.sleep(1000);
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\Video.mp4";
        new FileUpload(filepath);
        Thread.sleep(1000);
        SiteCategory.ErrorToolTipMessage.shouldBe(visible);
    }

    @Test
    @Order(9)
    public void t9MultipleDocumentAddModelShouldBeVisible() throws AWTException, InterruptedException {
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
        $(".modal-content").shouldBe(visible);

    }

    @Test
    @Order(10)
    public void t10AddMultipleDocumentWithAllValidCredentials() throws AWTException, InterruptedException {
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
    @Order(11)
    public void t11SearchSpecificDocument(){
        SiteEdit.Search.setValue("s");
        SiteEdit.Search.pressEnter();
    }
    @Test
    @Order(12)
    public void t12UnpublishedListOfDocument(){
        Site.SortSelect.click();
        Site.DomainSort.click();
        Site.UnPublishSortOrder.click();
    }
    @Test
    @Order(13)
    public void t13PublishedListOfDocument(){
        Site.SortSelect.click();
        Site.DomainSort.click();
        Site.PublishSortOrder.click();
    }

    @Test
    @Order(14)
    public void t14AddMultipleDocumentFormShouldGetCanceledAfterClickingOnCancelButton() throws AWTException, InterruptedException {
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
        SiteCategory.CancelButton.click();
        SiteCategory.CategoryTitle.shouldBe(visible);

    }

    @Test
    @Order(15)
    public void t15ErrorMessageShouldBeVisibleAndSaveButtonShouldBeDisabledAfterAddingInvalidDocument() throws AWTException, InterruptedException {
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
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\\"\"5v.mp4\" \"1.5V.avi\" \"1v.mp4\" ";
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
        SiteCategory.ErrorToolTipMessage.shouldBe(visible);
        SiteCategory.SaveButton.shouldBe(disabled);


    }

    @Test
    @Order(16)
    public void t16ErrorMessageShouldBeVisibleAfterAddingTitleAsUpperLimit() throws AWTException, InterruptedException {
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
        SiteCategory.ErrorToolTipMessage.shouldBe(visible);
    }

    @Test
    @Order(17)
    public void t17ErrorMessageShouldBeVisibleAfterAddingInvalidThumbnail() throws AWTException, InterruptedException {
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
        filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\pptx1.pptx";
        new FileUpload(filepath);
        SiteCategory.ErrorToolTipMessage.shouldBe(visible);
    }

    @Test
    @Order(18)
    public void t18RemoveTheSelectedDocument() throws AWTException, InterruptedException {
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
        SiteCategory.MulDocumentRemove1.click();
        SiteCategory.MulDocumentRemove1.click();
        SiteCategory.MulDocumentRemove1.click();
        Thread.sleep(1000);
        SiteCategory.CategoryTitle.shouldBe(visible);
        Thread.sleep(500);
        AdvanceSite.SuccessMessage.shouldBe(visible);

    }

    @Test
    @Order(19)
    public void t19AddNewDocumentPanelShouldGetAppearAfterClickingAddNewDocButton() throws AWTException, InterruptedException {
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
        SiteCategory.AddNewDocumentButton.click();
        Thread.sleep(1000);
        filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\\"Google_Adword_Project.pptx\" \"pptx1.pptx\" \"SEO.pptx\" ";
        new FileUpload(filepath);
        Thread.sleep(1000);
    }
////////////////Edit Category Document///////////////////////
    @Test
    @Order(20)
    public void t20EditCategoryDocumentModelShouldBeVisibleAfterEditOptionIsClicked() throws InterruptedException {
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
        AdvanceSite.DocumentFlyoutMenu.click();
        AdvanceSite.DocumentEdit.click();
        $(".model-content").shouldBe(visible);

    }

    @Test
    @Order(21)
    public void t21EditDocumentWithAllValidDetails() throws InterruptedException, AWTException {
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
        AdvanceSite.DocumentFlyoutMenu.click();
        AdvanceSite.DocumentEdit.click();
        Thread.sleep(1000);
        UploadDocument();
        Thread.sleep(500);
        AdvanceSite.DocumentTitle.clear();
        AdvanceSite.DocumentTitle.sendKeys("Doc");
        AdvanceSite.DocumentIcon.click();
        $x("//*[@id=\"icon\"]/div/ul/li[3]").click();
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

    @Test
    @Order(22)
    public void t22SuccessMessageShouldBeVisibleAfterEditingDocumentWithValidDetails() throws InterruptedException, AWTException {
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
        AdvanceSite.DocumentFlyoutMenu.click();
        AdvanceSite.DocumentEdit.click();
        Thread.sleep(1000);
        UploadDocument();
        Thread.sleep(500);
        AdvanceSite.DocumentTitle.clear();
        AdvanceSite.DocumentTitle.sendKeys("Doc");
        AdvanceSite.DocumentIcon.click();
        $x("//*[@id=\"icon\"]/div/ul/li[3]").click();
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
        Thread.sleep(1000);
        AdvanceSite.SuccessMessage.shouldBe(visible);

    }

    @Test
    @Order(23)
    public void t23EditDocumentWithInvalidDocType() throws InterruptedException, AWTException {
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
        AdvanceSite.DocumentFlyoutMenu.click();
        AdvanceSite.DocumentEdit.click();
        Thread.sleep(1000);
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\1.5v.avi";
        new FileUpload(filepath);
        Thread.sleep(1000);
        SiteCategory.ErrorToolTipMessage.shouldBe(visible);

    }


    @Test
    @Order(24)
    public void t24EditDocumentWithTitleUpperLimit() throws InterruptedException, AWTException {
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
        AdvanceSite.DocumentFlyoutMenu.click();
        AdvanceSite.DocumentEdit.click();
        Thread.sleep(1000);
        UploadDocument();
        Thread.sleep(500);
        AdvanceSite.DocumentTitle.clear();
        AdvanceSite.DocumentTitle.sendKeys("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).\n" +
                "\n");
        SiteCategory.ErrorToolTipMessage.click();

    }

    @Test
    @Order(25)
    public void t25EditDocumentWithInvalidThumbnailType() throws InterruptedException, AWTException {
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
        AdvanceSite.DocumentFlyoutMenu.click();
        AdvanceSite.DocumentEdit.click();
        Thread.sleep(1000);
        UploadDocument();
        Thread.sleep(500);
        AdvanceSite.DocumentTitle.clear();
        AdvanceSite.DocumentTitle.sendKeys("Doc");
        AdvanceSite.DocumentIcon.click();
        $x("//*[@id=\"icon\"]/div/ul/li[3]").click();
        AdvanceSite.DocumentDescription.sendKeys("Desc");
        Thread.sleep(1000);
        AdvanceSite.DocumentThumbnail.click();
        Thread.sleep(1000);
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\1.5V.avi";
        new FileUpload(filepath);
        Thread.sleep(1000);
        SiteCategory.ErrorToolTipMessage.shouldBe(visible);

    }

    @Test
    @Order(26)
    public void t26EditDocumentWithUnpublishedStatus() throws InterruptedException, AWTException {
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
        AdvanceSite.DocumentFlyoutMenu.click();
        AdvanceSite.DocumentEdit.click();
        Thread.sleep(1000);
        UploadDocument();
        Thread.sleep(500);
        AdvanceSite.DocumentTitle.clear();
        AdvanceSite.DocumentTitle.sendKeys("Doc");
        AdvanceSite.DocumentIcon.click();
        $x("//*[@id=\"icon\"]/div/ul/li[3]").click();
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
        AdvanceSite.Unpublished.click();
        Thread.sleep(500);
        AdvanceSite.SaveButton.click();
        Thread.sleep(1000);
        AdvanceSite.SuccessMessage.shouldBe(visible);


    }
    @Test
    @Order(27)
    public void t27ChangeStatusOfDocument() throws InterruptedException, AWTException {
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
        AdvanceSite.DocumentFlyoutMenu.click();
        Thread.sleep(1000);
        SiteCategory.DocStatusPub.click();
        Thread.sleep(1000);

    }
    @Test
    @Order(28)
    public void t287SuccessMessageShouldBeVisibleAfterChangingStatusOfDocument() throws InterruptedException, AWTException {
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
        AdvanceSite.DocumentFlyoutMenu.click();
        Thread.sleep(1000);
        SiteCategory.DocStatusPub.click();
        Thread.sleep(1000);
        AdvanceSite.SuccessMessage.shouldBe(visible);

    }
    @Test
    @Order(29)
    public void t29RemoveDocument() throws InterruptedException, AWTException {
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
        AdvanceSite.DocumentFlyoutMenu.click();
        Thread.sleep(1000);
        SiteCategory.RemoveCategory.click();
        Thread.sleep(1000);

    }
    @Test
    @Order(30)
    public void t30SuccessMessageShouldBeVisibleAfterTheRemoveDocumentAction() throws InterruptedException, AWTException {
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
        AdvanceSite.DocumentFlyoutMenu.click();
        Thread.sleep(1000);
        SiteCategory.RemoveCategory.click();
        Thread.sleep(1000);
        AdvanceSite.SuccessMessage.shouldBe(visible);
    }
    @Test
    @Order(31)
    public void t31CancelDocumentRemoveProcess() throws InterruptedException, AWTException {
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
        AdvanceSite.DocumentFlyoutMenu.click();
        Thread.sleep(1000);
        SiteCategory.RemoveCategory.click();
        Thread.sleep(1000);
        SiteCategory.Cancel.click();
        Thread.sleep(1000);

    }

    @Test
    @Order(32)
    public void t32MoveCategoryDocumentPanelShouldGetAppearAfterMoveOptionIsClicked() throws InterruptedException, AWTException {
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
        AdvanceSite.DocumentFlyoutMenu.click();
        Thread.sleep(1000);
        SiteCategory.MoveCategory.click();
        Thread.sleep(1000);
        SiteCategory.MoveCategoryModel.shouldBe(visible);

    }

    @Test
    @Order(33)
    public void t33MoveDocumentContactWithChoosingTheCategory() throws InterruptedException, AWTException {
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
        AdvanceSite.DocumentFlyoutMenu.click();
        Thread.sleep(1000);
        SiteCategory.MoveCategory.click();
        Thread.sleep(1000);
        SiteCategory.MoveCategoryModel.shouldBe(visible);
        Thread.sleep(1000);
        SiteCategory.MoveCategoryDropDown.click();
        Thread.sleep(1000);
        SiteCategory.SelectedCategory.click();
        Thread.sleep(1000);
        AdvanceSite.SaveButton.click();

    }
    @Test
    @Order(34)
    public void t34SuccessMessageShouldGetAppearAfterMovingTheDocument() throws InterruptedException, AWTException {
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
        AdvanceSite.DocumentFlyoutMenu.click();
        Thread.sleep(1000);
        SiteCategory.MoveCategory.click();
        Thread.sleep(1000);
        SiteCategory.MoveCategoryModel.shouldBe(visible);
        Thread.sleep(1000);
        SiteCategory.MoveCategoryDropDown.click();
        Thread.sleep(1000);
        SiteCategory.SelectedCategory.click();
        Thread.sleep(1000);
        AdvanceSite.SaveButton.click();
        AdvanceSite.SuccessMessage.shouldBe(visible);

    }

    @Test
    @Order(35)
    public void t35CancelCategoryDocumentMovingProcedure() throws InterruptedException, AWTException {
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
        AdvanceSite.DocumentFlyoutMenu.click();
        Thread.sleep(1000);
        SiteCategory.MoveCategory.click();
        Thread.sleep(1000);
        SiteCategory.MoveCategoryModel.shouldBe(visible);
        Thread.sleep(1000);
        SiteCategory.MoveCategoryDropDown.click();
        Thread.sleep(1000);
        SiteCategory.SelectedCategory.click();
        Thread.sleep(1000);
        AdvanceSite.Cancel.click();
        SiteCategory.MoveCategoryModel.shouldNotBe(visible);

    }
    @Test
    @Order(36)
    public void t36CloseTheCategoryContactMovePanelsWithoutSaving() throws InterruptedException, AWTException {
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
        AdvanceSite.DocumentFlyoutMenu.click();
        Thread.sleep(1000);
        SiteCategory.MoveCategory.click();
        Thread.sleep(1000);
        SiteCategory.MoveCategoryModel.shouldBe(visible);
        Thread.sleep(1000);
        SiteCategory.Close.click();
        SiteCategory.MoveCategoryModel.shouldNotBe(visible);
    }

}
