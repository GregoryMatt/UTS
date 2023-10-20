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
public class Reel extends Post{
    private int duration;
    private int playedCount;

    public Reel(int duration, int playedCount, String postID, ContentStateEnum status, Timestamp timeUpload, ContentTypeEnum postType, ArrayList<Comment> comment) {
        super(postID, status, timeUpload, postType, comment);
        this.duration = duration;
        this.playedCount = playedCount;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getPlayedCount() {
        return playedCount;
    }

    public void setPlayedCount(int playedCount) {
        this.playedCount = playedCount;
    }
    
    
}
