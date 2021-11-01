package com.hyoretsu.lp1.foxes_and_rabbits;

import java.awt.Color;

public class Counter {
 /** A name for this type of simulation participant */
 private String name;
 /** How many of this type exist in the simulation. */
 private int count;

 /**
  * Provide a name for one of the simulation types.
  *
  * @param name A name, e.g. "Fox".
  */
 public Counter(String name) {
  this.name = name;
  count = 0;
 }

 /** @return The current count for this type. */
 public int getCount() {
  return count;
 }

 /** @return The short description of this type. */
 public String getName() {
  return name;
 }

 /** Increment the current count by one. */
 public void increment() {
  count++;
 }

 /** Reset the current count to zero. */
 public void reset() {
  count = 0;
 }
}
