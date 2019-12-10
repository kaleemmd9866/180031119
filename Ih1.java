import java.util.*;
class Animal
{
   void eat()
{
   System.out.println("eat method");
}
void sleep()
{
 System.out.println("sleep method");
}
}
class Bird extends Animal
{
  void eat()
{
   System.out.println("eat");
}
void sleep()
{
  System.out.println("sleep");
}
void fly()
{
   System.out.println("fly");
}
}

class Ih1
{
  public static void main(String []args)
{
   Animal a=new Animal();
   Bird b=new Bird();
a.eat();
a.sleep();
b.eat();
b.sleep();
b.fly();
}
}

   