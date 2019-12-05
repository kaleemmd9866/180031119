import java.util.*;
class Box
{
   double dimen(int w,int h,double d)
{  
   
  return (w*h*d);

   }
}
class C1
{
  public static void main(String []args)
{
  Box b=new Box();

System.out.println("volume:" +  b.dimen(2,3,4));
}
 }