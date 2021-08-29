package com.hyoretsu.lp1;

public class Book {
 private String author;
 private String title;

 /** Set the author and title fields when this object is constructed. */
 public Book(String bookAuthor, String bookTitle) {
  author = bookAuthor;
  title = bookTitle;
 }

 public String getAuthor() {
  return this.author;
 }

 public String getTitle() {
  return this.title;
 }

 public void printAuthor() {
  System.out.println(this.author);
 }

 public void printTitle() {
  System.out.println(this.title);
 }
}
