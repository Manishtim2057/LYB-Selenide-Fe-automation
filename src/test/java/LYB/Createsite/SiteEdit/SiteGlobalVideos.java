package LYB.Createsite.SiteEdit;

import LYB.Base.BaseSetup;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class SiteGlobalVideos extends BaseSetup {
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
    public void t1SiteGlobalVideoShouldBeVisibleAfterSiteGlobalVideoIsClicked() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(500);
        SiteEdit.SiteGlobalVideos.click();
        Thread.sleep(500);
        SiteEdit.Title.shouldBe(visible);

    }
    @Test
    @Order(2)
    public void t2VideoPlaylistShouldBeEmptyBeforeVideosIsAssigned() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(500);
        SiteEdit.SiteGlobalVideos.click();
        Thread.sleep(1000);
        SiteEdit.AssignVideo.click();
        Thread.sleep(1000);
        SiteEdit.EmptyVideoPlaylist.shouldBe(visible);


    }
    @Test
    @Order(3)
    public void t3VideoShouldBeVisibleInVideoPlayListAfterVideoIsAssigned() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteEdit.SiteGlobalVideos.click();
        Thread.sleep(1000);
        SiteEdit.AssignVideo.click();
        Thread.sleep(1000);
        SiteEdit.VideoList.shouldBe(visible);
        Thread.sleep(1000);
        SiteEdit.UnAssignVideo.click();

    }
    @Test
    @Order(4)
    public void t4VideoPlayListShouldBeEmptyAfterVideoListIsUnassigned() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteEdit.SiteGlobalVideos.click();
        Thread.sleep(1000);
        SiteEdit.AssignVideo.click();
        Thread.sleep(1000);
        SiteEdit.UnAssignVideo.click();
        Thread.sleep(1000);
        SiteEdit.ConfirmCancel.click();
        Thread.sleep(1000);
        SiteEdit.EmptyVideoPlaylist.shouldBe(visible);

    }
}
