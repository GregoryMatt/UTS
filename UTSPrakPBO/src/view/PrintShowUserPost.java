/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.Post;
import controller.Controller;
import model.User;

/**
 *
 * @author grego
 */
public class PrintShowUserPost {

    public PrintShowUserPost(ArrayList <User> listUser, ArrayList <Post> listPost) {
        print(listUser, listPost);
    }

    public void print(ArrayList<User> listUser, ArrayList<Post> listPost) {
        Scanner scan = new Scanner(System.in);
        String user = scan.nextLine();
        
        if (user.equalsIgnoreCase(listUser.get(userName))) {
            Controller find = new Controller();

            find.showUserPosts(listUser.get(userName), listPost);
        }

    }

}
