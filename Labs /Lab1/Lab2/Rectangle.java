class Rectangle implements Shape
{
//seems like there is something missing here... 
  private double width;
  private double height;
  private Point center;
  
  public Rectangle(Point p, double width, double height)
  {
    this.center = p;
    this.height = height;
    this.width = width;

  }
  
  public Point getPoint()
  {
    return center;
  }
  
  public void setPoint(Point p)
  {
    this.center = p;
  }
  
  public double getWidth()
  {
   return width;
  }
  
  public void setWidth(double width)
  {
   this.width = width; 
  }
  
  public double getHeight()
  {
   return height;
  }
  
  public void setHeight(double height)
  {
    this.height = height;
  }
  
//seems like there is something missing here... 

public double getArea(){
  return width * height;
}

public double getPerimeter(){
  return width + width + height + height;

}

}

