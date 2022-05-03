package co.com.choucair.certification.retolatam.taks;

import co.com.choucair.certification.retolatam.model.DataLatam;
import co.com.choucair.certification.retolatam.userinterface.ConsultaVuelosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class ConsultaVuelosLatam implements Task {
    private DataLatam dataLatam;
    public ConsultaVuelosLatam(DataLatam dataLatam)
    {
        this.dataLatam = dataLatam;
    }

    public static ConsultaVuelosLatam the(DataLatam dataLatam) {
        return Tasks.instrumented(ConsultaVuelosLatam.class,dataLatam);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ConsultaVuelosPage.CLICK_JOURNEY_OPTION));
        if(dataLatam.getTrayecto().equals("Solo ida"))
        {actor.attemptsTo(Click.on(ConsultaVuelosPage.CLICK_GO_OPTION));
        } else {actor.attemptsTo(Click.on(ConsultaVuelosPage.CLICK_ROUND_TRIP_OPTION));
        }
        actor.attemptsTo(Enter.theValue(dataLatam.getOrigen()).into(ConsultaVuelosPage.ENTER_ORIGIN));
        actor.attemptsTo(Enter.theValue(dataLatam.getOrigen()).into(ConsultaVuelosPage.ENTER_DESTINATION));
        actor.attemptsTo(Click.on(ConsultaVuelosPage.CONFIRM_ENTER_DESTINATION));
    }
}
