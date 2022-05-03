package co.com.choucair.certification.retolatam.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConsultaVuelosPage extends PageObject {
    public static final Target CLICK_JOURNEY_OPTION = Target.the("click on round trip option")
            .located(By.xpath("//span[@class='text-label']"));
    public static final Target CLICK_GO_OPTION = Target.the("click go option")
            .located(By.id("btnTripType0"));
    public static final Target CLICK_ROUND_TRIP_OPTION = Target.the("click on round trip option")
            .located(By.id("btnTripType1"));
    public static final Target ENTER_ORIGIN = Target.the("click on round trip option")
            .located(By.id("txtInputOrigin_field"));
    public static final Target ENTER_DESTINATION = Target.the("click on round trip option")
            .located(By.id("txtInputDestination_field"));
    public static final Target CONFIRM_ENTER_DESTINATION = Target.the("click on round trip option")
            .located(By.id("popperExtended"));

}
