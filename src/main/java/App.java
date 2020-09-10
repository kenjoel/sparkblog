import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.sun.org.apache.xpath.internal.objects.XObject;
import models.post;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args){
        staticFileLocation("/public");

        get("/", (request, response) ->{
                Map<String, Object > model = new HashMap<String, Object>();
                return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        post("/post/new", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String content = request.queryParams("content");
            post post = new post(content);
            return  new ModelAndView(model, "success.hbs");
        });

        get("/", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<post> posts = (ArrayList<post>) post.getAll();
            model.put("posts", posts);

            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());



    }
}
