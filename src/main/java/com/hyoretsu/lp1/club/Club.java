package com.hyoretsu.lp1.club;

import java.util.ArrayList;
import java.util.List;

public class Club {
 // Exercise 4.40
 private List<Membership> memberships = new ArrayList<>();

 /** Constructor for objects of class Club */
 public Club() {
 }

 /**
  * Add a new member to the club's list of members.
  *
  * @param member The member object to be added.
  */
 public void join(Membership member) {
 }

 /** @return The number of members (Membership objects) in the club. */
 public int numberOfMembers() {
  // Exercise 4.41
  return this.memberships.size();
 }
}
