public class Circle implements Shape
{

   //seems like there is something missing here... 
   private double radius;
   private Point center; 
     
   public Circle(Point p,double radius)
   {
      this.center = p;
      this.radius = radius; 
   }

   
   /**
   * Creates a unit circle
   * Centered at (0,0) with a radius of 1
   */
   public Circle()
   {
       this.center = new Point(0,0);
       this.radius = 1;
       
       }


   //getters
   public Point getPoint()
   {
     return center; 
   }
   
   
   
   public double getRadius()
   {
      return radius;
   }

   
   
   //setters
   public void setPoint(Point p)
   {
      this.center = p;
   }


   //Does NOT verify that r is >0
   public void setRadius(double r)
   {
      this.radius = r;
   }


   private static final double PI = Math.PI;

   //seems like there is something missing here...   
   public double getArea(){
     return PI * radius * radius;
   
   }
   
   public double getPerimeter(){
     return PI * 2 * radius;
   
   }

}


