package socialmedia.test;

import org.junit.jupiter.api.Test;
import socialmedia.main.User;
import static org.junit.jupiter.api.Assertions.*;

public class UserSpec {
    @Test
    public void userHasFirstname(){
        User user = new User();
        user.firstname = "Alice";

        assertEquals(user.firstname, "Alice");
    }
}
