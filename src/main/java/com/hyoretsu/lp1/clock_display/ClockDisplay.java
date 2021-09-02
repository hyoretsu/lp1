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
  // Exercise 3.59
  this.hours = new NumberDisplay(12);
  this.minutes = new NumberDisplay(60, this.hours);
  this.seconds = new NumberDisplay(60, this.minutes);
  this.tenthSeconds = new NumberDisplay(10, this.seconds);
  this.hundredthSeconds = new NumberDisplay(10, this.tenthSeconds);

  updateDisplay();
 }

 /**
  * Constructor for ClockDisplay objects. This constructor creates a new clock
  * set at the time specified by the parameters.
  */
 public ClockDisplay(Integer hour, Integer minute, Integer second, Integer tenthSecond, Integer hundredthSecond) {
  // Exercise 3.59
  this.hours = new NumberDisplay(12);
  this.minutes = new NumberDisplay(60, this.hours);
  this.seconds = new NumberDisplay(60, this.minutes);
  this.tenthSeconds = new NumberDisplay(10, this.seconds);
  this.hundredthSeconds = new NumberDisplay(10, this.tenthSeconds);

  setTime(hour, minute, second, tenthSecond, hundredthSecond);
 }

 /**
  * This method should get called every 0.01 seconds - it makes the clock display
  * go one hundredth of a second forward.
  */
 // Exercise 3.59
 public void timeTick() {
  this.hundredthSeconds.increment();

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
