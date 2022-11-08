package LYB.Createsite.SiteCategory;

import LYB.Base.BaseSetup;
import LYB.Createsite.AdvanceForm.AdvanceSite;
import LYB.Createsite.Site;
import LYB.Createsite.SiteEdit.SiteEdit;
import LYB.FileUpload.FileUpload;
import com.codeborne.selenide.Condition;
import io.qameta.allure.internal.shadowed.jackson.databind.ser.Serializers;
import org.junit.jupiter.api.*;


import java.awt.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CategoryContact_Add_Edit_Status_Move_Remove extends BaseSetup {
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
    public void t1CategoryContactPageShouldBeVisibleAfterCategoryContactIsClicked() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContacts.click();
        Thread.sleep(1000);
        SiteCategory.CategoryTitle.shouldBe(visible);
    }
    @Test
    @Order(2)
    public void t2AddContactWithAllValidRequirements() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContacts.click();
        Thread.sleep(1000);
        SiteCategory.NewContact.click();
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

    @Test
    @Order(3)
    public void t3SearchSpecificDocument(){
        SiteEdit.Search.setValue("s");
        SiteEdit.Search.pressEnter();
    }
    @Test
    @Order(4)
    public void t4UnpublishedListOfDocument(){
        Site.SortSelect.click();
        Site.DomainSort.click();
        Site.UnPublishSortOrder.click();
    }
    @Test
    @Order(5)
    public void t5PublishedListOfDocument(){
        Site.SortSelect.click();
        Site.DomainSort.click();
        Site.PublishSortOrder.click();
    }
    @Test
    @Order(6)
    public void t6SaveButtonShouldBeDisabledAfterInvalidDetailsIsAdded() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContacts.click();
        Thread.sleep(1000);
        SiteCategory.NewContact.click();
        AdvanceSite.ContactTypeDropDown.click();
        AdvanceSite.ContactType1.click();
        AdvanceSite.ContactTitle.sendKeys("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).\n" +
                "\n");
        AdvanceSite.ContactEmail.sendKeys("Lorem@gmail.com");
        AdvanceSite.ContactDescription.setValue("Lorem");
        Thread.sleep(1000);
        AdvanceSite.ContactSaveButton.shouldBe(disabled);
    }
    @Test
    @Order(7)
    public void t7ErrorMessageShouldBeVisibleAfterAddingInvalidDetails() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContacts.click();
        Thread.sleep(1000);
        SiteCategory.NewContact.click();
        AdvanceSite.ContactTypeDropDown.click();
        AdvanceSite.ContactType1.click();
        AdvanceSite.ContactTitle.sendKeys("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).\n" +
                "\n");
        AdvanceSite.ContactEmail.sendKeys("Lorem@gmail.com");
        AdvanceSite.ContactDescription.setValue("Lorem");
        Thread.sleep(1000);
        SiteCategory.ErrorToolTipMessage.shouldBe(visible);
    }
    @Test
    @Order(8)
    public void t8ErrorToolTipMessageShouldBeVisibleAfterAddingInvalidEmail() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContacts.click();
        Thread.sleep(1000);
        SiteCategory.NewContact.click();
        AdvanceSite.ContactTypeDropDown.click();
        AdvanceSite.ContactType1.click();
        AdvanceSite.ContactTitle.sendKeys("It is a long");
        AdvanceSite.ContactEmail.sendKeys("Lorem");
        AdvanceSite.ContactDescription.setValue("Lorem");
        Thread.sleep(1000);
        AdvanceSite.SaveButton.click();
        Thread.sleep(1000);
        SiteCategory.ErrorToolTipMessage.shouldBe(visible);
    }
    @Test
    @Order(9)
    public void t9ErrorToolTipMessageShouldBeVisibleAfterAddingInvalidPhone() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContacts.click();
        Thread.sleep(1000);
        SiteCategory.NewContact.click();
        AdvanceSite.ContactTypeDropDown.click();
        AdvanceSite.ContactType2.click();
        AdvanceSite.ContactTitle.sendKeys("It is a long content");
        AdvanceSite.ContactPhone.sendKeys("Lorem");
        AdvanceSite.ContactDescription.setValue("Lorem");
        Thread.sleep(1000);
        AdvanceSite.SaveButton.click();
        Thread.sleep(1000);
        SiteCategory.ErrorToolTipMessage.shouldBe(visible);
    }
    @Test
    @Order(10)
    public void t10ErrorToolTipMessageShouldBeVisibleAfterAddingInvalidAddress() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContacts.click();
        Thread.sleep(1000);
        SiteCategory.NewContact.click();
        AdvanceSite.ContactTypeDropDown.click();
        AdvanceSite.ContactType3.click();
        AdvanceSite.ContactTitle.sendKeys("It is a long content");
        AdvanceSite.ContactAddress.sendKeys("3234");
        AdvanceSite.ContactDescription.setValue("Lorem");
        Thread.sleep(1000);
        AdvanceSite.SaveButton.click();
        Thread.sleep(1000);
        SiteCategory.ErrorToolTipMessage.shouldBe(visible);
    }
    @Test
    @Order(11)
    public void t11ErrorToolTipMessageShouldBeVisibleAfterAddingInvalidThumbnail() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContacts.click();
        Thread.sleep(1000);
        SiteCategory.NewContact.click();
        AdvanceSite.ContactTypeDropDown.click();
        AdvanceSite.ContactType1.click();
        AdvanceSite.ContactTitle.sendKeys("Sample");
        AdvanceSite.ContactEmail.sendKeys("Lorem@gmail.com");
        AdvanceSite.ContactDescription.setValue("Lorem");
        AdvanceSite.ContactThumbnail.click();
        Thread.sleep(1000);
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\SEO.pptx";
        new FileUpload(filepath);
        Thread.sleep(1000);
        SiteEdit.ErrorTooltipMessage.is(visible);
    }

    @Test
    @Order(12)
    public void t12AddContactWithUnpublishedStatus() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContacts.click();
        Thread.sleep(1000);
        SiteCategory.NewContact.click();
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
        AdvanceSite.Unpublished.click();
        Thread.sleep(1000);
        AdvanceSite.ContactSaveButton.click();
        Thread.sleep(1000);

    }



    ////////////Edit Contact Category////////////////////////
    @Test
    @Order(13)
    public void t13EditContactFormShouldBeVisibleAfterEditOptionIsClicked() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContacts.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContactFlyout.click();
        Thread.sleep(1000);
        SiteCategory.EditCategory.click();
        Thread.sleep(1000);
        SiteCategory.AddCategoryFrom.shouldBe(visible);
    }
    @Test
    @Order(14)
    public void t14EditContactWithALlValidDetails() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContacts.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContactFlyout.click();
        Thread.sleep(1000);
        SiteCategory.EditCategory.click();
        Thread.sleep(1000);
        AdvanceSite.ContactTitle.clear();
        AdvanceSite.ContactTitle.sendKeys("Edited");
        AdvanceSite.ContactEmail.clear();
        AdvanceSite.ContactEmail.sendKeys("Lorem@gmail.com");
        AdvanceSite.ContactDescription.clear();
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
    @Test
    @Order(15)
    public void t15SaveButtonShouldBeDisabledAfterInvalidDetailsIsAdded() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContacts.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContactFlyout.click();
        Thread.sleep(1000);
        SiteCategory.EditCategory.click();
        Thread.sleep(1000);
        AdvanceSite.ContactTitle.clear();
        AdvanceSite.ContactTitle.sendKeys("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).\n" +
                "\n");
        AdvanceSite.ContactEmail.clear();
        AdvanceSite.ContactEmail.sendKeys("Lorem@gmail.com");
        AdvanceSite.ContactDescription.clear();
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
        AdvanceSite.ContactSaveButton.shouldBe(disabled);
    }
    @Test
    @Order(16)
    public void t16ErrorMessageShouldBeVisibleAfterAddingInvalidDetails() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContacts.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContactFlyout.click();
        Thread.sleep(1000);
        SiteCategory.EditCategory.click();
        Thread.sleep(1000);
        AdvanceSite.ContactTitle.sendKeys("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).\n" +
                "\n");
        AdvanceSite.ContactEmail.sendKeys("Lorem@gmail.com");
        AdvanceSite.ContactDescription.setValue("Lorem");
        Thread.sleep(1000);
        SiteCategory.ErrorToolTipMessage.shouldBe(visible);
    }
    @Test
    @Order(17)
    public void t17ErrorToolTipMessageShouldBeVisibleAfterAddingInvalidEmail() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContacts.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContactFlyout.click();
        Thread.sleep(1000);
        SiteCategory.EditCategory.click();
        Thread.sleep(1000);
        AdvanceSite.ContactTitle.sendKeys("It is a long");
        AdvanceSite.ContactEmail.sendKeys("Lorem");
        AdvanceSite.ContactDescription.setValue("Lorem");
        Thread.sleep(1000);
        AdvanceSite.SaveButton.click();
        Thread.sleep(1000);
        SiteCategory.ErrorToolTipMessage.is(visible);
    }

    @Test
    @Order(18)
    public void t18ErrorToolTipMessageShouldBeVisibleAfterAddingInvalidThumbnail() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContacts.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContactFlyout.click();
        Thread.sleep(1000);
        SiteCategory.EditCategory.click();
        Thread.sleep(1000);
        AdvanceSite.ContactType1.click();
        AdvanceSite.ContactTitle.sendKeys("Sample");
        AdvanceSite.ContactEmail.sendKeys("Lorem@gmail.com");
        AdvanceSite.ContactDescription.setValue("Lorem");
        AdvanceSite.ContactThumbnail.click();
        Thread.sleep(1000);
        String filepath = "C:\\Users\\Ensue\\Pictures\\Saved Pictures\\SEO.pptx";
        new FileUpload(filepath);
        Thread.sleep(1000);
        SiteEdit.ErrorTooltipMessage.is(visible);
    }
