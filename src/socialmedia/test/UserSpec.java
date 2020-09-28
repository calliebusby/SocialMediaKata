package socialmedia.test;

import org.junit.jupiter.api.*;
import socialmedia.main.Post;
import socialmedia.main.User;
import static org.junit.jupiter.api.Assertions.*;

public class UserSpec {
    User alice = new User();
    User bob = new User();
    User charlie = new User();
    Post alicePost = new Post();

    @BeforeEach
    public void setUp() {
        alice.firstname = "Alice";
        alicePost.body = "I love the weather today.";
        alice.posts.add(alicePost);
        alice.following.add(bob);
        alice.following.add(charlie);
    }

    @Test
    public void userHasFirstname() {
        String expectedName = "Alice";
        assertEquals(expectedName, alice.firstname);
    }

    @Test
    public void userHasPosts() {
        assertEquals(1, alice.posts.size());
        assertEquals("I love the weather today.", alice.posts.get(0).body);
    }

    @Test
    public void userIsFollowing() {
        assertEquals(2, alice.following.size());
    }
}
