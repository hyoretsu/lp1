package com.hyoretsu.lp1;

public class Book {
 private String author;
 public Integer pages;
 public String refNumber = "";
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

 public String getRefNumber() {
  return this.refNumber;
 }

 public String getTitle() {
  return this.title;
 }

 public void printAuthor() {
  System.out.println(this.author);
 }

 public void printDetails() {
  String bookDetails = "Title: " + this.title + ", Author: " + this.author + ", Pages: " + this.pages;

  if (this.refNumber.length() > 0) {
   bookDetails += ", Reference Number: " + this.refNumber;
  } else {
   bookDetails += ", Reference Number: ZZZ";
  }

  System.out.println(bookDetails);
 }

 public void printTitle() {
  System.out.println(this.title);
 }

 public void setRefNumber(String ref) {
  this.refNumber = ref;
 }
}
