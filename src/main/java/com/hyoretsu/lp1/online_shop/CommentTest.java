package com.hyoretsu.lp1.online_shop;

import static org.junit.Assert.*;
import org.junit.Test;

// Exercise 9.13
public class CommentTest {
 @Test
 // Exercise 9.15
 public void refuseSameAuthorComments() {
  SalesItem item = new SalesItem("test", 1);

  item.addComment("Jane Doe", "test", 5);
  assertEquals(false, item.addComment("Jane Doe", "test", 5));
 }
}
