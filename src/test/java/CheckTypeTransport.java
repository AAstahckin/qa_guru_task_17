import data.TransportType;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import page.AutoRuPage;
import page.components.MarketingPopupComponents;

import java.util.List;

@DisplayName("Проверка отображения видов транспорта на главной странице")
@Description("Проверка отображения видов транспорта на главной странице")
public class CheckTypeTransport extends TestBase {

    AutoRuPage autoRuPage = new AutoRuPage();
    MarketingPopupComponents marketingPopupComponents = new MarketingPopupComponents();

    @EnumSource(value = TransportType.class)
    @ParameterizedTest(name = "При наведенеии в Header на элемент : {0} отображаются виды транспорта")
    void searchMarksAndBrand(TransportType transportType) {
        autoRuPage.openAutoRu();
        marketingPopupComponents.shutdownMarketingPopup();
        autoRuPage.checkTypeTransport(transportType.getTypeName(), List.of(transportType.getTypeValue()));
    }

}