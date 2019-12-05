import java.util.*;
class Patient
{
  String name="kaleem";
  double w=87,h=6;
 double BMI( )
{
   
  double bmi=(w/(h*h))*703;
   return bmi;
}
}
 class C3
{
   public static void main(String []args)
{
   Patient P=new Patient();
  System.out.println(P.BMI());
}
}