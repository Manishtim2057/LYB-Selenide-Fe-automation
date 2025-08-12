package LYB.Createsite.SiteUser;

import LYB.Base.BaseSetup;
import LYB.Createsite.AdvanceForm.AdvanceSite;
import LYB.Createsite.Site;
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
    @Test
    @Order(5)
    public void t5SortSelectByTitleAsc() throws InterruptedException {
        Site.SortSelect.click();
        Site.TitleSort.click();
        Site.AscSortOrder.click();

    }
    @Test
    @Order(6)
    public void t6SortSelectByTitleDesc() throws InterruptedException {
        Site.SortSelect.click();
        Site.TitleSort.click();
        Site.AscSortOrder.click();

    }
    @Test
    @Order(7)
    public void t7SortSelectByDateAsc() throws InterruptedException {
        Site.SortSelect.click();
        Site.DateSort.click();
        Site.AscSortOrder.click();

    }
    @Test
    @Order(8)
    public void t8SortSelectByDateDesc() throws InterruptedException {
        Site.SortSelect.click();
        Site.DateSort.click();
        Site.DescSortOrder.click();

    }
    @Test
    @Order(9)
    public void t9SortSelectByDomainAsc() throws InterruptedException {
        Site.SortSelect.click();
        Site.DomainSort.click();
        Site.AscSortOrder.click();

    }
    @Test
    @Order(10)
    public void t10SortSelectByDomain() throws InterruptedException {
        Site.SortSelect.click();
        Site.DomainSort.click();
        Site.DescSortOrder.click();

    }
    @Test
    @Order(11)
    public void t11SortByPublished() throws InterruptedException {
        Site.SortSelect.click();
        Site.DomainSort.click();
        Site.PublishSortOrder.click();

    }
    @Test
    @Order(12)
    public void t12SortByUnpublished() throws InterruptedException {
        Site.SortSelect.click();
        Site.DomainSort.click();
        Site.UnPublishSortOrder.click();

    }
}