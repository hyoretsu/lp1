package com.hyoretsu.bluej_exercises.ch2;

public class Exercise35 {
 public Integer price = 0;

 /** Reduce price by the given amount. */
 public void discount(int amount) {
  if (this.price >= 0 && amount <= this.price) {
   this.price -= amount;
  } else {
   System.out.println("The price would go lower than 0 if discounted by the given amount.");
  }

  return;
 }
}
