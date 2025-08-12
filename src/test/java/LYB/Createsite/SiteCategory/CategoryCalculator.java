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
public class CategoryCalculator extends BaseSetup {
    TestMethodOrder Ascending;

    @BeforeEach
    public void setUp() throws InterruptedException {
        open("http://localhost:4200/auth/login");

    }

    public void Search() {
        SiteEdit.Search.setValue("atmsite");
        SiteEdit.Search.pressEnter();

    }

    @Test()
    @Order(1)
    public void t42CalculatorPageShouldBeVisibleAfterCalculatorOptionIsClicked() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCalculators.click();
        Thread.sleep(1000);
        SiteEdit.Title.shouldBe(visible);

    }
    @Test
    @Order(2)
    public void t43AssignCalculator() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCalculators.click();
        Thread.sleep(1000);
        AdvanceSite.CalculatorAssign.click();
        Thread.sleep(1000);
        AdvanceSite.SuccessMessage.shouldBe(visible);

    }
    @Test
    @Order(3)
    public void SuccessMessageShouldBeVisibleAfterCalculatorIsAssigned() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCalculators.click();
        Thread.sleep(1000);
        AdvanceSite.CalculatorAssign.click();
        Thread.sleep(1000);
        AdvanceSite.SuccessMessage.shouldBe(visible);

    }


    @Test
    @Order(5)
    public void SuccessMessageShouldBeVisibleAfterCalculatorIsUnAssigned() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCalculators.click();
        Thread.sleep(1000);
        AdvanceSite.CalculatorUnAssign.click();
        Thread.sleep(1000);
        AdvanceSite.SuccessMessage.shouldBe(visible);

    }

    @Test
    @Order(6)
    public void SelectedCalculatorMustBeEmptyAfterUnAssigningAllAssignedCalculators() throws InterruptedException, AWTException {
        Search();
        Thread.sleep(1000);
        SiteEdit.EditSite.click();
        Thread.sleep(1000);
        SiteCategory.SiteCategory.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCard.click();
        Thread.sleep(1000);
        SiteCategory.CategoryCalculators.click();
        Thread.sleep(1000);

        do {
            AdvanceSite.CalculatorUnAssign.click();
        } while(SiteCategory.CardContainer.is(empty));

        Thread.sleep(500);
        AdvanceSite.SuccessMessage.shouldBe(visible);

    }


}