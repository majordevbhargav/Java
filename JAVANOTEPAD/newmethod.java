class newmethod{
    public static void main(String[] args) {
        
        int a,b,div;
try{
       a=Integer.parseInt(args[0]);
       b=Integer.parseInt(args[1]);
div=a/b;
}
catch(Exception e)
{
e.getMessage();
}
System.out.println(div);
System.out.println("hello");
  //Exception in thread "main" java.lang.ArithmeticException(exception name): / by zero ()
       // at newmethod.main(newmethod.java:7)  (loctain of exception)   
       
    
    }
}