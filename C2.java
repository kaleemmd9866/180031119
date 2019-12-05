import java.util.*;
class Calculator
{
  static double powerInt(int num1,int num2)
{
  double p=Math.pow(num1,num2);
  return p;
}
static double powerDouble(double num1,int num2)
{
  double q=Math.pow(num1,num2);
   return q;
}
 }
class C2
{
   public static void main(String []args)
{
 System.out.println(Calculator.powerInt(12,10));
System.out.println(Calculator.powerDouble(12.000,10));
}
}