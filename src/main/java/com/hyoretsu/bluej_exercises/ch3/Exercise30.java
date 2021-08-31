package com.hyoretsu.bluej_exercises.ch3;

final class Rectangle {
 public Integer height;
 public Integer width;

 public Rectangle(Integer width, Integer height) {
  this.height = height;
  this.width = width;
 }
}

public class Exercise30 {
 public Rectangle window;

 public Exercise30(Integer width, Integer height) {
  this.window = new Rectangle(width, height);
 }
}
