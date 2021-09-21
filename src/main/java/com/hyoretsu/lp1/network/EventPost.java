package com.hyoretsu.lp1.network;

public class EventPost extends Post {
 private String eventType = "";

 public EventPost(String author, String eventType) {
  super(author);
  this.eventType = eventType;
 }

 public String getType() {
  return this.eventType;
 }

 public void printShortSummary() {
  System.out.println("Event post from " + this.getUserName());
 }
}
