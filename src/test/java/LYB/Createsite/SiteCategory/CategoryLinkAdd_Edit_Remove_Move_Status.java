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
import org.apache.hc.client5.http.auth.StandardAuthScheme;
import org.junit.jupiter.api.*;


import java.awt.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CategoryLinkAdd_Edit_Remove_Move_Status extends BaseSetup {
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

    @Test
    @Order(1)
    public void AddLinkPageShouldBeVisibleAfterCategoryLinkIsClicked() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryLinks.click();
        Thread.sleep(1000);
        SiteEdit.Title.shouldBe(visible);

    }
    @Test
    @Order(2)
    public void AddLinkWithValidRequireDetailAndSuccessMessageShouldBeVisible() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryLinks.click();
        Thread.sleep(1000);
        SiteCategory.NewLink.click();
        AdvanceSite.LinkTitle.sendKeys("NewLInk");
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
        Thread.sleep(500);
        AdvanceSite.SuccessMessage.shouldBe(visible);

    }


    @Test
    @Order(3)
    public void t11SearchSpecificDocument(){
        SiteEdit.Search.setValue("N");
        SiteEdit.Search.pressEnter();
    }
    @Test
    @Order(4)
    public void t12UnpublishedListOfDocument(){
        Site.SortSelect.click();
        Site.DomainSort.click();
        Site.UnPublishSortOrder.click();
    }
    @Test
    @Order(5)
    public void t13PublishedListOfDocument(){
        Site.SortSelect.click();
        Site.DomainSort.click();
        Site.PublishSortOrder.click();
    }
    @Test
    @Order(6)
    public void AddLinkWithStatusAsPublished() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryLinks.click();
        Thread.sleep(1000);
        SiteCategory.NewLink.click();
        AdvanceSite.LinkTitle.sendKeys("NewLInk");
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
        Thread.sleep(500);
        AdvanceSite.SuccessMessage.shouldBe(visible);

    }
    @Test
    @Order(7)
    public void ErrorMessageShouldBeVisibleAfterAddingInvalidThumbnailType() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryLinks.click();
        Thread.sleep(1000);
        SiteCategory.NewLink.click();
        AdvanceSite.LinkTitle.sendKeys("NewLInk");
        AdvanceSite.LinkURl.sendKeys("https://www.youtube.com/");
        AdvanceSite.LinkThumbnail.click();
        Thread.sleep(1000);
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\1.5v.avi";
        new FileUpload(filepath);
        SiteCategory.ErrorToolTipMessage.shouldBe(visible);

    }
    @Test
    @Order(8)
    public void AddLinkWithTitleUpperLimit() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryLinks.click();
        Thread.sleep(1000);
        SiteCategory.NewLink.click();
        AdvanceSite.LinkTitle.sendKeys("NewLInk");
        Thread.sleep(1000);
        SiteCategory.ErrorToolTipMessage.shouldBe(visible);


    }
    @Test
    @Order(9)
    public void EditModelShouldBeVisibleAfterClickingOnEditOption() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryLinks.click();
        Thread.sleep(500);
        SiteCategory.CategoryContactFlyout.click();
        Thread.sleep(1000);
        SiteCategory.EditCategory.click();
        Thread.sleep(1000);
        $(".modal-content").shouldBe(visible);

    }
    @Test
    @Order(10)
    public void EditLinkWithValidRequireDetailAndSuccessMessageShouldBeVisible() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryLinks.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContactFlyout.click();
        Thread.sleep(500);
        SiteCategory.EditCategory.click();
        Thread.sleep(1000);
        AdvanceSite.LinkTitle.sendKeys("NewLInk");
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
        Thread.sleep(1500);
        AdvanceSite.SuccessMessage.shouldBe(visible);

    }
    @Test
    @Order(11)
    public void EditLinkWithStatusAsPublished() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryLinks.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContactFlyout.click();
        Thread.sleep(500);
        SiteCategory.EditCategory.click();
        Thread.sleep(1000);
        AdvanceSite.LinkTitle.sendKeys("NewLInk");
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
        Thread.sleep(1500);
        AdvanceSite.SuccessMessage.shouldBe(visible);

    }
    @Test
    @Order(12)
    public void ErrorMessageShouldBeVisibleAfterEditingInvalidThumbnailType() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryLinks.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContactFlyout.click();
        Thread.sleep(500);
        SiteCategory.EditCategory.click();
        Thread.sleep(1000);
        AdvanceSite.LinkTitle.sendKeys("NewLInk");
        AdvanceSite.LinkURl.sendKeys("https://www.youtube.com/");
        AdvanceSite.LinkThumbnail.click();
        Thread.sleep(1000);
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\1.5v.avi";
        new FileUpload(filepath);
        SiteCategory.ErrorToolTipMessage.shouldBe(visible);

    }
    @Test
    @Order(13)
    public void EditLinkWithTitleUpperLimit() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryLinks.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContactFlyout.click();
        Thread.sleep(500);
        SiteCategory.EditCategory.click();
        Thread.sleep(1000);
        AdvanceSite.LinkTitle.sendKeys("NewLInk");
       Thread.sleep(1000);
       SiteCategory.ErrorToolTipMessage.shouldBe(visible);


    }
    @Test
    @Order(14)
    public void ConfirmationPanelShouldBeVisibleAfterClickingRemoveOption() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryLinks.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContactFlyout.click();
        Thread.sleep(500);
        SiteCategory.RemoveCategory.click();
        Thread.sleep(1000);
       $(".modal-content").shouldBe(visible);


    }
    @Test
    @Order(15)
    public void CancelLinkRemovingProcess() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryLinks.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContactFlyout.click();
        Thread.sleep(500);
        SiteCategory.RemoveCategory.click();
        Thread.sleep(1000);
        SiteCategory.CancelButton.click();
        Thread.sleep(1000);
        SiteCategory.CategoryTitle.shouldBe(visible);
        AdvanceSite.SuccessMessage.shouldNotBe(visible);



    }
    @Test
    @Order(16)
    public void SuccessMessageShouldBeVisibleAfterRemovingAddedDocument() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryLinks.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContactFlyout.click();
        Thread.sleep(500);
        SiteCategory.RemoveCategory.click();
        Thread.sleep(1000);
        AdvanceSite.ConfirmCancel.click();
        Thread.sleep(1000);
        AdvanceSite.SuccessMessage.shouldBe(visible);



    }
    @Test
    @Order(17)
    public void SuccessMessageShouldBeVisibleAfterClickingUnpublishedOption() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryLinks.click();
        Thread.sleep(1500);
        SiteCategory.CategoryContactFlyout.click();
        Thread.sleep(1000);
        Status();
        Thread.sleep(1000);
        SiteCategory.UnpublishedColor.shouldBe(visible);
        Thread.sleep(1000);
