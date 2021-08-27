package com.hyoretsu.lp1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TicketMachine {
 /** The price of a ticket from this machine. */
 private Map<String, Integer> prices = new HashMap<>();
 /** The amount of money entered by a customer so far. */
 private int balance;
 /** The total amount of money collected by this machine. */
 private int total;

 /** Create a machine that issues tickets of 1000 cents each. */
 public TicketMachine() {
  prices.put("standard", 1000);
  balance = 0;
  total = 0;
 }

 /**
  * Create a machine that issues tickets of the given price. Note that the price
  * must be greater than zero, and there are no checks to ensure this.
  */
 public TicketMachine(Integer cost) {
  prices.put("standard", cost);
  balance = 0;
  total = 0;
 }

 public void addNewPrice(String description, Integer price) {
  prices.put(description, price);
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

 /** Return the price of a specific kind of ticket. */
 public Integer getPrice(String ticketType) {
  return prices.get(ticketType);
 }

 /** Return all kinds of ticket prices available. */
 public Set<String> getAvailablePrices() {
  return prices.keySet();
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
 public void printTicket(String ticketType) {
  // Exercise 2.62
  Integer amountLeftToPay = this.balance - this.prices.get(ticketType);

  if (amountLeftToPay <= 0) {
   // Simulate the printing of a ticket.
   System.out.println("##################");
   System.out.println("# The BlueJ Line");
   System.out.println("# Ticket");
   System.out.println("# " + prices.get(ticketType) + " cents.");
   System.out.println("##################");
   System.out.println();

   // Update the total collected with the price.
   total += this.prices.get(ticketType);
   // Reduce the balance by the price.
   balance -= this.prices.get(ticketType);
  } else {
   System.out.println("You must insert at least: " + (this.prices.get(ticketType) - balance) + " more cents.");
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
 public void showPrice(String ticketType) {
  System.out.println("The price of the selected kind of ticket is " + this.prices.get(ticketType) + " cents.");
 }
}
