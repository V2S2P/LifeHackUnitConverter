package app.controllers;

import app.persistence.Team21UnitMapper;
import io.javalin.Javalin;
import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

public class Team21UnitController {
    public static void routes(Javalin app) {
        app.get("/team-21/unit-converter", Team21UnitController::team21FrontHome);
        app.post("/team-21/unit-converter", Team21UnitController::handleConversion);  // This now matches the form action
    }

    private static void team21FrontHome(@NotNull Context ctx) {
        ctx.render("team21/unit-converter.html");
    }
    public static void handleConversion(@NotNull Context ctx){
        double value = Double.parseDouble(ctx.formParam("value"));
        String unitType = ctx.formParam("unitType");

        double result = Team21UnitMapper.convert(value,unitType);
        ctx.attribute("result", String.format("%.4f", result));
        ctx.attribute("unitType", unitType);
        ctx.render("team21/unit-converter.html");
    }
}
