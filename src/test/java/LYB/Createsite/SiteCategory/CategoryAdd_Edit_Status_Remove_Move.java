package LYB.Createsite.SiteCategory;

import LYB.Base.BaseSetup;
import LYB.Createsite.AdvanceForm.AdvanceSite;
import LYB.Createsite.Site;
import LYB.Createsite.SiteEdit.SiteEdit;
import org.junit.jupiter.api.*;

import java.security.SecureRandom;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Selenide.open;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)


public class CategoryAdd_Edit_Status_Remove_Move extends BaseSetup {
    TestMethodOrder Ascending;

    @BeforeEach
    public void setUp() throws InterruptedException {
        open("https://staging.learnyourcare.com/auth/login");

    }


    public void Search(){
        SiteEdit.Search.setValue("pnc");
        SiteEdit.Search.pressEnter();

    }
    @Test
    @Order(1)
    public void t1AddCategoriesButtonShouldBeVisibleAfterClickedOnCategory() throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        SiteCategory.SiteCategory.click();
        SiteCategory.AddCategory.shouldBe(visible);
    }
    @Test
    @Order(2)
    public void t2AddCategoriesButtonShouldBeClicked(){
        Search();
        SiteEdit.EditSite.click();
        SiteCategory.SiteCategory.click();
        SiteCategory.AddCategory.click();
        SiteCategory.AddCategoryFrom.shouldBe(visible);
    }

    @Test
    @Order(3)
    public void t3AddCategoriesWithValidDetails() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.AddCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryTitle.sendKeys("New Category");
        Thread.sleep(1000);
        SiteCategory.CategoryDescription.sendKeys("It is a long established fact that a reader will be distracted");
        Thread.sleep(1000);
        SiteCategory.CategoryHeader.sendKeys("It is a long established fact that a reader will be distracted");
        Thread.sleep(1000);
        SiteCategory.CategoryFooter.sendKeys("t is a long established fact that a reader will be distracted");
        Thread.sleep(1000);
        SiteCategory.StatusDropDown.click();
        Thread.sleep(1000);
        SiteCategory.Unpublished.click();
        Thread.sleep(1000);
        SiteCategory.CategorySaveButton.click();
        Thread.sleep(500);
        AdvanceSite.SuccessMessage.shouldBe(visible);


    }
    @Test
    @Order(4)
    public void t4SaveButtonShouldBeDisabledAfterAddingInvalidDetails() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.AddCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryTitle.sendKeys("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).\n" +
                "\n");
        Thread.sleep(1000);
        SiteCategory.CategorySaveButton.shouldBe(disabled);
    }
    @Test
    @Order(5)
    public void t5ToolTipErrorMessageShouldAppearAfterInvalidDetailsISAdded() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.AddCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryTitle.sendKeys("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).\n" +
                "\n");
        Thread.sleep(1000);
        SiteCategory.ErrorToolTipMessage.shouldBe(visible);


    }
    @Test
    @Order(6)
    public void t6CancelAddCategories() throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.AddCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryTitle.sendKeys("New Category");
        Thread.sleep(1000);
        SiteCategory.CategoryCancelButton.click();
        Thread.sleep(1000);
        SiteCategory.AddCategory.is(disappear);
        Thread.sleep(500);
        SiteCategory.CategoryTitle.shouldBe(visible);

    }
    @Test
    @Order(7)
    public void t7CloseAddCategories() throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.AddCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryTitle.sendKeys("New Category");
        Thread.sleep(1000);
        SiteCategory.CategoryCloseButton.click();
        Thread.sleep(1000);
        SiteCategory.AddCategory.is(disappear);
        Thread.sleep(500);
        SiteCategory.CategoryTitle.shouldBe(visible);
    }

    @Test
    @Order(8)
    public void t8ChoosePublishedStatusInCategories() throws InterruptedException {

        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.AddCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryTitle.sendKeys("New Category");
        Thread.sleep(1000);
        SiteCategory.CategoryDescription.sendKeys("It is a long established fact that a reader will be distracted");
        Thread.sleep(1000);
        SiteCategory.CategoryHeader.sendKeys("It is a long established fact that a reader will be distracted");
        Thread.sleep(1000);
        SiteCategory.CategoryFooter.sendKeys("t is a long established fact that a reader will be distracted");
        Thread.sleep(1000);
        SiteCategory.StatusDropDown.click();
        Thread.sleep(1000);
        SiteCategory.Published.click();
        Thread.sleep(1000);
        SiteCategory.CategorySaveButton.click();
        Thread.sleep(500);
        AdvanceSite.SuccessMessage.shouldBe(visible);
    }
    @Test
    @Order(9)
    public void t9EditPanelShouldBeVisibleAfterEditOptionIsClicked() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.hover();
        Thread.sleep(1000);
        SiteCategory.FlyoutButton.click();
        Thread.sleep(1000);
        SiteCategory.EditCategory.click();
        Thread.sleep(1000);
        SiteCategory.AddCategoryFrom.shouldBe(visible);
        Thread.sleep(1000);
    }
    @Test
    @Order(10)
    public void t10EditAddCategoriesWithValidDetails() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.hover();
        Thread.sleep(1000);
        SiteCategory.FlyoutButton.click();
        Thread.sleep(1000);
        SiteCategory.EditCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryTitle.clear();
        Thread.sleep(500);
        SiteCategory.CategoryTitle.sendKeys("Overflow");
        Thread.sleep(1000);
        SiteCategory.CategoryDescription.clear();
        Thread.sleep(500);
        SiteCategory.CategoryDescription.sendKeys("Got Updated");
        Thread.sleep(1000);
        SiteCategory.CategoryHeader.clear();
        Thread.sleep(500);
        SiteCategory.CategoryHeader.sendKeys("Got Updated");
        Thread.sleep(1000);
        SiteCategory.CategoryFooter.clear();
        Thread.sleep(500);
        SiteCategory.CategoryFooter.sendKeys("Got Updated");
        Thread.sleep(1000);
        SiteCategory.StatusDropDown.click();
        Thread.sleep(1000);
        SiteCategory.Unpublished.click();
        Thread.sleep(1000);
        SiteCategory.CategorySaveButton.click();
        Thread.sleep(500);
        AdvanceSite.SuccessMessage.shouldBe(visible);
    }
    @Test
    @Order(11)
    public void t11SaveButtonShouldBeDisabledIfInvalidDetailsIsAdded() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.hover();
        Thread.sleep(1000);
        SiteCategory.FlyoutButton.click();
        Thread.sleep(1000);
        SiteCategory.EditCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryTitle.sendKeys("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).\n" +
                "\n");
        Thread.sleep(1000);
        SiteCategory.CategorySaveButton.shouldBe(disabled);
    }
    @Test
    @Order(12)
    public void t12ToolTipErrorMessageShouldGetAppearAfterInvalidDetailsIsAdded() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.hover();
        Thread.sleep(1000);
        SiteCategory.FlyoutButton.click();
        Thread.sleep(1000);
        SiteCategory.EditCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryTitle.sendKeys("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).\n" +
                "\n");
        Thread.sleep(1000);
        SiteCategory.ErrorToolTipMessage.shouldBe(visible);
    }
    @Test
    @Order(13)
    public void t13ChooseUnpublishedStatusForCategory() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.hover();
        Thread.sleep(1000);
        SiteCategory.FlyoutButton.click();
        Thread.sleep(1000);
        SiteCategory.EditCategory.click();
        Thread.sleep(1000);
        SiteCategory.StatusDropDown.click();
        Thread.sleep(1000);
        SiteCategory.Unpublished.click();
        Thread.sleep(1000);
        SiteCategory.CategorySaveButton.click();
        Thread.sleep(1000);
        SiteCategory.UnpublishedColor.shouldBe(visible);
        Thread.sleep(500);
        AdvanceSite.SuccessMessage.shouldBe(visible);


    }

    @Test
    @Order(14)
    public void t14ChoosePublishedStatusForCategory() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.hover();
        Thread.sleep(1000);
        SiteCategory.FlyoutButton.click();
        Thread.sleep(1000);
        SiteCategory.EditCategory.click();
        Thread.sleep(1000);
        SiteCategory.StatusDropDown.click();
        Thread.sleep(1000);
        SiteCategory.Published.click();
        Thread.sleep(1000);
        SiteCategory.CategorySaveButton.click();
        Thread.sleep(1000);
        SiteCategory.PublishedColor.shouldBe(visible);
        Thread.sleep(500);
        AdvanceSite.SuccessMessage.shouldBe(visible);

    }
    @Test
    @Order(15)
    public void t15ChangeTheStatusOfCategory() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.hover();
        Thread.sleep(1000);
        SiteCategory.FlyoutButton.click();
        Thread.sleep(1000);
        SiteCategory.UnPublishCategory.click();



    }
    @Test
    @Order(16)
    public void t16RemoveCreatedCategory() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.hover();
        Thread.sleep(1000);
        SiteCategory.FlyoutButton.click();
        Thread.sleep(1000);
        SiteCategory.RemoveCategory.click();
        Thread.sleep(1000);
        AdvanceSite.ConfirmCancel.click();
        Thread.sleep(500);
        AdvanceSite.SuccessMessage.shouldBe(visible);

    }
    @Test
    @Order(17)
    public void t17CancelTheRemoveCreatedCategoryProcess() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.hover();
        Thread.sleep(1000);
        SiteCategory.FlyoutButton.click();
        Thread.sleep(1000);
        SiteCategory.RemoveCategory.click();
        Thread.sleep(1000);
        SiteCategory.Cancel.click();
    }

    @Test
    @Order(18)
    public void t18MoveCategoryModelShouldGetAppear() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.hover();
        Thread.sleep(1000);
        SiteCategory.FlyoutButton.click();
        Thread.sleep(1000);
        SiteCategory.MoveCategory.click();
        Thread.sleep(1000);
        SiteCategory.MoveCategoryModel.shouldBe(visible);
    }

    @Test
    @Order(19)
    public void t19SelectNewCategoryToMoveCategoryResources() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.hover();
        Thread.sleep(1000);
        SiteCategory.FlyoutButton.click();
        Thread.sleep(1000);
        SiteCategory.MoveCategory.click();
        Thread.sleep(1000);
        SiteCategory.MoveCategoryDropDown.click();
        Thread.sleep(1000);
        SiteCategory.SelectedCategory.click();
        Thread.sleep(1000);
        AdvanceSite.SaveButton.click();

        Thread.sleep(500);
        AdvanceSite.SuccessMessage.shouldBe(visible);
    }

    @Test
    @Order(20)
    public void t20CancelTheMoveResourceProcess() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.hover();
        Thread.sleep(1000);
        SiteCategory.FlyoutButton.click();
        Thread.sleep(1000);
        SiteCategory.MoveCategory.click();
        Thread.sleep(1000);
        SiteCategory.MoveCategoryDropDown.click();
        Thread.sleep(1000);
        SiteCategory.SelectedCategory.click();
        Thread.sleep(1000);
        AdvanceSite.Cancel.click();
    }
    @Test
    @Order(21)
    public void t21CloseTheMoveResourceModal() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.hover();
        Thread.sleep(1000);
        SiteCategory.FlyoutButton.click();
        Thread.sleep(1000);
        SiteCategory.MoveCategory.click();
        Thread.sleep(1000);
        SiteCategory.MoveCategoryDropDown.click();
        Thread.sleep(1000);
        SiteCategory.SelectedCategory.click();
        Thread.sleep(1000);
        SiteCategory.Close.click();

    }



}
