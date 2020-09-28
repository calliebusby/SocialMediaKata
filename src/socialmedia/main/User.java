package socialmedia.main;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    private UUID uuid;
    public String firstname;
    public ArrayList<Post> posts = new ArrayList<Post>();
    public List<User> following;
}
