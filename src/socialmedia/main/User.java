package socialmedia.main;

import java.util.List;
import java.util.UUID;

public class User {
    private UUID uuid;
    public String firstname;
    public List<Post> posts;
    public List<User> following;
}
