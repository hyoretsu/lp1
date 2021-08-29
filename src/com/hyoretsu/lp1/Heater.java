package com.hyoretsu.lp1;

public class Heater {
 public Double temperature;

 public Heater() {
  this.temperature = 15.0;
 }

 public void cooler() {
  this.temperature -= 5;
 }

 public Double getTemperature() {
  return this.temperature;
 }

 public void warmer() {
  this.temperature += 5;
 }
}
