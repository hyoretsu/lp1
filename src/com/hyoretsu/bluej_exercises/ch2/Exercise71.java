package com.hyoretsu.bluej_exercises.ch2;

public class Exercise71 {
 public String name;
 public Integer age;
 public String code;
 public Integer credits;

 public Exercise71(String myName, Integer myAge) {
  this.name = myName;
  this.age = myAge;
 }

 public Integer getAge() {
  return this.age;
 }

 public String getName() {
  return this.name;
 }

 public void printDetails() {
  System.out.println("The name of this person is " + this.name);
 }

 public void setAge(Integer age) {
  this.age = age;
 }
}
