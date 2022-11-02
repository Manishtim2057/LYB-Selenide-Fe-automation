package LYB.Createsite.SiteCategory;

import LYB.Base.BaseSetup;
import LYB.Createsite.AdvanceForm.AdvanceSite;
import LYB.Createsite.SiteEdit.SiteEdit;
import LYB.FileUpload.FileUpload;
import com.codeborne.selenide.Condition;
import io.qameta.allure.internal.shadowed.jackson.databind.ser.Serializers;
import org.junit.jupiter.api.*;


import java.awt.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CategoryDocument extends BaseSetup {
    TestMethodOrder Ascending;

    @BeforeEach
    public void setUp() throws InterruptedException {
        open("http://localhost:4200/auth/login");

    }
    public void Search(){
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
    }

    @Test
    @Order(3)
    public void t3SaveButtonShouldBeDisabledAfterInvalidDetailIsAdded() throws InterruptedException, AWTException {

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
    @Order(4)
    public void t4TooltipErrorMessageShouldBeVisibleAfterAddingInvalidDetails() throws InterruptedException, AWTException {

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
    @Order(5)
    public void t5TooltipErrorMessageShouldBeVisibleAfterAddingInvalidThumbnail() throws InterruptedException, AWTException {


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
}
