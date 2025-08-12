package LYB.Createsite.SiteUser;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class UsersElements {
    public static SelenideElement SiteUsersPage = $(".component-title-block h2");
    public static SelenideElement AssignUser = $(".btn-secondary");
    public static SelenideElement UserDropDown = $("advanced-select .adv-selected-option");
    public static SelenideElement SelectUser = $(".dropdown-menu li:nth-of-type(4)");
    public static SelenideElement SiteAdminToggle = $(".custom-slide-toggle .slider");
    public static SelenideElement SiteUsers = $(".side-nav .navbar-nav .nav-item:nth-of-type(7)");
    public static SelenideElement AssignedUser = $(".site-users-list .flex-table-tbody");
}
