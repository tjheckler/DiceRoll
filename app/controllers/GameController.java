package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class GameController extends Controller
{
    public Result getStart()
    {
        return ok(views.html.start.render());
    }
}
