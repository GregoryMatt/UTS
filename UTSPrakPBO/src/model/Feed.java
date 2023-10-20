/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.Timestamp;
import java.util.ArrayList;
/**
 *
 * @author grego
 */
public class Feed extends Post{
    private String caption;
    private int likes;

    public Feed(String caption, int likes, String postID, ContentStateEnum status, Timestamp timeUpload, ContentTypeEnum postType, ArrayList<Comment> comment) {
        super(postID, status, timeUpload, postType, comment);
        this.caption = caption;
        this.likes = likes;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    
    
    
}
