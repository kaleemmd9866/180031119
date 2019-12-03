import java.util.*;
class Prob8
{
  public static void main(String []args)
{
  char ch;
String code;
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
switch(ch)
{
   case 'r':
          code="Red";
          break;
  case 'b':
        code="blue";
        break;
 case 'g':
       code="green";
           break;
 case 'o':
      code="orange";
       break;
  case 'y':
            code="yellow";
            break;
  case 'w':
           code="white";
           break;
default:
          code="not valid";
           break;
}
System.out.print(code);
}
}
          