package com.hyoretsu.lp1.network;

import java.util.ArrayList;

public class NewsFeed {
 private ArrayList<Post> posts;

 /** Construct an empty news feed. */
 public NewsFeed() {
  posts = new ArrayList<>();
 }

 /**
  * Add a post to the news feed.
  *
  * @param post The post to be added.
  */
 public void addPost(Post post) {
  posts.add(post);
 }

 /**
  * Show the news feed. Currently: print the news feed details to the terminal.
  * (To do: replace this later with display in web browser.)
  */
 public void show() {
  // display all posts
  for (Post post : posts) {
   post.display();
   System.out.println(); // empty line between posts
  }
 }
}
