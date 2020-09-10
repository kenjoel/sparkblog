package models;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

class AppTest {

}




public class PostTest {

    @Test
    public void NewPostObjectGetsCorrectlyCreated_true() throws Exception {

        post post = new post("Day 1: Intro");
        assertEquals("Day 1: Intro", post.getContent());
    }
}