package socialmedia.test;

import org.junit.jupiter.api.*;
import socialmedia.main.Post;
import static org.junit.jupiter.api.Assertions.*;


public class PostSpec {
    Post newPost = new Post();

    @BeforeEach
    public void setUp() {
        newPost.body = "This is my first post";
        newPost.author = "Alice";
    }

    @Test
    public void postHasBody() {
        assertEquals("This is my first post", newPost.body);
    }

    @Test
    public void postHasAuthorName() {
        assertEquals("Alice", newPost.author);
    }

    @Test
    public void postHasDate() {
        assertNotNull(newPost.date);
    }
}
