public class ShapeTest
{


private static final double EPSILON = .001;

/*
   doubles are tricky, I can't compare directly, use epsilon method to see if they are really close
*/
public static void assertDoubleEquals(double a,double b,String message)
{
   double diff = Math.abs(a-b);
   assert diff<EPSILON: message;
}


//helper function for circles
public static void verifyCircle(Circle c, double x,double y,double r,double a,double p)
{
   Point center = c.getPoint();
   assertDoubleEquals(center.getX(),x,"x in Point does not match");
   assertDoubleEquals(center.getY(),y,"y in Point does not match");
   assertDoubleEquals(c.getRadius(),r,"r of Circle does not match");
   assertDoubleEquals(c.getArea(),a,"Area is not calculated correctly");
   assertDoubleEquals(c.getPerimeter(),p,"Perimeter is not calcuated Correctly");
}


public static void testCircle()
{
   //unit circle
   Circle c = new Circle();
   verifyCircle(c,0,0,1,3.14159,6.2831853);
   
   
   c.setPoint(new Point(5,10));
   c.setRadius(13); 
   verifyCircle(c,5,10,13,530.9291584,81.68140899);


   Circle c2 = new Circle(new Point(5,10), 13); 
   verifyCircle(c,5,10,13,530.9291584,81.68140899);
   
   c.setPoint(new Point(0,0));
   c.setRadius(1); 
   verifyCircle(c,0,0,1,3.14159,6.2831853);
}

//helper function for circles
public static void verifyRect(Rectangle r, double x,double y,double w,double h,double a,double p)
{
   Point upperLeft = r.getPoint();
   assertDoubleEquals(upperLeft.getX(),x,"x in Point does not match");
   assertDoubleEquals(upperLeft.getY(),y,"y in Point does not match");
   assertDoubleEquals(r.getWidth(),w,"width of Rect does not match");
   assertDoubleEquals(r.getHeight(),h,"height of Rect does not match");
   assertDoubleEquals(r.getArea(),a,"Area is not calculated correctly");
   assertDoubleEquals(r.getPerimeter(),p,"Perimeter is not calcuated Correctly");
}



public static void testRect()
{
   Rectangle r = new Rectangle(new Point(5,10),8,7);
   
   verifyRect(r,5,10,8,7,56,30);
   
   r.setPoint(new Point(-5,1));
   r.setWidth(2);
   r.setHeight(3);
   
   verifyRect(r,-5,1,2,3,6,10);
   

}



public static void main(String[] args)
{
   testCircle();
   testRect();

   System.out.println("All tests run correctly");
}


}