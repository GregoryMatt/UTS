/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author grego
 */
public class Comment {
    private String commentID;
    private String text;
    private ContentStateEnum status;

    public Comment(String commentID, String text, ContentStateEnum status) {
        this.commentID = commentID;
        this.text = text;
        this.status = status;
    }

    public String getCommentID() {
        return commentID;
    }

    public void setCommentID(String commentID) {
        this.commentID = commentID;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ContentStateEnum getStatus() {
        return status;
    }

    public void setStatus(ContentStateEnum status) {
        this.status = status;
    }
    
    
}
