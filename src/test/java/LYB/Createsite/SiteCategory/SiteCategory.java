package LYB.Createsite.SiteCategory;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SiteCategory {

    public static SelenideElement SiteCategory = $(".side-nav .navbar-nav .nav-item:nth-of-type(6)");

    public static SelenideElement AddCategory = $(".btn:not(:disabled):not(.disabled)");

    public static SelenideElement AddCategoryFrom = $(".modal-content");

    public static SelenideElement ErrorToolTipMessage = $(".modal-content");

    public static SelenideElement CategoryTitle = $(".form-control, .custom-select.title");

    public static SelenideElement CategoryDescription = $x("//*[@id=\"description\"]");

    public static SelenideElement CategoryHeader = $x("/html/body/nico-empty-modal/div/div/div/app-new-category-modal/div[2]/form/div[3]/div/quill-editor/div[2]/div[1]");

    public static SelenideElement CategoryFooter = $x("/html/body/nico-empty-modal/div/div/div/app-new-category-modal/div[2]/form/div[4]/div/quill-editor/div[2]/div[1]");

    public static SelenideElement StatusDropDown = $x("//*[@id=\"status\"]");

    public static SelenideElement Published = $x("//*[@id=\"status\"]/option[2]");

    public static SelenideElement Unpublished = $x("//*[@id=\"status\"]/option[1]");

    public static SelenideElement CategoryCloseButton = $x("//*[@id=\"description\"]");

    public static SelenideElement CategoryCancelButton = $x("//*[@id=\"description\"]");

    public static SelenideElement CategorySaveButton = $x("//*[@id=\"category-form\"]/div[6]/button");

    public static SelenideElement FlyoutButton = $(".panel .custom-icon-button");

    public static SelenideElement UnPublishCategory = $("#dropdown-custom li:nth-of-type(1)");
    public static SelenideElement EditCategory = $("#dropdown-custom li:nth-of-type(2)");
    public static SelenideElement RemoveCategory = $("#dropdown-custom li:nth-of-type(3)");
    public static SelenideElement MoveCategory = $("#dropdown-custom li:nth-of-type(4)");
    public static SelenideElement MoveCategoryDropDown = $x("//*[@id=\"newCategory\"]");
    public static SelenideElement SelectedCategory = $x("//*[@id=\"newCategory\"]/option[4]");

    public static SelenideElement MoveCategoryModel = $(".modal-content");
    public static SelenideElement CategoryCard = $(".panel");
    public static SelenideElement NewDocument = $(".btn-secondary");
    public static SelenideElement UnpublishedColor = $(".circular-status-indicator.unpublished");

    public static SelenideElement PublishedColor = $(".circular-status-indicator.published");
//    public static SelenideElement Confirm = $(".modal-footer .btn-secondary");
    public static SelenideElement Cancel = $(".modal-footer .btn");
   public static SelenideElement Close = $(".modal .custom-icon-button");
   public static SelenideElement CategoryVideos = $(".panel .nav-item:nth-of-type(1)");
   public static SelenideElement CategoryDocuments = $(".panel .nav-item:nth-of-type(2)");
   public static SelenideElement CategoryContacts = $(".panel .nav-item:nth-of-type(3)");
   public static SelenideElement CategoryLinks = $(".panel .nav-item:nth-of-type(4)");
   public static SelenideElement CategoryCalculators = $(".panel .nav-item:nth-of-type(5)");
   public static SelenideElement SingleDocument = $(".dropdown-menu li:nth-of-type(1)");
   public static SelenideElement MultipleDocument = $(".dropdown-menu li:nth-of-type(2)");

   public static SelenideElement NewContact = $(".btn-secondary");
   public static SelenideElement CategoryContactFlyout = $(".resource-card .custom-icon-button");

















}
