package com.hyoretsu.lp1;

public class Book {
 private String author;
 public Integer pages;
 private String title;

 /** Set the author and title fields when this object is constructed. */
 public Book(String bookAuthor, String bookTitle, Integer pages) {
  author = bookAuthor;
  this.pages = pages;
  title = bookTitle;
 }

 public String getAuthor() {
  return this.author;
 }

 public Integer getPages() {
  return this.pages;
 }

 public String getTitle() {
  return this.title;
 }

 public void printAuthor() {
  System.out.println(this.author);
 }

 public void printDetails() {
  System.out.println("Title: " + this.title + ", Author: " + this.author + ", Pages: " + this.pages);
 }

 public void printTitle() {
  System.out.println(this.title);
 }
}
