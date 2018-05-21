package controllers;

import models.Die;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

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

    public Result postDice()
    {
        DynamicForm form = formFactory.form().bindFromRequest();
        int dieSize = Integer.parseInt(form.get("DieSize"));
        Random random = new Random();

        int value = random.nextInt(dieSize + 1);

        return ok(views.html.rolldice.render(value));
    }

    public Result getStart()
    {
        return ok(views.html.start.render());
    }
}
