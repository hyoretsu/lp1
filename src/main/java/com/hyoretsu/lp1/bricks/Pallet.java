package com.hyoretsu.lp1.bricks;

public class Pallet {
 private static final double BASE_WEIGHT = 6.5; // Kg
 private static final double BASE_HEIGHT = 15; // cm
 private Brick aBrick;
 private int bricksInPlane;
 private int height;

 /**
  * Create a pallet with a given number of bricks.
  *
  * @param bricksInPlane The number of bricks in each level on the base.
  * @param height        The number of bricks stacked on top of each other.
  */
 public Pallet(int bricksInPlane, int height) {
  this.bricksInPlane = bricksInPlane;
  this.height = height;
  aBrick = new Brick(8, 20, 12);
 }

 /** @return The height of this stack (in cm) */
 public double getHeight() {
  // Exercise 9.38
  return (aBrick.getHeight() * height) + BASE_HEIGHT;
 }

 /** @return The weight of the pallet (in kg) */
 public double getWeight() {
  int numberOfBricks = bricksInPlane * height;
  // Exercise 9.38
  return aBrick.getWeight() * numberOfBricks + BASE_WEIGHT;
 }
}
