package page.components;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import org.openqa.selenium.Cookie;

import static com.codeborne.selenide.Selenide.$;

public class MarketingPopupComponents {

    SelenideElement confirmButton = $("#confirm-button");

    public void shutdownMarketingPopup() {
        if(confirmButton.isDisplayed()) {
            confirmButton.click();
            Cookie cookiePopupsShownCount = new Cookie("popups-popup-pdd-spring-shown-count", "1");
            WebDriverRunner.getWebDriver().manage().addCookie(cookiePopupsShownCount);
        } else {
            Cookie cookiePopupsShownCount = new Cookie("popups-popup-pdd-spring-shown-count", "1");
            WebDriverRunner.getWebDriver().manage().addCookie(cookiePopupsShownCount);
        }
    }

}
