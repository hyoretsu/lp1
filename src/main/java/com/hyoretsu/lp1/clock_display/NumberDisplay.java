package com.hyoretsu.lp1.clock_display;

public class NumberDisplay {
 private int limit;
 private int value;

 /**
  * Constructor for objects of class NumberDisplay. Set the limit at which the
  * display rolls over.
  */
 // Exercise 3.38
 public NumberDisplay(int rollOverLimit) {
  // If left as 12, there wouldn't be 12:00 since the hours would stop at 11
  this.limit = rollOverLimit == 12 ? 13 : rollOverLimit;
  // Start as 12h or continue to 0min
  this.value = rollOverLimit == 12 ? 12 : 0;
 }

 /** Return the current value. */
 public int getValue() {
  return value;
 }

 /**
  * Return the display value (that is, the current value as a two-digit String.
  * If the value is less than ten, it will be padded with a leading zero).
  */
 public String getDisplayValue() {
  // Exercise 3.38
  if (this.limit == 13 && this.value == 0) {
   this.value += 1;
  }

  // Exercise 3.58
  if (this.value < 10 && this.limit > 10) {
   return "0" + value;
  } else {
   return "" + value;
  }
 }

 /**
  * Set the value of the display to the new specified value. If the new value is
  * less than zero or over the limit, do nothing.
  */
 public void setValue(int replacementValue) {
  if ((replacementValue >= 0) && (replacementValue < limit)) {
   value = replacementValue;
  }
 }

 /**
  * Increment the display value by one, rolling over to zero if the limit is
  * reached.
  */
 public void increment() {
  value = (value + 1) % limit;
 }
}
