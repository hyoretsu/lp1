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
  // Exercise 4.42
  this.memberships.add(member);
 }

 /**
  * Determine the number of members who joined in the given month.
  *
  * @param month The month we are interested in.
  * @return The number of members who joined in that month.
  */
 public int joinedInMonth(int month) {
  // Exercise 4.54
  if (month < 1 || month > 12) {
   System.out.println("Please input a valid month");

   return 0;
  }

  Integer count = 0;

  for (Membership member : memberships) {
   if (member.getYear() == month) {
    count += 1;
   }
  }

  return count;
 }

 /** @return The number of members (Membership objects) in the club. */
 public int numberOfMembers() {
  // Exercise 4.41
  return this.memberships.size();
 }

 /**
  * Remove from the club’s collection all members who joined in the given month,
  * and return them stored in a separate collection object.
  *
  * @param month The month of the membership.
  * @param year  The year of the membership.
  * @return The members who joined in the given month and year.
  */
 public ArrayList<Membership> purge(int month, int year) {
  // Exercise 4.55
  ArrayList<Membership> filteredMembers = new ArrayList<>();

  if (month < 1 || month > 12) {
   System.out.println("Please input a valid month");

   return filteredMembers;
  }

  for (Integer i = 0; i < memberships.size(); i++) {
   Membership member = memberships.get(i);

   if (member.getYear() == year && member.getMonth() == month) {
    filteredMembers.add(member);
    memberships.remove(i);
   }
  }

  return filteredMembers;
 }
}
