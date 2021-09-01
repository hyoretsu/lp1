package com.hyoretsu.lp1.house;

// Exercise 3.40
public class Tree {
 private Triangle leaves;
 private Square trunk;

 public Tree() {
  this.leaves = new Triangle();
  this.trunk = new Square();

  // Exercise 3.41
  this.setup();
 }

 // Exercise 3.41
 public void setup() {
  this.leaves.moveHorizontal(130);
  this.leaves.moveVertical(-10);
  this.leaves.changeSize(90, 75);
  this.leaves.makeVisible();

  this.trunk.moveHorizontal(10);
  this.trunk.moveVertical(100);
  this.trunk.changeSize(40);
  this.trunk.changeColor("brown");
  this.trunk.makeVisible();
 }
}
