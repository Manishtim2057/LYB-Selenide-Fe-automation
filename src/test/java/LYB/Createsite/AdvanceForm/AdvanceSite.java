package LYB.Createsite.AdvanceForm;

import com.codeborne.selenide.Driver;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AdvanceSite {

    public static SelenideElement NewSiteButton = $(".component-title-block .cta-block > .btn.btn-secondary");

    public static SelenideElement SiteManagement = $x("/html/body/app-root/admin-root/section/div/section/div/app-sites/div/section/app-sites-list/section[1]/h2");
    public static SelenideElement UseAdvanceForm =  $x("//*[@id=\"nico-modal-body\"]/app-create-site-modal/div[3]/a[1]");//User Advance Form button.

    public static SelenideElement SubDomain = $x("//*[@id=\"domain\"]");//Advance form subdomain.

    public static SelenideElement SiteTitle = $x("//*[@id=\"title\"]");//Advance Site Title.

    public static SelenideElement  SiteLogo = $x("//*[@id=\"detailsForm\"]/div[3]/div/label/span");

    public static SelenideElement SitePrimaryColor = $x("//*[@id=\"primary_color\"]");

    public static SelenideElement SitePriColorInput = $x("//*[@id=\"detailsForm\"]/div[4]/div/div[1]/color-picker/div/div[7]/div[1]/input");

    public static SelenideElement SitePriColorOKButton = $x("//*[@id=\"detailsForm\"]/div[4]/div/div[1]/color-picker/div/div[9]/button");

    public static SelenideElement SiteSecondaryColor = $x("//*[@id=\"secondary_color\"]");

    public static SelenideElement SiteSecColorInput = $x("//*[@id=\"detailsForm\"]/div[4]/div/div[2]/color-picker/div/div[7]/div[1]/input");

    public static SelenideElement SiteSecColorOkButton = $x("//*[@id=\"detailsForm\"]/div[4]/div/div[2]/color-picker/div/div[9]/button");

    public static SelenideElement SiteDescription = $x("//*[@id=\"description\"]");

    public static SelenideElement SaveAndNextButton = $(".fixed-sides-actions .stepper-next-btn");

    public static SelenideElement SiteMessage = $x("//*[@id=\"messageForm\"]/div/div/quill-editor/div[2]/div[1]");


    public static SelenideElement ChooseVideoType = $x("/html/body/app-root/admin-root/section/div/section/div/app-sites/div/section/app-site-create/div/div/div/div[2]/section/div/div/section/div/app-video-options/div[1]/h3");
    public static SelenideElement GlobalVideos = $x("/html/body/app-root/admin-root/section/div/section/div/app-sites/div/section/app-site-create/div/div/div/div[2]/section/div/div/section/div/app-video-options/div[2]/div/div[1]/div");

    public static SelenideElement CategoryVideos = $x("/html/body/app-root/admin-root/section/div/section/div/app-sites/div/section/app-site-create/div/div/div/div[2]/section/div/div/section/div/app-video-options/div[2]/div/div[2]/div");

    public static SelenideElement GlobalAndCategoryVideos = $x("//*[@id=\"video-option\"]/div[3]/div");


    //For the Add Category
    public static SelenideElement AddCategory = $(".btn:not(:disabled):not(.disabled)");

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

    public static SelenideElement PreviousButton = $(".fixed-sides-actions .stepper-prev-btn");

    public static SelenideElement CancelButton = $(".fixed-sides-actions .stepper-cancel-btn");

    public static SelenideElement ConfirmCancel = $(".modal-footer > *.btn-secondary");

    public static SelenideElement ContinueLater = $(".fixed-sides-actions .stepper-continue-later-btn");

    public static SelenideElement AddVideoBucket = $(".adv-site-create-container .steps .step .step-header-container .step-title");

    public static  SelenideElement AssignVideBucket = $(".add-resource, .remove-resource");

    public static SelenideElement ClearSelection = $(".adv-site-create-container .steps .step .resource-bucket-container .clear-selected-btn, .adv-site-create-container .steps .step .resource-videos-container .clear-selected-btn");

    public static SelenideElement SelectedBuckets = $(".resource-bucket-container .bucket-column .bucket-card .bucket-container .bucket-block .bucket-block-details");

    public static SelenideElement EmptySelectBuckets =$(".jumbotron");

    public static SelenideElement AvailableVideosList = $(".video-container:last-of-type");

    public static SelenideElement EmptyAvailableVideo = $(".no-data-block");

    public static SelenideElement AddVideos = $(".adv-site-create-container .steps .step .step-header-container .step-title");

    public static SelenideElement AvailableVideos = $(".video-container:last-of-type");

    public static SelenideElement VideosPlayList = $(".adv-site-create-container .steps .card");

    public static SelenideElement AssignVideo = $(".video-container .video-action");

    public static SelenideElement UnAssignVideo = $("a i.remove-form-bucket");

    public static SelenideElement EmptyVideoPlaylist = $(".no-data-block");

    ////AddResources
    public static SelenideElement AddResources = $(".adv-site-create-container .steps .step .step-header-container .step-title");

    public static SelenideElement NewDocument = $(".card:nth-of-type(1) .btn-secondary");
    public static SelenideElement AddDocument = $(".upload-resource-block .dnd-text .link");
    public static SelenideElement DocumentTitle = $("input#title");
    public static SelenideElement DocumentIcon = $("#icon > div > div");
    public static SelenideElement DocumentIconOption1 = $(".dropdown.open .dropdown-menu .fa-file-word far");
    public static SelenideElement DocumentDescription = $("textarea.form-control, textarea.custom-select");

    public static SelenideElement DocumentList = $(".adv-site-create-container .steps .card");
    public static SelenideElement DocumentThumbnail = $("#thumbnailImageContainer .custom-file");
    public static SelenideElement SaveButton = $(".row.justify-content-end.p-3 > button");
    public static SelenideElement DocumentFlyoutMenu = $(".card:nth-of-type(1) .resource-card-content .custom-icon-button");

    public static SelenideElement ChangeStatus = $x("//*[@id=\"dropdown-custom\"]/li[1]/a");

    public static SelenideElement DocumentEdit = $(".card:nth-of-type(1) #dropdown-custom li:nth-of-type(2)");

    public static SelenideElement RemoveDocument = $x("//*[@id=\"dropdown-custom\"]/li[3]/a");
    public static SelenideElement Cancel = $(".justify-content-end .btn");


//
    public static SelenideElement ContactThumbnail = $("#thumbnail_url.custom-file");
    public static SelenideElement NewContact = $(byText("New contact"));
    public static SelenideElement ContactTypeDropDown = $x("//*[@id=\"contact_type\"]");
    public static SelenideElement ContactType = $x("//*[@id=\"contact_type\"]/option[1]");
    public static SelenideElement ContactTitle = $x("//*[@id=\"title\"]");
    public static SelenideElement ContactEmail = $x("//*[@id=\"value\"]");
    public static SelenideElement ContactDescription = $x("//*[@id=\"description\"]");


    public static SelenideElement Done = $x("/html/body/modal-container/div/div/app-cropper-modal/div/div[3]/button[3]");

   public static SelenideElement ContactFlyout = $(".card:nth-of-type(2) .custom-icon-button");

    public static SelenideElement ContactEdit = $(".card:nth-of-type(2) #dropdown-custom li:nth-of-type(2)");
    public static SelenideElement ContactRemove = $(".card:nth-of-type(2) #dropdown-custom li:nth-of-type(3)");

    public static SelenideElement AlertMessage = $(".nico-alert .alert-message");



    public static SelenideElement ContactSaveButton = $x("//*[@id=\"contact-create-form\"]/div[7]/button");



    public static SelenideElement NewLink = $(".card:nth-of-type(3) .btn-secondary");
    public static SelenideElement LinkTitle = $x("//*[@id=\"title\"]");
    public static SelenideElement LinkURl = $x("//*[@id=\"url\"]");
    public static SelenideElement LinkThumbnail = $x("//*[@id=\"thumbnailImageContainer\"]/app-upload-thumbnail-image/div/div[1]/label");
    public static SelenideElement LinkStatus = $x("");
    public static SelenideElement LinkDescription = $x("//*[@id=\"description\"]");
    public static SelenideElement LinkSaveButton= $(".justify-content-end .btn-secondary");

    public static SelenideElement SelectCalculator = $(".adv-site-create-container .steps .step .step-header-container .step-title");
    public static SelenideElement CalculatorAssign = $(".add-resource");
    public static SelenideElement CalculatorUnAssign = $(".remove-resource");
    public static SelenideElement SelectedCalculatorList = $x("//*[@id=\"calculatorDragDropContainer\"]/div[1]/app-calculator-card/a");
//    public static SelenideElement AvailableCalculatorList = $x("//*[@id=\"calculatorDragDropContainer\"]/div[1]/app-calculator-card/a");

    public static SelenideElement PreviewSite = $x("/html/body/app-root/admin-root/section/div/section/div/app-sites/div/section/app-site-create/div/div/div/div/section/app-site-preview/div[1]/h3");







}
