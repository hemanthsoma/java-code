import java.util.*;
import java.lang.*;
public class MathOperations
{
  static int add(int a,int b){
    return a+b;
  }
  static int sub(int a,int b){
    return a-b;
  }
  static int multiply(int a,int b){
    return a*b;
  }
  static int divide(int a,int b){
    return a/b;
  }
  public static void main(String[] args) {
    System.out.println("Sum of Two Nums "+add(1,2));
    System.out.println("Diff B/W Two Nums "+sub(2,1));
    System.out.println("Product of Two Nums "+multiply(2,3));
    System.out.println("Division of Two Nums "+divide(4,2));
  }
}
