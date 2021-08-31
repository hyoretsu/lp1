package com.hyoretsu.bluej_exercises.ch3;

public class Exercise26 {
 private Integer limit;
 private Integer value;

 /**
  * Increment the display value by one, rolling over to zero if the limit is
  * reached.
  */
 public void increment() {
  Integer newValue = this.value + 1;

  if (newValue < limit) {
   this.value = newValue;
  } else {
   this.value = 0;
  }
 }
}
