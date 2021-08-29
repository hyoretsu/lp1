package com.hyoretsu.lp1.lab_classes;

public class Student {
 /** the student's full name */
 private String name;
 /** the student ID */
 private String id;
 /** the amount of credits for study taken so far */
 private int credits;

 /** Create a new student with a given name and ID number. */
 public Student(String fullName, String studentID) {
  if (fullName.length() < 4 || studentID.length() < 3) {
   System.out.println("Either the given name or ID is too short");
  }

  name = fullName;
  id = studentID;
  credits = 0;
 }

 /** Add some credit points to the student's accumulated credits. */
 public void addCredits(int additionalPoints) {
  credits += additionalPoints;
 }

 /** Set a new name for this student. */
 public void changeName(String replacementName) {
  name = replacementName;
 }

 /** Return the number of credit points this student has accumulated. */
 public int getCredits() {
  return credits;
 }

 /**
  * Return the login name of this student. The login name is a combination of the
  * first four characters of the student's name and the first three characters of
  * the student's ID number.
  */
 public String getLoginName() {
  String nameLogin = this.name;
  String idLogin = this.id;

  if (this.name.length() > 4) {
   nameLogin = this.name.substring(0, 4);
  }

  if (this.id.length() > 3) {
   idLogin = this.id.substring(0, 3);
  }

  return nameLogin + idLogin;
 }

 /** Return the full name of this student. */
 public String getName() {
  return name;
 }

 /** Return the student ID of this student. */
 public String getStudentID() {
  return id;
 }

 /** Print the student's name and ID number to the output terminal. */
 public void print() {
  System.out.println(name + ", student ID: " + id + ", credits: " + credits);
 }
}
