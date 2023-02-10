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
    public static SelenideElement SelectedCategory = $x("//*[@id=\"newCategory\"]/option[2]");

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
   public static SelenideElement NewLink = $(".btn-secondary");
   public static SelenideElement DocumentCard = $(".resource-card");
   public static SelenideElement CategoryContactFlyout = $(".resource-card .custom-icon-button");
/////////////////Multiple Document////////////////////////////////

    public static SelenideElement MulDocumentTitle1 =$x(" //*[@id=\"data.0.title\"]");
    public static SelenideElement MulDocumentTitle2 =$x("//*[@id=\"data.1.title\"]");
    public static SelenideElement MulDocumentTitle3 =$x("//*[@id=\"data.2.title\"]");
    public static SelenideElement MulDocumentDesc1 =$x("//*[@id=\"data.0.description\"]");
    public static SelenideElement MulDocumentDesc2 =$x("//*[@id=\"data.1.description\"]");
    public static SelenideElement MulDocumentDesc3 =$x("//*[@id=\"data.2.description\"]");
    public static SelenideElement MulDocumentThumbnail1 =$x("//*[@id=\"0\"]/app-upload-thumbnail-image/div/div[2]/label");
    public static SelenideElement MulDocumentThumbnail2 =$x("//*[@id=\"1\"]/app-upload-thumbnail-image/div/div[2]/label");
    public static SelenideElement MulDocumentThumbnail3 =$x("//*[@id=\"2\"]/app-upload-thumbnail-image/div/div[2]/label");
    public static SelenideElement MulDocumentStatus1 =$x("//*[@id=\"data.0.status\"]");
    public static SelenideElement MulDocumentStatus2 =$x("//*[@id=\"data.1.status\"]");
    public static SelenideElement MulDocumentStatus3 =$x("//*[@id=\"data.2.status\"]");
    public static SelenideElement MulDocumentRemove1 =$x("//*[@id=\"multi-document-field\"]/table/tr[2]/td[7]/button");
    public static SelenideElement MulDocumentRemove2 =$x("//*[@id=\"multi-document-field\"]/table/tr[3]/td[7]/button");
    public static SelenideElement MulDocumentRemove3 =$x("//*[@id=\"multi-document-field\"]/table/tr[4]/td[7]/button");
    public static SelenideElement MulDocumentIcon1 =$x("//*[@id=\"data.0.icon\"]/div/div");
    public static SelenideElement MulDocumentIcon2 =$x("//*[@id=\"data.1.icon\"]/div/div");
    public static SelenideElement MulDocumentIcon3 =$x("//*[@id=\"data.2.icon\"]/div/div");
    public static SelenideElement MulDocumentIconOption1=$x("//*[@id=\"data.0.icon\"]/div/ul/li[3]");
    public static SelenideElement MulDocumentIconOption2 =$x("//*[@id=\"data.1.icon\"]/div/ul/li[3]");
    public static SelenideElement MulDocumentIconOption3 =$x("//*[@id=\"data.2.icon\"]/div/ul/li[3]");

    public static SelenideElement MulDocument1Published =$x("//*[@id=\"data.0.status\"]/option[1]");
    public static SelenideElement MulDocument1Unpublished =$x("//*[@id=\"data.0.status\"]/option[2]");
    public static SelenideElement MulDocument2Unpublished =$x("//*[@id=\"data.1.status\"]/option[1]");
    public static SelenideElement MulDocument2Published =$x("//*[@id=\"data.1.status\"]/option[2]");
    public static SelenideElement MulDocument3Unpublished =$x("//*[@id=\"data.1.status\"]/option[1]");
    public static SelenideElement MulDocument3Published =$x("//*[@id=\"data.1.status\"]/option[2]");
    public static SelenideElement SaveButton =$(".modal-footer .btn-secondary");
    public static SelenideElement CancelButton =$(".modal-footer .btn");
    public static SelenideElement DocStatusPub =$x("//*[@id=\"dropdown-custom\"]/li[1]/a");
//    public static SelenideElement  =$x("//*[@id=\"dropdown-custom\"]/li[1]/a");
    public static SelenideElement AddNewDocumentButton =$x("//*[@id=\"multi-document-field\"]/div/button");




/////////////////For If Else////////////
    public static SelenideElement Status = $(".resource-card nico-status");
    public static SelenideElement Unpub = $x("//*[@id=\"dropdown-custom\"]/li[1]/a");
    public static SelenideElement Pub = $(".resource-card nico-status");
    public static SelenideElement UnStatus = $x("//*[@id=\"uxrm7tjIkl-1395\"]/div[2]/div/nico-status/span");
    public static SelenideElement CardContainer = $(".resource-card");










}
