package com.hyoretsu.lp1;

// Exercise 2.93/94
public class Heater {
 private Double increment;
 private Double max;
 private Double min;
 public Double temperature;

 public Heater(Double min, Double max) {
  this.increment = 5.0;
  this.max = max;
  this.min = min;
  this.temperature = 15.0;
 }

 public void cooler() {
  Double newTemp = this.temperature - this.increment;

  if (newTemp >= this.min) {
   this.temperature = newTemp;
  } else {
   System.out.println("This action would make the heater colder than its minimum temperature");
  }
 }

 public Double getTemperature() {
  return this.temperature;
 }

 public void setIncrement(Double increment) {
  if (increment > 0) {
   this.increment = increment;
  }
 }

 public void warmer() {
  Double newTemp = this.temperature + this.increment;

  if (newTemp <= this.max) {
   this.temperature = newTemp;
  } else {
   System.out.println("This action would make the heater hotter than its maximum temperature");
  }
 }
}