/////////////Category Contact Status Change ////////////////////
    @Test
    @Order(19)
    public void t19ChangeTheCategoryContactStatus() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContacts.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContactFlyout.click();
        Thread.sleep(1000);
        SiteCategory.UnPublishCategory.click();
        Thread.sleep(1000);

    }
    @Test
    @Order(20)
    public void t20SuccessMessageShouldBeVisibleAfterChangingCategoryContactStatus() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContacts.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContactFlyout.click();
        Thread.sleep(1000);
        SiteCategory.UnPublishCategory.click();
        Thread.sleep(1000);
        AdvanceSite.SuccessMessage.click();

    }
    @Test
    @Order(21)
    public void t21RemoveTheCategoryContact() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContacts.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContactFlyout.click();
        Thread.sleep(1000);
        SiteCategory.RemoveCategory.click();
        Thread.sleep(1000);
        AdvanceSite.ConfirmCancel.click();

    }
    @Test
    @Order(22)
    public void t22CancelTheProcessOfRemovingCategoryContact() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContacts.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContactFlyout.click();
        Thread.sleep(1000);
        SiteCategory.RemoveCategory.click();
        Thread.sleep(1000);
        SiteCategory.Cancel.click();

    }
    @Test
    @Order(23)
    public void t23MoveCategoryContactPanelShouldGetAppearAfterMoveOptionIsClicked() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContacts.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContactFlyout.click();
        Thread.sleep(1000);
        SiteCategory.MoveCategory.click();
        Thread.sleep(1000);
        SiteCategory.MoveCategoryModel.shouldBe(visible);

    }

    @Test
    @Order(24)
    public void t24MoveCategoryContactWithChoosingTheCategory() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContacts.click();
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
    @Order(25)
    public void t25CancelCategoryContactMovingProcedure() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContacts.click();
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

    }
    @Test
    @Order(27)
    public void t27CloseTheCategoryContactMovePanelsWithoutSaving() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContacts.click();
        Thread.sleep(1000);
        SiteCategory.CategoryContactFlyout.click();
        Thread.sleep(1000);
        SiteCategory.MoveCategory.click();
        Thread.sleep(1000);
        SiteCategory.MoveCategoryModel.shouldBe(visible);
        Thread.sleep(1000);
        SiteCategory.Close.click();
    }

}