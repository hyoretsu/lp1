package com.hyoretsu.lp1;

public class TicketMachine {
 /** The price of a ticket from this machine. */
 private int price;
 /** The amount of money entered by a customer so far. */
 private int balance;
 /** The total amount of money collected by this machine. */
 private int total;

 /** Create a machine that issues tickets of 1000 cents each. */
 public TicketMachine() {
  this.price = 1000;
  balance = 0;
  total = 0;
 }

 /** Return the amount of money already inserted for the next ticket. */
 public int getBalance() {
  return balance;
 }

 /** @return the price of a ticket. */
 public int getPrice() {
  return price;
 }

 // Exercise 2.26
 public Integer getTotal() {
  return balance;
 }

 /** Receive an amount of money from a customer. */
 public void insertMoney(int amount) {
  balance += amount;
 }

 /**
  * Print a ticket. Update the total collected and reduce the balance to zero.
  */
 public void printTicket() {
  // Simulate the printing of a ticket.
  System.out.println("##################");
  System.out.println("# The BlueJ Line");
  System.out.println("# Ticket");
  System.out.println("# " + price + " cents.");
  System.out.println("##################");
  System.out.println();

  // Update the total collected with the balance.
  total += balance;
  // Clear the balance.
  balance = 0;
 }

 // Exercise 2.37
 public void prompt() {
  System.out.println("Please insert the correct amount of money.");
 }

 // Exercise 2.41
 public void showPrice() {
  System.out.println("The price of a ticket is " + this.price + " cents.");
 }
}
