import java.util.*;
import java.io.*;
class Author{
private String name="kaleem";
private String email="kaleemmd9866";
private char gender='m';
Author(String name,String email,char gender){
this.name=name;
this.email=email;
this.gender=gender;
System.out.println("name of the author is="+name);
System.out.println("email of teh author is="+email);
System.out.println("gender="+gender);
}
}
class Book {
private String nameB="my life";
private String Author="kaleem";
private double price=340;
private int qtyInStock=10;
Book(String nameB,String Author,double price,int qtyInStock){
this.nameB=nameB;
this.Author=Author;
this.price=price;
this.qtyInStock=qtyInStock;
}
String getName(String nameB){
return nameB;
}
String getAuthor(String Author){
return Author;}
void setPrice(double price){
this.price=price;
}
double getPrice(double price){
return price;
}
void setQtyInStock(int qtyInStock){
this.qtyInStock=qtyInStock;
}
int getQtyInStock(int qtyInStock){
return qtyInStock;
}
}
class De1{
public static void main(String k[]){

Book B=new Book("my life","Rishi",340,10);
System.out.println("name of the book is:"+B.getName("my life"));
System.out.println("Author of the book is:"+B.getAuthor("kaleem"));

System.out.println("price of the book is:"+B.getPrice(340));

System.out.println("qty of the book is:"+B.getQtyInStock(10));

Author A=new Author("kaleem","kaleemmd9866",'m');


}
}





