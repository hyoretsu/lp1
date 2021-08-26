package com.hyoretsu.lp1.house;

public class Picture {
 private Square wall;
 private Square window;
 private Triangle roof;
 private Circle sun;
 private Circle sun2;
 private boolean drawn;

 /** Constructor for objects of class Picture */
 public Picture() {
  wall = new Square();
  window = new Square();
  roof = new Triangle();
  sun = new Circle();
  sun2 = new Circle();
  drawn = false;
 }

 /** Draw this picture. */
 public void draw() {
  if (!drawn) {
   wall.moveHorizontal(-140);
   wall.moveVertical(20);
   wall.changeSize(120);
   wall.makeVisible();

   window.changeColor("black");
   window.moveHorizontal(-120);
   window.moveVertical(40);
   window.changeSize(40);
   window.makeVisible();

   roof.moveHorizontal(20);
   roof.moveVertical(-60);
   roof.changeSize(60, 180);
   roof.makeVisible();

   // Exercise 1.16
   sun.changeColor("blue");
   sun.moveHorizontal(100);
   sun.moveVertical(-40);
   sun.changeSize(80);
   sun.makeVisible();

   // Exercise 1.17
   sun2.changeColor("yellow");
   sun2.moveHorizontal(200);
   sun2.moveVertical(-20);
   sun2.changeSize(45);
   sun2.makeVisible();

   drawn = true;
  }
 }

 /** Change this picture to black/white display */
 public void setBlackAndWhite() {
  wall.changeColor("black");
  window.changeColor("white");
  roof.changeColor("black");
  sun.changeColor("black");
 }

 /** Change this picture to use color display */
 public void setColor() {
  wall.changeColor("red");
  window.changeColor("black");
  roof.changeColor("green");
  sun.changeColor("yellow");
 }
}
