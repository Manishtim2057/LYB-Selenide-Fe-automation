package LYB.Createsite.SiteUser;

import LYB.Base.BaseSetup;
import LYB.Createsite.AdvanceForm.AdvanceSite;
import LYB.Createsite.SiteCategory.SiteCategory;
import LYB.Createsite.SiteEdit.SiteEdit;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SiteUsersTest extends BaseSetup {
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
    public void t1SiteUserPageShouldBeVisibleAfterUserOptionIsClicked() throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        UsersElements.SiteUsers.click();
        UsersElements.SiteUsersPage.shouldBe(visible);
    }
    @Test
    @Order(2)
    public void t2AssignUserPanelShouldBeVisibleAfterAssignUserButtonIsClicked() throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        UsersElements.SiteUsers.click();
        UsersElements.AssignUser.click();
        $(".model-content").is(visible);

    }
    @Test
    @Order(3)
    public void t3AssignUserAsSiteAdmin() throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        UsersElements.SiteUsers.click();
        UsersElements.AssignUser.click();
        UsersElements.UserDropDown.click();
        UsersElements.SelectUser.click();
        UsersElements.SiteAdminToggle.click();
        SiteCategory.Close.click();

    }
    @Test
    @Order(4)
    public void t4UnAssignUserAsSiteAdmin() throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        UsersElements.SiteUsers.click();
        UsersElements.AssignedUser.click();
        UsersElements.SiteAdminToggle.click();
        SiteCategory.Close.click();

    }
}