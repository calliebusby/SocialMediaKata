package socialmedia.test;

import org.junit.jupiter.api.*;
import socialmedia.main.PublishService;
import socialmedia.main.User;

import static org.junit.jupiter.api.Assertions.*;

public class PublishServiceSpec {
    PublishService publishService = new PublishService();

    @Test
    public void publishPostShouldReturnFalseWhenUserNotProvided() {
        String body = "Darn! We lost!";

        Boolean expected = publishService.publishPost(null, body);

        assertFalse(expected);
    }

    @Test
    public void publishPostShouldReturnFalseWhenBodyNotProvided() {
        User bob = new User();

        Boolean expected = publishService.publishPost(bob, null);

        assertFalse(expected);
        assertEquals(0, bob.posts.size());
    }

    @Test void publishPostShouldSaveANewPostWhenAllInfoProvided() {
        User bob = new User();
        bob.firstname = "Bob";
        String body = "Darn! We lost!";

        Boolean expected = publishService.publishPost(bob, body);

        assertTrue(expected);
        assertEquals(1, bob.posts.size());
    }
}
