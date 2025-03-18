package app.controllers;

import app.entities.Team21EntityUser;
import app.exceptions.DatabaseException;
import app.persistence.ConnectionPool;
//import app.persistence.Team21Mapper;
import io.javalin.Javalin;
import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;
/*
public class Team21Controller {
    public static void routes(Javalin app) {
        app.get("/team-21/login", ctx -> team21LoginPage(ctx));
        app.get("/team-21/index", ctx -> team21FrontHome(ctx));
    }

    private static void team21FrontHome(@NotNull Context ctx) {
        ctx.render("team21/index.html");
    }
    private static void team21LoginPage(@NotNull Context ctx) {
        ctx.render("team21/login.html");
    }
    private static void team21Login(Context ctx, ConnectionPool connectionPool){
        String username = ctx.formParam("username");
        String password = ctx.formParam("password");

        try {
            Team21EntityUser user = Team21Mapper.login(username, password, connectionPool);
            ctx.sessionAttribute("currentUser",user);
            ctx.redirect("/expenseTracker");
        }catch (DatabaseException e){
            ctx.attribute("message", e.getMessage());
            ctx.render("login.html");
        }
    }
}


 */