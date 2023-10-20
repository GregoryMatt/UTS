/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.*;
/**
 *
 * @author grego
 */
public class Controller {

    public void showUserPosts(User user, ArrayList<Post> posts) {
        System.out.println("Posts by User: " + user.getUserName());

        ArrayList<Post> pinnedPosts = new ArrayList<>();
        ArrayList<Post> otherPosts = new ArrayList<>();

        for (Post post : posts) {
            if (post.getStatus() == ContentStateEnum.PINNED) {
                pinnedPosts.add(post);
            } else {
                otherPosts.add(post);
            }
        }

        for (Post post : pinnedPosts) {
            displayPostInfo(post);
        }

        ArrayList<Post> showedPosts = new ArrayList<>();
        ArrayList<Post> archivedPosts = new ArrayList<>();
        ArrayList<Post> deletedPosts = new ArrayList<>();

        for (Post post : otherPosts) {
            if (post.getStatus() == ContentStateEnum.SHOWED) {
                showedPosts.add(post);
            } else if (post.getStatus() == ContentStateEnum.ARCHIVED) {
                archivedPosts.add(post);
            } else if (post.getStatus() == ContentStateEnum.DELETED) {
                deletedPosts.add(post);
            }
        }

        for (Post post : showedPosts) {
            displayPostInfo(post);
        }

        for (Post post : archivedPosts) {
            displayPostInfo(post);
        }

        int deletedPostCount = deletedPosts.size();
        System.out.println("Total DELETED Posts: " + deletedPostCount);
    }

    public void displayPostInfo(Post post) {
        if (post instanceof Reel) {
            Reel reel = (Reel) post;
            System.out.println("Reel Duration: " + reel.getDuration() + " sec, Played Count: " + reel.getPlayedCount());
        } else if (post instanceof Story) {
            Story story = (Story) post;
            System.out.println("Story Duration: " + story.getDuration() + " sec, Views: " + story.getViews());
        } else if (post instanceof Feed) {
            Feed feed = (Feed) post;
            System.out.println("Feed Caption: " + feed.getCaption() + ", Likes: " + feed.getLikes());
        }
    }

    public void showPostDetails(String postID, ArrayList<Post> posts) {
        for (Post post : posts) {
            if (post.getPostID().equals(postID)) {
                if (post instanceof Reel) {
                    Reel reel = (Reel) post;
                    System.out.println("Reel ID: " + reel.getPostID());
                    System.out.println("Duration: " + reel.getDuration() + " sec");
                    System.out.println("Played Count: " + reel.getPlayedCount());
                    System.out.println("Status: " + reel.getStatus());
                    System.out.println("Upload Time: " + reel.getTimeUpload());
                    System.out.println("Post Type: " + reel.getPostType());
                } else if (post instanceof Story) {
                    Story story = (Story) post;
                    System.out.println("Story ID: " + story.getPostID());
                    System.out.println("Duration: " + story.getDuration() + " sec");
                    System.out.println("Views: " + story.getViews());
                    System.out.println("Status: " + story.getStatus());
                    System.out.println("Upload Time: " + story.getTimeUpload());
                    System.out.println("Type: " + story.getPostType());
                } else if (post instanceof Feed) {
                    Feed feed = (Feed) post;
                    System.out.println("Feed ID: " + feed.getPostID());
                    System.out.println("Caption: " + feed.getCaption());
                    System.out.println("Likes: " + feed.getLikes());
                    System.out.println("Status: " + feed.getStatus());
                    System.out.println("Upload Time: " + feed.getTimeUpload());
                    System.out.println("Type: " + feed.getPostType());
                }
                return;
            }
        }
        System.out.println("Post not found.");
    }

    
}
