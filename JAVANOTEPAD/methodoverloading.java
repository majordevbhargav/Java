class Sum{
public int sum(int a, int b)
{
return a+b;
}
public int sum(int a, int b, int c)
{
return a+b+c;
}
public float sum (float a, float b)
{
return a+b;
}
public double sum( double a, double b){
return a+b;
}
}
class methodoverloading{
public static void main(String[] args){
Sum s=new Sum();
System.out.println(s.sum(3,4));
System.out.println(s.sum(3,4,5));
System.out.println(s.sum(2.4f,2.4f));
System.out.println(s.sum(3.4,6.5));
}
}