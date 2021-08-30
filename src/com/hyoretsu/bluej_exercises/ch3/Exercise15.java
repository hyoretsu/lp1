package com.hyoretsu.bluej_exercises.ch3;

public class Exercise15 {
 public Boolean a;
 public Boolean b;
 public Boolean evaluation = false;

 public Exercise15(Boolean a, Boolean b) {
  this.a = a;
  this.b = b;

  this.evaluation = this.a != this.b;
 }
}
