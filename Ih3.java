import java.util.*;
class Person
{ 
   String name="kaleem";
  }
class Student extends Person
{
   int id=1232;  

  }
class Teacher extends Person
{
   double salary=10000;
   String subject="chemistry";
  void teacher()
{
  System.out.println(super.name);
  System.out.println(this.salary);
 System.out.println(this.subject);
 }
}
class Collegestudent extends Student
{
  int year=1990;
  String major="ECE";
 void college()
{
   System.out.println(super.id);
  System.out.println(this.year);
  System.out.println(this.major);
}
}
  class Ih3
{
  public static void main(String []args)

{
  Teacher t=new Teacher();
   Collegestudent c=new Collegestudent();
c.college();
   t.teacher();
}
}