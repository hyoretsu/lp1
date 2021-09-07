package com.hyoretsu.lp1.auction;

public class Person {
 /** The name of this person. */
 private final String name;

 /**
  * Create a new person with the given name.
  *
  * @param name The person's name.
  */
 public Person(String name) {
  this.name = name;
 }

 /** @return The person's name. */
 public String getName() {
  return name;
 }
}
