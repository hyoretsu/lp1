package com.hyoretsu.lp1.network;

import java.util.ArrayList;

public class MessagePost extends Post {
 /** An arbitrarily long, multi-line message */
 private String message;

 /**
  * Constructor for objects of class MessagePost.
  *
  * @param author The username of the author of this post.
  * @param text   The text of this post.
  */
 public MessagePost(String author, String text) {
  super(author);
  message = text;
 }

 /**
  * Return the text of this post.
  *
  * @return The post's message text.
  */
 public String getText() {
  return message;
 }

 public void printShortSummary() {
  System.out.println("Message post from " + this.getUserName());
 }
}
