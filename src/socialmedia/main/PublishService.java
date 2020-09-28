package socialmedia.main;

import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;

public class PublishService {

    public Boolean publishPost(User user, String body) {
        if (user != null && body != null) {
            Post newPost = new Post();
            newPost.body = body;
            newPost.author = user.firstname;

            user.posts.add(newPost);
            return true;
        }
        return false;
    }

    public String[] getUserTimeline(User user) {
        String[] postList = new String[user.posts.size()];
        int i = 0;
        for(Post post : user.posts) {
            postList[i] = post.body;
            i++;
        }

        return postList;
    }

    public String[] getTimeline(User user) {
        ArrayList<User> allUsers = new ArrayList<User>();
        allUsers.add(user);
        allUsers.addAll(user.following);
        ArrayList<Post> allPosts = new ArrayList<Post>();

        for(User friend : allUsers) {
            for(Post post : friend.posts) {
                allPosts.add(post);
            }
        }

        String[] postList = new String[allPosts.size()];
        int i = 0;
        for(Post post : allPosts) {
            postList[i] = post.body;
            i++;
        }

        return postList;
    }
}
