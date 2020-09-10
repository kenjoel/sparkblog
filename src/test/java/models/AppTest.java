package models;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

class AppTest {

}




class PostTest {

    @After
    public void tearDown() {
        post.clearAllPosts(); //clear out all the posts before each test.
    }

    @Test
    public void AllPostsAreCorrectlyReturned_true() {
        post post = new post("Day 1: Intro");
        post otherPost = new post ("How to pair successfully");
        assertEquals(2, models.post.getAll());
    }

    @Test
    public void AllPostsContainsAllPosts_true() {
        post post = new post("Day 1: Intro");
        post otherPost = new post ("How to pair successfully");
        assertTrue(models.post.getAll());
        assertTrue(post.getAll());
    }
}