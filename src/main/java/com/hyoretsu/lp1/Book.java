package com.hyoretsu.lp1;

public class Book {
 private String author;
 // Exercise 2.91
 public Integer borrowed = 0;
 // Exercise 2.92
 public Boolean courseText;
 // Exercise 2.85
 public Integer pages;
 // Exercise 2.88
 public String refNumber = "";
 private String title;

 /** Set the author and title fields when this object is constructed. */
 public Book(String bookAuthor, String bookTitle, Integer pages, Boolean isTextbook) {
  author = bookAuthor;
  this.courseText = isTextbook;
  this.pages = pages;
  title = bookTitle;
 }

 // Exercise 2.91
 public void borrow() {
  this.borrowed += 1;
 }

 // Exercise 2.83
 public String getAuthor() {
  return this.author;
 }

 // Exercise 2.91
 public Integer getBorrowed() {
  return this.borrowed;
 }

 // Exercise 2.85
 public Integer getPages() {
  return this.pages;
 }

 // Exercise 2.88
 public String getRefNumber() {
  return this.refNumber;
 }

 // Exercise 2.83
 public String getTitle() {
  return this.title;
 }

 // Exercise 2.92
 public Boolean isCourseText() {
  return this.courseText;
 }

 // Exercise 2.84
 public void printAuthor() {
  System.out.println(this.author);
 }

 // Exercise 2.87
 public void printDetails() {
  String bookDetails = "Title: " + this.title + ", Author: " + this.author + ", Pages: " + this.pages;

  // Exercise 2.89
  if (this.refNumber.length() > 0) {
   bookDetails += ", Reference Number: " + this.refNumber;
  } else {
   bookDetails += ", Reference Number: ZZZ";
  }

  // Exercise 2.91
  bookDetails += "This book's been borrowed " + this.borrowed + " times";

  System.out.println(bookDetails);
 }

 // Exercise 2.84
 public void printTitle() {
  System.out.println(this.title);
 }

 // Exercise 2.88
 public void setRefNumber(String ref) {
  // Exercise 2.90
  if (ref.length() >= 3) {
   System.out.println("The given reference number's less than 3 characters-wide");

   return;
  }

  this.refNumber = ref;
 }
}
