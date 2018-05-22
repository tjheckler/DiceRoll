package controllers;

import models.Die;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import sun.plugin2.message.Message;

import javax.inject.Inject;
import java.util.Random;

public class GameController extends Controller
{

    private FormFactory formFactory;

    @Inject
    public GameController(FormFactory formFactory)
    {
        this.formFactory = formFactory;
    }

    public Result postDice1()
    {

            DynamicForm form = formFactory.form().bindFromRequest();
            int dieSize = Integer.parseInt(form.get("DieSize"));
            int numberOfDice = Integer.parseInt(form.get("numberOfDice"));
            Die die1 = new Die(dieSize);
            Die die2 = new Die(dieSize);
            Die die3 = new Die(dieSize);
            if (numberOfDice == 1)
            {
                return ok(views.html.rolldice.render(die1));
            } else if (numberOfDice == 2)
            {
                return ok(views.html.rolldice2.render(die1, die2));
            } else if (numberOfDice == 3)
            {
                return ok(views.html.rolldice3.render(die1, die2, die3));
            }
        return badRequest("Invalid number of dice");

    }


    public Result getStart()
    {
        return ok(views.html.start.render());
    }
}
