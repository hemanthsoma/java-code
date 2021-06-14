import java.io.*;
import java.lang.*;
import java.util.*;
class oper{
    int a=3,b=2;
    public void add()
    {
      System.out.println(a+b);
    }
    public void sub()
    {
      System.out.println(a-b);
    }
    public void mul()
    {
      System.out.println(a*b);
    }
    public void div()
    {
      System.out.println(a/b);
    }

}
class MathOper{
    public static void main(String[] args)
    {
        oper g = new oper();
        g.add();
        g.sub();
        g.mul();
        g.div();
    }
}
