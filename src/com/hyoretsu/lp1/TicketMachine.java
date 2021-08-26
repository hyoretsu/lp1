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

 /**
  * Create a machine that issues tickets of the given price. Note that the price
  * must be greater than zero, and there are no checks to ensure this.
  */
 public TicketMachine(Integer cost) {
  this.price = cost;
  balance = 0;
  total = 0;
 }

 // Exercise 2.61
 public Integer emptyMachine() {
  Integer previousTotal = total;
  this.total = 0;

  return previousTotal;
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

 /**
  * Receive an amount of money from a customer. Check that the amount is
  * sensible.
  */
 public void insertMoney(int amount) {
  if (amount > 0) {
   balance += amount;
  } else {
   System.out.println("Use a positive amount rather than: " + amount);
  }
 }

 /**
  * Print a ticket if enough money has been inserted, and reduce the current
  * balance by the ticket price. Print an error message if more money is
  * required.
  */
 public void printTicket() {
  // Exercise 2.62
  Integer amountLeftToPay = this.balance - this.price;

  if (amountLeftToPay <= 0) {
   // Simulate the printing of a ticket.
   System.out.println("##################");
   System.out.println("# The BlueJ Line");
   System.out.println("# Ticket");
   System.out.println("# " + price + " cents.");
   System.out.println("##################");
   System.out.println();

   // Update the total collected with the price.
   total += price;
   // Reduce the balance by the price.
   balance -= price;
  } else {
   System.out.println("You must insert at least: " + (price - balance) + " more cents.");
  }
 }

 // Exercise 2.37
 public void prompt() {
  System.out.println("Please insert the correct amount of money.");
 }

 /** Return the money in the balance. The balance is cleared. */
 public int refundBalance() {
  int amountToRefund;
  amountToRefund = balance;
  balance = 0;
  return amountToRefund;
 }

 // Exercise 2.41
 public void showPrice() {
  System.out.println("The price of a ticket is " + this.price + " cents.");
 }
}
