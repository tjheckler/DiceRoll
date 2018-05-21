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

    public Result postDice1()
    {
        DynamicForm form = formFactory.form().bindFromRequest();
        int dieSize = Integer.parseInt(form.get("DieSize"));
        //int howMany = Integer.parseInt(form.get("die1"));
        Die die1 = new Die(dieSize);
        return ok(views.html.rolldice.render(die1));
    }
    public Result postDice2()
    {
        DynamicForm form = formFactory.form().bindFromRequest();
        int dieSize = Integer.parseInt(form.get("DieSize"));
        //int howMany = Integer.parseInt(form.get("die2"));
        Die die2 = new Die(dieSize);
        return ok(views.html.rolldice.render(die2));
    }
    public Result postDice3()
    {
        DynamicForm form = formFactory.form().bindFromRequest();
        int dieSize = Integer.parseInt(form.get("DieSize"));
        //int howMany = Integer.parseInt(form.get("die3"));
        Die die3 = new Die(dieSize);
        return ok(views.html.rolldice.render(die3));
    }

    public Result getStart()
    {
        return ok(views.html.start.render());
    }
}
