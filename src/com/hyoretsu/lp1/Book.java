package com.hyoretsu.lp1;

public class Book {
 private String author;
 public Integer borrowed = 0;
 public Integer pages;
 public String refNumber = "";
 private String title;

 /** Set the author and title fields when this object is constructed. */
 public Book(String bookAuthor, String bookTitle, Integer pages) {
  author = bookAuthor;
  this.pages = pages;
  title = bookTitle;
 }

 public void borrow() {
  this.borrowed += 1;
 }

 public String getAuthor() {
  return this.author;
 }

 public Integer getBorrowed() {
  return this.borrowed;
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

  bookDetails += "This book's been borrowed " + this.borrowed + " times";

  System.out.println(bookDetails);
 }

 public void printTitle() {
  System.out.println(this.title);
 }

 public void setRefNumber(String ref) {
  if (ref.length() >= 3) {
   System.out.println("The given reference number's less than 3 characters-wide");

   return;
  }

  this.refNumber = ref;
 }
}
