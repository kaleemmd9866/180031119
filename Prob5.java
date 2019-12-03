import java.util.*;
class Prob5
{
   public static void main(String []args)
{
  char c;
  Scanner sc=new Scanner(System.in);
c=sc.next().charAt(0);
if(c>='a'&&c<='z')
{  

   System.out.println("Alphabet");
}
else if(c>='0'&&c<='9')
{
  System.out.println("numbers");
}
else
{
  System.out.println("symbol");
}
}
}
