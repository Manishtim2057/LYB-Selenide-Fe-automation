package LYB.Base;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class BaseButtonVariable {
    public SelenideElement username = $x("//*[@id=\"username\"]");
    public SelenideElement password = $x("//*[@id=\"password\"]");

    public SelenideElement login = $x("//*[@id=\"loginForm\"]/div[3]/button");
}
