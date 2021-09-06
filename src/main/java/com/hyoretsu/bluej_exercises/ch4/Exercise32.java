package com.hyoretsu.bluej_exercises.ch4;

public class Exercise32 {
 public Integer sum(Integer a, Integer b) {
  Integer total = 0;

  Integer start = a;
  while (start <= b) {
   total += start;
  }

  return total;
 }
}
