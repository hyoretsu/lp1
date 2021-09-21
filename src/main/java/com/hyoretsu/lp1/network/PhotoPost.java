package com.hyoretsu.lp1.network;

import java.util.ArrayList;

public class PhotoPost extends Post {
 /** The name of the image file */
 private String filename;
 /** A one line image caption */
 private String caption;

 /**
  * Constructor for objects of class PhotoPost.
  *
  * @param author   The username of the author of this post.
  * @param filename The filename of the image in this post.
  * @param caption  A caption for the image.
  */
 public PhotoPost(String author, String filename, String caption) {
  super(author);
  this.filename = filename;
  this.caption = caption;
 }

 /**
  * Return the caption of the image of this post.
  *
  * @return The image's caption.
  */
 public String getCaption() {
  return caption;
 }

 /**
  * Return the file name of the image in this post.
  *
  * @return The post's image file name.
  */
 public String getImageFile() {
  return filename;
 }

 public void printShortSummary() {
  System.out.println("Photo post from " + this.getUserName());
 }
}
