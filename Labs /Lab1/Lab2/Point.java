/* Simple example of a Point class in Java */

import java.lang.Math;

public class Point
{
  private double x; // must declare attributes
  private double y;

  // constructor initializes objects in class
  public Point(double x, double y) 
  {
    this.x = x;
    this.y = y;
  }

  // copy constructor creates copy of an object
  public Point(Point other) 
  {
    this.x = other.x;
    this.y = other.y;
  }

  // setters (mutators)
  public void setX(double x) 
  {
      this.x = x; 
  }
  
  public void setY(double y) 
  {
      this.y = y;
  }
  
  
  public void move(double dx, double dy) 
  {
    x += dx; 
    y += dy;
  }

  // getters (accessors)
  public double getX() 
  { 
      return x; 
  }
  
  
  public double getY() 
  {
      return y;
  }
  
  // other methods
  public double distance(Point other) 
  {
    return Math.sqrt(Math.pow(this.x - other.x, 2) +
                     Math.pow(this.y - other.y, 2));
  }

  // string representation of object
  public String toString()
  {
    return "Point at (" + x + ", " + y + ")";
  }

}