//        AdvanceSite.SuccessMessage.shouldBe(visible);

    }
//    @Test
//    @Order(15)
//    public void SuccessMessageShouldBeVisibleAfterClickingPublishedOption() throws InterruptedException, AWTException {
//        Search();
//        Thread.sleep(1000);
//        SiteEdit.EditSite.click();
//        Thread.sleep(1000);
//        SiteCategory.SiteCategory.click();
//        Thread.sleep(1000);
//        SiteCategory.CategoryCard.click();
//        Thread.sleep(1000);
//        SiteCategory.CategoryLinks.click();
//        Thread.sleep(1500);
//        SiteCategory.CategoryContactFlyout.click();
//        Thread.sleep(1000);
//        SiteCategory.Published.click();
//        Thread.sleep(1000);
//        SiteCategory.PublishedColor.shouldBe(visible);
//        Thread.sleep(1000);
//        AdvanceSite.SuccessMessage.shouldBe(visible);
//
//    }

    @Test
    @Order(18)
    public void MoveCategoryContactPanelShouldGetAppearAfterMoveOptionIsClicked() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryLinks.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContactFlyout.click();
        Thread.sleep(1000);
        SiteCategory.MoveCategory.click();
        Thread.sleep(1000);
        SiteCategory.MoveCategoryModel.shouldBe(visible);

    }

    @Test
    @Order(19)
    public void SuccessMessageShouldBeVisibleAfterMovingLink() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryLinks.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContactFlyout.click();
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
    @Order(20)
    public void CancelCategoryContactMovingProcedure() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryLinks.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContactFlyout.click();
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
        SiteCategory.CategoryTitle.shouldBe(visible);


    }
    @Test
    @Order(21)
    public void CloseTheCategoryContactMovePanelsWithoutSaving() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryLinks.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContactFlyout.click();
        Thread.sleep(1000);
        SiteCategory.MoveCategory.click();
        Thread.sleep(1000);
        SiteCategory.MoveCategoryModel.shouldBe(visible);
        Thread.sleep(1000);
        SiteCategory.Close.click();
        SiteCategory.CategoryTitle.shouldBe(visible);
    }

}

