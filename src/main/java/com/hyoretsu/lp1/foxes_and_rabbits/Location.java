package com.hyoretsu.lp1.foxes_and_rabbits;

public class Location {
 // Row and column positions.
 private int row;
 private int col;

 /**
  * Represent a row and column.
  *
  * @param row The row.
  * @param col The column.
  */
 public Location(int row, int col) {
  this.row = row;
  this.col = col;
 }

 /** @return The column. */
 public int getCol() {
  return col;
 }

 /** @return The row. */
 public int getRow() {
  return row;
 }

 /** Implement content equality. */
 public boolean equals(Object obj) {
  if (obj instanceof Location) {
   Location other = (Location) obj;
   return row == other.getRow() && col == other.getCol();
  } else {
   return false;
  }
 }

 /**
  * Use the top 16 bits for the row value and the bottom for the column. Except
  * for very big grids, this should give a unique hash code for each (row, col)
  * pair.
  *
  * @return A hashcode for the location.
  */
 public int hashCode() {
  return (row << 16) + col;
 }

 /**
  * Return a string of the form row,column
  *
  * @return A string representation of the location.
  */
 public String toString() {
  return row + "," + col;
 }
}
