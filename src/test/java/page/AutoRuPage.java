package page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AutoRuPage {

    SelenideElement
            regionIndicators = $(".TopNavigationIndicators__item"),
            mainHeader = $(".HeaderMainNav_theme_default");

    ElementsCollection
            itemTransport = $$(".HeaderMainNav__subLinks li");

    public AutoRuPage openAutoRu() {
        open("");
        return this;
    }

    public AutoRuPage checkTypeTransport(String type, List<String> model) {
        regionIndicators.shouldHave(visible);
        mainHeader.shouldHave(visible);
        mainHeader.$(byText(type)).hover();
        itemTransport.shouldHave(texts(model));
        return this;
    }

}
