package LYB.Createsite.SiteEdit;

import LYB.Base.BaseSetup;
import LYB.Createsite.Site;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.commands.PressEnter;
import org.junit.jupiter.api.*;

import java.awt.event.KeyEvent;

import static com.codeborne.selenide.Condition.empty;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)


public class SiteVideoBucketsTest extends BaseSetup {
    TestMethodOrder Ascending;

    @BeforeEach
    public void setUp() throws InterruptedException {
        open("http://localhost:4200/auth/login");

    }

    public void Search(){
        SiteEdit.Search.setValue("atmsite");
        SiteEdit.Search.pressEnter();
    }
    public void UnAssignBuckets(){

        SiteEdit.UnAssignBuckets.click();
        SiteEdit.ConfirmCancel.click();
    }

    @Test
    @Order(1)
    public void t1SiteVideoBucketsShouldBeVisibleAfterItIsClicked() throws InterruptedException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(500);
        SiteEdit.SiteVideoBuckets.click();
        Thread.sleep(500);
        SiteEdit.SiteVideoBucketsPage.shouldBe(Condition.visible);

    }

    @Test
    @Order(2)
    public void t2AssignTheAvailableVideoBucketAndUnAssignTheSelectedVideoBuckets() throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        SiteEdit.SiteVideoBuckets.click();
        Thread.sleep(1000);
        SiteEdit.AssignBuckets.click();
        Thread.sleep(1000);
        SiteEdit.AssignBuckets.click();
        Thread.sleep(1000);
        SiteEdit.AssignBuckets.click();
        Thread.sleep(1000);
        UnAssignBuckets();
        Thread.sleep(1000);
        UnAssignBuckets();
        Thread.sleep(1000);
        UnAssignBuckets();
        Thread.sleep(1000);
    }
    @Test
    @Order(3)
    public void t3SelectedBucketsBlockShouldBeVisibleAfterAvailableBucketsIsAssigned() throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteEdit.SiteVideoBuckets.click();
        Thread.sleep(1000);
        SiteEdit.AssignBuckets.click();
        Thread.sleep(1000);
        SiteEdit.AssignBuckets.click();
        Thread.sleep(1000);
        SiteEdit.AssignBuckets.click();
        SiteEdit.SelectedBucketsBlock.should(visible);
        Thread.sleep(1000);
        UnAssignBuckets();
        Thread.sleep(1000);
        UnAssignBuckets();
        Thread.sleep(1000);
        UnAssignBuckets();
        Thread.sleep(1000);
    }
    @Test
    @Order(4)
    public void t4AvailableVideoBlockShouldBeVisibleAfterVideoBucketsIsAssigned() throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteEdit.SiteVideoBuckets.click();
        Thread.sleep(1000);
        SiteEdit.AssignBuckets.click();
        Thread.sleep(1000);
        SiteEdit.AssignBuckets.click();
        Thread.sleep(1000);
        SiteEdit.AssignBuckets.click();
        Thread.sleep(1000);
        SiteEdit.AvailableVideoBlock.shouldBe(visible);
        Thread.sleep(1000);
        UnAssignBuckets();
        Thread.sleep(1000);
        UnAssignBuckets();
        Thread.sleep(1000);
        UnAssignBuckets();
        Thread.sleep(1000);
    }
//    @Test
//    public void t5SelectedBucketsShouldBeUnassigned() throws InterruptedException {
//        Search();
//        SiteEdit.EditSite.click();
//        Thread.sleep(1000);
//        SiteEdit.SiteVideoBuckets.click();
//        Thread.sleep(1000);
//        for(int i=10;i>=1;i--) {
//            SiteEdit.UnAssignBuckets.click();
//            SiteEdit.ConfirmCancel.click();
//        }
//}


    @Test
    @Order(5)
    public void t5SelectedBucketsAndAvailableVideosShouldBeEmptyBeforeAssigningTheBuckets() throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        Thread.sleep(500);
        SiteEdit.SiteVideoBuckets.click();
        Thread.sleep(500);
        SiteEdit.SelectedBuckets.shouldBe(visible);
        Thread.sleep(500);


    }
    @Test
    @Order(6)
    public void t6SelectedBucketsAndAvailableVideosShouldBeEmptyAfterUnAssignButtonIsClicked() throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteEdit.SiteVideoBuckets.click();
        Thread.sleep(1000);
        SiteEdit.AssignBuckets.click();
        Thread.sleep(1000);
        SiteEdit.AssignBuckets.click();
        Thread.sleep(1000);
        SiteEdit.AssignBuckets.click();
        Thread.sleep(1000);
        SiteEdit.AvailableVideoBlock.should(visible);
        Thread.sleep(1000);
        UnAssignBuckets();
        Thread.sleep(1000);
        UnAssignBuckets();
        Thread.sleep(1000);
        UnAssignBuckets();
        Thread.sleep(1000);
        SiteEdit.SelectedBuckets.shouldBe(visible);
        Thread.sleep(1000);
        SiteEdit.AvailableVideos.shouldBe(visible);
    }

}
