package com.hyoretsu.bluej_exercises.ch2;

public class Exercise57 {
 public Exercise57(Integer price, Integer budget) {
  if (price > budget) {
   System.out.println("Too expensive, your budget is " + budget);
  } else {
   System.out.println("Just right");
  }
 }
}
