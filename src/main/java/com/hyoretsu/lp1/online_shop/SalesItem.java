package com.hyoretsu.lp1.online_shop;

import java.util.ArrayList;
import java.util.Iterator;

public class SalesItem {
 private String name;
 private int price; // in cents
 private ArrayList<Comment> comments;

 /** Create a new sales item. */
 public SalesItem(String name, int price) {
  this.name = name;
  this.price = price;
  comments = new ArrayList<>();
 }

 /**
  * Add a comment to the comment list of this sales item. Return true if
  * successful; false if the comment was rejected.
  *
  * The comment will be rejected if the same author has already left a comment,
  * or if the rating is invalid. Valid ratings are numbers between 1 and 5
  * (inclusive).
  */
 public boolean addComment(String author, String text, int rating) {
  if (ratingInvalid(rating)) { // reject invalid ratings
   return false;
  }

  if (findCommentByAuthor(author) != null) { // reject multiple comments by same author
   return false;
  }

  comments.add(new Comment(author, text, rating));
  return true;
 }

 /**
  * Downvote the comment at 'index'. That is: count this comment as less helpful.
  * If the index is invalid, do nothing.
  */
 public void downvoteComment(int index) {
  if (index >= 0 && index < comments.size()) { // if index is valid
   comments.get(index).downvote();
  }
 }

 /**
  * Find the comment by the author with the given name.
  *
  * @return The comment if it exists; null if it doesn't.
  */
 private Comment findCommentByAuthor(String author) {
  for (Comment comment : comments) {
   if (comment.getAuthor().equals(author)) {
    return comment;
   }
  }
  return null;
 }

 /**
  * Return the most helpful comment. The most useful comment is the one with the
  * highest vote balance. If there are multiple comments with equal highest
  * balance, return any one of them.
  */
 public Comment findMostHelpfulComment() {
  // Exercise 9.10
  if (comments.size() == 0) {
   return null;
  }

  Iterator<Comment> it = comments.iterator();
  Comment best = it.next();
  while (it.hasNext()) {
   Comment current = it.next();
   if (current.getVoteCount() > best.getVoteCount()) {
    best = current;
   }
  }
  return best;
 }

 /** Return the name of this item. */
 public String getName() {
  return name;
 }

 /** Return the number of customer comments for this item. */
 public int getNumberOfComments() {
  return comments.size();
 }

 /** Return the price of this item. */
 public int getPrice() {
  return price;
 }

 /**
  * For a price given as an int, return a readable String representing the same
  * price. The price is given in whole cents. For example for price==12345, the
  * following String is returned: $123.45
  */
 private String priceString(int price) {
  int dollars = price / 100;
  int cents = price - (dollars * 100);
  if (cents <= 9) {
   return "$" + dollars + ".0" + cents; // include zero padding if necessary
  } else {
   return "$" + dollars + "." + cents;
  }
 }

 /**
  * Check whether the given rating is invalid. Return true if it is invalid.
  * Valid ratings are in the range [1..5].
  */
 private boolean ratingInvalid(int rating) {
  // Exercise 9.10
  return rating < 1 || rating > 5;
 }

 /**
  * Remove the comment stored at the index given. If the index is invalid, do
  * nothing.
  */
 public void removeComment(int index) {
  if (index >= 0 && index < comments.size()) { // if index is valid
   comments.remove(index);
  }
 }

 /**
  * Show all comments on screen. (Currently, for testing purposes: print to the
  * terminal. Modify later for web display.)
  */
 public void showInfo() {
  System.out.println("*** " + name + " ***");
  System.out.println("Price: " + priceString(price));
  System.out.println();
  System.out.println("Customer comments:");
  for (Comment comment : comments) {
   System.out.println("-------------------------------------------");
   System.out.println(comment.getFullDetails());
  }
  System.out.println();
  System.out.println("===========================================");
 }

 /**
  * Upvote the comment at 'index'. That is: count this comment as more helpful.
  * If the index is invalid, do nothing.
  */
 public void upvoteComment(int index) {
  if (index >= 0 && index < comments.size()) { // if index is valid
   comments.get(index).upvote();
  }
 }
}