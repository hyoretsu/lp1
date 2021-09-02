package com.hyoretsu.lp1.clock_display;

public class ClockDisplay {
 private NumberDisplay hours;
 private NumberDisplay minutes;
 // Exercise 3.57
 private NumberDisplay seconds;
 // Exercise 2.58
 private NumberDisplay tenthSeconds;
 private NumberDisplay hundredthSeconds;
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
  // Exercise 3.58
  this.tenthSeconds = new NumberDisplay(10);
  this.hundredthSeconds = new NumberDisplay(10);

  updateDisplay();
 }

 /**
  * Constructor for ClockDisplay objects. This constructor creates a new clock
  * set at the time specified by the parameters.
  */
 public ClockDisplay(Integer hour, Integer minute, Integer second, Integer tenthSecond, Integer hundredthSecond) {
  // Exercise 3.38
  this.hours = new NumberDisplay(12);
  minutes = new NumberDisplay(60);
  // Exercise 3.57
  this.seconds = new NumberDisplay(60);
  // Exercise 3.58
  this.tenthSeconds = new NumberDisplay(10);
  this.hundredthSeconds = new NumberDisplay(10);

  setTime(hour, minute, second, tenthSecond, hundredthSecond);
 }

 /**
  * This method should get called every 0.01 seconds - it makes the clock display
  * go one hundredth of a second forward.
  */
 public void timeTick() {
  // Exercise 3.58
  this.hundredthSeconds.increment();

  if (this.hundredthSeconds.getValue() == 0) {
   this.tenthSeconds.increment();

   if (this.tenthSeconds.getValue() == 0) {
    // Exercise 3.57
    this.seconds.increment();

    if (this.seconds.getValue() == 0) {
     this.minutes.increment();

     if (this.minutes.getValue() == 0) { // it just rolled over!
      this.hours.increment();
     }
    }
   }
  }

  updateDisplay();
 }

 /** Set the time of the display to the specified hour and minute. */
 public void setTime(Integer hour, Integer minute, Integer second, Integer tenthSecond, Integer hundredthSecond) {
  hours.setValue(hour);
  minutes.setValue(minute);
  // Exercise 3.57
  this.seconds.setValue(second);
  // Exercise 3.58
  this.tenthSeconds.setValue(tenthSecond);
  this.hundredthSeconds.setValue(hundredthSecond);

  updateDisplay();
 }

 /** Return the current time of this display in the format HH:MM. */
 public String getTime() {
  return displayString;
 }

 /** Update the internal string that represents the display. */
 private void updateDisplay() {
  this.displayString = this.hours.getDisplayValue() + ":" + this.minutes.getDisplayValue() + ":"
    + this.seconds.getDisplayValue() + ":" // Exercise 3.57
    + this.tenthSeconds.getDisplayValue() + this.hundredthSeconds.getDisplayValue(); // Exercise 3.58
 }
}
