
class Box2
{
double height;
double length;
double breadth;
}
class Box3
{
public static void main(String args[])
{
Box2 b1=new Box2();
Box2 b2=new Box2();
double area1;
double area2;
b1.height=15.3;
b1.length=18.2;
b1.breadth=12.2;
b2.height=14.4;
b2.length=17.5;
b2.breadth=19.3;
area1=(2*b1.height*b1.length*b1.breadth);
area2=(2*b2.height*b2.length*b2.breadth);
System.out.println("area1 :"+area1);
System.out.println("area2 :"+area2);
}
}
