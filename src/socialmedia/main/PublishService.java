package socialmedia.main;

import jdk.jshell.spi.ExecutionControl;

public class PublishService {

    public Boolean publishPost(User user, String body) {
        if (user != null) {
            Post newPost = new Post();
            newPost.body = body;
            newPost.author = user.firstname;

            user.posts.add(newPost);
            return true;
        }
        return false;
    }
}
