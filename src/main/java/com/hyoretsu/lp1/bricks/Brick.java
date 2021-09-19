package com.hyoretsu.lp1.bricks;

public class Brick {
 private static final int WEIGHT_PER_CM3 = 2; // weight/cm³ in grams
 private int height;
 private int width;
 private int depth;

 /**
  * Create a Brick given edge lengths in centimeters.
  *
  * @param height The brick's height.
  * @param width  The brick's width.
  * @param depth  The brick's depth.
  */
 public Brick(int height, int width, int depth) {
  this.height = height;
  this.width = width;
  this.depth = depth;
 }

 /** @return The height of this brick in centimeters. */
 public double getHeight() {
  return height;
 }

 /** @return The surface area of this brick in square centimeters. */
 public double getSurfaceArea() {
  double side1 = width * height;
  double side2 = width * depth;
  double side3 = depth * height;
  // Exercise 9.38
  double total = (side1 + side2 + side3) * 2;

  return total;
 }

 /** @return The volume of this brick in cubic centimeters. */
 public int getVolume() {
  return width * height * depth;
 }

 /** @return The weight of this brick in kg. */
 public double getWeight() {
  // Exercise 9.38
  return (getVolume() * WEIGHT_PER_CM3) / (double) 1000;
 }
}
