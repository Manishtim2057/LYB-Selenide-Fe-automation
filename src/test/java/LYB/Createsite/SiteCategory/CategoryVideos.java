package LYB.Createsite.SiteCategory;

import LYB.Base.BaseSetup;
import LYB.Createsite.AdvanceForm.AdvanceSite;
import LYB.Createsite.SiteEdit.SiteEdit;
import com.codeborne.selenide.Condition;
import io.qameta.allure.internal.shadowed.jackson.databind.ser.Serializers;
import org.junit.jupiter.api.*;
import org.openqa.selenium.edge.AddHasCasting;


import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CategoryVideos extends BaseSetup {
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
    public void t1VideosPageShouldBeVisibleAfterCategoryVideosIsClicked() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryVideos.click();
        Thread.sleep(1000);
        SiteEdit.Title.shouldBe(visible);
    }
    @Test
    @Order(2)
    public void t2AssignAndUnAssignCategoryVideos() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryVideos.click();
        Thread.sleep(1000);
        AdvanceSite.AssignVideo.click();
        Thread.sleep(500);
        AdvanceSite.SuccessMessage.click();
        Thread.sleep(500);
        AdvanceSite.UnAssignVideo.click();
        Thread.sleep(1000);
        AdvanceSite.ConfirmCancel.click();
        Thread.sleep(500);
        AdvanceSite.SuccessMessage.click();

    }
    @Test
    @Order(3)
    public void t3VideosPlaylistShouldBeVisibleAfterVideosIsAssigned() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryVideos.click();
        Thread.sleep(1000);
        AdvanceSite.AssignVideo.click();
        Thread.sleep(500);
        AdvanceSite.SuccessMessage.click();
        Thread.sleep(500);
        SiteEdit.VideoList.shouldBe(visible);
        Thread.sleep(1000);
        AdvanceSite.UnAssignVideo.click();
        Thread.sleep(1000);
        AdvanceSite.ConfirmCancel.click();
        Thread.sleep(500);
        AdvanceSite.SuccessMessage.click();
        Thread.sleep(500);

    }
    @Test
    @Order(4)
    public void t4EmptyVideoPlayListShouldBeVisibleAfterAssignedAllVideoIsUnAssigned() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryVideos.click();
        Thread.sleep(1000);
        AdvanceSite.AssignVideo.click();
        Thread.sleep(500);
        AdvanceSite.UnAssignVideo.click();
        SiteEdit.ConfirmCancel.click();
        Thread.sleep(1000);
        AdvanceSite.SuccessMessage.shouldBe(visible);
        Thread.sleep(1000);
        SiteEdit.EmptyVideoPlaylist.is(visible);
        Thread.sleep(1000);
        Thread.sleep(500);

    }
}
