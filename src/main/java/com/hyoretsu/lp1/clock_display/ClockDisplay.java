package com.hyoretsu.lp1.clock_display;

public class ClockDisplay {
 private NumberDisplay hours;
 private NumberDisplay minutes;
 // Exercise 3.57
 private NumberDisplay seconds;
 private String displayString; // simulates the actual display

 /**
  * Constructor for ClockDisplay objects. This constructor creates a new clock
  * set at 00:00.
  */
 public ClockDisplay() {
  // Exercise 3.38
  this.hours = new NumberDisplay(12);
  minutes = new NumberDisplay(60);
  // Exercise 3.57
  this.seconds = new NumberDisplay(60);

  updateDisplay();
 }

 /**
  * Constructor for ClockDisplay objects. This constructor creates a new clock
  * set at the time specified by the parameters.
  */
 public ClockDisplay(Integer hour, Integer minute, Integer second) {
  // Exercise 3.38
  this.hours = new NumberDisplay(12);
  minutes = new NumberDisplay(60);
  // Exercise 3.57
  this.seconds = new NumberDisplay(60);

  setTime(hour, minute, second);
 }

 /**
  * This method should get called every second - it makes the clock display go
  * one second forward.
  */
 public void timeTick() {
  // Exercise 3.57
  this.seconds.increment();

  if (this.seconds.getValue() == 0) {
   this.minutes.increment();

   if (this.minutes.getValue() == 0) { // it just rolled over!
    this.hours.increment();
   }
  }

  updateDisplay();
 }

 /** Set the time of the display to the specified hour and minute. */
 public void setTime(Integer hour, Integer minute, Integer second) {
  hours.setValue(hour);
  minutes.setValue(minute);
  // Exercise 3.57
  this.seconds.setValue(second);

  updateDisplay();
 }

 /** Return the current time of this display in the format HH:MM. */
 public String getTime() {
  return displayString;
 }

 /** Update the internal string that represents the display. */
 private void updateDisplay() {
  this.displayString = this.hours.getDisplayValue() + ":" + this.minutes.getDisplayValue() + ":"
    + this.seconds.getDisplayValue(); // Exercise 3.57
 }
}
