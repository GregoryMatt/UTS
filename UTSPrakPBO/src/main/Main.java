/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import model.*;
/**
 *
 * @author grego
 */
public class Main {
    public static void main(String[] args) {
        // Data dummy untuk User
        User user = new User("12345", "JohnDoe", "password123", "A software engineer", new ArrayList<>());

        // Data dummy untuk Reel
        Reel reel = new Reel(30, 1000, "67890", ContentStateEnum.SHOWED, new Timestamp(System.currentTimeMillis()), ContentTypeEnum.VIDEO, new ArrayList<>());

        // Data dummy untuk Story
        Story story = new Story(15, 500, "54321", ContentStateEnum.SHOWED, new Timestamp(System.currentTimeMillis()), ContentTypeEnum.VIDEO, new ArrayList<>());

        // Data dummy untuk Feed
        Feed feed = new Feed("Hehe", 200, "98765", ContentStateEnum.SHOWED, new Timestamp(System.currentTimeMillis()), ContentTypeEnum.PICTURE, new ArrayList<>());

        // Data dummy untuk Comment
        Comment comment = new Comment("1111", "Nice post!", ContentStateEnum.SHOWED);

        // Simpan objek-objek ke dalam ArrayList jika diperlukan
        List<Post> posts = new ArrayList<>();
        posts.add(reel);
        posts.add(story);
        posts.add(feed);

        // Outputkan data dummy
        System.out.println("User: " + user.getUserName() + ", Bio: " + user.getBio());
        System.out.println("Reel Duration: " + reel.getDuration() + " seconds, Played Count: " + reel.getPlayedCount());
        System.out.println("Story Duration: " + story.getDuration() + " seconds, Views: " + story.getViews());
        System.out.println("Feed Caption: " + feed.getCaption() + ", Likes: " + feed.getLikes());
        System.out.println("Comment: " + comment.getText());
    }
}
