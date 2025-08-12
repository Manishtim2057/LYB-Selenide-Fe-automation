package LYB.Createsite.SiteCategory.BulkAction;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class BulkActionElement {
    public static SelenideElement BulkAction = $x("/html/body/app-root/admin-root/section/div/section/div/app-sites/div/section/app-themes/section/div/app-site-resources/section/div/app-resource-documents/div/section[1]/app-bulk-action-menu/div/div");
    public static SelenideElement DeselectBulkAction = $x("/html/body/app-root/admin-root/section/div/section/div/app-sites/div/section/app-themes/section/div/app-site-resources/section/div/app-resource-documents/div/section[1]/app-bulk-action-menu/div/div/button");
    public static SelenideElement SelectAllCheckBox = $(".bulk-checkbox-input");
    public static SelenideElement BulkEdit = $(".custom-icon-button:nth-of-type(2)");
    public static SelenideElement BulkDelete = $(".custom-icon-button:nth-of-type(3)");
    public static SelenideElement BulkFlyout = $(" .bulk-action-menu-container .btn-group ");
    public static SelenideElement BulkPublished = $(".dropdown-menu li:nth-of-type(1)");
    public static SelenideElement BulkUnpublished = $(".dropdown-menu li:nth-of-type(2)");
    public static SelenideElement BulkMove = $(".dropdown-menu li:nth-of-type(3)");
}
