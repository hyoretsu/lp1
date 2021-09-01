package com.hyoretsu.lp1.mail_system;

public class MailItem {
 /** The sender of the item. */
 private String from;
 /** The text of the message. */
 private String message;
 // Exercise 3.54
 private String subject;
 /** The intended recipient. */
 private String to;

 /**
  * Create a mail item from sender to the given recipient, containing the given
  * message.
  *
  * @param from    The sender of this item.
  * @param to      The intended recipient of this item.
  * @param message The text of the message to be sent.
  */
 public MailItem(String from, String to, String subject, String message) {
  this.from = from;
  this.to = to;
  this.subject = subject;
  this.message = message;
 }

 /** @return The sender of this message. */
 public String getFrom() {
  return from;
 }

 /** @return The intended recipient of this message. */
 public String getTo() {
  return to;
 }

 /** @return The text of the message. */
 public String getMessage() {
  return message;
 }

 /** Print this mail message to the text terminal. */
 public void print() {
  System.out.println("From: " + from);
  System.out.println("To: " + to);
  System.out.println("Subject: " + this.subject);
  System.out.println("Message: " + message);
 }
}
