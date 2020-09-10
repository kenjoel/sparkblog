package models;

import java.util.ArrayList;
import java.util.function.BooleanSupplier;

public class post {
    private String content;
    private static ArrayList<post> instances = new ArrayList<>(); // I’m new. When do I get created?

    public post(String content){
        this.content = content;
        instances.add(this); //Also new. Can you figure out what I do and how I work?
    }

    public static BooleanSupplier getAll(){
        return (BooleanSupplier) instances;
    }

    public static void clearAllPosts(){
        instances.clear();
    }

}
