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
public abstract class Post {
    
    private String postID;
    private ContentStateEnum status;
    private Timestamp timeUpload;
    private ContentTypeEnum postType;
    private ArrayList <Comment> comment = new ArrayList <>();

    public Post(String postID, ContentStateEnum status, Timestamp timeUpload, ContentTypeEnum postType, ArrayList <Comment> comment) {
        this.postID = postID;
        this.status = status;
        this.timeUpload = timeUpload;
        this.postType = postType;
        this.comment = comment;
    }

    public String getPostID() {
        return postID;
    }

    public void setPostID(String postID) {
        this.postID = postID;
    }

    public ContentStateEnum getStatus() {
        return status;
    }

    public void setStatus(ContentStateEnum status) {
        this.status = status;
    }

    public Timestamp getTimeUpload() {
        return timeUpload;
    }

    public void setTimeUpload(Timestamp timeUpload) {
        this.timeUpload = timeUpload;
    }

    public ContentTypeEnum getPostType() {
        return postType;
    }

    public void setPostType(ContentTypeEnum postType) {
        this.postType = postType;
    }

    public ArrayList<Comment> getComment() {
        return comment;
    }

    public void setComment(ArrayList<Comment> comment) {
        this.comment = comment;
    }
    
    
    
}
