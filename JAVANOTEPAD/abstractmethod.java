abstract class vehicle {
int data;
 void m1(){
System.out.println("Data="+data);
}
abstract void sound();
vehicle(){
this.data=6;
System.out.println("Hi I am from the constructor ");

}
}
class car extends vehicle{
void sound(){
System.out.println("Hi I am from the abstract data type ");
}
car(){
super();
}
}
class abstractmethod {
public static void main(String args[]){
car c=new car();
c.sound();
c.m1();
}
}