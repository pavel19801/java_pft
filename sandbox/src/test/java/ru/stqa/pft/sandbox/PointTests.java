package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testArea() {
    Point p1 = new Point(10.0, 12.0);
    Point p2 = new Point(13.0, 16.0);
    Assert.assertEquals(p2.distance(p1),5.0);
  }
  @Test
  public void testArea2() {
    Point p1 = new Point(13.0, 12.0);
    Point p2 = new Point(15.0, 12.0);
    Assert.assertEquals(p2.distance(p1),7);
  }
  @Test
  public void testArea3() {
    Point p1 = new Point(14.0, 12.0);
    Point p2 = new Point(13.0, 16.0);

    Assert.assertNull(p2.distance(p1),"Not Null");
  }
}
