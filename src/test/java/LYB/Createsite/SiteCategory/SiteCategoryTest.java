package LYB.Createsite.SiteCategory;

import LYB.Base.BaseSetup;
import LYB.Createsite.AdvanceForm.AdvanceSite;
import LYB.Createsite.SiteEdit.SiteEdit;
import org.junit.jupiter.api.*;
import org.openqa.selenium.support.ui.Sleeper;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)


public class SiteCategoryTest extends BaseSetup {
    TestMethodOrder Ascending;

    @BeforeEach
    public void setUp() throws InterruptedException {
        open("http://localhost:4200/auth/login");

    }


    public void Search(){
        SiteEdit.Search.setValue("atmsite");
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
    }
}
