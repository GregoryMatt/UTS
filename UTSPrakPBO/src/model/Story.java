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
public class Story extends Post{
    private int duration;
    private int views;

    public Story(int duration, int views, String postID, ContentStateEnum status, Timestamp timeUpload, ContentTypeEnum postType, ArrayList<Comment> comment) {
        super(postID, status, timeUpload, postType, comment);
        this.duration = duration;
        this.views = views;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    
    
    
}
