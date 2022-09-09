package LYB.Login;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class Login {
    public SelenideElement username = $x("//*[@id=\"username\"]");
    public SelenideElement password = $x("//*[@id=\"password\"]");

    public SelenideElement login = $x("//*[@id=\"loginForm\"]/div[3]/button");

    public SelenideElement forgot = $x("//*[@id=\"loginForm\"]/div[3]/a");//for the forgot password

    public SelenideElement email  =  $x("//*[@id=\"email\"]");

    public SelenideElement send = $x("//*[@id=\"cmpntForm\"]/div[2]/button[1]"); //Foor the send me a reset link

    public SelenideElement cancel = $x("//*[@id=\"cmpntForm\"]/div[2]/button[2]"); //For cancel the resetting password.
}
