package com.hyoretsu.lp1.zuul;

public class Room {
 public String description;
 public Room northExit;
 public Room southExit;
 public Room eastExit;
 public Room westExit;

 /**
  * Create a room described "description". Initially, it has no exits.
  * "description" is something like "a kitchen" or "an open court yard".
  *
  * @param description The room's description.
  */
 public Room(String description) {
  this.description = description;
 }

 /** @return The description of the room. */
 public String getDescription() {
  return description;
 }

 /**
  * Define the exits of this room. Every direction either leads to another room
  * or is null (no exit there).
  *
  * @param north The north exit.
  * @param east  The east east.
  * @param south The south exit.
  * @param west  The west exit.
  */
 public void setExits(Room north, Room east, Room south, Room west) {
  if (north != null) {
   northExit = north;
  }
  if (east != null) {
   eastExit = east;
  }
  if (south != null) {
   southExit = south;
  }
  if (west != null) {
   westExit = west;
  }
 }
}
