package socialmedia.test;

import org.junit.jupiter.api.*;
import socialmedia.main.Post;
import socialmedia.main.User;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UserSpec {
    User alice = new User();
    Post alicePost = new Post();


    @BeforeEach
    public void setUp() {
        alice.firstname = "Alice";
        alice.posts.add(alicePost);
    }

    @Test
    public void userHasFirstname() {
        String expectedName = "Alice";
        assertEquals(alice.firstname, expectedName);
    }

    @Test
    public void userHasPosts(){
        assertEquals(alice.posts.size(), 1);
    }
}
